fun main() {
    val calif = listOf("matematicas" to 50, "geografia" to 73, "español" to 80, "quimica" to 93, "historia" to 99)
    println(grades(calif))
}

fun grades(notes: List<Pair<String, Int>>): List<Pair<String, String>> {
    val gradedNotes: MutableList<Pair<String, String>> = mutableListOf()
    for (i in notes.indices) {
        val effort = when (notes[i].second) {
            in 0..69 -> "Insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        gradedNotes.add(Pair(notes[i].first.uppercase(), effort))
    }
    return gradedNotes
}