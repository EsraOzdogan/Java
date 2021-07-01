package GameProject.Entities;

public class Gamer {
	private int gamerId;
	private String firstName;
	private String lastName;
	private int birthOfYear;
	private String nationalIdentity;
	
	
	public Gamer() {
	}

	public Gamer(int gamerId, String firstName, String lastName, int birthOfYear, String nationalIdentity) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.nationalIdentity = nationalIdentity;
	}
	
	public int getId() {
		return gamerId;
	}
	public void setId(int gamerId) {
		this.gamerId = gamerId;
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
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}


}
