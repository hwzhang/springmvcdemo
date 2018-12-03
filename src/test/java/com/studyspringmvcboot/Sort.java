package com.studyspringmvcboot;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-12-02 22:21
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 67, 2, 7, 8, 6, 9, 44};

//        quickSort(arr, 0, 9);
//        mb(arr);
        xz(arr);
    }

    /**
     * 快速排序
     *
     * @param arr
     * @param L   指向数组第一个元素
     * @param R   指向数组最后一个元素
     */
    public static void quickSort(int[] arr, int L, int R) {
        int i = L;
        int j = R;

        //支点
        int pivot = arr[(L + R) / 2];

        //左右两端进行扫描，只要两端还没有交替，就一直扫描
        while (i <= j) {

            //寻找直到比支点大的数
            while (pivot > arr[i])
                i++;

            //寻找直到比支点小的数
            while (pivot < arr[j])
                j--;

            //此时已经分别找到了比支点小的数(右边)、比支点大的数(左边)，它们进行交换
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        //上面一个while保证了第一趟排序支点的左边比支点小，支点的右边比支点大了。


        //“左边”再做排序，直到左边剩下一个数(递归出口)
        if (L < j)
            quickSort(arr, L, j);

        //“右边”再做排序，直到右边剩下一个数(递归出口)
        if (i < R)
            quickSort(arr, i, R);
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void mb(int[] arr) {
        int swap = 0;
        //记录是否发生了置换， 0 表示没有发生置换、 1 表示发生了置换
        boolean isChange = true;
        //外层循环是排序的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            isChange = false;
            //内层循环是当前趟数需要比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //前一位与后一位与前一位比较，如果前一位比后一位要大，那么交换
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    //如果进到这里面了，说明发生置换了
                    isChange = true;
                }
            }

            //如果比较完一趟没有发生置换，那么说明已经排好序了，不需要再执行下去了
            if (!isChange) {
                break;
            }
        }
        System.out.println(arr);
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void xz(int[] arr) {
        int pos = 0;
        int swap = 0;
        //外层循环控制需要排序的趟数
        for (int i = 0; i < arr.length - 1; i++) {
//            新的趟数、将角标重新赋值为0
            pos = 0;
            //内层循环控制遍历数组的个数并得到最大数的角标
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[pos]) {
                    pos = j;
                }
            }
            swap = arr[pos];
            arr[pos] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = swap;
        }
        System.out.println(arr);
    }
}
