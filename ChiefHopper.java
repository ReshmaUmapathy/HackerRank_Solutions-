import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the chiefHopper function below.
    /*static int chiefHopper(int[] arr) {


    }*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
         int n = scanner.nextInt();
        int arr[]=new int[n];
        int i,d=0,res=0;
        for(i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int bot;
        int k=0;
        do{
            k++;
            bot = k;
        for(i=0;i<n;i++)
        {
            d = bot - arr[i];
            bot+=d;
        }
            res = k;
    }while(bot<0);
        System.out.println(res);
    }
}
