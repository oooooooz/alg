package com.nobug.base.alg;


public class QuickSort extends AlgZone{

    public static void main(String[] args) {
        int[] ary = randomAry(10);
        QuickSort quickSort = new QuickSort();
        quickSort.doSort(ary,0,ary.length-1);
        doResult(ary);
        int k = 2;
        int bigK = quickSort.findK(ary,0,ary.length - 1,k);
        System.out.println("the big " + k  + " element: " + bigK);
    }

    private void doSort(int[] ary,int offset,int end){
        if(offset >= end) return;
        int pivotIdx = pivot(ary,end,offset);
        doSort(ary, offset, pivotIdx-1);
        doSort(ary, pivotIdx+1, end);
    }

    private int findK(int[] ary,int offset,int end,int k){
        if(offset >= end) return -1;
        int pivotIdx = pivot(ary,end,offset);
        if(k == pivotIdx + 1){
            return ary[pivotIdx];
        }
        if(k < pivotIdx + 1){
            return findK(ary, offset, pivotIdx-1,k);
        }
        if(k > pivotIdx + 1) {
            return findK(ary, pivotIdx + 1, end,k);
        }
        return -1;
    }

    private int pivot(int[] ary,int end,int offset){
        int pivot = ary[end];
        int j = offset;
        int i = j;
        for(;j<end;j++) {
            if (ary[j] < pivot) {
                int tmp = ary[i];
                ary[i] = ary[j];
                ary[j] = tmp;
                i++;
            }
        }
        int tmp = ary[i];
        ary[i] = ary[end];
        ary[end] = tmp;
        return i;
    }
}
