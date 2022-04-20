package hello;

public class C {
	static 
	{
		System.out.println("static");
	}
	{
		System.out.println("non static");
	}

	public static void main(String[] args) {
		C a = new C ();

	}

}
