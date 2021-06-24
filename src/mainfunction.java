
public class mainfunction {

	public static void main(String args[]) {
		
		int x1=65;
		double x2=1.12345678910;
		long x3;
		String x4="444";
		int raddix =16; 
		
		typecast calling = new typecast() ;
		
		System.out.println("Original input in int:"+x1);
		System.out.println("Converted Output to char:"+calling.intconvert(x1)); 
		System.out.println("\n");
		
		System.out.println("Original input in double:"+x2);
		System.out.println("Converted Output to long:"+calling.dblconvert(x2)); 
		System.out.println("\n");

		System.out.println("Original input in String (which is in hexadecimal form):"+x4);
		System.out.println("Converted Output to int:"+calling.stringconvert(x4,raddix)); 
		System.out.println("\n");
		
		System.out.println("Original input in double:"+x2);
		System.out.println("Converted Output to float:"+calling.dblconvert2(x2)); 
		System.out.println("\n");
		
		
		}
}
