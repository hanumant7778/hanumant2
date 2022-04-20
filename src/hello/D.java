package hello;

public class D {
 static 
 {
	 System.out.println("Static");
 }
 {
	 System.out.println("no static");
 }
 public D()
 {
	 System.out.println("constructor");
 }
 public void m1()
 {
	 System.out.println("method"); 
 }
	public static void main(String[] args) {
		D c = new D ();
		c.m1();
       
	}

}
