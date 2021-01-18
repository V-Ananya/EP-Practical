package studentManagement;
import java.lang.ClassNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertStudent {
	public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement stmt=con.prepareStatement("Insert into Student Details values(sb.getRegno,sb.getName,sb.getEmail)");
		int i = stmt.executeUpdate(); 
		return i;
	}
}