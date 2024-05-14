package com.mea;

public class App 
{
	public int add(int x,int y) {
		return x+y;
	}
	
	public int sub(int x,int y) {
		return x-y;
	}
	
	public int mul(int x,int y) {
		return x*y;
	}
	
    public static void main( String[] args )
    {

    	System.out.println("App.main()");
    	App app = new App();
        System.out.println("Sum is ::: "+app.add(10, 20));
        System.out.println("Subtraction is :: "+app.sub(20, 20));
        System.out.println("Multiplication is :"+app.mul(10, 20));
    }
}
