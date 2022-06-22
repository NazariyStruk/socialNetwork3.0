package service.serviceImpl;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import antlr.StringUtils;
import entity.User;
import model.Response;
import repository.UserRepository;
import repository.repositoryImpl.UserRepositoryImpl;
import service.UserService;

public class UserServiceImpl implements UserService {
	UserRepository userRepository = new UserRepositoryImpl();

	public static void menu() {
		System.out.println("------------------------------");
		System.out.println("1.Показати список усіх користувачів");
		System.out.println("2.Добавити користувача");
		System.out.println("3.Знайти користувача");
		System.out.println("4.Вийти");
		System.out.println("------------------------------");
	}

	@Override
	public void addUser(Scanner scanner) {
		userRepository.addUser(scanner);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

	@Override
	public Response<User> findUser(Scanner scanner) {
		List<User> ourUsersResult = userRepository.findUser(scanner);
		Response<User> response = new Response();
		if (ourUsersResult != null && !ourUsersResult.isEmpty()) {
			response.setBody(ourUsersResult);
		}
		else {
			response.setErrorMessage("No such User");
		}
		return response;
	}
}
