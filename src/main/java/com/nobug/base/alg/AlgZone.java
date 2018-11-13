package com.nobug.base.alg;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * User: FF
 * Date: 2018/11/14
 * Time: 0:12
 */
abstract class AlgZone {

    static int[] randomAry(int len){
        if(len <= 0)len = 10;
        Random random = new Random();
        int[] ary = new int[len];
        IntStream.range(0,ary.length).forEach(i -> ary[i] = random.nextInt(100));
        System.out.println("before: " + Arrays.toString(ary));
        return ary;
    }

    static void doResult(int[] ary){
        System.out.println("sorted: " + Arrays.toString(ary));
    }
}
