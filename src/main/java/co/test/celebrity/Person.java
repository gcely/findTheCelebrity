package co.test.celebrity;

/**
 * Class that represents a person
 * @author german.cely
 *
 */
public class Person {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private Integer nmbrPeopleKnows;
	
	/*
	 * Default constructor
	 */
	public Person() {
		
	}
	
	/*
	 * Constructor with parameters
	 */
	public Person(Integer id, String firstName, String lastName, String email, String gender, Integer nmbrPeopleKnows) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.nmbrPeopleKnows = nmbrPeopleKnows;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getNmbrPeopleKnows() {
		return nmbrPeopleKnows;
	}

	public void setNmbrPeopleKnows(Integer nmbrPeopleKnows) {
		this.nmbrPeopleKnows = nmbrPeopleKnows;
	}
	

}
