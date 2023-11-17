package edu.desu.exam02.part02;

public class Recursion {

    public int countSubString(String pattern, String word){
        int answer = 0;
        if (word.length() < pattern.length()){
            return answer;
        }
        if (pattern.equals(word.substring(0,pattern.length()))){
            answer++;
        }
        return answer + countSubString(pattern, word.substring(1));
    }
}
