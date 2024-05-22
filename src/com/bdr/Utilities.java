package com.bdr;

public class Utilities {

    // Returns char array containing every nth char.
    // When sourceArray.length < n, return sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {
        if (sourceArray == null || sourceArray.length < n) return sourceArray;
        int returnedLength = sourceArray.length / n;

        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n-1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }

        return result;
    }

    // Remove pairs of same character that are next to each other
    // by removing on e occurence of the character.
    // "ABBCDEEF" -> "ABCDEF"
    // "ABCBDEEF" -> "ABCBDEF" (the 2 B's are NOT next to each other -> not removed)
    public String removePairs(String source) {

        // if length is less than 2, there are no pairs.
        if (source == null || source.length() < 2) return source;

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length - 1; i++) {
            if(string[i] != string[i+1]) {
                sb.append(string[i]);
            }
        }

        sb.append(string[string.length - 1]);
        return sb.toString();
    }

    // Perform a conversion based on some internal business rule.
    public int converter(int a, int b) {
        return (a/b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) return source;

        return null;
    }
}
