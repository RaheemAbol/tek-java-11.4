package tek.java;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        boolean[] boolArr = new boolean[] { true, true, false, true };
//        byte[] byteArr = new byte[] { 10, 20, 30 };
//        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };
//        double[] dblArr = new double[] { 1, 2, 3, 4 };
//        float[] floatArr = new float[] { 1, 2, 3, 4 };
//        int[] intArr = new int[] { 1, 2, 3, 4 };
//        long[] lomgArr = new long[] { 1, 2, 3, 4 };
//        short[] shortArr = new short[] { 1, 2, 3, 4 };
//        System.out.println(Arrays.toString(boolArr));
//        System.out.println(Arrays.toString(byteArr));
//        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(dblArr));
//        System.out.println(Arrays.toString(floatArr));
//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(lomgArr));
//        System.out.println(Arrays.toString(shortArr));

//
//        int[] dValues = new int[10];
//        Arrays.fill(dValues, 6); // set all values to 6
//        for(int i : dValues) { // print using loop
//            System.out.println(dValues[i]);
//        }
//        long[] lValues = new long[10];
//        Arrays.fill(lValues, 2057); // set all values to 2057
//        System.out.println(Arrays.toString(lValues)); // print using toString()
//
//        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
//        // Fill from index 1 to index 4.
//        Arrays.fill(ar, 1, 5, 10);
//        System.out.println(Arrays.toString(ar)); // print using toString(

//        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
//
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.sort(arr);
//
//
//        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

//
//        int[] sourceArrays = {2,3,4,5,10};
//        int[] shallow = sourceArrays;
//        int[] targetArrays = new int[sourceArrays.length];
//        for(int i =0; i < sourceArrays.length; i++)
//        {
//            targetArrays[i] = sourceArrays[i];
//        }
//        System.out.println(Arrays.toString(sourceArrays));
//        System.out.println(Arrays.toString(targetArrays));
//        if (targetArrays == sourceArrays) {
//            System.out.println("Same instance");
//        } else {
//            System.out.println("Different instance");
//        }

//        int[] sourceArray = {1,2,3};
//        int[] targetArray = sourceArray.clone();
//        sourceArray[2] = 500;
//        targetArray[0] = 33;
//        System.out.println("Source Array: " + Arrays.toString(sourceArray));
//        System.out.println("Target Array: " + Arrays.toString(targetArray));

//        int[] sourceArray = {1, 2, 3, 4, 5};
////        int[] destinationArray = new int[5];
////
////        System.arraycopy(sourceArray, 0, destinationArray, 0, 5);
////
////        System.out.println(Arrays.toString(destinationArray));
//
//        int[] newArr = Arrays.copyOf(sourceArray,7);
//
//
//        System.out.println(Arrays.toString(newArr));


//        int n;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of elements you want to store: ");
////reading the number of elements from the that we want to enter
//        n=sc.nextInt();
//
//        int[] array = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for(int i=0; i<n; i++)
//        {
////reading array elements from the user
//            array[i]=sc.nextInt();
//        }
//        System.out.println("Array elements are: ");
//// accessing array elements using the for loop
//        for (int i=0; i<n; i++)
//        {
//            System.out.println(array[i]);
//        }

//        double[] arr = new double[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = Math.random();
//        }
//        System.out.println("Random numbers = "+ Arrays.toString(arr));


        // an array of numbers
//        int[] numbers = {3, 4, 5, -5, 0, 12,10};
//        int sum = 0;
//        // iterating through each element of the array
//        for (int number: numbers) {
//            sum += number;
//        }
//
//        System.out.println("Sum = " + sum);

//        int[] myarray = {  4, 6, 8, 20, 10};
//        int minVal = Integer.MAX_VALUE;
//        for (int i = 0; i < myarray.length; i++) {
//            if (myarray[i] < minVal) {
//                minVal = myarray[i];
//            }
//        }
//        System.out.println("minVal = " + minVal);

//        int[] arr = {25,0,2,4,6,8,10};
//        int maxVal = Integer.MIN_VALUE; // or 0
//        for(int i=0; i < arr.length; i++){
//            if(arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        System.out.println("Max Element = " + maxVal);

//        Integer[] intArray = {10,20,30,40,50,60,70,80,90};
//        //-----print array starting from first element---------
//        System.out.println("Original Array:");
//        for(int i=0;i<intArray.length;i++) {
//            System.out.print(intArray[i] + " ");
//        }
//        System.out.println();
//        //----------print array starting from last element----
//        System.out.println("Original Array printed in reverse order:");
//        for(int i=intArray.length-1;i>=0;i--) {
//            System.out.print(intArray[i] + " ");
//        }


        int intArr[] = {10, 20, 15, 22, 35};

        // sorting the array
        Arrays.sort(intArr);

        // declare element for searching
        System.out.println(Arrays.toString(intArr));
        int element = 22;
        System.out.println(element + " found at index = " +
                Arrays.binarySearch(intArr, element));

    }
}

