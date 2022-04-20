package inheritance;

public class C extends B
{ 
	public void m3()
	{
	System.out.println("m3---c");	
	}

	public static void main(String[] args) {
		C d = new C ();
		d.m2();  
	}

}
 