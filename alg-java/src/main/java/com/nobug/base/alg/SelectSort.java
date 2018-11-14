package com.nobug.base.alg;

/**
 * User: FF
 * Date: 2018/11/4
 * Time: 10:03
 */
public class SelectSort extends AlgZone{


    public static void main(String[] args) {
        int[] ary = randomAry(10);
        int minxIdx = 0;
        new SelectSort().selectSort(ary,ary[minxIdx],minxIdx,0);
        doResult(ary);
    }

    private void selectSort(int[] ary,int min,int minIdx,int curIdx){
        if(curIdx == ary.length-1)return;
        for(int idx = curIdx;idx < ary.length;idx++) {
            if (ary[idx] < min) {
                min = ary[idx];
                int tmp = ary[minIdx];
                ary[minIdx] = ary[idx];
                ary[idx] = tmp;
                //minIdx = idx;
            }
        }
        //System.out.println("cur: " + curIdx + ",min="+min+"," + Arrays.toString(ary));
        ++curIdx;
        selectSort(ary,ary[curIdx] , curIdx, curIdx);
    }



}
