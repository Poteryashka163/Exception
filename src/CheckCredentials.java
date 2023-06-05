public class CheckCredentials {
    public static void checkCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login == null || login.length() > 20 || !login.matches("\\w+")) {
            throw new WrongLoginException("Неверный логин");
        }

        if (password == null || password.length() > 20 || !password.matches("\\w+")) {
            throw new WrongPasswordException("Неверный пароль");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        else {
            System.out.println("Все данные введены верно.");
        }
    }
}
