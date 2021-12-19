//Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
//
//missingChar("kitten", 1) → "ktten"
//missingChar("kitten", 0) → "itten"
//missingChar("kitten", 4) → "kittn"

package Codingbat;

public class Task10 {

    public String missingChar(String str, int n) {

        char[]arr = str.toCharArray();
        char[]tempArr = new char[arr.length-1];
        int count = -1;

        for (int i = 0; i < arr.length; i++) {
            if (n != i){
                count++;
                tempArr[count] = arr[i];
            }
        }
        String tempString = new String(tempArr);
        return tempString;
    }

}
