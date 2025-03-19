public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,10,11,44,77};
        int target = 1;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    public static int binarySearch(int arry[], int target){

        int start = 0;
        int end = arry.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arry[mid]){
                end = mid -1;
            } else if (target > arry[mid]) {
                start = mid +1;
            } else
                return mid;
        }

        return -1;
    }
}
