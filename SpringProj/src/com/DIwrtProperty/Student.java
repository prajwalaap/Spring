package com.DIwrtProperty;

public class Student {  
private String name;
private String id;
  
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public void displayInfo(){  
    System.out.println("Hello: "+name);  
}  
  
public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
}  
