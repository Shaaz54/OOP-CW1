/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2015271
 */
public class Person {
    // creating instance variable
    private String name;
    private String surname;
    private int age;

     
    // creating constructor (parameterized contructor)
    public Person(String n){
        name = n;
    }
    
    public void displayName(){
        System.out.println("name : "+name);  
    }
    
    // setter and getter
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
        public int getAge() {
        return age;
    }
        
        public String getSurname() {
        return surname;
    }    

}
