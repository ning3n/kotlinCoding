fun main(){
    (1..100).forEach {
        if (isPrime(number)){
            println("$number es primo")
        }
    }
}

private fun isPrime(number: Int): Boolean {
    if (number < 2) return false

    for (i in 2 until number) {
        if (number % i == 0) return false
    }

    return true
}