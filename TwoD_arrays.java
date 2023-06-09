// import java.util.*;

// public class TwoD_arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int arr[][] = new int[rows][cols];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(arr[i][j]+ " ");
//             }
//             System.out.println();
//         }
        
//     }
// }

// import java.util.*;

// public class TwoD_arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int arr[][]= new int[rows][cols];

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 arr[i][j]= sc.nextInt();
//             }
//         }

//         System.out.print("enter the number you want to search for: ");
//         int num = sc.nextInt();

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(arr[i][j]==num){
//                     System.out.println("The number u are searching is " + num + " and it is found at index "+ i +","+j);
//                 }
//             }
//         }
//         sc.close();
//     }
// }

import java.util.*;

public class TwoD_arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][]= new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        sc.close();

    }

    // this is how we do linear search in a 2d array and RETURN AN ARRAY FROM A METHOD
    static int[] searchInMatrix(int arr[][], int target){
        if(arr.length==0){
            return new int[]{0,0};
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]== target){
                    return new int[]{i, j};
                }
                else{
                    return new int[]{-1,-1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}