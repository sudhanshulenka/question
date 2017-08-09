package com.codility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterenCompiler {
	
	public static List<String> getAllMatches(String text, String regex) {
	        List<String> matches = new ArrayList<String>();
	        Matcher m = Pattern.compile("(?=(" + regex + "))").matcher(text);
	        while(m.find()) {
	            matches.add(m.group(1));
	        }
	        return matches;
	    }
	/*public static List<String> getAllMatches(String text, String regex) {
	    List<String> matches = new ArrayList<String>();
	    for(int length = 1; length <= text.length(); length++) {
	        for(int index = 0; index <= text.length()-length; index++) {
	            String sub = text.substring(index, index + length);
	            if(sub.matches(regex)) {
	                matches.add(sub);
	            }
	        }
	    }
	    return matches;*/
	//}

	    public static void main(String[] args) {
	      //  System.out.println(getAllMatches("GraphTreesGraph", "G.G"));
	    	String s="GraphTreesGraph";
	    	List<String> allMatches = new ArrayList<String>();
	    
	    	  if( s.matches("r"));
	           int length= s.split("r").length;
	    	System.out.println(length-1);
	       }

}
