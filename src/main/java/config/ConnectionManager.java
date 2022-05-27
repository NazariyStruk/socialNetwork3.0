package config;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;

import org.postgresql.ds.PGSimpleDataSource;
import org.postgresql.ds.common.BaseDataSource;

public class ConnectionManager {
	private static final String DB_USERNAME = "postgres";
	private static final String DB_PASSWORD = "1111";
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

	private static Connection connection;
	private static final BaseDataSource dataSource = new PGSimpleDataSource();

	public static Connection getConnection() {
		try {
			if (Objects.isNull(connection)) {
				dataSource.setURL(DB_URL);
				dataSource.setUser(DB_USERNAME);
				dataSource.setPassword(DB_PASSWORD);
				connection = dataSource.getConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
