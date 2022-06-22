package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import entity.User;

public class UserModel {

	private int id;
	private String firstName;
	private String secondName;
	private String country;
	private String city;
	private int age; // byte
	private int friendsAmount;

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

	public int getFriendsAmount() {
		return friendsAmount;
	}

	public static UserModel userModelBuild(User user) {
		UserModel userModel = new UserModel();
		userModel.age = user.getAge();
		userModel.city = user.getCity();
		userModel.country = user.getCountry();
		userModel.firstName = user.getFirstName();
		userModel.secondName = user.getSecondName();
		userModel.friendsAmount = user.getFriendsAmount();
		return userModel;
	}
}
