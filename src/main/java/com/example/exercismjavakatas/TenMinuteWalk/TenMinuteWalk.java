package com.example.exercismjavakatas.TenMinuteWalk;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
// in order to go back to th exact spot, the number should be 0
        int x = 0;
        int y = 0;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
                default:
                    // invalid direction
                    return false;
            }
        }

        return x == 0 && y == 0;
    }
}
