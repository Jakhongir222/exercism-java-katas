package com.example.exercismjavakatas.CodeTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

interface OnlineAccount {
    int basePrice = 120;
    int regularMoviePrice = 45;
    int exclusiveMoviePrice = 80;
}
public class Account implements OnlineAccount, Comparable<Account>{
    /*
    Given an interface named "OnlineAccount" that models the account of popular online video streaming platforms, perform the operations listed below.
 The interface "OnlineAccount" consists of the basePrice, regularMoviePrice and exclusiveMoviePrice.

In order to complete this challenge, you need to implement an incomplete class named "Account" which implements the "OnlineAccount" interface as well as the Comparable<Account> interface.

The class account has two attributes to keep track of the numbers of movies watched:
1. Integer noOfRegularMovies,
2.  Integer noOfExclusiveMovies, 3. String ownerName

Methods to complete for class Account.

1. Add parameterized constructor that initialized the attributes ownerName,  noOfRegularMovies and the .

2. Int monthlyCost()=>
This method returns the monthly costs cost for the account. [Monthly cost = base price + noOfRegularMovies* regularMoviePrice + noOfExclusiveMovies* exclusiveMoviePrice]

3. Override the compare to method of the Comparable interface such that two accounts can be compared based on their monthly costs
 4.  String toString() which returns => "Owner is [OwnerName] and monthly cost is[monthlyCost] USD
     */


    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Add a parameterized constructor that initializes the attributes noOfExclusiveMovies and noOfExclusiveMovies.
    public Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies) {
        this.ownerName = ownerName;
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
    }

    // 2. This method returns the monthly cost for the account.
    public int monthlyCost() {
        return basePrice + (noOfRegularMovies * regularMoviePrice) + (noOfExclusiveMovies * exclusiveMoviePrice);
    }

    // 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
    @Override
    public int compareTo(Account other) {
        return this.monthlyCost() - other.monthlyCost();
    }

    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    @Override
    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD.";
    }
}

