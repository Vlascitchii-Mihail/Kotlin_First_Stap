/*import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count +=part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(file)
    )
    clip.open(audioInputStream)
    clip.start()
}

suspend fun main () {
    runBlocking {
        launch { playBeats("x-x-x-x-x-x-", "toms.aiff") }
        playBeats("x-----x------", "crash_cymbal.aiff")
    }
}*/


/*import kotlinx.coroutines.*
fun main() {
    runBlocking { launch {
        delay(1000)
        println("World!") }
        println("Hello ")}
}*/

/*import kotlinx.coroutines.*
fun main() {
    for (i in 1..100) {
        GlobalScope.launch(Dispatchers.Main) {
            println("This is executed before delay $i")
            stallForTime()
            println("This is executed after delay $i")
        }
    }
}
suspend fun stallForTime() {
    withContext(Dispatchers.Default) {
        delay(2000L)
    }
}*/



/*fun main() {
    var n = 0
    var data = mutableListOf(0)
    repeat(999) { data.add(++n) }
    //data.forEach { item -> print(item) }
    binarySearch(data, readLine()!!.toInt())
}
fun binarySearch(_data: MutableList<Int>, num: Int) {
    var low = 0
    var height = _data.size
    while (low <= height) {
        var mid = (low + height) / 2
        var guess = _data[mid]
        if (guess == num) {
            println("Index of $num is $mid")
            break
        }
        if (guess > num) height = mid - 1
        if (guess < num) low = mid + 1
    }
}*/



/*fun main() {
    val data = mutableListOf<Int>(5, 8, 6, 8, 4, 3, 2, 0, 9, 1, 7)
    val data2 = mutableListOf<Int>()
    for (item in 0 until data.size) min(data.toIntArray()).let { data.remove(it)
    data2.add(it)}
    print(data2)
}

fun min(_data: IntArray): Int {
    var num = _data[(Math.random() * _data.size).toInt()]
    for (item in _data) if (num > item) num = item
    return num
}*/



/*fun main() {
    val data = mutableListOf<Int>(5, 8, 6, 8, 4, 3, 2, 0, 9, 1, 7)
    val data2 = mutableListOf<Int>()
    for (item in 0 until data.size) data.minOrNull().let { data.remove(it)
        if (it != null) data2.add(it) }
    print(data2)
}*/




/*fun countDown(i: Int) {
    var x = i
    print("${x--}, ")
    if (x > 0) countDown(x)
    else print(x)
}

fun factorial(number: Int): Int {
    return if (number == 1) number else number * factorial(number - 1)
}

fun sum(arr: Array<Int>, count: Int): Int {
    return if (count == 1) arr[0] else arr[count - 1] + sum(arr, count - 1)
}

fun sum(arr: MutableList<Int>): Int {
    if (arr.size == 1) return arr[0]
    arr[0] += arr[arr.size - 1]
    arr.removeAt(arr.size - 1)
    return sum(arr)
}

fun count(list: MutableList<Int>): Int {
    if (list.isEmpty()) return 0
    list.removeAt(list.size - 1)
    return 1 + count(list)
}

fun maxElement(arr: MutableList<Int>): Int {
    //if (arr.isEmpty()) return max
    return when {
        arr.size == 1 -> arr[0]
        arr[0] < arr[arr.size - 1] -> {
            arr[0] = arr[arr.size - 1]
            arr.removeAt(arr.size - 1)
            maxElement(arr)
        }
        else -> {
            arr.removeAt(arr.size - 1)
            maxElement(arr)
        }
    }

}

fun quicksort(arr: List<Int>): List<Int> {
    return if (arr.size < 2) arr
    else {
        val pivot = arr[arr.size / 2]
        val less = arr.filter { it < pivot }
        val greater = arr.filter { it > pivot }
        quicksort(less) + pivot + quicksort(greater)
    }
}

fun main() {
    countDown(5)
    println("\nFactorial = ${factorial(5)}")
    val arr = arrayOf(4, 7, 9, 6, 3, 1, 5, 8, 0)
    println("Sum of array = ${sum(arr, arr.size)}")
    println("Sum of list = ${sum(mutableListOf(4, 7, 9, 6, 3, 1, 5, 8, 0))}")
    println("Number of elements = ${count(mutableListOf(4, 7, 9, 6, 3, 1, 5, 8, 0))}")
    println("Max element of list = ${maxElement(mutableListOf(4, 7, 9, 6, 3, 1, 5, 8, 0))}")
    val list = mutableListOf(5, 7)
    repeat(1000) { list.add((Math.random() * list.size).toInt())}
    println("Quick short of list = ${quicksort(list.reversed())}")
}*/




/*fun main() {
    val book = mutableMapOf("apple" to 0.67, "pineapple" to 1.49, "carrot" to 12)
    readLine()!!.let { if (book[it] == null) {
        print("Enter the price: ")
        book[it] = readLine()!!.toDouble()
        } else {
        println("key exist")
    }
    }
    }*/



