package api.concepts.APIConcepts;

import groovy.transform.ASTTest;

public class ReplaceAll {
    public static void main(String [] args){
      String name = "kasvika123@##$";
        name = name.replaceAll("[a-z 0-9]","");
        System.out.println("only special chars : " name);
    }
}
