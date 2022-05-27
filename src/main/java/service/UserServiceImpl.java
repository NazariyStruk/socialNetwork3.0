package service;

import static mappers.UserMapper.userMapper;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import repo.UserRepository;
import service.userService.UserService;

public class UserServiceImpl implements UserService {
	UserRepository userRepository = new UserRepository();

	public static void menu() {
		System.out.println("------------------------------");
		System.out.println("1.Показати список усіх користувачів");
		System.out.println("2.Добавити користувача");
		System.out.println("3.Знайти користувача");
		System.out.println("4.Вийти");
		System.out.println("------------------------------");
	}

	@Override
	public void addUser(Connection connection, Scanner scanner) throws SQLException {
		userRepository.addUser(connection, scanner).executeUpdate();
	}

	@Override
	public void getAllUsers(Connection connection) throws SQLException {
		userMapper(userRepository.getAllUsers(connection));
	}

	@Override
	public void findUser(Connection connection, Scanner scanner) throws SQLException {
		userMapper(userRepository.findUser(connection, scanner).executeQuery());
	}
}
