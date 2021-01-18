package studentManagement;
import java.lang.ClassNotFoundException;
import java.sql.SQLException;
public class Students {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentBean sb = new StudentBean();
		sb.setRegno(190031721);
		sb.setName("Ananya");
		sb.setEmail("ananya@gmail.com");
		InsertStudent si = new InsertStudent();
		int i = si.StudentInsert(sb);
		if(i>0)
			System.out.println("Insertion Successful");
		else
			System.out.println("Insertion Failed");
	}
}