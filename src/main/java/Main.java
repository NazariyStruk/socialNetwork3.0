import java.util.Arrays;
import java.util.Scanner;

import org.hibernate.Session;

import config.HibernateUtil;
import service.serviceImpl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		UserServiceImpl userService = new UserServiceImpl();
		Scanner scanner = new Scanner(System.in);

		try (Session session = HibernateUtil.getSession()) {
			session.beginTransaction();

			while (true) {
				userService.menu();
				int command = scanner.nextInt();

				if (command == 1) {
					System.out.println(Arrays.toString(userService.getAllUsers(session).toArray()));
				} else if (command == 2) {
					userService.addUser(scanner, session);
				} else if (command == 3) {
					System.out.println(Arrays.toString(userService.findUser(scanner, session).toArray()));
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
