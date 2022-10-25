func fizzBuzz(n: Int) -> String {
    var out = ""

    if (n % 3 == 0) {out += "Fizz"}
    if (n % 5 == 0) {out += "Buzz"}

    if (out == "") {out = String(n)}
    return out
}

for i in 1...100 {
    print(fizzBuzz(n: i))
}
