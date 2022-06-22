package repository.repositoryImpl;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionLazyDelegator;

import config.HibernateUtil;
import entity.User;
import repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

	@Override
	public List<User> findUser(Scanner scanner) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		System.out.println("Введіть Ім'я користувача для пошуку");
		scanner.nextLine();
		String name = scanner.nextLine();
		Query query = session.createNativeQuery("select * from users where firstname like ?", User.class);
		List<User> ourUsers = (List<User>) query.setParameter(1, name).getResultList();
		transaction.commit();
		return ourUsers;
	}

	@Override
	public void addUser(Scanner scanner) {
		Session sessionAddUser = HibernateUtil.getSession();
		Transaction transaction = sessionAddUser.getTransaction();
		transaction.begin();

		User ourUser = new User();

		System.out.println("Введіть Ім'я користувача"); // on engl;
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
		sessionAddUser.save(ourUser);
		transaction.commit();
	}

	@Override
	public List<User> getAllUsers() {
		Session sessionAllUsers = HibernateUtil.getSession();
		Transaction transaction = sessionAllUsers.getTransaction();
		transaction.begin();
		Query query = sessionAllUsers.createNativeQuery("SELECT * from users", User.class);
		transaction.commit();
		return (List<User>) query.getResultList();
	}
}
