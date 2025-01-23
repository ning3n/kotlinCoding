/*
    Escribe una funcion que reciba dos palabras (String) y retorne verdadero o falso (Boolean)
    si son anagramas o no. No hace falta comprobar que ambas palabras existan.
    dos palabras exactamente iguales no son anagramas.
*/

fun main() {
    println(isAnagram("roma", "amor")) // true
}

private fun isAnagram(word1: String, word2: String): Boolean {
    if (word1.lowercase() == word2.lowercase()) return false
    return word1.lowercase().toCharArray().sortedArray().contentEquals(word2.lowercase().toCharArray().sortedArray())
}
