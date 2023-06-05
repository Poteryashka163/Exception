
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите Пароль: ");
        String password = scanner.nextLine();
        System.out.print("Введите Подтверждение пароля: ");
        String confirmPassword = scanner.nextLine();
        scanner.close();

        try {
            CheckCredentials.checkCredentials(login,password,confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}