class Main {
  static String fizzBuzz(int n) {
    String output = "";

    if (n % 3 == 0) {output += "Fizz";}
    if (n % 5 == 0) {output += "Buzz";}
      
    if (output == "") {output += n;}
    return output;
  }
    
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
        System.out.println(fizzBuzz(i));
    }
  }
}
