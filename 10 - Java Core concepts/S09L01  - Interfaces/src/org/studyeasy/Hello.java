package org.studyeasy;

import org.studyeasy.phone.Iphone8;
import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone1 = new OnePlus5();
		System.out.println("Processor : "+phone1.processor());
		
		Phone phone2 = new Iphone8();
		System.out.println("Processor : "+phone2.processor());
		
	}

}
