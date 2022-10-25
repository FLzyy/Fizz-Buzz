function fizzBuzz(n: number) {
    let out: string = "";

    if (n % 3 == 0) {out += "Fizz";}
    if (n % 5 == 0) {out += "Buzz";}

    if (out == "") {out = n.toString();}
    return out;
}

for (let i: number = 1; i <= 100; i++) {
    console.log(fizzBuzz(i));
}