/*import sun.security.provider.certpath.Vertex
import java.util.Queue
import java.util.Deque
import java.util.LinkedList
fun bfs(start: String, finish: String): Int {
    val queue = ArrayDeque<String>()
    queue.add(start)
    val visited = mutableMapOf(start to 0)
    while (queue.isNotEmpty()) {
        val next = queue.poll()
    }
}


class Graph {
    private data class Vertex(val name: String) {
        val neighbors = mutableSetOf<Vertex>()
    }

    private val vertices = mutableMapOf<String, Vertex>()

    private operator fun get(name: String) = vertices[name] ?: throw IllegalArgumentException()

    fun addVertex(name: String) {
        vertices[name] = Vertex(name)
    }

    private fun connect(first: Vertex, second: Vertex) {
        first.neighbors.add(second)
        second.neighbors.add(first)
    }

    fun connect(first: String, second: String) = connect(this[first], this[second])

    fun neighbors(name: String) = vertices[name]?.neighbors?.map { it.name } ?: listOf()
}


private fun bfs(start: Vertex, finish: Vertex): Int {
    val queue = Lin<Vertex>()
    queue.add(start)
    val visited = mutableMapOf(start to 0)
    while (queue.isNotEmpty()) {
        val next = queue.pool()
        val distance = visited[next]!!
        if (next == finish) return distance
        for (neighbor in next.neighbors) {
            if (neighbor in visited) continue
            visited.put(neighbor, distance + 1)
            queue.add(neighbor)
        }
    }
    return -1
}

fun main() {
    val graph = mutableMapOf("you" to arrayOf("alice", "bob", "claire"))
    graph["bob"] = arrayOf("anuj", "peggi")
    graph["alice"] = arrayOf("peggi")
    graph["clair"] = arrayOf("thom", "jonny")
    graph["anuj"] = arrayOf()
    graph["thom"] = arrayOf()
    graph["jonny"] = arrayOf()
    println(graph)
//    fun search() {
//        val q: Queue<MutableMap<String, Array<String>>> = LinkedList<MutableMap<String, Array<String>>>()
//        q = graph
//        val searched: MutableMap<String, Array<String>>
//        while (q.poll() != null) {
//
//        }
//    }


}*/




/*import java.util.Queue
import java.util.LinkedList
fun main() {
    val num: Queue<Int> = LinkedList<Int>(listOf(1, 2, 3))
    num.add(4)
    num.offer(5)
    println(num)
    num.poll()
    println(num.peek())
    println(num)
    println(num.indexOf(3))
    //num.forEach( println(it))
    for (n in num) println(n)
}*/




/*fun main() {
    val graph2 = mutableMapOf("WeakUp" to setOf("Shower", "Teeth"))
    graph2["Teeth"] = setOf("Breakfast")
}*/

/*fun main() {
    val graph = mutableMapOf("WakeUp" to setOf("Work-Out", "Teeth", "Food"))
    graph["Work-Out"] = setOf("Shower")
    graph["Teeth"] = setOf("Breakfast")
    graph["Shower"] = setOf("GetDressed")
}*/




/*import java.util.*

fun main() {
    val graph = mutableMapOf("you" to setOf("alice", "bob", "claire"))
    graph["bob"] = setOf("anuj", "peggi")
    graph["alice"] = setOf("peggi")
    graph["clair"] = setOf("thom", "jonny")
    graph["anuj"] = setOf()
    graph["thom"] = setOf()
    graph["jonny"] = setOf()
    println(graph)
    val searchQueue = LinkedList<MutableMap<String, Set<String>>>()
    searchQueue.add(graph)
    var searched = setOf<String>()
    while (searchQueue.isNotEmpty()) {
        var person = searchQueue.peek()
        if (person in searched))
    }
}*/


/*
import kotlin.math.absoluteValue
val processed = mutableSetOf<String>()
fun main() {
    val graph = mutableMapOf("start" to mutableMapOf("a" to 6, "b" to 2))
    println(graph["start"]?.values)
    graph["a"] = mutableMapOf("fin" to 1)
    graph["b"] = mutableMapOf("a" to 3, "fin" to 5)
    graph["fin"] = mutableMapOf()

    val costs = mutableMapOf("a" to 6, "b" to 2, "fin" to Int.MAX_VALUE)

    val parents = mutableMapOf("a" to "start", "b" to "Start", "fin" to null)

    var node = findLowestCostNode(costs)
    while (node != null) {
        var cost = costs[node]
        var neighbors = graph[node]
        for (n in neighbors?.keys!!) {
            var newCost = cost?.plus(neighbors[n]!!)
            if (costs[n]?.absoluteValue!! > newCost!!) {
                costs[n] = newCost
                parents[n] = node
            }
            processed.add(node)
            node = findLowestCostNode()
        }
    }
}
var lowestCostNode: MutableMap.MutableEntry<String, Int> = TODO()

fun findLowestCostNode(costs: MutableMap<String, Int>): MutableMap.MutableEntry<String, Int>{
    var lowestCost = Int.MAX_VALUE
    for (node in costs) {
        var cost = costs[node]
        if (cost < lowestCost && node.key !in processed) {
            lowestCost = node.value
            lowestCostNode = node
        }
    }
    return lowestCostNode
}*/



/*fun main() {
    val states = setOf("mt", "wa", "or", "id", "nv", "ut", "ca", "az")
    val stations = mutableMapOf("kone" to setOf("id", "nv", "ut"))
    stations["ktwo"] = setOf("wa", "id", "mt")
    stations["kthree"] = setOf("or", "nv", "ca")
    stations["kfour"] = setOf("nv", "ur")
    stations["kfive"] = setOf("ca", "az")
    val finalStation = setOf("")

    var bestStation = null
}*/



