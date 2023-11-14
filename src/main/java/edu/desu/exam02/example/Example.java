package edu.desu.exam02.example;

public class Example {

    public String endX(String str){
        if(str.length() < 1){
            return str;
        }

        String firstCharacter = str.substring(0,1);
        String subStr = str.substring(1);
        String preChar = "";
        String postChar = "";
        if(!firstCharacter.equals("x")){
            preChar = firstCharacter;
        } else {
            postChar = "x";
        }
        return preChar + endX(subStr) + postChar;
    }
}
