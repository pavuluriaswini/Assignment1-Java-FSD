package assignment1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter Search Element");
        
        int key = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("The element "+key+" found at index "+i);
            }
            

        }
        
        
    }
}
