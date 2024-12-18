fun displayEvenOrOdds(x: Int, ) {
    for (i in 1..x) {
        if (i % 2 == 0) {
            println("$i est pair")
        } else {
            println("$i est impair")
        }
    }
}

fun displayFibonacci(x: Int) {
    var a = 0
    var b = 1
    var next: Int
    for (i in 1..x) {
        println(a)
        next = a + b
        a = b
        b = next
    }
}

fun displayFactorial(x: Int = 10) {
    var result = 1
    for (i in 1..x) {
        result *= i
    }
    println(result)
}

fun displayPrimeNumbers(x : Int) {
    var num: Int
    var isPrime: Boolean
    for (i in 1..x) {
        isPrime = true
        for (j in 2..i / 2) {
            num = i % j
            if (num == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime)
            println("$i est un nombre premier")
    }
}

fun main() {
    //displayEvenOrOdds(10)
    //displayFibonacci(10)
    //displayFactorial()
    displayPrimeNumbers(10)
}