fun main(){
    for (index in 1..100){
        val divisibleByThree = index % 3 == 0
        val divisibleByFive = index % 5 == 0

        when {
            divisibleByThree && divisibleByFive -> println("FizzBuzz")
            divisibleByThree -> println("Fizz")
            divisibleByFive -> println("Buzz")
            else -> println(index)
        }
    }
}