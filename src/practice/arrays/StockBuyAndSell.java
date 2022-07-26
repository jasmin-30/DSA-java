package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
You are given the prices of a stock for n consecutive days in an array.
You need to buy and sell stock in such a way so that you can get maximum profit.
 */
public class StockBuyAndSell {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        System.out.println(maxProfit1(arr, 0, n-1));
    }

    private static int maxProfit1(int[] arr, int start, int end) {
        if (start >= end)
            return 0;

        int profit = 0;
        for (int i=start;i<end;i++) {
            for (int j=i+1;j<=end;j++) {
                if(arr[j] > arr[i]) {
                    int curr_profit = arr[j] - arr[i] +
                            maxProfit1(arr, start, i-1) +
                            maxProfit1(arr, j+1, end);

                    profit = Math.max(curr_profit, profit);
                }
            }
        }
        return profit;
    }
}
