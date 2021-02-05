package superMarket;
import java.sql.SQLException;
import java.util.Scanner;
public class ItemMain {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		ItemBean ib = new ItemBean();
		Scanner scan = new Scanner(System.in);
		DAO si = new DAO();
		while(true) {
			System.out.println("CRUD OPERATIONS To Be DONE...");
			System.out.println("1. Insert the data.");
			System.out.println("2. Display the data.");
			System.out.println("3. Total Cost of the items");
			System.out.println("4. Exit.");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter id:");
				ib.setId(scan.nextInt());
				System.out.println("Enter item name ");
				ib.setName(scan.next());
				System.out.println("Enter item cost: ");
				ib.setCost(scan.nextFloat());
				int i = si.Insert(ib);
				if(i > 0) {
					System.out.println("Insertion is successful");
				}	
				else
					System.out.println("Insertion failed");
				break;
			case 2:
				si.Display();
				break;
			case 3:	
				System.out.println("Total Cost:");
				si.TotalCost();
				break;
			case 4:	
				System.exit(0);
			default:
				System.out.println("Enter a valid number");
			}
		}
	}
}