
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jon
 */
public class Abbreviations {

    private HashMap<String, String> Abbreviations;

    public Abbreviations() {
        this.Abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.Abbreviations.put(abbreviation, explanation);

    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.Abbreviations.containsKey(abbreviation)) {
            return true;
        }
        else{
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if(hasAbbreviation(abbreviation)){
            return this.Abbreviations.get(abbreviation);
        }
        else{
            return null;
        }
    }
}
