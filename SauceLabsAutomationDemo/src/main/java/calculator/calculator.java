package calculator;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator objcal=new calculator();
		
		String value=objcal.getString();
		System.out.println("the string return by get string method si: "+value);

	}
	
	public String getString() {
		return "Hello world";
	}

}
