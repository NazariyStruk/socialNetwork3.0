package service.serviceImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import entity.User;
import repository.repositoryImpl.UserRepositoryImpl;
import service.UserService;

public class UserServiceImpl implements UserService {
	UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();

	public static void menu() {
		System.out.println("------------------------------");
		System.out.println("1.Показати список усіх користувачів");
		System.out.println("2.Добавити користувача");
		System.out.println("3.Знайти користувача");
		System.out.println("4.Вийти");
		System.out.println("------------------------------");
	}

	@Override
	public void addUser(Scanner scanner, Session session) {
		userRepositoryImpl.addUser(scanner, session);
	}

	@Override
	public List<User> getAllUsers(Session session) {
		return userRepositoryImpl.getAllUsers(session);
	}

	@Override
	public List<User> findUser(Scanner scanner, Session session) throws SQLException {
		return userRepositoryImpl.findUser(scanner, session);
	}
}
