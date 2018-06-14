package Assign_1;

import java.util.Random;

public class Dice {
	protected int numberOfFace;
	protected String face;
	
	Dice(int numberOfFace){
		this.numberOfFace=numberOfFace;
		face="";
	}
	
	public String showFace() {
		return face;
	}
	
	public int generateNumber(int n) {
		Random rand = new Random();
		int num = rand.nextInt(n);
		num++;
		return num;
	}
}
