package com.example.exercismjavakatas.Klarna;

import java.util.ArrayList;
import java.util.List;

class Underwriter {

    public static String[] identifyInvalidTransactions(String[] transactions) {
        List<String> invalidTransactions = new ArrayList<>();

        for (int i = 0; i < transactions.length; i++) {
            String[] currentTransaction = transactions[i].split(",");
            String name = currentTransaction[0];
            int time = Integer.parseInt(currentTransaction[1]);
            int amount = Integer.parseInt(currentTransaction[2]);
            String city = currentTransaction[3];

            if (amount > 2000) {
                invalidTransactions.add(transactions[i]);
            } else {
                boolean isInvalid = false;
                for (int j = 0; j < transactions.length; j++) {
                    if (i != j) {
                        String[] nextTransaction = transactions[j].split(",");
                        String nextName = nextTransaction[0];
                        int nextTime = Integer.parseInt(nextTransaction[1]);
                        int nextAmount = Integer.parseInt(nextTransaction[2]);
                        String nextCity = nextTransaction[3];

                        if (nextName.equals(name) && Math.abs(nextTime - time) <= 60) {
                            if (nextAmount == amount || !nextCity.equals(city) || nextTime == time) {
                                isInvalid = true;
                                break;
                            }
                        }
                    }
                }

                if (isInvalid) {
                    invalidTransactions.add(transactions[i]);
                }
            }
        }

        return invalidTransactions.toArray(new String[0]);
    }
}

/*
Context
In order to protect our customers we need to identify invalid transactions, a transaction is invalid if:

The amount exceeds $2000, or;
It occurs within (and including) 60 minutes of another transaction with the same name and the exact same price, or;
It occurs within (and including) 60 minutes of another transaction with the same name in a different city, or;
It occurs at the exact same time of another transaction with the same name.
Task
You are given an array of strings transaction where transactions[i] consists of comma-separated values representing the name, time (in minutes), amount, and city of the transaction.
Return a list of transactions that are possibly invalid. You may return the answer in any order

Example 1
Input: transactions = ["john,20,800,stockholm","john,50,100,beijing"]
Output: ["john,20,800,stockholm","john,50,100,beijing"]
Explanation : The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, has the same name and is in a different city. Similarly the second one is invalid too.

Example 2
Input: transactions = ["john,20,200,stockholm","john,50,200,stockholm"]
Output: ["john,20,200,stockholm","john,50,200,stockholm"]
Explanation : The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, has the same name and the same price. Similarly the second one is invalid too.

Example 3
Input: transactions = ["john,20,150,stockholm","john,20,300,stockholm"]
Output: ["john,20,150,stockholm","john,20,300,stockholm"]
Explanation : The first transaction is invalid because the second transaction occurs at the exact same time and has the same name.

Example 4
Input: transactions = ["john,20,150,stockholm","john,30,300,stockholm"]
Output: []
Explanation : Both transactions are valid.
 */
