//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            // ArrayList<Integer> v = new ArrayList<Integer>();
            int[] gas = new int[array1.size()];
            int idx = 0;
            for (int i : array1) gas[idx++] = i;

            int[] cost = new int[array2.size()];
            idx = 0;
            for (int i : array2) cost[idx++] = i;

            int ans = new Solution().startStation(gas, cost);

            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends
class Solution {
    public int startStation(int[] gas, int[] cost) {
        int totalGas = 0, currentGas = 0;
        int start = 0;
        
        // Calculate total gas and cost
        for (int i = 0; i < gas.length; i++) {
            int netGain = gas[i] - cost[i];
            totalGas += netGain;
            currentGas += netGain;
            
            // If currentGas falls below zero, reset start station
            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }
        
        // If total gas is less than total cost, journey is impossible
        return (totalGas >= 0) ? start : -1;
    }
}

