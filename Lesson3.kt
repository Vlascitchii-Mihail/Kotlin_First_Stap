import java.util.*

/*class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    val point3D = Point3D()
    point3D.x = x
    point3D.y = y
    point3D.z = z
    return point3D
}*/



/*class OperatingSystem {
    var name: String = "String"
}

class DualBoot {
    var primaryOs: OperatingSystem = OperatingSystem()
    var secondaryOs: OperatingSystem = OperatingSystem()
}*/



/*class Calendar(var day: String?, var month: String?, var year: String?) {

    fun selectCurrentDay() {
        day = readLine()
        month = readLine()
        year = readLine()
    }
}
fun createCalendar() = Calendar("-", "-", "-")
fun main() {
    val calendar = createCalendar()
    calendar.selectCurrentDay()
    println("${calendar.day} ${calendar.month} ${calendar.year}")
}*/



/*fun main(){
    var ch: Char = readLine()!!.first()
    println("ch++ ${ch++}")
    println("$ch + 1 = ${ch + 1}")
    println("ch == b? ${ch == 'b'}")
    val isDigit = ch >= '1' && ch <= '9'
    println("ch is digit? $isDigit")
    println("ch is letter? ${ch.isLetter()}")
    println("ch is digit? ${ch.isDigit()}")
    println("ch is letter or digit? ${ch.isLetterOrDigit()}")
    println("ch is whitespace? ${ch.isWhitespace()}")
    println("ch is uppercase? ${ch.isUpperCase()}")
    println("ch is lowercase? ${ch.isLowerCase()}")
    println("ch to upper case $ch: ${ch.uppercaseChar()} and ${ch.uppercase()}")
    println("ch to lower case $ch: ${ch.lowercase()} and ${ch.lowercaseChar()}")
}*/



/*fun main() {
    val let = List(4) { readLine()!!.first()}
    for (it in let) println(it - 1)
}*/


/*fun main() {
    val list = List(2) { readLine()!!.first()}
    println(list[0].equals(list[1], ignoreCase = true))
    println(readLine()!!.equals(readLine()!!, true))
}*/



/*fun main() {
    repeat(4) { println(readLine()?.first()?.isDigit())}
}*/


/*fun main() {
    var list = List(3) { readLine()!!.first()}
    println(list[0] == list[1] - 1 && list[0] == list[2] - 2)
}*/



/*fun main() {
    println(readLine()!!.first().code == readLine()!!.toInt())
    println("number to Char: ${readLine()!!.toInt().toChar()}")
}*/



/*fun main() {
    val char = readLine()!!.first()
    println(char.isUpperCase() || char.isDigit() && (char.code >= 31 && char.code <= 39))
}*/



/*fun main() {
    var greeting = "Hello"
    println("last element: ${greeting[greeting.length - 1]}")
    println("does string is empty? ${greeting.isEmpty()}")
    greeting = "Hello world!"
}*/



/*fun main() {
    val name1 = readLine()!!.split(" ")
    println("${name1[0].first()}. ${name1[1]}, ${name1[2]} years old")
}*/



/*import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (firstName, lastName, age) = Array(3) { scanner.next() }
    println("${firstName.first()}. $lastName, $age years old ")
}*/



/*fun main() {
    val (first, last, age) = readLine()!!.split(" ")
    println("${first.first()}. $last, $age years old")
}*/



/*fun main() {
    println(readLine()!! == readLine()!!)
}*/



/*fun main() {
    val str = readLine()!!
    val num = readLine()!!.toInt()
    println("Symbol # $num of the string \"$str\" is \'${str[num - 1].toChar()}\'")
}*/


/*fun main() {
    val num = readLine()!!
    println(num[num.length - 2])
}*/


/*fun main() {
    val (num1, num2, num3, num4, num5) = Array(5) { readLine()!!.toInt()}
    println(num5 in num1..num2 && num5 in num3..num4)
}*/



//fun main() = println(readLine()!!.toInt() in 18..59)



