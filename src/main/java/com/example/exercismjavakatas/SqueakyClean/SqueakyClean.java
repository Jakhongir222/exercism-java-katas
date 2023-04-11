package com.example.exercismjavakatas.SqueakyClean;

public class SqueakyClean {
    static String clean(String identifier) {
        // Task 1: Replace spaces with underscores
        String cleaned = identifier.trim().replaceAll("\\s", "_");

        // Task 2: Replace control characters with "CTRL"
        cleaned = cleaned.replaceAll("\\p{Cntrl}", "CTRL");

        // Task 3: Convert kebab-case to camelCase
        if (cleaned.contains("-")) {
            StringBuilder sb = new StringBuilder();
            boolean capitalizeNext = false;
            for (int i = 0; i < cleaned.length(); i++) {
                char c = cleaned.charAt(i);
                if (c == '-') {
                    capitalizeNext = true;
                } else if (capitalizeNext) {
                    sb.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    sb.append(c);
                }
            }
            cleaned = sb.toString();
        }

        // Task 4: Omit non-letter characters
        cleaned = cleaned.replaceAll("[^a-zA-Z]", "");

        // Task 5: Omit Greek lower case letters
        cleaned = cleaned.replaceAll("[α-ω]", "");

        return cleaned;
    }
}
