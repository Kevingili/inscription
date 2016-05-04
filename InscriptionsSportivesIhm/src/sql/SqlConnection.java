package sql;
import java.sql.*;
import javax.swing.*;
public class SqlConnection {
	Connection conn = null;
	public static Connection dbConnector()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//192.168.60.248 -- mot de passe: root
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.60.248/inscription", "root", "root");
			JOptionPane.showMessageDialog(null, "Connection successful");
			return conn;
		} catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}
