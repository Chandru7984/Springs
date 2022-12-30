package java_test;

public class ReverseString {
	
	public static void main(String[] args) {
		String lemon = "Killer";
		String pig="";
		
		for (int i = lemon.length() - 1; i >= 0; i--) {
			
			pig=lemon+pig.charAt(i);
		}
		
		System.out.println(pig);
	}

}
