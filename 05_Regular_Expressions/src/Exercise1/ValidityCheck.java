package Exercise1;

public class ValidityCheck {

    public static String PasswordCheck(String password) {

        if (password.matches("[A-Za-z]{1}.{3,14}")) {
            return "Your password is valid";
        } else {
            return "Your password is invalid";
        }
    }
}
