fun fizzBuzz(n: Int):String{
    var output:String = ""

    if (n % 3 == 0) {output += "Fizz"}
    if (n % 5 == 0) {output += "Buzz"}

    if (output == "") {output += n}
    return output
}

fun main() {

    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}
