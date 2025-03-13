package Java;

public class Static_staticadd 
{
	static int x=50;
	static void add()
	{
		int a= 10;
		int b= 20;
		int c = a+b;
		System.out.println(c);
	}

}
class Son
{
	public static void main(String[] args) {
		
		Static_staticadd.add();
		System.out.println(Static_staticadd.x);
	}
}
