public class typecast {

	public int stringconvert(String y, int raddix) {
		
		int x = Integer.parseInt(y,raddix);
		return x;
	}
	public long dblconvert(double y) {
		
		long x = (long) y;
		return x;
	}
	public float dblconvert2(double y) {
		
		float x = (float) y;
		return x;
	}
	
	public char intconvert(int y) {
		
		char x = (char) y;
		return x;
	}	
	
}

//The Following class explains Explicit Type Casting
class explicitypecast{
	public double intconvert2(int x) {
		double y=x;
		return y;
	}
	
	public int convertchar(char x) {
		int y=x;
		return y;
}
}