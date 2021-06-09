package com.codegym;

public class Student {
    private String name;
    private String classes;

public Student(){

}
    public Student(String n,String c){
        name = n;
        classes = c;
    }
    public String setName(){
        return this.name;
    }
    public  String setClasses(){
        return this.classes;
    }

}
