package demo;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    	List<String> str1=List.of("d","e","ed","co","aa");
    	String match="code";

    	List<String> sorted = str1.stream().sorted()
    	.collect(Collectors.toList());

    	String word="";
    	for(String str : sorted){
    	  word = word.concat(str);
    	}

    	if(word.contains(match)){ 
    		String res = word.substring(word.lastIndexOf(match)); 
    		System.out.print("Word Matched =>"+ res); 
    	}
    }
}


