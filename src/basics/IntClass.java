package basics;

public class IntClass {
	
	private IntClass() {
		
	}
	public static IntOne<Boolean> m1(boolean i) {
		return new IntOne<Boolean>() {

			
			
			@Override
			public Boolean applies(Object input) {
				// TODO Auto-generated method stub
				return i;
			}
			
		};
		
	}
	
	
	

}
