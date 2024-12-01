import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val l1 = input.map { it.split(" ").first().toInt() }.sorted()
        val l2 = input.map { it.split(" ").last().toInt() }.sorted()
        return l1.mapIndexed { index, i ->
            abs(i - l2[index])
        }.sum()
    }

    fun part2(input: List<String>): Int {
        val l1 = input.map { it.split(" ").first().toInt() }
        val l2 = input.map { it.split(" ").last().toInt() }
        return l1.sumOf { e1 ->
            l2.filter { it == e1 }.size * e1
        }
    }

    // Read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 11)
    check(part2(testInput) == 31)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
