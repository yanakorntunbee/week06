package week6;

public class local101 {
	
	String rd ="RED VELVET" ; 
	
	static int age = 10;
	
	static String cat = "luca";
	
	public static void main(String[]args) {
		
		local101 obj = new local101();
		
		String owner ="lisa";
		
		System.out.println("The name of is : "+ cat + " and Tommy is : "+ owner);
		
		cat();
		
		obj.display();
		
	}
	
	public static void cat() {
		
		age = 2019 ;
		
		age=age+1;
		
		System.out.println(age);
		
	}
	
	public void display() {
		
		System.out.println(rd);
		
	}
}
