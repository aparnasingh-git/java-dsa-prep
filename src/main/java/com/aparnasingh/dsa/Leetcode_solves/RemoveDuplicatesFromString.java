package codingProblems;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

    public static String removeDuplicates(String s) {
    	StringBuilder sb=new StringBuilder();
    	HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()) {
         if(!set.contains(ch)) {
        	 set.add(ch);
        	 sb.append(ch);
         }
        }
    	
    	return sb.toString();
         
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); // progamin
        System.out.println(removeDuplicates("aabbcc"));       // abc
        System.out.println(removeDuplicates("leetcode"));     // letcod
    }
}
