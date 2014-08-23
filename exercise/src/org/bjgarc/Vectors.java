package org.bjgarc;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		String[] letters = {"A", "C", "D", "X", "F", "D", "B", "B", "A", "D"};
		Vector<String> vec = new Vector<String>();
		
		for(int i=0; i<letters.length; i++) {
			if (!vec.contains(letters[i])) {
				vec.add(letters[i]);
			}
		}
		
		Iterator<String> it = vec.iterator();
		while(it.hasNext()) {
			System.out.println((String)it.next());
		}
		
		for(int i=0; i<vec.capacity(); i++) {
			for(int j=0; j<vec.capacity(); j++) {
				if(vec.get(i).compareToIgnoreCase(vec.get(j)) < 0) {
					//tmp = vec.get[i];
					
				}
			}
		}

	}

}
