
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
public class Main {
    
    public static void main(String[] args){
        HashMap<String, String> hashmap = new HashMap<>();
        Program program=new Program();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        program.printKeys(hashmap);
        System.out.println("---");
        program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        program.printValuesOfKeysWhere(hashmap, ".e");
    }
    
}
