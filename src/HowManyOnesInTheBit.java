public class HowManyOnesInTheBit {

  public static void main(String[] args) {
    System.out.println(countSetBits(322258));
  }

  public static int countSetBits(int n) {
    if (n == 0) {
      return 0;
    } else {
      return (n & 1) + countSetBits(n >> 1);
    }
  }
}