/*fun main() {
    val num1 = readLine()!!.toInt()
    println(num1 in readLine()!!.toInt()..readLine()!!.toInt())
}*/



/*fun main() {
    val str1 = "Hello"
    var str2 = "Hello"
    println(str1 === str2)
    str2 = "World"
    println(str1 === str2)

}*/



/*fun main() {
    val a = 4
    val b = 6
    val max = if (a > b){
        println("Choose a")
        a
    } else {
        println("Chose b")
        b
    }
    println(max)
}*/



/*fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(if (a > c) {
        if (a > b) a else b
    } else {
        if (b > c) b else c
    })
}*/



/*fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var max = b
    if (a > b) max = a
    println(max)
}*/



/*// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    // put your code here
    println((a + b + Math.abs(a - b)) / 2)
}*/



//fun main() = println(if (readLine()!!.toInt() % 2 == 0) "even" else "odd" )



/*fun main() {
    println(readLine()!!.toInt().let { if (it == 0) "zero" else if (it < 0) "negative" else "positive" })
}*/



/*fun main() {
    println(readLine()!!.toInt().let { if (it < 0 || it ==0) "NO" else "YES" })
}*/



//fun main() = readLine()!!.toInt().run { println(if (this > 0) "YES" else "NO") }



/*fun main() {
    val (A, B, H) = Array(3) { readLine()!!.toInt() }
    when (H >= 0){
        H < A -> println("Deficiency")
        H > B -> println("Excess")
        H in A..B -> println("Normal")
    }
}*/



/*fun main() {
    println(readLine()!!.toInt().let { if (it in 1900..3000 && it % 400 == 0 || (it % 100 != 0 && it % 4 == 0)) "Leap" else "Regular" })
}*/



/*fun main() = List(3) { readLine()!!.toInt()}.
        let { println(if ((it[0] + it[1] > it[2]) && (it[1] + it[2] > it[0]) &&
                    (it[0] + it[2] > it[1])) "YES" else "NO") }*/



/*fun main() {
    println(readLine()!!.toInt().let { if (it in -14..12 || it in 15..16 || it in 19..Int.MAX_VALUE) "True" else "False" })
}*/

/*import kotlin.math.*
fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
    println(if (abs(x2 - x1) == 1 && abs(y2 - y1) == 2 || abs(x2 - x1) ==2 && abs(y2 - y1) == 1) "YES" else "NO")
}*/



/*fun main() {
    val num = readLine()!!.toInt()
    listOf(2, 3, 5, 6).map {if (num % it == 0)println("Divided by $it")}
}*/


/*import kotlin.math.*
fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
    println(if ((x1 == x2 || y1 == y2) ||  (abs(x1 - x2) == abs(y1 - y2))) "YES" else "NO")
}*/



/*fun main() {
    val (x1, y1, z1) = readLine()!!.split(" ").map { it.toInt() }.sorted()
    val (x2, y2, z2) = readLine()!!.split(" ").map { it.toInt() }.sorted()
    when (true) {
        (x1 * y1 * z1 == x2 * y2 * z2) -> println("Box 1 = Box 2")
        x1 >= x2 && y1 >= y2 && z1 >= z2 -> println("Box 1 > Box 2")
        x1 <= x2 && y1 <= y2 && z1 <= z2 -> println("Box 1 < Box 2")
    else -> println("Incomparable")
    }
}*/



/*fun main() {
    val (a, b, c) = List(3) {readLine()!!}
    println(when(b) {
        "equals" -> a == c
        "plus" -> a + c
        "endsWith" -> a.endsWith(c)
        else -> "Unknown operation"
    })
}*/


/*import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextLong()
    val operator = scanner.next()
    var b = scanner.nextLong()
    println(when (operator) {
        "+" -> a + b
        "-" -> a - b
        "/" -> if (b != 0.toLong())a / b else "Division by 0!"
        "*" -> a * b
        else -> "Unknown operator"
    })
}*/



