package hello;

public class A2 {
	public void m2() {
		int a = 20;
		System.out.println("the total value of a="+a);
		int b =30;
		System.out.println("the value of b="+b);
		int c =a-b;
		System.out.println("total substraction="+c);
	}

	public static void main(String[] args) {
      A2 c = new A2();
      c.m2();
	}

}
