import kotlin.math.pow // importujemy funkcjonalność podnoszenia do potęgi z biblioteki

fun checkArmstrong(number: Int): Boolean { // pobiera integer, zwraca boolean
    val digits = number.toString().map { it.digitToInt() } // Zamiana liczby na listę jej cyfr
    val power = digits.size // Ilość cyfr w liczbie
    val sum = digits.sumOf { it.toDouble().pow(power).toInt() } // Sumujemy cyfry podniesione do potęgi

    return sum == number // Sprawdzamy, czy suma jest równa oryginalnej liczbie
}

fun main() {
    println(checkArmstrong(153)) // true, bo 1^3 + 5^3 + 3^3 = 153
    println(checkArmstrong(9))   // true, bo 9^1 = 9
    println(checkArmstrong(154)) // false, bo 1^3 + 5^3 + 4^3 =/= 154
}

// 153 -> "153" -> [1, 5, 3] - digits
// E[1, 5, 3] -> [1.0, 5.0, 3.0] -> [1.0^3, 5.0^3, 3.0^3] -> [1, 125, 27] -> 1 + 125 + 27 = 153
// 153 == 153 -> true 

