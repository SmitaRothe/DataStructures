package q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class SuperFibs {
    private Map<Integer, Long>cache= new HashMap<>();
    public static int stepsCount=1;

    public static void main(String[] args) {
        SuperFibs f = new SuperFibs();
        System.out.printf("1 : %d, steps %d", f.getNthFib(0), SuperFibs.stepsCount);
        System.out.println();
        System.out.printf("2 : %d, steps %d", f.getNthFib(1), SuperFibs.stepsCount);
        System.out.println();
        System.out.printf("3 : %d, steps %d", f.getNthFib(2), SuperFibs.stepsCount);
        System.out.println();
        System.out.printf("4 : %d, steps %d", f.getNthFib(3), SuperFibs.stepsCount);
        System.out.println();
        System.out.printf("5 : %d, steps %d", f.getNthFib(4), SuperFibs.stepsCount);
        System.out.println();
        System.out.printf("6 : %d, steps %d", f.getNthFib(5), SuperFibs.stepsCount);
        System.out.println();
        System.out.printf("7 : %d, steps %d", f.getNthFib(6), SuperFibs.stepsCount);
        System.out.println();
        System.out.printf("8 : %d, steps %d", f.getNthFib(200), SuperFibs.stepsCount);
        System.out.println();
    }

    public SuperFibs() {
        cache.put(0,0L);
        cache.put(1,1L);
        cache.put(2,1L);
    }
    
    public long getNthFib(int n) {
        //if n<=1 then no need to compute
        if (n <=1) {
            return n;
        }
        //calculate and return the value by calling the function computeNthFib
        return computeNthFib(n);
    }

    private long computeNthFib(int n) {
        //if n>1 then compute the value and increment the counter for steps
        for (int i = cache.size(); i <= n; i++) {
            long val = cache.get(i - 1) + cache.get(i - 2)+cache.get(i - 3); //compute the value
            cache.put(i,val);                       //and add it into the cache
            stepsCount++;                               //increment the counter for steps
        }
        return cache.get(n);
    }
}
