package com.org.tav.day3;
/*class X {
	public void m1() {
		
	}
}
class Y {
	public void m1() {
		
	}
}
class Z{
	public void m1() {
		
	}
	
}*/
interface X{
	public void m2();
		
}
interface Y{
	public void m3();
}
interface Z{
	public void m4();
}
public class Demo implements X , Y , Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Method m4");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Method m3");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method m2");
	}

}
