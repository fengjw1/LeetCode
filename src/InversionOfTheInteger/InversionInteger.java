package InversionOfTheInteger;

/**
 * Created by fengjw on 2018/8/17
 * Code Change The World!
 */

public class InversionInteger {

    public int reverse(int x){
        long a = 0;
        int b = 0;
        if (x >= 0){
            b = (x + "").length();
        }else {
            b = (x + "").length() - 1;
        }
        while (x != 0){
            for (int i = 0; i < b; i ++){
                int a1 = x % 10;
                x = (x - a1) / 10;
                a += (int) (a1 * Math.pow(10, b - i - 1));
            }
        }
        if ((a > Math.pow(2, 31) - 1) || (a < (-1)* Math.pow(2, 31))){
            return 0;
        }

        return (int) a;

    }

}
