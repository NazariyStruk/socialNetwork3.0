package entity;

public class User {
	private int id;
	private String first_name;
	private String second_name;
	private String country;
	private String city;

	private int age;
	private int friends_amount;

	public User(int id, String first_name, String second_name, String country, String city, int age, int friends_amount) {
		this.id = id;
		this.first_name = first_name;
		this.second_name = second_name;
		this.country = country;
		this.city = city;
		this.age = age;
		this.friends_amount = friends_amount;
	}

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getFriends_amount() {
		return friends_amount;
	}

	public void setFriends_amount(int friends_amount) {
		this.friends_amount = friends_amount;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", first_name='" + first_name + '\'' +
				", second_name='" + second_name + '\'' +
				", country='" + country + '\'' +
				", city='" + city + '\'' +
				", age='" + age + '\'' +
				", friends_amount='" + friends_amount + '\'' +
				'}';
	}
}