/*fun main() {
    val (num1, op, num2) = readLine()!!.split(" ")

    val a = num1.toLong()
    val b = num2.toLong()

    print(when (op) {
        "+" -> a + b
        "-" -> a - b
        "/" -> if (b != 0L) a / b else "Division by 0!"
        "*" -> a * b
        else -> "Unknown operator"
    })
}*/



/*fun main() = when (readLine()!!) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> " intellect"
        else -> "not a valid house"
    }.let(::print)*/




/*fun main() = when (readLine()!!.toInt()) {
    0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> "F"
    0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> "T"
    1, 10, 100, 1000, 10000, 100000 -> "P"
    else -> "N"}.let (::print)*/



/*fun main() = when (readLine()!!.toInt()) {
    1 -> "You have chosen a square"
    2 -> "You have chosen a circle"
    3 -> "You have chosen a triangle"
    4 -> "You have chosen a rhombus"
    else -> "There is no such shape!"
}.let (::print)*/



/*fun main() = when (readLine()!!.toInt()) {
    1 -> "move up"
    2 -> "move down"
    3 -> "move left"
    4 -> "move right"
    0 -> "do not move"
    else -> "error!"}.let(::print)*/



/*fun main() = when (readLine()!!) {
    "one" -> 1
    "two" -> 2
    "three" -> 3
    "four" -> 4
    "five" -> 5
    "six" -> 6
    "seven" -> 7
    "eight" -> 8
    "nine" -> 9
    else -> "" }.let(::print)*/



/*un main() {
    val nums = arrayOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    val numIn = readLine()!!
    println(nums.indexOf(numIn) + 1)
}*/



/*fun main() = readLine()!!.toInt().let { when {
    it / 1000 != 0 -> 4
    it / 100 != 0 -> 3
    it / 10 != 0 -> 2
    else -> 1
} }.let(::print)*/



/*fun main() = with(readLine()!!.toInt()) { when {
        this / 1000 != 0 -> 4
        this / 100 != 0 -> 3
        this / 10 != 0 -> 2
        else -> 1
    } }.let(::print)*/


/*fun main() = when (readLine()!!.toInt()) {
        in 0..9 -> 1
        in 10..99 -> 2
        in 100..999 -> 3
        in 1000..9999 -> 4
        else -> "So much"
    }.let(::print)*/




/*fun main() = when (readLine()!!.toInt()) {
    1 -> "No"
    2 -> "Yes"
    3 -> "No"
    4-> "No"
    else -> "Unknown number" }.let(::print)*/




/*fun main() = when (readLine()!!.toInt()) {
    in 1..4 -> "few"
    in 5..9 -> "several"
    in 10..19 -> "pack"
    in 20..49 -> "lots"
    in 50..99 -> "horde"
    in 100..249 -> "throng"
    in 250..499 -> "swarm"
    in 500..999 -> "zounds"
    in 1000..Int.MAX_VALUE -> "legion"
    else -> "no army" }.let(::print)*/

/*fun main() {
    val (a, b) = List(2) { readLine()!! }
    print("$b\n$a")
}*/


/*import kotlin.math.*
fun main() = when (readLine()!!) {
        "rectangle" -> readLine()!!.toDouble() * readLine()!!.toDouble()
        "triangle" -> {
            val (a, b, c) = List(3) { readLine()!!.toDouble()}
            val p = 0.5 * (a + b+ c)
            sqrt(p * (p - a) * (p - b) * (p - c))
        }
        "circle" -> 3.14 * readLine()!!.toDouble().pow(2)
    else -> "Not found"
    }.let(::print)*/




/*fun main() = readLine()!!.let {
    if (it.isEmpty()) return
    when (it.first().toString()) {
        "i" -> it.drop(1).toInt() + 1
        "s" -> it.drop(1).reversed()
        "" -> ""
        else -> it
    }.let(::print)
}*/




