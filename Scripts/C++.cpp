#include <iostream>
using namespace std;

string fizzBuzz(int n) {
  string output = "";

  if (n % 3 == 0) {output += "Fizz";}
  if (n % 5 == 0) {output += "Buzz";}

  if (output == "") {output = to_string(n);}
  return output;
}

int main() {
  for (int i = 1; i <= 100; i++) {
    cout << fizzBuzz(i) << "\n";
  }
  return 0;
}
