package Car;

public class main {
    public static void main (final String[] args) {
        final Car Auto = new Car(65, 180000, "VW", "Polo");
        System.out.println(Auto.leistung);

        final Car Auto2 = new Car.CarBuilder()
        .setKilometerstand(12300)
        .setLeistung(230)
        .setMarke("Toyota")
        .setModell("Hilux")
        .build();

        System.out.println(Auto2.modell);
    }
}