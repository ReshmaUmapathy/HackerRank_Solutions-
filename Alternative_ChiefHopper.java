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
        int e = 0;
        for(i=0;i<n;i++)
        {
            int height = arr[i];
            if(height>e)
            {
                e+=(int)Math.ceil((height-e)/2.0);
            }
            else if(e>height)
            {
                e = (int)Math.ceil((height+e)/2.0);
            }    
        }
        System.out.println(e);
    }
}
