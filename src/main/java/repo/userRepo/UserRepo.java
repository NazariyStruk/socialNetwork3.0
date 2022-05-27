package repo.userRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public interface UserRepo {

	PreparedStatement findUser(Connection connection, Scanner scanner) throws SQLException;

	PreparedStatement addUser(Connection connection, Scanner scanner) throws SQLException;

	ResultSet getAllUsers(Connection connection) throws SQLException;

}
