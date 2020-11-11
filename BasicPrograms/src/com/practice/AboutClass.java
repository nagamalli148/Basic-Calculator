/* Java is OOP it means everything moves around objects.
Class basically a definition of an object when u create an obj it means u can access variables,methods in that class. 
// It contains variables and methods
 * Make variable private and make Methods public to access variables.
*/

package com.practice;

class Movie {  //Entity
	
	//Variables
	private String name;   
	private String category; 
	
	//Method
	public void setValues(String n,String c) {
		name=n;
		category=c;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
}

public class AboutClass {

	public static void main(String[] args) {
		
       Movie a=new Movie();
       a.setValues("Matrix","Action");
       
       Movie b=new Movie(); 
       
       b.setValues("Titanic","Drama");    
       
       System.out.println(a.getName());
       
       System.out.println(a.getCategory());
       
       System.out.println("\n");
       
       System.out.println("Another Movie is: ");
       
       System.out.println(b.getName());
 
       System.out.println(b.getCategory());
	
	}

}