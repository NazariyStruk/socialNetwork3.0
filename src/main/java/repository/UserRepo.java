package repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import entity.User;

public interface UserRepo {

	List<User> findUser(Scanner scanner, Session session) throws SQLException;

	void addUser(Scanner scanner, Session session) throws SQLException;

	List<User> getAllUsers(Session session) throws SQLException;
}
