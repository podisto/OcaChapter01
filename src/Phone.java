
// A class is a design from which an object can be created.
class Phone {
	String model;
	String company;
	
	Phone(String model) {
		this.model = model;
	}
	
	double weight;
	
	void makeCall(String number) {
		System.out.println("Make call ...");
	}
	
	void receiveCall() {
		System.out.println("Ringing...");
	}
}
