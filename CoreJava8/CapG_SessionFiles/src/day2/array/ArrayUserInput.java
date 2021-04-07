package day2.array;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of passengers: ");
		int size = sc.nextInt();
		int passengerAge[] = new int[size];
		for (int i=0; i<passengerAge.length; i++) {
			System.out.println("Enter Passenger "+(i+1)+" age:");
			passengerAge[i] = sc.nextInt();
		}
		int ageCount[] = new int[3];
		for (int i=0; i<passengerAge.length;i++) {
			if(passengerAge[i]<18) {
				ageCount[0]++;
			}
			else if(passengerAge[i]>=18 && passengerAge[i]<55) {
				ageCount[1]++;
			}
			else {
				ageCount[2]++;
			}
		}
		System.out.println("Children: "+ageCount[0]);
		System.out.println("Adults: "+ageCount[1]);
		System.out.println("Senior Citizen: "+ageCount[2]);
		sc.close();
	}

}
