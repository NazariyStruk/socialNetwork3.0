package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;

public class UserMapper {

	public static void userMapper(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setFirst_name(resultSet.getString("firstName"));
			user.setSecond_name(resultSet.getString("secondName"));
			user.setAge(resultSet.getInt("age"));
			user.setCountry(resultSet.getString("country"));
			user.setCity(resultSet.getString("city"));
			user.setFriends_amount(resultSet.getInt("friendsAmount"));
			System.out.println(user);
		}
	}
}