/*fun main() = readLine()!!.let {
    when (it.firstOrNull()) {
        'i' -> it.substring(1).toInt() + 1
        's' -> it.substring(1).reversed()
        else -> it
    }
}.let(::print)*/



/*fun square(value: Int, context: Any, continuation: (Int, Any) -> Unit) {
    continuation(value * value, context)
}*/


/*fun isNotDot(c: Char): Boolean = c != '.'
fun main() {
    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter(::isNotDot)
    println(textWithoutDots)
}*/




//fun isEven(number: Int) = number % 2 == 0



/*fun identity(arg: Int) = arg
fun half(arg: Int) = arg / 2
fun zero(arg: Int) = 0
fun main() {
    fun generate(functionName: String): (Int) -> Int {
        when (functionName) {
            "identity" -> return ::identity
            "half" -> return ::half
            else -> return ::zero
        }
    }
}*/



/*fun main() {
    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter { it != '.' }
}*/


/*fun placeArgument(value: Int, f: (Int, Int) -> Int): (Int) -> Int {
    return { i -> f(value, i) }
}
fun sum(a: Int, b: Int): Int = a + b
fun main() {
    val mul2 = { a: Int, b: Int -> a * b }
    val increment = placeArgument(1, ::sum)
    val triple = placeArgument(3, mul2)

    println(increment(4))   // 5
    println(increment(40))  // 41
    println(triple(4))      // 12
    println(triple(40))
}*/




/*fun main() {
    val (a, b) = List(2) {readLine()!!.toLong()}
    val lambda: (Long, Long) -> Long = {
            a, b -> var c = 1L
        for (item in a..b) c *= item
        c}
}*/



/*fun main() {
    val (a, b) = List(2) {readLine()!!.toLong()}
    val lambda: (Long, Long) -> Long = {a, b -> (a..b).reduce{ st,b -> st*b }}
}*/


/*fun main() {
    val (a, b) = List(2) {readLine()!!.toLong()}
    //val lambda: (Int, Int) -> Int = {m, v -> if (m > v) m else v }
    val lambda: (Int, Int) -> Int = ::maxOf
}*/



/*import kotlin.math.*
fun main() {
    val (a, b, c) = List(3) {readLine()!!.toInt()}
    val lambda: (Int) -> Int = {x -> a * x.toDouble().pow(2).toInt() + b * x + c}
}*/




/*fun fizzbuzz(from: Int, to: Int, transformation: (Int) -> String) {
    for (number in from..to) {
        println(transformation(number))
    }
}

fun main() {
    fizzbuzz(1, 100) { number ->
        if (number % 15 == 0) {
            return@fizzbuzz "fizzbuzz"
        }
        if (number % 3 == 0) {
            return@fizzbuzz "fizz"
        }
        if (number % 5 == 0) {
            return@fizzbuzz "buzz"
        }
        return@fizzbuzz number.toString()
    }
}*/


//fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int = { g(h(it)) }



//val notPredicate: (Char) -> Boolean = { c: Char -> c !is Char }


/*fun main() {
    f(readLine()!!.toDouble()).let(::print)
}
fun f(x: Double): Double = x.let { when {
        it <= 0 -> f1(it)
       it >= 1.0 -> f3(it)
        else -> f2(it)
    } }


// implement your functions here
fun f1(x: Double) = x * x + 1

fun f2(x: Double) = 1 / (x * x)

fun f3(x: Double) = x * x - 1*/



/*fun name(userName: String = "secret user") = println("Hello, $userName!")

fun main() = readLine()!!.let { if (it == "HIDDEN") name() else name(it) }*/




/*fun sum5(a1: Int = 0, a2: Int = 0, a3: Int = 0, a4: Int = 0, a5: Int = 0): Int{
    a1 + a2 + a3 + a4 + a5
}*/


/*fun sum5(vararg a: Int) = print(a.sum())
fun main() {
    sum5(18, 4)
}*/




