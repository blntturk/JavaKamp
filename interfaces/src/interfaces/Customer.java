package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName; // private dikkat et.

// Bo? Constructor olu?turduk
	public Customer() {

	}

// Source menusunden Constructor olu?turduk
	public Customer(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

// Source menusunden Getter-Setter olu?turduk
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}