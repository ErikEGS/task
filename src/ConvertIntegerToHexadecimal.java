import java.util.Scanner;

public class ConvertIntegerToHexadecimal {

    public static void main(String[] args) {
        decToHex(new Scanner(System.in).nextInt());
    }

    static void decToHex(int n) {
        char[] hexDeciNum = new char[8];
        int i = 0;

        while (n != 0) {
            int temp = 0;
            temp = n % 16;

            if (temp < 10) {
                hexDeciNum[i] = (char) (temp + 48);
            } else {
                hexDeciNum[i] = (char) (temp + 55);
            }
            i++;
            n = n / 16;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexDeciNum[j]);
        }
    }
}
