/* program to swap the values of two variables without using the third variable */

public class J_S1A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare two variables a & b
		int a,b;
		
		// intialize 
		a=50;
		b=100;
		
		System.out.println("Before swap:");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println();
        System.out.println("After swap:");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
	}

}
