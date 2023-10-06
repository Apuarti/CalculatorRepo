package GITHUB;

public class Calculator {
	
	
	public int multiply(int a, int b)
	{
		return a*b;
		
	}
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		System.out.println(cal.multiply(5, 10));
	}

}
