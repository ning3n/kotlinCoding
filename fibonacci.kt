/*
    Escribe un programa que imprima los primeros 50 numeros de la sucesion de fibonacci
*/

fun main() {
    var n0: Long = 0
    var n1: Long = 1

    (1..50).forEach {
        println(n0)

        va1 fib = n0 + n1
        n0 = n1
        n1 = fib
    }
}