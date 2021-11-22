public class ConvertBinaryToHexadecimal {

  public static void main(String[] args) {
    System.out.println(decimalToHex(10011110));
  }

  static int binaryToDecimal(long binary) {
    int decimalNumber = 0, i = 0;
    while (binary > 0) {
      decimalNumber += Math.pow(2, i++) * (binary % 10);
      binary /= 10;
    }
    return decimalNumber;
  }

  static String decimalToHex(long binary) {
    int decimalNumber = binaryToDecimal(binary);
    String hexNumber = Integer.toHexString(decimalNumber);
    hexNumber = hexNumber.toUpperCase();
    return hexNumber;
  }
}
