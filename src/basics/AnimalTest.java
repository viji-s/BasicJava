package basics;

public class AnimalTest {

	public AnimalTest(AnimalInt<Integer, Boolean> animalInt) {
	}

	public static void main(String[] args) {

		AnimalTest t = new AnimalTest(new AnimalInt<Integer, Boolean>() {

			@Override
			public Boolean apply(Integer t) {
				System.out.println("true");
				return true;
			}

		});

	}

}
