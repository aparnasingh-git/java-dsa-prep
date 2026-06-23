package codingProblems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheckUsingJava8 {

	public static boolean isAnagram(String str1, String str2) {

		str1.chars().mapToObj(c->(char)c).forEach(System.out::print);

		LinkedHashMap<Character,Long> collect = str1.toLowerCase().replaceAll("[^a-z0-9]", "").chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));

		LinkedHashMap<Character,Long> collect2 = str2.toLowerCase().replaceAll("[^a-z0-9]", "").chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));
		
				return collect.equals(collect2);
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("Listen", "Silent"));          // true
		System.out.println(isAnagram("Dormitory", "Dirty room!!")); // true
		System.out.println(isAnagram("Java", "Spring"));            // false
	}
}

