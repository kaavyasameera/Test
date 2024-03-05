package api.concepts.APIConcepts;

import groovy.transform.ASTTest;

public class ReplaceAll {
    public static void main(String [] args){
        String name = "KASVIKA123@#";
        name = name.replaceAll("[^a-z]","").toLowerCase();
        System.out.println("name is in small letters : "name);
    }
}
