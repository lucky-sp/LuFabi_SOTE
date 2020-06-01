package Exercise3;

import java.lang.reflect.Field;

public class Main6_3 {

    public static void main(String[] args) {
        HtwgStudent student = new HtwgStudent("Max", "Mustermann",1);
        generateSqlForClass(student.getClass());
    }

    private static void generateSqlForClass(Class<?> clazz) {
        Entity entityAnnotation = clazz.getAnnotation(Entity.class);

        String tableName = "";
        if (entityAnnotation != null) {

            if (entityAnnotation.generationType().equals(GenerationType.LOWER_CASE)) {
                tableName = clazz.getName().toLowerCase();
            } else if (entityAnnotation.generationType().equals(GenerationType.UPPER_CASE)) {
                tableName = clazz.getName().toUpperCase();
            } else if (entityAnnotation.generationType().equals(GenerationType.SNAKE_CASE)) {
                String regex = "([a-z])([A-Z]+)";
                String replacement = "$1_$2";
                tableName = clazz.getName().replaceAll(regex, replacement).toLowerCase().replaceAll(".*\\.","");
            }
        }

        String sqlStatement = "Create Table " + tableName + " (";

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {

            Column columnAnnotation = fields[i].getAnnotation(Column.class);
            Id pk = fields[i].getAnnotation(Id.class);

            String columnName = fields[i].getName();
            if (columnAnnotation != null) {
                columnName = columnAnnotation.name();
            }

            if (fields[i].getType().equals(String.class)) {

                sqlStatement += columnName + " varchar(255), ";

            } else   {
                if (pk.pk().equals(Constraint.PRIMARY_KEY)) {
                    sqlStatement += columnName + " integer primary key, ";
                } else {
                    sqlStatement += columnName + " integer, ";
                }
            }
        }

        sqlStatement = sqlStatement.trim().replaceAll(",$", "");
        sqlStatement += ");";

        System.out.println(sqlStatement);
    }
}
