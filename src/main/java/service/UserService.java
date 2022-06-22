package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import entity.User;

public interface UserService {

	void addUser(Scanner scanner, Session session);

	List<User> getAllUsers(Session session);

	List<User> findUser(Scanner scanner, Session session) throws SQLException;

}
