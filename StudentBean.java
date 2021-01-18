package studentManagement;
public class StudentBean {
	private String name,email;
	private int regno;
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public int getRegno() {
		return regno;
	}
	public String getName() {
		return name;
	}
}