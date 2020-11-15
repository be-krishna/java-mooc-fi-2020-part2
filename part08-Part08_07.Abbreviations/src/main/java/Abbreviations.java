
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizeKey(abbreviation);

        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizeKey(abbreviation);

        if (abbreviations.containsKey(abbreviation)) {
            return true;
        }

        return false;
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizeKey(abbreviation);

        if (this.abbreviations.containsKey(abbreviation)) {
            return this.abbreviations.get(abbreviation);
        }

        return null;
    }

    public String sanitizeKey(String key) {
        if (key == null) {
            return "";
        }

        key = key.toLowerCase();
        return key.trim();
    }
}
