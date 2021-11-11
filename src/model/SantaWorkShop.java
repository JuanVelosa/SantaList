package model; 
import java.util.ArrayList; 
public class SantaWorkShop {
	ArrayList<Child>kid; 

	public String addKid(String name, String lastName,String address, String city,String country, String wish,int age,int state){
		String message="";
		boolean allreadyExist=false; 
		boolean continues=false; 
		for(int i=0; i<subscriber.length;i++){
			if(subscriber[i]!=null){
				if(subscriber[i].getId().equalsIgnoreCase(id)){
					message="The id you enter allready exist";
					allreadyExist=true; 
				}
			}
		}
		if (allreadyExist==false){
			for(int i=0; i<subscriber.length && !continues;i++){
				if(subscriber[i]==null){
					subscriber[i]=new Subscriber(name, age, id, tc, cd, hoursToConsume);
					message="Subscriber succesfully added"; 
					continues=true; 
				}
			}
		}
		if(allreadyExist==false && continues==false){
			message="Subscriber spaces are full";
		}
		return message;
	}
	public static void kidListOrder(){
		int i, j; 
		Child aux; 
		for (i= 0;i< )
	}
}