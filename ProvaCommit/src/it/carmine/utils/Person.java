package it.carmine.utils;

public class Person 
{
    public Person(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
    	setId(i);
    	setFname(string);
    	setLname(string2);
	}
	private Integer id;
    private String fname;
    private String lname;
	/**
	 * @return
	 */
	public String getFname() {
		// TODO Auto-generated method stub
		return fname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
}