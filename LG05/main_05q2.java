package Q2;

import java.util.Scanner;

public class main_05q2 {

    public static int menu() {
        Scanner scan = new Scanner(System.in);
        int cho = 0;

        System.out.println("MENU\r\n"
                + "1. Initialize array\r\n"
                + "2. Input array elements\r\n"
                + "3. Output array elements\r\n"
                + "4. Search a value\r\n"
                + "5. Exit program");

        while(cho < 1 || cho > 5 ) {
            System.out.println("Enter your choice:");
            cho = scan.nextInt();
        }
        return cho;
    }
    public static int[] initialize() {
        int[] arr = new int[10];
        return arr;
    }
    public static int fillArray(int arr[]) {
        int b, size = 0;
        System.out.println("Enter the elements of the array:");
        Scanner scan = new Scanner(System.in);

        while (size < arr.length) {
            b = scan.nextInt();
            if (b == 0)
                break;
            
            arr[size] = b;
            size++;
        }
        return size;
    }
    public static void display(int arr[], int size) {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] +" ");
    }

    public static int findPos(int arr[], int s, int size) {
        for(int i = 0; i < size; i++)
            if(arr[i] == s)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cho = 0, size = 10, search;
        int[] arr = null;

        while(cho != 5)
        {
            cho = menu();
            if(cho == 1) {
                arr = initialize();
                System.out.println("All elements are initialized by zero");
            }
            else if(cho == 2) {
                size = fillArray(arr);
                System.out.println("The size of the array: "+ size);
            }
            else if(cho == 3)
                    display(arr, size);

            else if(cho == 4) {
                System.out.println("Enter the value that will be searched:");
                search = scan.nextInt();

                int a = findPos(arr, search, size);
                if(a == -1)
                    System.out.println("The array does NOT contain the searched number!");
                else
                    System.out.println("Position of the value is: "+ a);
            }
        }
    }

}