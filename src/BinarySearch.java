public class BinarySearch {
    public static void main(String[] args) {
        int [] arry = {-1,0,1,2,4,5,6,7,8,11,12,34,55};
        int target = 0;
        int ans = binarySearch(arry, target);
        System.out.println(ans);

    }

    static int binarySearch(int arry[], int target){
        int start =0;
        int end = arry.length-1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if(target < arry[mid]){
                end = mid -1;
            }
            else if (target > arry[mid]){
                start = mid +1;
            }else
            return  mid;
        }

        return -1;
    }
}
