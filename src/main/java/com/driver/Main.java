package com.driver;
public class Main {
     public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        // override method

        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
 public static void main (String[] args){
         // create object of class B
     B objb= new B();
     objb.meth();
 }
}