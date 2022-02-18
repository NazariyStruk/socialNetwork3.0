import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
	private static final String DB_USERNAME = "postgres";
	private static final String DB_PASSWORD = "1111";
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		while (true) {
			System.out.println("------------------------------");
			System.out.println("1.Показати список усіх користувачів");
			System.out.println("2.Добавити користувача");
			System.out.println("3.Знайти користувача");
			System.out.println("4.Вийти");
			System.out.println("------------------------------");

			int command = scanner.nextInt();

			if (command == 1) {
				DBController.getAllUsers(connection);
			} else if (command == 2) {
				DBController.addUser(connection, scanner);
			} else if (command == 3) {
				connection.getAutoCommit();
				String SQL_GET_USER = "select * from users where firstname like ?";
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_USER);
				System.out.println("Введіть Ім'я користувача для пошуку");
				scanner.nextLine();
				String name = scanner.nextLine();
				preparedStatement.setString(1, name);
				preparedStatement.execute();
			} else if (command == 4) {
				System.exit(0);
			} else {
				System.err.println("Не вірна команда");
			}
		}
	}
}
