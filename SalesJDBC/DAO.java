package superMarket;
import studentManagement.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.ResultSet;
public class DAO {
	public int Insert(ItemBean student) throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement statement = con.prepareStatement("insert into sales values(?, ?, ?)");
		statement.setInt(1,  student.getId());
		statement.setString(2,  student.getName());
		statement.setFloat(3,  student.getCost());
		int i = statement.executeUpdate();
		return i;	
	}
	public void Display() throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement statement = con.prepareStatement("select itemid, itemname, Cost from sales");
		ResultSet i = (ResultSet) statement.executeQuery();
		System.out.println("ItemId\t\tItemName\t\tCost");
		while(i.next()) {
			System.out.print(i.getInt(1));
			System.out.print("\t\t"+i.getString(2));
			System.out.print("\t\t"+i.getFloat(3));
			System.out.println();
		}
	}
	public void TotalCost() throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement statement = con.prepareStatement("select sum(Cost) from sales");
	    ResultSet i = (ResultSet) statement.executeQuery();
	    i.next();
	    String sum = i.getString(1);
	    double value = Double.parseDouble(sum);
	    System.out.println(value);	    	
	}
}