/*fun polynomial(x: Int = 0, c: Int = 0, b: Int = 0, a: Int = 0): Int {
    return when {
        x != 0 && c != 0 && b != 0 && a != 0 -> a * x * x + b * x + c
        x != 0 && c != 0 && b != 0 -> b * x + c
        else -> c
    }
}fun main() {
    polynomial(10, 9, 4)
}*/



//fun getVolume(x: Int, y: Int = 1, z: Int = 1) = x * y * z


/*fun newLine(str1: String, str2: String, str3: String, str4: String = " "){
    println("$str1$str4$str2$str4$str3")
}
fun main() {
    val (a, b, c, d) = List(4) { readLine()!!}
    if (d == "NO SEPARATOR") newLine(a, b, c) else newLine(a, b, c, d)
}*/



/*fun greetUser(
    name: String,
    admin: Boolean = false,
    smith: Boolean = false,
    honorific: String = "",
    greet: String = "Greetings"
): String {
    return if (!admin && !smith) {
        "$greet, $honorific $name"
    } else {
        "Matrix Error"
    }
}*/
// do not change lines above

/*fun greetNeo(str: String) = greetUser(greet = "Hello", honorific = "Mr.", name = "Anderson",
admin = false, smith = false)
*/



/*fun speedLimit(speed: Int, limit: Int = 60){
    println(if (speed <= limit) "Within the limit" else "Exceeds the limit" +
            " by ${speed - limit} kilometers per hour")
}

fun main() {
    List(2) {  readLine()!! }.let { if (it[1] == "no limit") speedLimit(it[0].toInt())
    else speedLimit(it[0].toInt(), it[1].toInt()) }
}*/




/*import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val speed = scanner.nextInt()
    val limit = if (scanner.hasNextInt()) scanner.nextInt() else 60
    println(if (speed > limit) "Exceeds the limit by ${speed - limit} kilometers per hour" else "Within the limit")
}*/



/*fun price(old: Int = 5, passed: Int = 100_000, speed: Int = 120, auto: Int = 0, newCarPrice: Int = 20_000){
    println(newCarPrice - old * 2000 + auto * 1500 - (120 - speed) * 100 -
            (passed / 10_000 * 200))
}

fun main() {
    when (readLine()!!) {
        "old" -> price(old = readLine()!!.toInt())
        "passed" -> price(passed = readLine()!!.toInt())
        "speed" -> price(speed = readLine()!!.toInt())
        "auto" -> price(auto = readLine()!!.toInt())
    }
}*/


/*import kotlin.math.hypot
fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x3, y4: Double = y3): Double {
    return hypot((x2 - x1), (y2 - y1)) + hypot((x3 - x2), (y3 - y2)) +
            hypot((x4 - x3), (y4 - y3)) + hypot((x1 - x4), (y1 - y4))
}

fun main() = List(8) { readLine()!!.toDouble()}.let {
        perimeter(it[0], it[1], it[2], it[3], it[4], it[5], it[6], it[7])
    }.let(::print)*/

/*import kotlin.math.*
fun compoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10){
    println((amount * (1 + percent.toDouble() / 100).pow(years)).toInt())
}
fun main() = when (readLine()!!) {
        "amount" -> compoundInterest(readLine()!!.toInt())
        "percent" -> compoundInterest(percent = readLine()!!.toInt())
        else -> compoundInterest(years = readLine()!!.toInt())
    }*/




/*fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        when {
            time > 127 -> time = 127
            time < -128 -> time = -128
            else -> time
        }
    }
}*/




/*class Site(val address: String, val foundationYear: Int)

fun makeReddit(reddit: Site = Site("reddit.com", 2005)) = reddit*/




//class Pet(val name: String, animal: String = "cat", owner: String)



/*class Route(startPoint: Int = 0, finishPoint: Int) {
    val distance = finishPoint - startPoint
}*/



/*class Application(val name: String) {
    fun run(str1: String, str2: String, str3: String) {
        println("$name\n$str1\n$str2\n$str3")
    }
}
fun main() {
    val app = Application("game")
    app.run("aaa", "bbb", "ccc")
}*/



