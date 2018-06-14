package Assign_1;

public class TwoFaceDice extends Dice {

	TwoFaceDice() {
		super(2);
	
	int num = generateNumber(2);
	if(num==1)
		face="HEAD";
	else
		face="TAIL";
	}
}
