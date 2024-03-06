package api.concepts.APIConcepts;

import groovy.transform.ASTTest;

public class ReplaceAll {
    public static void main(String [] args){
        String str = "kasvika123@##$";
       str = str.replaceAll("[a-z 0-9]","");
        System.out.println("only special chars : " str);
    }
}
