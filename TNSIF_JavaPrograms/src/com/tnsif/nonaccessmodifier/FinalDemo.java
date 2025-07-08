package com.tnsif.nonaccessmodifier;

class FinalDemo {
	
	int Max = 100;
	
	void display() {
		System.out.println("show the value of max: "+Max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		fd.Max = 200;

	}

}

class Child extends FinalDemo{
	void display() {
		System.out.println("show the value of max: "+Max);
	}
}
