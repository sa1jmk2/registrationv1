package com.api;
 public class Adbug {
     public static void main(String[] args) {
        Adbug a1=new Adbug();
         int val = a1.test();
         System.out.println(  val);
         C c1=new C();
         c1.test2();
     }
     private int test() {
         B b1=new B();

                  return b1.test1();
    }

}

