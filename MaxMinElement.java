import java.util.Scanner;
import java.util.Arrays;
class MaxMinElement{
    public static void main(String[] args) {
      int arr[] = {3,54,34,22,11};
      int max = arr[0];
      int min = arr[1];

      for(int i=0; i<arr.length; i++){
        if(max<arr[i]){
          max = arr[i];
        }
        if(min>arr[i]){
          min = arr[i];
        }
      }
      System.out.println(max);
      System.out.println(min);

}}