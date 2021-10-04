/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2015271
 */
public class MyApplication {
    public static void main(String [] args){
    
        Person p = new Person("shafraz");
        p.setSurname("ramees");
        p.setAge(20);
       p.displayName();
       System.out.println("surname :"+p.getSurname()+"\n"+"age is :"+p.getAge()); 

    }
}
