import java.sql.Connection;
import java.util.Scanner;

import config.ConnectionManager;
import service.UserServiceImpl;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Connection connection = ConnectionManager.getConnection();
		UserServiceImpl userService = new UserServiceImpl();
		while (true) {
			userService.menu();
			int command = scanner.nextInt();

			if (command == 1) {
				userService.getAllUsers(connection);
			} else if (command == 2) {
				userService.addUser(connection, scanner);
			} else if (command == 3) {
				userService.findUser(connection, scanner);
			} else if (command == 4) {
				System.exit(0);
			} else {
				System.err.println("Не вірна команда");
			}
		}
	}
}
