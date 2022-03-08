package basics;

import java.util.function.Predicate;

public class Employee {
	
	String name;
	int slary;
	int deptno;
	
	
	public String toString() {
		return name + " "+slary+ " "+deptno;			
	}
	
	Employee(String name,int slary,int deptno){
		this.name=name;
		this.slary=slary;
		this.deptno=deptno;
		
	}
	public static void main(String[] args) {
		
		Employee e=new Employee("viji",100000,101); 
		Predicate<Employee> p=e1->e.slary<5000==true;
		System.out.println(p.test(e));
		p=e1->e.name.length()>3;
		System.out.println(p.test(e));
		
	}

}
