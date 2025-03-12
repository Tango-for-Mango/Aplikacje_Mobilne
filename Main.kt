fun isPalindrome(word: String): Boolean {
    return word == word.reversed() // obraca stringa i porównuje czy jest identyczny z początkowym
}

fun main() {
    val word = readln() //pobieranie wyrazu od uzytkownika
    println(isPalindrome(word)) // sprawdzane jest pobrane słowo
}
