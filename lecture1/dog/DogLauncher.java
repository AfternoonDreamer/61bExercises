public class DogLauncher {
	public static void main(String[] args) {
		Dog d = new Dog(5);

		Dog d2 = new Dog(100);
	
		//Dog.makeNoise();
//static method option:
		//Dog bigger = Dog.maxDog(d, d2);
		//bigger.makeNoise();

//non-static method option:
		//Dog bigger2 = d.maxDog2(d2);
		//bigger2.makeNoise();


//Exercise 1.2.1 What would the following method do?
		Dog bigger3 = d.maxDog3(d, d2);
		bigger3.makeNoise();
		
	}
}