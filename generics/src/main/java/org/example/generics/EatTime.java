package org.example.generics;

public class EatTime <T extends Animals>{
    T t;
    public EatTime(T t){
        this.t = t;
    }

    public void eat(){
        t.eat();
    }
}
