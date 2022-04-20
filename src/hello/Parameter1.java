package hello;

public class Parameter1 {
	public void m1(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Parameter1 d = new Parameter1();
		d.m1(77,"hello");

	}

}
