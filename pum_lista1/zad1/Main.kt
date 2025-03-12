fun foo(n: Int) {
    for (i in 1..n) {
        var output = "" // output pusty, sama liczba

        if (i % 3 == 0) output += "trzy"
        if (i % 5 == 0) output += "piec"
        if (i % 7 == 0) output += "siedem"
        if (i % 11 == 0) output += "jedenascie"
        if (i % 13 == 0) output += "trzynascie"

        println(if (output.isEmpty()) i else output) // jesli liczba nie jest podzielna przez zadny z warunków, zwraca i -> tą liczbę;
                                                    // w przeciwnym wypadku, zwraca stringa
    }
}

fun main() {
    foo(15) // Przykładowe wywołanie
}
