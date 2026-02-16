package org.example.generics;

public class Print <T>{
    T t;
    public Print(T t){
        this.t = t;
    }

    public void print(){
        System.out.println(t);
    }
}
