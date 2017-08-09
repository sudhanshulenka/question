package com.hackrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringFunny {
	
	

	    public static void main(String[] args) {
	    /* Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            String result = funnyString(s);
	            System.out.println(result);
	        }*/
	    	test();
	    }
	    
	    
	    static String funnyString(String s){
			if(null!=s && !" ".equals(s) && s.length()>2) {
	         char[] chardata=	s.toCharArray();
		      List<Integer> dataintlist=new ArrayList<>();
		      
			for (int i = 0; i < chardata.length; i++) {
				Integer asiccode = (int) chardata[i];
			}
	      
			}
	    	return s;
	    }
	    
	    static   void test() {
	    	  ArrayList<Integer> list = new ArrayList<Integer>();
	          
	          //Adding elements to list
	           
	          list.add(1452);
	           
	          list.add(6854);
	          list.add(6854);
	           
	          list.add(8741);
	          list.add(8741);
	          list.add(6542);
	          list.add(6542);
	          list.add(6542);
	          list.add(3845);
	       List<Object> dupicatelist= list.stream()
	           .collect(Collectors.groupingBy(e->e,Collectors.counting()))
	            .entrySet().stream()
	              .filter(e->e.getValue()>1)
	                .collect(Collectors.toList());
	       
	    List<Integer> datlist=   list.stream().distinct().collect(Collectors.toList());
	    
	      
	       System.out.println(datlist);
	          
	    //   System.out.println(dupicatelist);
	         
	      //  System.out.println(list);
	    }
}
