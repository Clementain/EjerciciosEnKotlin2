fun main() {
    val words = listOf("alumno", "BONITO", "TARDES", "genial", "gimnasia", "ESPEJISMO", "estoicismo", "VOLAR")
    println(params(words) { a -> validate(a) })
}

fun params(values: List<String>, validate: (String) -> Boolean): List<Pair<String, Boolean>> {
    val words: MutableList<Pair<String, Boolean>> = mutableListOf()
    for (i in values.indices) {
        words.add(Pair(values[i], validate(values[i])))
    }
    return words
}


fun validate(word: String): Boolean {
    return word == word.uppercase()
}