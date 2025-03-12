fun printPascal(height: Int) {
    val triangle = mutableListOf<List<Int>>() /* mutowalna lista w niemutowalnej stalej val (można .add, nie można redefiniować) */

    for (i in 0 .. height-1) { // until korzysta z <, .. korzystają z <=,stąd to -1
        val row = MutableList(i + 1) { 1 }
        for (j in 1 .. i-1) {
            row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j] // wartość środkowego elementu jako suma dwóch powyższych
        }
        triangle.add(row) // tworzenie listy list, "tablicy"
    }

    for (row in triangle) {
        println(row.joinToString(" ")) // scalanie elementów listy do stringa
    }
}

fun main() {
    val height = 4
    printPascal(height)
}
