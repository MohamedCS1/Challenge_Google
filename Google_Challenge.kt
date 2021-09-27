
import java.util.*
import kotlin.collections.HashMap
import kotlin.system.exitProcess

fun main() {

    val array = arrayListOf<LinkedList<String>>()


    for (i in 0..4) {

        array.add(LinkedList<String>())
    }

    array[0].add("M")
    array[0].add("M")
    array[0].add("M")
    array[0].add("M")
    array[0].add("G")


    array[1].add("M")
    array[1].add("M")
    array[1].add("G")
    array[1].add("G")
    array[1].add("G")


    array[2].add("G")
    array[2].add("G")
    array[2].add("M")
    array[2].add("M")
    array[2].add("G")


    array[3].add("M")
    array[3].add("M")
    array[3].add("G")
    array[3].add("M")
    array[3].add("G")


    array[4].add("G")
    array[4].add("G")
    array[4].add("G")
    array[4].add("G")
    array[4].add("M")


    val hash_map = HashMap<Int, Int>()

    for (i in 0 until array.size) {
        for (j in 0..4) {
            if (array[i][j] == "M" && i == j) {

                hash_map[i] = j
                break
            }
        }
    }

    if (array.size > hash_map.size)
    {
        exitProcess(0)
    }

    for (i in hash_map) {
        println(i)
    }


}
