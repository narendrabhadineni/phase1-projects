package typecasting;
public class typecasting {

	public static void main(String[] args) {
		System.out.print("explicit");
		System.out.println("Typecasting");
		
		double a=25.6;
		int b=(int)a;
		System.out.println("the value of a="+a);
		System.out.println("the value of b="+b);
		System.out.println("\n");
		
		
		System.out.print("implicit");
		System.out.println("Typecasting");
		char p='P';
		System.out.println("the value of p="+p);
		int q='p';
		System.out.println("the value of q="+q);
		float r='p';
		System.out.println("the value of r="+r);
		long s='p';
		System.out.println("the value of s="+s);
		double t='p';
		System.out.println("the value of t="+t);
		System.out.println("\n");
		

	}

}