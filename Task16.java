//Given a string, return true if the string starts with "hi" and false otherwise.
//
//startHi("hi there") → true
//startHi("hi") → true
//startHi("hello hi") → false

package Codingbat;

public class Task16 {

    public boolean startHi(String str) {

        if (str.equals("Hi") || str.equals("hi")) {
            return true;
        }else if (str.startsWith("Hi") || str.startsWith("hi")) {
            return true;
        }else
            return false;


    }


}
