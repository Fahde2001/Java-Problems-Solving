package org.example.Java2DArray;

import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number Size of array");

        System.out.print("Enter the size of the array (must be at least 3): ");
        int size = scan.nextInt();
        int[][] arr = new int[size][size];

        if (size < 3) {
            System.out.println("Size must be at least 3 to form an hourglass.");
            return;
        }

        // Reading input into the array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number "+i+" row");
            for (int j = 0; j < size; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        // Print the input array
        for(int i=0 ;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }

        int maxSum = Integer.MIN_VALUE;  // Initialize to a very small number

        // Loop through each hourglass starting point

        for (int i = 0; i <= size-3; i++) {
            for (int j = 0; j <= size-3; j++) {
                int currentHourglassSum = calculateHourglassSum(arr, i, j);
                if (currentHourglassSum > maxSum) {
                    maxSum = currentHourglassSum;
                }
            }
        }

        // Print the maximum hourglass sum
        System.out.println("Maximum Hourglass Sum: " + maxSum);
    }

    private static int calculateHourglassSum(int[][] arr, int row, int col) {
        int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2]    // Top row
                + arr[row + 1][col + 1]                                   // Middle element
                + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        System.out.println(arr[row][col] +" "+ arr[row][col + 1] +" "+ arr[row][col + 2] +"\n"+
               "     " + arr[row + 1][col + 1]  +"\n"
                + arr[row + 2][col] + " "+ arr[row + 2][col + 1] +" "+ arr[row + 2][col + 2]);

        return sum;
    }
}
