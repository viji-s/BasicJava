package basics;

abstract class MyClass<T>{  
    abstract T add(T num, T num2);  
}  
public class JavaExample {  
    public static void main(String[] args) {  
    	
        MyClass<Integer> obj = new MyClass<Integer>() {  
              	Integer add(Integer x, Integer y) {  
                return x+y;   
            }  
        };    
        Integer sum = obj.add(100,101);  
        System.out.println(sum);  
    }  
}