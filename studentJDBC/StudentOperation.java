package studentManagement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.mysql.jdbc.ResultSet;
public class StudentOperation {
	public int StudentInsert(StudentBean student) throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement statement = con.prepareStatement("insert into student values(?, ?, ?)");
		statement.setInt(1,  student.getReg());
		statement.setString(2,  student.getName());
		statement.setString(3,  student.getEmail());
		int i = statement.executeUpdate();
		return i;	
	}	
	public int StudentDelete(int reg) throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement statement = con.prepareStatement("delete from student where regno = ?");
		statement.setInt(1,  reg);
		int i = statement.executeUpdate();		
		return i;
	}	
	public int StudentUpdate(int reg, String name, String email) throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement statement = con.prepareStatement("update student set name = ?, email= ? where regno = ?");
		statement.setString(1, name);
		statement.setString(2, email);
		statement.setInt(3, reg);
		int i = statement.executeUpdate();
		return i;	
	}	
	public void StudentDisplay() throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement statement = con.prepareStatement("select regno, name, email from student");
		ResultSet i = (ResultSet) statement.executeQuery();
		System.out.println("RegNo\t\tName\t\tEmail");
		while(i.next()) {
			System.out.print(i.getInt(1));
			System.out.print("\t\t"+i.getString(2));
			System.out.print("\t\t"+i.getString(3));
			System.out.println();
		}
	}
}