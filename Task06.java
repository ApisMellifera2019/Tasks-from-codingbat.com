//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true

package Codingbat;

public class Task06 {

    public boolean makes10(int a, int b) {

        boolean temp = a==10 || b==10 || a+b==10;
        if (temp){
            return true;
        }else
            return false;
    }

}
