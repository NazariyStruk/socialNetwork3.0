package service.userService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public interface UserService {

	void addUser(Connection connection, Scanner scanner) throws SQLException;

	void getAllUsers(Connection connection) throws SQLException;

	void findUser(Connection connection, Scanner scanner) throws SQLException;

}
