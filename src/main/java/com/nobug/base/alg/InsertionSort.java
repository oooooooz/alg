package com.nobug.base.alg;

/**
 * User: FF
 * Date: 2018/11/13
 * Time: 23:40
 */
public class InsertionSort extends AlgZone{

    public static void main(String[] args) {
        int[] ary = randomAry(10);
        new InsertionSort().doSort(ary);
        doResult(ary);
    }

    private void doSort(int[] ary){
        for(int i = 1;i < ary.length;i++){
            int v = ary[i];
            int j = i - 1;
            //check pos
            for(;j >= 0;j--){
                if(ary[j] <= v)break;
                if(ary[j] > v){
                    ary[j + 1] = ary[j];//move ary[j] to the right
                }
            }
            ary[j + 1] = v;//put v
        }
    }

}
