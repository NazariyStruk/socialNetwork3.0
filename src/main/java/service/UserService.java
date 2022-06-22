package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import entity.User;
import model.Response;

public interface UserService {

	void addUser(Scanner scanner);

	List<User> getAllUsers();

	Response findUser(Scanner scanner);

}
