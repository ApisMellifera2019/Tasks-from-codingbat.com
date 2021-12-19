//Given a string, return a new string where the first and last chars have been exchanged.
//
//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"

package Codingbat;

public class Task11 {

    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        }
        else {

            String result = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);

            return result;
        }
    }

}
