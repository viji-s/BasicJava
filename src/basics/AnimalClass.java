package basics;

public class AnimalClass {

	
	private AnimalClass() {
		
	}
	
	
	public static AnimalInt<Integer,Boolean> soundBark() {
		return new AnimalInt<Integer,Boolean>(){

			

			@Override
			public Boolean apply(Integer t) {
				// TODO Auto-generated method stub
				return true;
			}
		
	};
}
}
