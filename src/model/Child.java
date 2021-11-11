package model; 

public class Child implements Comparable{
	private String name;
	private String lastName;
	private String address;
	private String city;
	private String country;
	private String wish;
	private int age; 
	private int state;
	
	public Child (String name,String lastName, String address,String city,String country,  String wish, int age, int state ){
		this.name=name;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.country=country;
		this.wish=wish;
		this.age=age;
		this.state=state;
	}
	//Getters and Setters 
	
	public String getName(){
		return name; 
	}
	public void setName(String name){
		this.name=name; 
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName=lastName; 
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address; 
	}
	public String getCity(){
		return city;
	}
	public void setCountry(String country){
		this.country=country; 
	}
	public String getWish(){
		return wish; 
	}
	public void setWish(String wish){
		this.wish=wish; 
	}
	public  int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age; 
	}
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state=state; 
	}
	@Override
	/**
	@param other, Child
	@return out, 
	negative, this is less than other zero, 
	this is equals to other
	positive this is greater than other
	*/
	public int compareTo(Child other){
		int out=-1;
		
		return out;
	}
}