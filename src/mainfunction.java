
public class mainfunction {

	public static void main(String args[]) {
		
		int x1=65;
		double x2=1.1234567891;
		long x3;
		String x4="444";
		int raddix =16; 
		char x5='a';
		typecast calling = new typecast();
		explicitypecast calling2 = new explicitypecast(); 
		
		System.out.println("Original input in int:"+x1);
		System.out.println("Converted to char:"+calling.intconvert(x1)); 
		System.out.println("\n");
		
		System.out.println("Original input in double:"+x2);
		System.out.println("Converted  to long:"+calling.dblconvert(x2)); 
		System.out.println("\n");

		System.out.println("Original input in String (which is in hexadecimal form):"+x4);
		System.out.println("Converted to int:"+calling.stringconvert(x4,raddix)); 
		System.out.println("\n");
		
		System.out.println("Original input in double:"+x2);
		System.out.println("Converted  to float:"+calling.dblconvert2(x2)); 
		System.out.println("\n");
		
		System.out.println("The Follwing outputs represent explicit type casting");
		System.out.println("Original input in int:"+x1);
		System.out.println("Converted to double:"+calling2.intconvert2(x1)); 
		System.out.println("\n");
		
		System.out.println("Original input in char:"+x5);
		System.out.println("Converted to int:"+calling2.convertchar(x5)); 
		System.out.println("\n");
		}}
