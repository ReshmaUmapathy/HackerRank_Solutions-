import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    // Complete the diagonalDifference function below.
    /*static int diagonalDifference(int[][] arr) {


    }*/
    static int difference(int a,int b)
        {
            if(a>b)
            {
                return a-b;
            }
            else if(b>a)
            {
                return b-a;
            }
            else
            {
                return a-b;
            }
        }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int i,j,res1=0,res2=0;
        int[][] num = new int[n][n];
        int k =0,a=0;
        for(i=0;i<n;i++)
        {
            String[] arr = sc.nextLine().split(" ");
            for(j=0;j<arr.length;j++)
            {
                if(arr[j].matches("-?\\d+"))
                {
                a = Integer.parseInt(arr[j]);
                num[i][j] = a;
                if(i == j)
                {
                    res1 += num[i][j];
                }
                }
            }
        }
        j=n-1;
        for(i=0;i<n;i++)
        {
            res2+= num[i][j];
            j--;
        }
        
        int result = difference(res1,res2);
        System.out.println(result);
    }
}
