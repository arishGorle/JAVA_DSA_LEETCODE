import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int Asen[] = {1,3,5,7,8,10,11,44,77};
        int Dsen[] = {20,19,18,17,16,15,14,13,3};
       
        int target = 3;
        int asen = orderAgnosticBS(Asen,target);
        int desn = orderAgnosticBS(Dsen,target);

        System.out.println(asen);
        System.out.println(desn);

    }

    static int orderAgnosticBS(int[] array , int taregt){
        int start = 0 ;
        int end = array.length-1;

        // here we need check given array is Asen or Desen ;

        boolean isAsen = array[start]<array[end];

        while (start <= end ){

            int mid = start + (end-start)/2;

            if(array[mid] == taregt){
                return mid;
            }
            if (isAsen){
                if(taregt > array[mid]){
                    start = mid + 1;
                } else
                    end = mid - 1;
            } else
                if(taregt > array[mid]){
                    end = mid -1;
                }else
                    start = mid + 1;
        }

      return -1;
    }
}
