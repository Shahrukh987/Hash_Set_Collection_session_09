 package com.collection_09;

import java.util.HashSet;
import java.util.Set;

public class BookNain {

	public static void main(String[] args) {
		Book bk1 =new Book("math","rd sharma" , 101);
		Book bk2 =new Book("math","rd sharma" , 102);
		Book bk3 =new Book("enlish","naiyar" , 103);
		Book bk4 =new Book("hindi","abid" , 104);
		Book bk5 =new Book("udu","shahrukh" , 105);
		
		Set<Book> bk = new HashSet<Book>();
		bk.add(bk1);
		bk.add(bk2);
		bk.add(bk3);
		bk.add(bk4);
		bk.add(bk5);
//		print
		
		for(Book bs : bk)
		{
		
		System.out.println(bs.getBookName()+":"+bs.getAuther()+":"+bs.getBookId());
				
	   }

	 
//	searching
	
	boolean found = false;
	for(Book bookobj : bk)
	{
		if(bookobj.getAuther().equalsIgnoreCase("shahrukh"))
		{
        	System.out.println(bookobj.getBookName()+":"+bookobj.getAuther()+":"+bookobj.getBookId());
			found = true;
			break;
		}
	}
	if(found==false)
	{
		System.out.println("not found");
	}
	
		

	}

}
