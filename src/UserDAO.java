/* the DAO connects to the database and provides an interface for retrieving and receiving data */ 
import java.sql.*;

public class UserDAO {
	
	public User display(String email) throws SQLException, ClassNotFoundException {
		String jdbcURL = "jdbc:mysql://localhost:3306/exdb";
    	String dbUser = "picasso";
    	String dbPassword = "example";

    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
    	String sql = "SELECT * FROM user";
    	PreparedStatement statement = connection.prepareStatement(sql);
    	ResultSet result = statement.executeQuery();

    	User user = new User();
    	while (result.next()) {
    		if (result.getString("email").contains(email)) {
    		user.setEmail(email);
    		user.setfName(result.getString("fName"));
    		user.setlName(result.getString("lName"));
    		user.setAddress(result.getString("address"));
    		user.setCity(result.getString("city"));
    		user.setState(result.getString("state"));
    		user.setZip(result.getString("zip"));
    		user.setQuote(result.getString("quote"));
    		} 
    }

    	connection.close();

    	return user;
	}
	
    public User checkLogin(String email, String password) throws SQLException,
    ClassNotFoundException {
    	String jdbcURL = "jdbc:mysql://localhost:3306/exdb";
    	String dbUser = "picasso";
    	String dbPassword = "example";

    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
    	String sql = "SELECT email, fName, lName, address, city, state, zip, quote FROM user WHERE email = ? and password = ?";
    	PreparedStatement statement = connection.prepareStatement(sql);
    	statement.setString(1, email);
    	statement.setString(2, password);
    	
    	
    	ResultSet result = statement.executeQuery();

    	User user = null;

    	if (result.next()) {
    		user = new User();
    		user.setEmail(email);
    	}

    	connection.close();

    	return user;
    }
    public User register(String email, String password, String fName, String lName, String address, String city, String state, String zip, String quote) throws SQLException, ClassNotFoundException {
    	String jdbcURL = "jdbc:mysql://localhost:3306/exdb";
    	String dbUser = "picasso";
    	String dbPassword = "example";

    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
    	String sql = "INSERT INTO user (email, password, fName, lName, address, city, state, zip, quote) VALUES (?,?,?,?,?,?,?,?,?)";
    	PreparedStatement statement = connection.prepareStatement(sql);
    	statement.setString(1, email);
    	statement.setString(2, password);
    	statement.setString(3, fName);
    	statement.setString(4, lName);
    	statement.setString(5, address);
    	statement.setString(6, city);
    	statement.setString(7, state);
    	statement.setString(8, zip);
    	statement.setString(9, quote);
    	
    	statement.executeUpdate();
    	
    		User u = new User();
    		u.setEmail(email);
    		u.setPassword(password);
    		u.setfName(fName);
    		u.setlName(lName);
    		u.setAddress(address);
    		u.setCity(city);
    		u.setState(state);
    		u.setZip(zip);
    		u.setQuote(quote);
    	
    	
    	connection.close();  
        
      return u;
    }
}
