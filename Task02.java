package Codingbat;

public class Task02 {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
            return true;
        }else
            return false;
    }
}
