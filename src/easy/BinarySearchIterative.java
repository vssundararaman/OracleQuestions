package easy;

import java.util.Arrays;

public class BinarySearchIterative {

    public static void main(String[] args) {

        int arr[]={2,5,-1,3,6,10,54,45,34};
        int searchElement = 3;

        int result = BinarySearch(arr,searchElement);

        if(result==-1){
            System.out.println("Element is Not present");
        }else{
            System.out.println("Element is present at the Index " + result);
        }

    }

    static int BinarySearch(int arr[], int searchElement){

        int start = 0; int end = arr.length;

        Arrays.sort(arr);

        while(start <=end){

            int mid = start + (end-start)/2;

            if(arr[mid] == searchElement){
                return mid;
            }

            if(arr[mid]>searchElement){
                end = mid-1;
            }

            if(arr[mid]<searchElement){
                start = mid+1;
            }
        }

        return -1;
    }
}
