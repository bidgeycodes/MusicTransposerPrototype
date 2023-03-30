package com.techelevator;

import com.techelevator.view.Console;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	Scanner userInput = new Scanner(System.in);

	private Console console;
	private String noteSelection;
	private String chordOrKeySelection;
	private String majorOrMinor;
	private Notes notes = new Notes();

	public Application(Console console) {
		this.console = console;
	}

	public void run() {

		console.welcomeMessage();

		while (true) {
			noteSelection = console.noteSelection();
			if (!notes.getNotesByKeySignature().contains(noteSelection)) {
				console.invalidMessage();
				continue;
			}
			majorOrMinor = console.majorOrMinor();
			if (!majorOrMinor.equalsIgnoreCase("major") && !majorOrMinor.equalsIgnoreCase("minor")) {
				console.invalidMessage();
				continue;
			}
			chordOrKeySelection = console.chordOrKeySelection();
			if (!chordOrKeySelection.equalsIgnoreCase("key") && !chordOrKeySelection.equalsIgnoreCase("chord")) {
				console.invalidMessage();
				continue;
			}

			if (majorOrMinor.equalsIgnoreCase("major")) {
				// major
				// disambiguation of F#/Gb
				if (noteSelection.equals("F#/Gb")) {
					noteSelection = "Gb";
				}

				if (chordOrKeySelection.equalsIgnoreCase("chord")) {
					// major chord
					Map<String, List<String>> keySignatureIdentifier = notes.getKeySignatureIdentifier();
					List<String> notesByKeySignature = keySignatureIdentifier.get(noteSelection);
					int firstNoteIndex = notesByKeySignature.indexOf(noteSelection);
					int secondNoteIndex = (notesByKeySignature.indexOf(noteSelection) + 4) % notesByKeySignature.size();
					int thirdNoteIndex = (notesByKeySignature.indexOf(noteSelection) + 7) % notesByKeySignature.size();
					String requestedChord = notesByKeySignature.get(firstNoteIndex) + " " + notesByKeySignature.get(secondNoteIndex) + " " + notesByKeySignature.get(thirdNoteIndex) + " ";
					console.request(requestedChord);
				} else {
					// major key
					Map<String, List<String>> keySignatureIdentifier = notes.getKeySignatureIdentifier();
					List<String> notesByKeySignature = keySignatureIdentifier.get(noteSelection);
					int doo = notesByKeySignature.indexOf(noteSelection);
					int re = (doo + 2) % notesByKeySignature.size();
					int mi = (re + 2) % notesByKeySignature.size();
					int fa = (mi + 1) % notesByKeySignature.size();
					int so = (fa + 2) % notesByKeySignature.size();
					int la = (so + 2) % notesByKeySignature.size();
					int ti = (la + 2) % notesByKeySignature.size();
					String requestedKey = notesByKeySignature.get(doo) + " " + notesByKeySignature.get(re) + " " + notesByKeySignature.get(mi) + " " + notesByKeySignature.get(fa)
							+ " " + notesByKeySignature.get(so) + " " + notesByKeySignature.get(la) + " " + notesByKeySignature.get(ti) + " " + notesByKeySignature.get(doo);
					console.request(requestedKey);
				}
			} else {
				// minor
				List<String> keySignatures = notes.getNotesByKeySignature();
				int indexOfSelectedKey = keySignatures.indexOf(noteSelection);
				// get the index of selectedKey before noteSelection is altered, so that the indexing is accurate for F#/Gb
				// if this were to be created later, "F#/Gb" would not be found and indexOf would give a result of -1
				// disambiguation of F#/Gb
				if (noteSelection.equals("F#/Gb")) {
					noteSelection = "F#";
				}
				if (chordOrKeySelection.equalsIgnoreCase("chord")) {
					// minor chord
					Map<String, List<String>> keySignatureIdentifier = notes.getKeySignatureIdentifier();
					List<String> notesByKeySignature = keySignatureIdentifier.get(noteSelection);
					int firstNoteIndex = notesByKeySignature.indexOf(noteSelection);
					int secondNoteIndex = (notesByKeySignature.indexOf(noteSelection) + 3) % notesByKeySignature.size();
					int thirdNoteIndex = (notesByKeySignature.indexOf(noteSelection) + 7) % notesByKeySignature.size();
					String requestedChord = notesByKeySignature.get(firstNoteIndex) + " " + notesByKeySignature.get(secondNoteIndex) + " " + notesByKeySignature.get(thirdNoteIndex) + " ";
					console.request(requestedChord);
				} else {
					int indexOfMajorKeyForRelativeMinor = (indexOfSelectedKey + 3) % keySignatures.size();
					// add index + 3 to the list of key signature-based list, NOT scales
					noteSelection = notes.getNotesByKeySignature().get(indexOfMajorKeyForRelativeMinor);

					Map<String, List<String>> keySignatureIdentifier = notes.getKeySignatureIdentifier();
					List<String> notesByKeySignature = keySignatureIdentifier.get(noteSelection);
					int doo = notesByKeySignature.indexOf(noteSelection);
					int re = (doo + 2) % notesByKeySignature.size();
					int mi = (re + 2) % notesByKeySignature.size();
					int fa = (mi + 1) % notesByKeySignature.size();
					int so = (fa + 2) % notesByKeySignature.size();
					int la = (so + 2) % notesByKeySignature.size();
					int ti = (la + 2) % notesByKeySignature.size();
					String requestedKey = notesByKeySignature.get(la) + " " + notesByKeySignature.get(ti) + " " + notesByKeySignature.get(doo) + " " + notesByKeySignature.get(re)
							+ " " + notesByKeySignature.get(mi) + " " + notesByKeySignature.get(fa) + " " + notesByKeySignature.get(so) + " " + notesByKeySignature.get(la);
					console.request(requestedKey);
				}

			}
		}
	}


	public static void main(String[] args) {
		Console console = new Console();
		Application cli = new Application(console);
		cli.run();
	}
}
