//unique key
//value can repeat or not
//Order will not maintain order

package com.vaish;

import java.util.HashMap;
import java.util.Map;

public class Hashmapmain {

	public static void main(String[] args) {
		HashMap<Integer, String>hob=new HashMap<Integer, String>();
		hob.put(1,"Vaish");
		hob.put(6,"Sakshi");
		hob.put(4,"Adi");
		hob.put(9,"Pranoti");
		hob.put(5,"Adi");
		System.out.println(hob);
		
		//create for phone number
		HashMap<Long, String>num=new HashMap<Long, String>();
		num.put((long) 1234567894, "Riya");//num.put(1234567894l, "Riya");
		num.put((long) 568941237, "Sakshi");
		num.put((long) 256974563, "Adi");
		num.put((long) 1245963258, "Vaish");
		System.out.println(num);
		
		
		
		
	}

}
