package com.collection_09;

import java.util.Objects;

public class FruitSet 
{
  private String fName;



public FruitSet(String fName)
{
	super();
	this.fName = fName;
}



public String getfName()
{
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

@Override
public int hashCode() {
	return Objects.hash(fName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FruitSet other = (FruitSet) obj;
	return Objects.equals(fName, other.fName);
}
  
  
}