/*class Car(val make: String, val year: Int) {

    var speed: Int = 10

    fun accelerate() {
        speed += 5
    }
    fun decelerate() {
        if (speed > 5) speed -= 5 else speed = 0
    }
}
fun main() {
    val car = Car("Honda", 1995)
    car.accelerate()
    println(car.speed)
    car.decelerate()
    println(car.speed)
}*/


/*import kotlin.math.*
object Math {
    fun abs(integer: Int): Int = if (integer < 0) integer * (-1) else integer
    fun abs(double: Double): Double = if (double < 0) double * (-1) else double
}
fun main() {
    println(Math.abs(-3))
    println(Math.abs(-1.3))
}*/



/*object PlayingField {
    object Size {
        var width: Int = 0
        var height: Int = 0
    }
    fun changeSize(newWidth: Int, newHeight: Int) {
        Size.width = newWidth
        Size.height = newHeight
    }
}*/




/*class Cell {
    object BaseProperties {
        var width = 10
        var height = 10
    }
    var width = BaseProperties.width
    var height = BaseProperties.height
}*/



/*import kotlin.math.*
class Block(val color: String) {
    object BlockProperties {
        var length = 6
        var width = 4
        fun blocksInBox(_length: Int = 9, _width: Int = 14): Int {
            return abs(_width * _length) / abs(width * length)
        }
    }
}
fun main() {
    println(Block.BlockProperties.blocksInBox(20, 10))
}*/




/*class Task(val name: String)
object Manager {
    var solveTask: Int = 0
    fun solveTask(obj: Task) {
        println("Task ${obj.name} solved!")
        ++solveTask
    }
}

fun main() {
    Manager.solveTask(Task("Resolve"))
    println(Manager.solveTask)
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



///////////////////Module 11/////////////////////



/*fun main(){
    val ints = listOf(1, 2, 3, 4)
    println(ints.maxOrNull())
    println(ints.minOfOrNull { it })
    println(ints.sum())
    println(ints.sumOf { it })
    println(ints.minOfOrNull { int: Int -> int })
    println(ints.sumOf { int: Int -> int.toDouble() })
}*/


/*data class Grocery(var name: String, val category : String, val unit: String,
                   val unitPrice: Double, val quantity: Int)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0,1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )
    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")
    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumOf{ it.quantity }
    println("sumQuantity: $sumQuantity")
    println("Sum of unit price: ${groceries.sumOf{it.unitPrice}}")
    println("Total price: ${groceries.sumOf { it.quantity * it.unitPrice }}")
    println(groceries.filter { it.category == "Vegetable" })
    println(groceries.filter { it.unitPrice > 3 })
    println(groceries.filterNot { it.category == "Frozen" })
    groceries.map { it.name }.let(::println)
    groceries.map { it.unitPrice * 0.5 }.let(::println)
    groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }.let(::println)
    groceries.forEach { println(it.name) }
    groceries.filter { it.unitPrice > 3 }.forEach { println(it.name) }
    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println(itemNames)
    print("groupBy ")
    println(groceries.groupBy { it.category })
    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println("  ${it.name}") }
    }

    val ints = listOf(1, 2, 3)
    println("Addition: ${ints.fold(0) { runningSum, item -> runningSum + item}}")
    println("Multiplication: ${ints.fold(1) { runningSum, item -> runningSum * item }}")

    println(groceries.fold("") {string, item -> string + " ${item.name}"})
    println("Subtraction: ${groceries.fold(50.0) { change, item -> change - item.unitPrice * item.quantity }}")

    println("Cost of vegetables: ${groceries.filter { it.category == "Vegetable" }
        .sumOf { it.unitPrice * it.quantity }}")

    print("Product price * quantity < 5:")
    groceries.filter { it.unitPrice * it.quantity < 5.0 }.forEach { print(" ${it.name}") }

    groceries.groupBy { it.category }.forEach {
        print("\n${it.key} ")
        println("Consumption: ${it.value.sumOf { it.unitPrice * it.quantity }}")
    }

    println("Product do not spill in bottle: ")
    groceries.filterNot { it.unit == "Bottle" }.groupBy { it.unit }
        .forEach {
            println(it.key)
            it.value.forEach { println("  ${it.name}") }
        }
    println("End")
    println(groceries[0].apply { name = "Tomato" })
    println(groceries[0].run { name == "tomatoes" })
    groceries[0].also { it.name = "Tomatoes" }.also { println(it.category) }
}*/




