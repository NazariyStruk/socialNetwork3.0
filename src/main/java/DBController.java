import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBController {

	public static void addUser(Connection connection, Scanner scanner) throws SQLException {
		String SQL_ADD_USER = "insert into users (firstname, secondname, age , country, city, friendsamount) values (?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(SQL_ADD_USER);
		System.out.println("Введіть Ім'я користувача");
		scanner.nextLine();
		String name = scanner.nextLine();
		preparedStatement.setString(1, name);
		System.out.println("Введіть прізвище користувача");
		String sureName = scanner.nextLine();
		preparedStatement.setString(2, sureName);
		System.out.println("Введіть вік користувача");
		String age = scanner.nextLine();
		preparedStatement.setString(3, age);
		System.out.println("Введіть країну користувача");
		String country = scanner.nextLine();
		preparedStatement.setString(4, country);
		System.out.println("Введіть місто користувача");
		String city = scanner.nextLine();
		preparedStatement.setString(5, city);
		System.out.println("Введіть кількість друзів користувача");
		String amount = scanner.nextLine();
		preparedStatement.setString(6, amount);
		preparedStatement.executeUpdate();
	}

	public static void getAllUsers(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		String SQL_SELECT_USERS = "select * from users order by id";
		ResultSet resultSet = statement.executeQuery(SQL_SELECT_USERS);

		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id") + " "
					+ resultSet.getString("firstName") + " "
					+ resultSet.getString("secondName") + " "
					+ resultSet.getInt("age") + " "
					+ resultSet.getString("country") + " "
					+ resultSet.getString("city") + " "
					+ resultSet.getInt("friendsAmount"));
		}
	}
}
