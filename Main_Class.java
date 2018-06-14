package Assign_1;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Main_Class {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of face for dice: ");
		int faces = scn.nextInt();
		System.out.println();
		Dice d = null;
		if(faces==2) {
			d=new TwoFaceDice();
		}
		else if(faces==4) {
			d=new FourFaceDice();
		}
		else if(faces==6) {
			d=new SixFaceDice();
		}
		else {
			System.out.println("Enter correct input");
			return;
		}
		System.out.println("Face is: "+d.showFace());

	}

}
