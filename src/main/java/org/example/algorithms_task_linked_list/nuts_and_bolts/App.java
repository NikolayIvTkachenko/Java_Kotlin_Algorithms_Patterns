package org.example.algorithms_task_linked_list.nuts_and_bolts;

public class App {
    public static void main(String[] args) {

        char[] nuts = {'$', '%', '&', 'x', '@'};
        char[] bolts = {'%', '@', 'x', '$', '&'};

        NutsBolts.match(nuts, bolts);
    }
}
