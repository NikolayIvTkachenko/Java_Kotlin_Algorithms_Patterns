package org.example.algorithms_task;

public class BestTimeToBuySellStockSolution {

    public static void main(String[] args) {

        int[] prices = {200, 500, 1000, 700, 30, 400, 900, 400, 550};

        int resultOneTransaction = maxProfitOneTransaction(prices);
        System.out.println("Max profit (one transaction): " + resultOneTransaction);

        int resultTwoTransaction = maxProfitTwoTransactions(prices);
        System.out.println("Max profit (two transaction): " + resultTwoTransaction);

        int resultUnlimitedTransaction = maxProfitUnlimitedTransactions(prices);
        System.out.println("Max profit (unlimited transaction): " + resultUnlimitedTransaction);

        int resultOKransaction = maxProfitKTransactions(prices, 2);
        System.out.println("Max profit (k=2 transaction): " + resultOKransaction);
    }

    /* One transaction, O(n) */
    public static int maxProfitOneTransaction(int[] prices) {

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int min = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        return result;
    }

    /* Two transactions, O(n) */
    public static int maxProfitTwoTransactions(int[] prices) {

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int[] left = new int[prices.length];
        int[] right = new int[prices.length];

        // Dynamic Programming from left to right
        left[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }

        // Dynamic Programming from right to left
        right[prices.length - 1] = 0;
        int max = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(right[i + 1], max - prices[i]);
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            result = Math.max(result, left[i] + right[i]);
        }

        return result;
    }

    /* Unlimited transactions, O(n) */
    public static int maxProfitUnlimitedTransactions(int[] prices) {

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                result += diff;
            }
        }

        return result;
    }

    /* K transactions, O(kn) */
    public static int maxProfitKTransactions(int[] prices, int k) {

        if (prices == null || prices.length <= 1 || k <= 0) {
            return 0;
        }

        int[] temp = new int[k + 1];
        int[] result = new int[k + 1];

        for (int q = 0; q < prices.length - 1; q++) {
            int diff = prices[q + 1] - prices[q];
            for (int p = k; p >= 1; p--) {
                temp[p] = Math.max(result[p - 1]
                        + Math.max(diff, 0), temp[p] + diff);
                result[p] = Math.max(temp[p], result[p]);
            }
        }

        return result[k];
    }
}
