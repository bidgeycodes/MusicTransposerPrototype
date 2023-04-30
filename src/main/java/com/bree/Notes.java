package com.bree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notes {

    private List<String> notesByKeySignature = new ArrayList<String>();
    private List<String> notesInSharpKeys = new ArrayList<String>();
    private List<String> notesInFlatKeys = new ArrayList<String>();
    private Map<String, List<String>> keySignatureIdentifier = new HashMap<String, List<String>>();

    public Notes() {}

    public List<String> getNotesByKeySignature() {
        if (notesByKeySignature.size() == 0) {
            notesByKeySignature.add("C");
            notesByKeySignature.add("Db");
            notesByKeySignature.add("D");
            notesByKeySignature.add("Eb");
            notesByKeySignature.add("E");
            notesByKeySignature.add("F");
            notesByKeySignature.add("F#/Gb");
            notesByKeySignature.add("G");
            notesByKeySignature.add("Ab");
            notesByKeySignature.add("A");
            notesByKeySignature.add("Bb");
            notesByKeySignature.add("B");
        }

        return notesByKeySignature;
    }

    public List<String> getNotesInSharpKeys() {
        if (notesInSharpKeys.size() == 0) {
            notesInSharpKeys.add("C");
            notesInSharpKeys.add("C#");
            notesInSharpKeys.add("D");
            notesInSharpKeys.add("D#");
            notesInSharpKeys.add("E");
            notesInSharpKeys.add("E#");
            notesInSharpKeys.add("F#");
            notesInSharpKeys.add("G");
            notesInSharpKeys.add("G#");
            notesInSharpKeys.add("A");
            notesInSharpKeys.add("A#");
            notesInSharpKeys.add("B");
        }

        return notesInSharpKeys;
    }

    public List<String> getNotesInFlatKeys() {
        if (notesInFlatKeys.size() == 0) {
            notesInFlatKeys.add("C");
            notesInFlatKeys.add("Db");
            notesInFlatKeys.add("D");
            notesInFlatKeys.add("Eb");
            notesInFlatKeys.add("E");
            notesInFlatKeys.add("F");
            notesInFlatKeys.add("Gb");
            notesInFlatKeys.add("G");
            notesInFlatKeys.add("Ab");
            notesInFlatKeys.add("A");
            notesInFlatKeys.add("Bb");
            notesInFlatKeys.add("B");
        }

        return notesInFlatKeys;
    }

    public Map<String, List<String>> getKeySignatureIdentifier() {
        if (keySignatureIdentifier.size() == 0) {
            keySignatureIdentifier.put("C", getNotesByKeySignature());
            keySignatureIdentifier.put("Db", getNotesInFlatKeys());
            keySignatureIdentifier.put("D", getNotesInSharpKeys());
            keySignatureIdentifier.put("Eb", getNotesInFlatKeys());
            keySignatureIdentifier.put("E", getNotesInSharpKeys());
            keySignatureIdentifier.put("F", getNotesInFlatKeys());
            keySignatureIdentifier.put("F#", getNotesInSharpKeys());
            keySignatureIdentifier.put("Gb", getNotesInFlatKeys());
            keySignatureIdentifier.put("G", getNotesInSharpKeys());
            keySignatureIdentifier.put("Ab", getNotesInFlatKeys());
            keySignatureIdentifier.put("A", getNotesInSharpKeys());
            keySignatureIdentifier.put("Bb", getNotesInFlatKeys());
            keySignatureIdentifier.put("B", getNotesInSharpKeys());
        }

        return keySignatureIdentifier;
    }


}
