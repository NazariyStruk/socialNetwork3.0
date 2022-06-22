import java.util.Arrays;
import java.util.Scanner;

import service.serviceImpl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		UserServiceImpl userService = new UserServiceImpl();
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				userService.menu();
				int command = scanner.nextInt();

				if (command == 1) {
					userService.getAllUsers().forEach(System.out::println);
				} else if (command == 2) {
					userService.addUser(scanner);
				} else if (command == 3) {
					userService.findUser(scanner).getBody();
				} else if (command == 4) {
					System.exit(0);
				} else {
					System.err.println("Не вірна команда");
				}
			}
		} catch (Throwable cause) {
			cause.printStackTrace();
		}
	}
}
