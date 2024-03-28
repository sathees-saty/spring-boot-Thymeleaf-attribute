package com.example.thymeleaf;

public class Employee {  
private String name;  
private String id;  
private String sal;  

public Employee()
{
}
public Employee(String id, String name,String sal) {
    this.id = id;
    this.name = name;
    this.sal = sal;
}

public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  

public String getId() {  
    return id;  
}  
public void setId(String id) {  
    this.id = id;  
}  

public String getSal() {  
    return sal;  
}  
public void setSal(String sal) {  
    this.sal = sal;  
}  
}  