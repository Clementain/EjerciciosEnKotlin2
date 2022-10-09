fun main() {
    val calif = listOf(20, 30, 70, 74, 76, 80, 86, 90, 99, 100)
    println(grades(calif))
}

fun grades(notes: List<Int>): List<Pair<Int, String>> {
    val gradedNotes: MutableList<Pair<Int, String>> = mutableListOf()
    for (i in notes.indices) {
        val effort = when (notes[i]) {
            in 0..69 -> "Insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        gradedNotes.add(Pair(notes[i], effort))
    }
    return gradedNotes
}