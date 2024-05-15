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
	
	public int div(int x,int y) {
		int div=0;
		if(y>0) {
			div=x/y;
		}
		return div;
	}
	
    public static void main( String[] args )
    {

    	System.out.println("App.main()");
    	App app = new App();
        System.out.println("Sum is ::: "+app.add(10, 20));
        System.out.println("Subtraction is :: "+app.sub(20, 20));
        System.out.println("Multiplication is :"+app.mul(10, 20));
        //new line added
        System.out.println("Division is :"+app.div(10, 20));
        
        //conflict test
        System.out.println("Subtraction is :: "+app.sub(200, 200));
    }
}
