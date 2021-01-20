package day9arrayarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArraysSorusu {

	public static void main(String[] args) {
		// String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.
		String []str= {"sali","cuma","pazar","persembe"};
		System.out.println(Arrays.toString(dortHarfli(str)));

	}

	private static String[] dortHarfli(String[] str) {
		
		ArrayList<String> list = new ArrayList<>();
		for (String w:str) {
			if(w.length()==4) {
				list.add(w);
				
			}
			
		}
		String []result = list.toArray(new String[list.size()]);
		return result;
		
	}

}
