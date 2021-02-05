package studentManagement;
import java.sql.SQLException;
import java.util.*;
public class StudentMain 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		StudentBean s = new StudentBean();
		Scanner scan = new Scanner(System.in);
		StudentOperation so = new StudentOperation();
		while(true) {
			System.out.println("CRUD OPERATIONS TO BE SELECTED...");
			System.out.println("1. Insert Student data.");
			System.out.println("2. Delete Student data.");
			System.out.println("3. Update Student data.");
			System.out.println("4. Display Student data.");
			System.out.println("5. exit.");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Registration no:");
				s.setReg(scan.nextInt());
				System.out.println("Name: ");
				s.setName(scan.next());
				System.out.println("Email: ");
				s.setEmail(scan.next());
				int i = so.StudentInsert(s);
				if(i > 0) {
					System.out.println("Insertion is successful");
				}	
				else
					System.out.println("Insertion failed");
				break;
			case 2:
				System.out.println("Enter REG to delete: ");
				int reg = scan.nextInt();
				int j = so.StudentDelete(reg);
				if(j > 0) {
					System.out.println("Row Effeted!");
				}
				else
					System.out.println("FAILED");
				break;
			case 3:
				System.out.println("Enter id to make changes with..");
				int reg1 = scan.nextInt();
				System.out.println("Enter name to update..");
				String name1 = scan.next();
				System.out.println("Enter email to update..");
				String email1 = scan.next();
				int k = so.StudentUpdate(reg1, name1, email1);
				if(k > 0)
					System.out.println("Row Effected!");
				else
					System.out.println("FAILED!");
				break;
			case 4:
				so.StudentDisplay();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Enter Valid no.");
			}	
		}	
	}
}