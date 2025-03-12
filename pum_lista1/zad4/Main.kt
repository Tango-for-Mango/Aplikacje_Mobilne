fun isPerfect(num:Int):String {
    var suma = 0
    for (i in 1..<num) {
        if(num%i==0) // jeśli liczba jest dzielnikiem naszej liczby, dodajemy ją do sumy
            suma+=i
    }
    if(suma == num) // przypisywanie liczbie jej carakterystyki bazując na sumie alikwotowej tej liczby
        return "perfect"
    if(suma > num)
        return "abundant"
    return "deficient"
}

fun main() {
    val number1 = 28
    println(isPerfect(number1)) // dsskonała

    val number2 = 12
    println(isPerfect(number2)) // obfita

    val number3 = 8
    println(isPerfect(number3)) // niedomiarowa
}
