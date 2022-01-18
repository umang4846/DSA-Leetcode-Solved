class Solution {
    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr); // 2, 3, 5, 10

        for (int i = 0; i < arr.length; i++) {
            int bsResult = binarySearch(arr,arr[i]*2);
            if(bsResult != -1 && i!= bsResult){
                return true;
            }
        }
        return false;
    }

    public int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }
}