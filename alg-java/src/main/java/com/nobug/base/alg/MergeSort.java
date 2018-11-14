package com.nobug.base.alg;

/**
 * User: chenhf
 * Date: 2018/11/6
 * Time: 12:31
 */
public class MergeSort extends AlgZone{

    public static void main(String[] args) {
        int[] ary = randomAry(10);
        new MergeSort().mergeSort(ary,0,ary.length-1);
        doResult(ary);
    }

    private void mergeSort(int[] ary,int p,int r){
        if(p>= r)return;
        int q = (p+r)/2;
        mergeSort(ary, p, q);
        mergeSort(ary,q + 1,r);
        merge(ary,p,q,r);
    }

    private void merge(int[] ary,int start,int q,int end){
        int i = start,j = q + 1,k = -1;
        int[] tmp = new int[end - start + 1];
        while (i <= q  && j <= end){
            if(ary[i] <= ary[j]){
                tmp[++k] = ary[i++];
            }else{
                tmp[++k] = ary[j++];
            }
        }
        int leftStart = i,leftEnd = q;
        if(j <= end){
            leftStart = j;
            leftEnd = end;
        }
        while (leftStart <= leftEnd)tmp[++k] = ary[leftStart++];
        System.arraycopy(tmp,0,ary,start,tmp.length);
    }

}
