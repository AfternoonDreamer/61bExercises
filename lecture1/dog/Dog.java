public class Dog {
    public int weightInPounds;

    /** One integer constructor for dogs. */
    public Dog(int w) { //constructor's signature
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woof!");
        }    
    }
//static method option:
    public static Dog maxDog(Dog d1, Dog d2) {
    	if (d1.weightInPounds > d2.weightInPounds){
		return d1;
   	}
	return d2;
    }

//non-static method option:
    public Dog maxDog2(Dog d2) {
	if(this.weightInPounds > d2.weightInPounds) {
	    return this;
	}
	return d2;
    }

//Exercise 1.2.1 What would the following method do?
    public Dog maxDog3(Dog d1, Dog d2) {
   	 if (weightInPounds > d2.weightInPounds) {
       	 return this;
   	 }
    	return d2;
    }


}
