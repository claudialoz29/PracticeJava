public class WhatisStatic {
    public static void main(String[] args){

        Person jhon = new Person();
        jhon.name = "jhon";
        jhon.age = 24;
        Person.address = "Main str 101";
        System.out.println(jhon.name);
        System.out.println(jhon.age);
        System.out.println(Person.address);

        Person alex = new Person();
        System.out.println(alex.name);//null because we didnt put any value
        System.out.println(alex.age);//0
        System.out.println(Person.address);// Main str 101, beacuse is static and static beleong to the class no to the specific object.

        // default value
        // object = null
        // numeric = 0
        //boolean = false

        ///local variable must be initited or have value otherwise it will error.
        int num =10;
        System.out.println(num);

        //Acces modifiers
        // public = can acces everywhere
        // protected = can acces same packge and subclasses
        // default = can acces only same packge
        // private = only same class
    }
}
class Person{   //default
    public String name;
    public int age;
    public static String address;


}
