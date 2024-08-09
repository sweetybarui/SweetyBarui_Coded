//Given an array arr of n integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n-1. You are allowed to rearrange the elements of the array.

//Note: Since the output could be large, print the answer modulo 109+7.

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            // int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().Maximize(arr));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Maximize {

    int Maximize(int arr[]) {
        // Complete the function
        int n = arr.length;
        
        if(n <= 1) return 0;
        
        Arrays.sort(arr);
        
        long sum = (long)arr[1];
        
        long mod=1000000007;
        for(int i = 2; i < n; i++)
        {
            long x=(long)arr[i];
            long y=i;
            sum+=x*y;
        }
        
        return (int)((sum)%mod);
    }
}
