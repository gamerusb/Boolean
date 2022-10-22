package lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boolean1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a % 2 == 0 && a < 0){
            System.out.println("отрицательное четное число");
        }if (a % 2 != 0 && a < 0) {
            System.out.println("отрицательное нечетное число");

        }if (a % 2 == 0 && a > 0){
            System.out.println("положительное четное число");
        }if (a % 2 != 0 && a > 0){
            System.out.println("положительное нечетное число");
        }else if (a == 0){
            System.out.println("ноль");
        }
        else {
            System.out.println(1);
        }

    }
}
