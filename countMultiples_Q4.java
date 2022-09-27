import java.io.*;
import java.util.*;
class CountMultiples {
    static int ans[];
    static void countSieve(int arr[], int n)
    {
        int MAX = arr[0];
        for (int i = 1; i < n; i++)
            MAX = Math.max(arr[i], MAX);

        int cnt[] = new int[MAX + 1];
        ans = new int[MAX + 1];
        for (int i = 0; i < n; ++i)

            ++cnt[arr[i]];
        for (int i = 1; i <= MAX; ++i)

            for (int j = i; j <= MAX; j += i)

                ans[i] += cnt[j];

        return;

    }
 

    static int countMultiples(int k)
    {
        return ans[k];
    }
 
    public static void main(String args[]) throws IOException
    {  
        Dictionary dict = new Hashtable();
        int arr[] = { 1,2,8,9,12,46,76,82,15,20,30 };

        int n = 11;
 

        // pre-calculate all multiples

        countSieve(arr, n);
        
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8,9};
        int i, x;
  
        // iterating over an array
        for (i = 0; i < ar.length; i++) {
  
            // accessing each element of array
            x = ar[i];
            //countMultiples(k);
            dict.put(x,countMultiples(x));
            
            //System.out.println(x + " " + countMultiples(x));
        }
        System.out.println(dict);
    }
}