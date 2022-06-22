package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "second_name")
	private String secondName;

	@Column(name = "country")
	private String country;

	@Column(name = "city")
	private String city;

	@Column(name = "age")

	private int age; // byte

	@Column(name = "friends_amount")
	private int friendsAmount;

	public User(int id, String firstName, String secondName, String country, String city, int age, int friendsAmount) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.country = country;
		this.city = city;
		this.age = age;
		this.friendsAmount = friendsAmount;
	}

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getFriendsAmount() {
		return friendsAmount;
	}

	public void setFriendsAmount(int friendsAmount) {
		this.friendsAmount = friendsAmount;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", secondName='" + secondName + '\'' +
				", country='" + country + '\'' +
				", city='" + city + '\'' +
				", age=" + age +
				", friendsAmount=" + friendsAmount +
				'}';
	}
}
