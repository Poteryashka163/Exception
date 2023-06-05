public class CheckCredentials {
    public static void checkCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        //Проверка login
        if (login == null || login.length() > 20 || !login.matches("\\w+")) {
            throw new WrongLoginException("Неверный логин");
        }
        //Проверка password
        if (password == null || password.length() > 20 || !password.matches("\\w+")) {
            throw new WrongPasswordException("Неверный пароль");
        }
        //Проверка confirmPassword
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        else {
            System.out.println("Все данные введены верно.");
        }
    }
}
