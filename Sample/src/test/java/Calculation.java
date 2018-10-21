package test.java;

public class Calculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = add(5,7);
		int res = substract(20,5);
		System.out.println("result of add is :::"+result);
		System.out.println("result of substract  is :::"+res);
		Service service = new Service();
		String name = service.getUserName("ram");
		System.out.println("My name is "+name);
		System.out.println("hello123 ");

	}
	
	static int add(int x , int y)
	{
		return x+y;
	}
	
	static int substract(int x , int y)
	{
		return x+y;
	}

}
