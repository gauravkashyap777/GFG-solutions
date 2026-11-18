class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int st =0;
        int end = arr.length-1;

        while(st<end){
            int mid = st+(end-st)/2;

            if(arr[mid] < arr[mid+1]){
                st = mid+1;

            }else{
                end = mid;
            }
        }
        return st;

        // int st = 0;
        // int end = arr.length - 1;

        // while (st <= end) {
        //     int mid = st + (end - st) / 2;

        //     if (mid - 1 >= 0 && arr[mid] > arr[mid - 1] &&
        //             mid + 1 < arr.length && arr[mid] > arr[mid + 1]) {
        //         return mid;

        //     } else if (mid - 1 >= 0 && arr[mid - 1] > arr[mid]) {
        //         end = mid - 1;

        //     } else {
        //         st = mid + 1;
        //     }
        // }
        // return -1;
    }
}