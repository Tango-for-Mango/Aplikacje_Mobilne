// Zad 1
val r: (String, Int) -> String = {s, i -> s.repeat(i)} // lambda z kopiowaniem stringa


// Zad 2
val <T> List<T>.tail: List<T>
    get() =  this.drop(1) // wszystkie oprocz 1.

val <T> List<T>.head: T
    get() = this.first() // 1.


// Zad 3
fun <A> isSorted(lst: List<A>, order: (A, A) -> Boolean): Boolean {
    return lst.zipWithNext().all { (a, b) -> order(a, b) } // sortowanie dzieki laczeniu 2ch sasiednich elementow w pary
                                                           // "zipWithNext"  i porownywanie czy spelniaja warunek
}


// Zad 4
fun <A> tailToHead(lst: List<A>): List<A> {
    if (lst.isEmpty()) throw IllegalStateException("Pusta lista")
    return listOf(lst.last()) + lst.dropLast(1) // ostatni el. na pocz. + error jesli pusta
}


// Zad 5
fun <A> setHead(lst: List<A>, item: A): List<A> {
    return listOf(item) + lst.drop(1) // zamiana 1. el. na podany przez uzytkownika: "item"
}


// Zad 6
fun check(N: Int, list: List<Int>): Int { // sprawdz. i wypis. 1. liczby ktora nie jest suma dow. 2ch z poprednich, zawartych w preambule
    for (i in N until list.size) {
        val preamble = list.subList(i - N, i).toSet() //wybieramy N poprzednich liczb i zamieniamy je na zbiór.
        val current = list[i]

        if (!preamble.any { num -> (current - num) in preamble && num != (current - num) }) { // sprawdzanie czy w preamble sa 2 liczby ze 1+2ga == current
            return current // jesli nie ma, zwracany jest current (liczba ktora nie jest zlozona z sumy 2ch innych z preambuly
        }
    }
    return -1
}



fun main() {
    println("")
    println("Zad 1")
    println("")
    println(r("a", 1))
    println(r("l",2))
    println(r("a", 3))
    println(r(" ", 3))
    println(r("m", 4))
    println(r("a", 5))
    println(r(" ", 3))
    println(r("k", 4))
    println(r("o", 3))
    println(r("t", 2))
    println(r("a", 1))

    println("")
    println("Zad2")
    println("")
    val listazad2 = listOf(1, 2, 3)
    println("Tail: ${listazad2.tail}")
    println("Head: ${listazad2.head}")

    println("")
    println("Zad3")
    println("")
    println(isSorted(listOf(1, 2, 3, 4)) { i: Int, j: Int -> i < j })
    println(isSorted(listOf(1, 1, 1, 1 )) { i:Int, j:Int -> i==j })
    println(isSorted(listOf("ahyyhh", "bkjn", "cnn", "duu")) { i: String, j: String -> i.first() < j.first() })

    println("")
    println("Zad4")
    println("")
    println(tailToHead(listOf(1, 2, 3)))

    println("")
    println("Zad5")
    println("")
    println(setHead(listOf(1, 2, 3), 5))

    println("")
    println("Zad6")
    println("")
    println(check(2, listOf(1, 2, 3, 4, 5, 6))) // powinno wypluć 4
    println(check(5, listOf(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576)))
} // powinno wypluć 127