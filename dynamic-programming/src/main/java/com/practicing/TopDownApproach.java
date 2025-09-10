package com.practicing;

import java.util.HashMap;
import java.util.Map;

public class TopDownApproach {

    public static int fib(int n, Map<Integer, Integer> memory){
        System.out.println("Finding fib of " + n);
        if(n==0 || n==1)
            memory.put(n, n);

        if(!memory.containsKey(n))
            memory.put(n, fib(n-1, memory) + fib(n-2, memory));
        else
            System.out.println("Fib("+n+") already computed with this value" + memory.get(n));

        return memory.get(n);
    }

    public static int[] getFibonacciArray(int n){
        Map<Integer, Integer> memory = new HashMap<>();
        int[] result = new int[n+1];

        for (int i = 0; i <= n ; i++) {
            result[i] = fib(i, memory);

        }
        return result;
    }

    public static void main(String[] args) {
        int n=10; //Ex
        int[] fibArray = getFibonacciArray(n);

        System.out.println("Fibonacci sequence up to "+n+ ": ");

        for (int num: fibArray){
            System.out.println(num + " ");
        }
    }
}