/*fun nameIsLong(name: String) = name.length >= 10
fun playerCreateMessage(nameTooLong: Boolean): String {
    return if (nameTooLong) {
        "Name is too long. Please choose another name."
    } else {
        "Welcome, adventurer"
    }
}
fun main() {
    "NeyHack".run(::nameIsLong)
        .run(::playerCreateMessage)
        .run(::println)
    10.also { println(it * 5) }.also { it - 5 }
    println(25.takeIf { it in 11..29 })
}*/







/*data class Pizza(val name: String, val pricePerSlice: Double, val quantity: Int)

fun main() {
    val ints = arrayOf(1, 2, 3, 4, 5)

    val pizzas = listOf(Pizza("Sunny Chicken", 4.5, 4),
        Pizza("Goat and Nut", 4.0, 1),
        Pizza("Tropical", 3.0, 2),
        Pizza("The Garden", 3.5, 3))

    println(ints.minByOrNull { it })
    println(ints.minByOrNull { i: Int -> i})
    println(ints.sum())
    println(ints.sumOf { it })
    println(ints.sumOf { it.toDouble() })
    println(ints.sumOf { num: Int -> num.toDouble() })

    println(pizzas.minByOrNull { it.pricePerSlice })
    println(pizzas.maxByOrNull { p: Pizza -> p.quantity })
    println(pizzas.maxByOrNull { it.quantity })
    println(pizzas.sumOf { it.pricePerSlice * it.quantity })
}*/




//fun main() {
//    val num = listOf(1, 2, 3, 4, 5, 6,7,8)
//    val doubleInts = num.map { it * 2 }
//    println(doubleInts)
//}




/*abstract class Pet(var name: String)
class Cat(name: String)
class Dog(name: String)
class Fish(name: String)
class Contest<T: Pet>() {
    private val scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore(t: T, score: Int) {
        if (score >= 0) scores[t] = score
    }

    fun getWinners(): Set<T> {
        val highScore = scores.values.maxOrNull()
        val winners = scores.filter { it.value == highScore }.keys
        winners.forEach { println("Winner: ${it.name}") }
        return winners
    }
}*/



/*fun main() {
    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0
    x1 = myMap.keys.fold("") {x, y -> x + y}
    x2 = myMap.entries.fold(0) {x, y -> x * y.value}
    println("$x1$x2")

    println(myMap.values.groupBy { it }.keys.sumOf{it})
    x1 = "ABCDE"
    x2 = myMap.values.fold(12) {x, y -> x - y}
    println("$x1$x2")

    println(myMap.entries.fold(1) {x, y -> x * y.value})

    println(myMap.values.fold("") {x, y -> x + y})

    x1 = myMap.values.fold(0) {x, y -> x + y}.toString()
    x2 = myMap.keys.groupBy { it }.size
    println("$x1$x2")
}*/



/*fun main() {
    var str = "ello World!"
    val str1 = "H$str"
    println(str1.replace("World", "Class", false))
    println(str1)
}*/



class Player {
    var name = "madrigal"
    get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    private set(value) { field = value.trim()}
    fun castFireball(numFireballs: Int = 2) = println("A glass of Fireball springs into" +
            "existence. (x$numFireballs)")
    var healthPoints = 89
    val isBlessed = true
    private val isImmortal = false
}

fun main() {
    val player = Player()
    println(player.name)
    //player.castFireball()
}