import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
   /* static void staircase(int n) {


    }*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-(i+1);j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
