class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    // Initialize variables
    int total = 55 * 9;
    double blueTotal = total * .24;
    double brownTotal = total * .13;
    double greenTotal = total * .16;
    double orangeTotal = total * .2;
    double redTotal = total * .13;
    double yellowTotal = total * .14;
    double sum = blueTotal + brownTotal + greenTotal + orangeTotal + redTotal + yellowTotal;

    // Print totals for debugging
    System.out.printf("blue: %.0f\n", blueTotal);
    System.out.printf("brown: %.0f\n", brownTotal);
    System.out.printf("green: %.0f\n", greenTotal);
    System.out.printf("orange: %.0f\n", orangeTotal);
    System.out.printf("red: %.0f\n", redTotal);
    System.out.printf("yellow: %.0f\n", yellowTotal);
    System.out.printf("Sum: %.0f\n", sum);

    // Print verification
    if (blueTotal > brownTotal && greenTotal > redTotal)
      System.out.println("Blue over Brown and Green over Red");
    if (brownTotal <= orangeTotal)
      System.out.println("Brown is less than or equal to Orange");
    if ((int)sum == total)
      System.out.println("Numbers match");
  }
}