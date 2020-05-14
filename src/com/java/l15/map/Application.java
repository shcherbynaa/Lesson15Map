package com.java.l15.map;

import java.util.Scanner;

public class Application {

	public static void menu() {
		System.out.println("1. Add member");
		System.out.println("2. Add animal to member");
		System.out.println("3. Remove animal from club");
		System.out.println("4. Remove member from club");
		System.out.println("5. Remove animal from all members");
		System.out.println("6. Show zooclub");
		System.out.println("7. Exit");
	}

	public static void main(String[] args) {
		Zooclub club = new Zooclub();
		while (true) {
			menu();
			System.out.println("Enter number to make your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				club.addMember();
				break;
			case 2:
				club.addAnimal();
				break;
			case 3:
				club.removeAnimal();
				break;
			case 4:
				club.removeMember();
				break;
			case 5:
				club.removeAnimalFromClub();
				break;
			case 6:
				club.showClub();
				break;
			case 7:
				System.exit(0);
				System.out.println("Exit...");
			}
		}
	}
}
