package Assign_1;

public class FourFaceDice extends Dice {
	FourFaceDice(){
		super(4);
		int num = generateNumber(4);
		face=num+"";
	}
}
