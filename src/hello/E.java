package hello;

public class E {
	public E()
	 {
		 System.out.println("constructor");
	 }

	 static 
	 {
		 System.out.println("Static");
	 }
	 {
		 System.out.println("no static");
	 }
	
	 public void m1()
	 {
		 System.out.println("method"); 
	 }
	public static void main(String[] args) {
		E c = new E ();
		c.m1();

	}

}
