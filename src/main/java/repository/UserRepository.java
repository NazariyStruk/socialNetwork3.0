package repository;

import java.util.List;
import java.util.Scanner;

import entity.User;

public interface UserRepository {

	List<User> findUser(Scanner scanner);

	void addUser(Scanner scanner);

	List<User> getAllUsers();
}
