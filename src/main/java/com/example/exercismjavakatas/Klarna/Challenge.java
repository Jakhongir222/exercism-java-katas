package com.example.exercismjavakatas.Klarna;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
    public static List<Integer> whoIsGoingHomeEarly(int n, int k) {
        List<Integer> workers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            workers.add(i);
        }

        List<Integer> homeEarly = new ArrayList<>();
        int index = 0;
        double half = Math.round((double) n / 2);
        for(int j=0; j<n; j++){
            if(workers.size()>half){
                index=(index+k)% workers.size();
                homeEarly.add(workers.get(index));
                workers.remove(index);
            }
        }
        return homeEarly;
    }
}



/*
A group of colleagues are at work and decide that half of them can go home while the other half stay. In order to fairly choose who gets to go home early they devise a game. The workers stand in a circle and play the game, in each round of the game someone gets to go home early until half of the workers are left. The rules of the game are as follows:

1) Stand in a circle where each worker is numbered from 1 to n in clockwise order, where n is the number of workers.

2) Start at the 1st worker.

3) Count the next k workers in the circle, not including the one you start at. The counting wraps around the circle and you may count workers more than once.

4) The worker you land at gets to go home and is removed from the circle.

5) Starting from the next worker clockwise from the one you just removed, repeat steps 3->4 until you have n/2 workers left. You should always round up when calculating n/2. For example if you have five workers then two get to go home.

You are asked to write a method which implements this game. You are given n the number of workers, and k the amount of steps in the game. Both parameters will always be non-negative integers.

You should return a list of the assigned numbers of the workers who are going home early in the order they were selected. There should always be at least one person working
 */