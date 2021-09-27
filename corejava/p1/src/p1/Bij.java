package p1;

public class Bij {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			int num=27/3;
			System.out.println(num);
		}
		catch(Exception e)
	{
	System.out.println("4");	
	}
	finally {
		System.out.println("95");
	}
	}

}
