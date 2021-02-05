import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DAO 
{
	public int registerInsert(RegistrationBean rb) throws ClassNotFoundException , SQLException 
	{
		Connection con = DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("insert into registrationbean values(?,?,?,?,?,?)");
		ps.setInt(1,rb.getId());
		ps.setString(2,rb.getName());
		ps.setString(3,rb.getEmail());
		ps.setString(4,rb.getPassword());
		ps.setString(5,rb.getLocation());
		int a=ps.executeUpdate();
		con.close();
		return a;
	}
}