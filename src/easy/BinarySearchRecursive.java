package easy;

import java.util.Arrays;

/**
 * Recursive Approach
 */
public class BinarySearchRecursive {

    public static void main(String[] args) {
        int arr[]={2,5,-1,3,6,10,54,45,34};
        int length = arr.length;
        int searchElement = 10;

        //If the Array is not started, then the below function sorts
        Arrays.sort(arr);
        int result = binarySearch(arr,0,length-1,searchElement);

        if(result==-1){
            System.out.println("Element is Not present");
        }else{
            System.out.println("Element is present at the Index " + result);
        }
    }

    static int binarySearch(int array[], int start, int length, int searchElement){

        if(length >=start){

            int mid = start + (length-start)/2;

            //If Middle Element is Search Element then Returns Middle Element
            if(array[mid] == searchElement){
                return mid;
            }

            //If searchElement is smaller then Mid then it can be present in the Left subArray
            if(array[mid] > searchElement){
                return binarySearch(array,start,mid-1,searchElement);
            }

            //If searchElement is greater then Mid then it can be present in the Right subArray
            if(array[mid]<searchElement){
                return binarySearch(array,mid+1,length,searchElement);
            }
        }

        return -1;
    }


}
