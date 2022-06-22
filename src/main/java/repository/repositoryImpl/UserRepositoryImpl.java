package repository.repositoryImpl;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;

import entity.User;
import repository.UserRepo;

public class UserRepositoryImpl implements UserRepo {

	@Override
	public List<User> findUser(Scanner scanner, Session session) {
		System.out.println("Введіть Ім'я користувача для пошуку");
		scanner.nextLine();
		String name = scanner.nextLine();
		Query query = session.createNativeQuery("select * from users where firstname like ?", User.class);

		return (List<User>) query.setParameter(1, name).getResultList();
	}

	@Override
	public void addUser(Scanner scanner, Session session) {
		User ourUser = new User();

		System.out.println("Введіть Ім'я користувача");
		scanner.nextLine();
		String name = scanner.nextLine();
		ourUser.setFirst_name(name);
		System.out.println("Введіть прізвище користувача");
		String sureName = scanner.nextLine();
		ourUser.setSecond_name(sureName);
		System.out.println("Введіть вік користувача");
		String age = scanner.nextLine();
		ourUser.setAge(Integer.valueOf(age));
		System.out.println("Введіть країну користувача");
		String country = scanner.nextLine();
		ourUser.setCountry(country);
		System.out.println("Введіть місто користувача");
		String city = scanner.nextLine();
		ourUser.setCity(city);
		System.out.println("Введіть кількість друзів користувача");
		String amount = scanner.nextLine();
		ourUser.setFriends_amount(Integer.parseInt(amount));
		session.save(ourUser);
	}

	@Override
	public List<User> getAllUsers(Session session) {
		Query query = session.createNativeQuery("SELECT * from users", User.class);
		return (List<User>) query.getResultList();
	}
}
