package api.concepts.APIConcepts;

import groovy.transform.ASTTest;

public class ReplaceAll {
    public static void main(String [] args){
        String name = "kaavya123@#";
        name = name.replaceAll("[^a-z]","").toUpperCase();
        System.out.println(name);
    }
}
