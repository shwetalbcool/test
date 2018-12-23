
public class Abc{
	
	public void  m1(String s) {
		System.out.println("String version");
		
	}
	public void  m1(Object o) {
		System.out.println("Object method ");
		
	}
	public void m1(StringBuffer s) {
System.out.println("SB version");		
	}
	public static void main(String[] args) {
		Abc	abc = new Abc();
		abc.m1("shwetal");
		abc.m1(new Object());
	//	abc.m1(null);       Ambigious 
	//  abc.m1(null);       Ambigious
		abc.m1("Shwetal");
		abc.m1("Abc");
	//	abc.m1(null);       Ambigious
	}
}

/*public class Abc{
	public static void main(String[] args) {
		A a = new A();
		a.m1(10);
		a.m1(10.3f);
		a.m1(10.6f);
	}
	

	
	
}
class A
{void m1(int a) {
}
int m1(float b){
	return 0;
	
}
int m1(double b){
	return 0;
}

}
*/
/*
public class Abc{
	Animal a=  new Cat();
	Animal a2=  new Dog();
	Dog d= new Dog();
	Cat c=new Cat();
	//Cat c1= new Animal();
}
class Animal{
	String name(int i) {
		return null;
	}
	String name(float i){
		return null;		
	}
	int name(double i){
		return 0;
		
	}
}
class Dog extends Animal{
	
	
	
}
class Cat extends Animal{
	
}*/
/*
interface I1{
	void m1();
	
}
interface I2{
	void m2();
	
}

class A  implements I1 ,I2{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}
class B extends A{
	*/

/*protected void m1(){
		
	}
*/
/*	}
public class Abc extends Throwable{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	}

*/

/*class A{
	public void m1()
	{
		System.out.println("m1 called");
	}
	public void m2()
	{
		System.out.println("m2 called");
	}

}
class B extends A{
	public void  m3() {
		System.out.println("m3 called");
		
	}
}

public class Abc{
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
		A a1=new A();
		a1.m1();
		a1.m2();
		
		B b=new B();
		b.m3();
	}
	
}
*/

/*
class myclass
{

}
interface a1<myclass>
{
   Integer get();
}

public class Abc implements a1
{
    myclass a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer get() {
		// TODO Auto-generated method stub
		return null;
	}

}
*/