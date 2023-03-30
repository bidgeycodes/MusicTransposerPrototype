package com.techelevator.view;

import java.util.Scanner;

/**
	KNOWN BUGS
	- Db minor key returns it in C#
	- NULL POINTER EXCEPTION
	- rephrase the question to ask for the major's relative minor? (explain "relative minor"?)
*/

public class Console {

	Scanner in = new Scanner(System.in);

	public void welcomeMessage() {
		System.out.println();
		System.out.println("do-re-mi-fa-so-la-ti-do");
		System.out.println();
	}

	public String noteSelection() {
		System.out.println("Which key or chord would you like to transpose?");
		System.out.println("Please select from the following options:");
		System.out.println();
		System.out.println("C, Db, D, Eb, E, F, F#/Gb, G, Ab, A, Bb, B");
		String selection = in.nextLine();

		return selection;
	}

	public String majorOrMinor() {
		System.out.println();
		System.out.println("Would you like the major or its relative minor?");
		System.out.println("Type major or minor");
		System.out.println("Note: the 'relative minor' will return the major key you selected");
		String selection = in.nextLine();
		return selection;
	}

	public String chordOrKeySelection() {
		System.out.println();
		System.out.println("Do you want the 8-note key ascending or the 3-note chord?");
		System.out.println("Type key or chord.");
		String selection = in.nextLine();

		return selection;
	}

	public void request(String returned) {
		System.out.println();
		System.out.println(returned);
		System.out.println();
	}

	public void invalidMessage() {
		System.out.println();
		System.out.println("Invalid entry. Please select from the options provided.");
		System.out.println();
	}
}

