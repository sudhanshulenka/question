package com.hackrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVFIleLoadAndSplit {
	
	public static void main(String[] args) throws Exception {
	
		    List<String> inputList = new ArrayList<String>();
		  
		      File inputF = new File("C://Users//SudhanshuLenka//Desktop//testing1.csv");
		      InputStream inputFS = new FileInputStream(inputF);
		      BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
		      String line;
		      while((line = br.readLine()) != null){
		    	String[] csvdata=line.split("|");
		    	csvdata[1]="xyz";
		      }
		      br.close();
		      inputFS.close();
	}

}
