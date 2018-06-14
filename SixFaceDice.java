package Assign_1;

public class SixFaceDice extends Dice {

	public SixFaceDice() {
		super(6);
		int num = generateNumber(6);
		face=num+"";
		}

}
