package com.example.exercismjavakatas.Katas;

import java.util.List;

public class DiamondPrinter {
    List<String> printToList(char a) {
        char upperCase = Character.toUpperCase(a);
        int charNum = (int) upperCase -64;
        int n = (charNum-1)*2 +1;
        for(int i=0; i<n; i++){
            String empty = ".";
            String repeated = empty.repeat(n-1);
            String newString = repeated+"A"+repeated;

        }
return null;
    }
}
