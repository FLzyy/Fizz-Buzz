def fizzBuzz(n):
    out = ""

    if (n % 3 == 0): out += "Fizz"
    if (n % 5 == 0): out += "Buzz"

    if (out == ""): out = n
    return out

for i in range(1, 101):
    print(fizzBuzz(i))
