
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.dict.containsKey(word)) {
            this.dict.get(word).add(translation);
        } else {
            this.dict.put(word, new ArrayList<>());
            this.dict.get(word).add(translation);
        }

    }

    public ArrayList<String> translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        this.dict.remove(word);
    }
}
