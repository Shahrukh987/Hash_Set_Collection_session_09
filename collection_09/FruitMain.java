package com.collection_09;

import java.util.HashSet;
import java.util.Set;

public class FruitMain {

	public static void main(String[] args) {
	
		FruitSet ft1=new FruitSet("apple");
		FruitSet ft2=new FruitSet("banana");
		FruitSet ft3=new FruitSet("mango");
		FruitSet ft4=new FruitSet("orange");
		FruitSet ft5=new FruitSet("pineapple");
		FruitSet ft6=new FruitSet("watermelon");
		FruitSet ft7=new FruitSet("graps");
		FruitSet ft8=new FruitSet("papaya");
		FruitSet ft9=new FruitSet("lemon");
		FruitSet ft10=new FruitSet("chery");
		Set<FruitSet>fs=new HashSet<FruitSet>();
		fs.add(ft1);
		fs.add(ft2);
		fs.add(ft3);
		fs.add(ft4);
		fs.add(ft5);
		fs.add(ft6);
		fs.add(ft7);
		fs.add(ft8);
		fs.add(ft9);
		fs.add(ft10);
       
		for(FruitSet f :fs)
		{
			System.out.println(f.getfName());
		}
		
		 boolean found= false;
		 for(FruitSet f : fs)
		 {
			if(f.getfName().equalsIgnoreCase("coconut")) 
			{
				System.out.println(f.getfName());
				found=true;
				break;
			}
		 }
		if(found==false)
		{
			System.out.println("Not found");
		}
		
			
		
		}

	}


