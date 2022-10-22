package lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boolean2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String read1 = read.readLine();
        int a = Integer.parseInt(read1);
        boolean bruh = (a % 2) == 0;
        boolean oneDigit  = (a < 10);
        boolean twoDigit = (a < 100) && (a >= 10);
        boolean threeDigit = (a < 1000) && (a >= 100);

        if (oneDigit && bruh){
            System.out.println("четное однозначное число");
        }
        if (oneDigit && !bruh){
            System.out.println("нечетное однозначное число");
        }
        if (twoDigit && bruh){
            System.out.println("четное двузначное число");
        }
        if (twoDigit && !bruh){
            System.out.println("нечетное двузначное число");
        }
        if (threeDigit && bruh){
            System.out.println("четное трехзначное число");
        }
        if (threeDigit && !bruh){
            System.out.println("нечетное трехзначное число");
        }
    }
}
