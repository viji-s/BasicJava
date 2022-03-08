package basics;
/*note 
 * this anonymous class is very useful, suppose we want to use any interface particular method and we don't want all the methods ,
 * if we implement that interface in class we are suppose to give impelementation for all the class, rather we can use anonymous class where we can use the required specific method alone
 * instead having or implementing everything
 * 
 * 
 * 
 * */

	interface Drawable{  
	    public void draw();  
	}  
	public class LambdaExpressionExample {  
	    public static void main(String[] args) {  
	        int width=10;  
	  
	        //without lambda, Drawable implementation using anonymous class  
	        Drawable d=new Drawable(){  
	            public void draw()
	            {
	            	System.out.println("Drawing "+width);
	            	}  
	        };  
	        System.out.println(d.getClass().getName());
	        d.draw();  
	    }  
	  
}
