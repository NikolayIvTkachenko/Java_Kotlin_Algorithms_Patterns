package org.example.algorithms_task_stack_queue.stock_span;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int stockPrices[] = {55, 34, 22, 23, 27, 88, 70, 42, 51, 100};
        int[] spanResult = StockSpan.stockSpan(stockPrices);

        System.out.println("Stock prices: " + Arrays.toString(stockPrices));
        System.out.println("Span results: " + Arrays.toString(spanResult));
    }
}
