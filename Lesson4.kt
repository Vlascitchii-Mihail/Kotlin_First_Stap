/*import java.io.File
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



/*class Totaller(var total: Int = 0) {
    fun add(num: Int): Int {
        total += num
        println(total)
        return total
    }
}
fun main() {
     val a = Totaller()
}*/


//import kotlinx.coroutines.*
//import kotlin.coroutines.CoroutineContext
//
//suspend fun main() {
//    GlobalScope {
//
//    }
//}


/*import kotlinx.coroutines.*
fun main() {
    runBlocking { launch {
        delay(1000)
        println("World!") }
        println("Hello ")}
}*/


/*import kotlinx.coroutines.*
fun main() {
    GlobalScope.launch { // запускаем новую сопрограмму в фоновом режиме и продолжаем
        delay(1000) // неблокирующая задержка на 1 секунду (по умолчанию единица времени - мс)
        print("World!") // печать после задержки
    }
    println("Hello ") // основной поток продолжается, пока сопрограмма задерживается
    Thread.sleep(2000) // блокируем основной поток на 2 секунды, чтобы поддерживать JVM в рабочем состоянии
}*/



/*import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch { // запускаем новую сопрограмму в фоновом режиме и продолжаем
        delay(1000)
        println("World!")
    }
    println("Hello ") // основной поток немедленно продолжается здесь
    runBlocking { // но это выражение блокирует основной поток
        delay(2000) // ... пока мы задерживаемся на 2 секунды, чтобы JVM оставалась в живых
    }
}*/



/*import  kotlinx.coroutines.*
fun main() = runBlocking<Unit> { // запускаем основную сопрограмму
    GlobalScope.launch { // запускаем новую сопрограмму в фоновом режиме и продолжаем
        delay(1000)
        println("World!")
    }
    println("Hello ") // основная сопрограмма немедленно продолжается здесь
    delay(2000) // задержка на 2 секунды, чтобы JVM оставалась работоспособной
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking {
    val job = GlobalScope.launch { // запускаем новую сопрограмму и сохраняем ссылку на ее задание
        delay(1000L)
        println("World!")
    }
    println("Hello ")
    job.join() // ждем завершения дочерней сопрограммы
}*/


/*import kotlinx.coroutines.*
fun main() = runBlocking { // это: CoroutineScope
    launch { // запускаем новую сопрограмму в рамках runBlocking
        delay(1000)
        println("World!")
    }
    println("Hello ")
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking { // это: CoroutineScope
    launch {
        delay(200L)
        println("Task from runBlocking")
    }
    coroutineScope { // Создает область сопрограммы
        launch {
            delay(500L)
            println("Task from nested launch")
        }
        delay(100L)
        println("Task from coroutine scope") // Эта строка будет напечатана перед вложенным запуском
    }
    println("Coroutine scope is over")// Эта строка не печатается до завершения вложенного запуска
}
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking {
    launch { doWorld() }
    println("Hello ")
}

suspend fun doWorld() { // это ваша первая функция приостановки
    delay(1000L)
    println("World!")
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking {
    repeat(100_000) { // запускаем много сопрограмм
        launch {
            delay(5000L)
            print(".")
        }
    }
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking {
    GlobalScope.launch {
        repeat(1000) { f->
            println("I' m sleeping $f ...")
            delay(500L)
        }
    }
    delay(5000L) // просто выходим после задержки
}*/



/*import  kotlinx.coroutines.*
fun main() = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i")
            delay(500)
        }
    }
    delay(2000)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // отменяет задание
    println("main: Now I can quit")
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (isActive) { // цикл вычислений, просто тратит впустую ЦП
            // выводим сообщение дважды в секунду
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // отменяет задание и ждет его завершения
    println("main: Now I can quit.")
}*/




/*import kotlinx.coroutines.*
fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) {i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            println("job: I'm running finally")
            delay(1000)
            println("job: And I'm just delayed for 1 sec because I'm non-cancellable")
        }
    }
    delay(1300)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}*/



/*import  kotlinx.coroutines.*
fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) {
                println("job: I'm running finally")
                delay(1000L)
                println("job: And I'm just delayed for 1 sec because I'm non-cancellable")
            }
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking {
    withTimeout(1300) {
        repeat(1000) { i->
            println("T'm sleeping $i ...")
            delay(500)
        }
    }
}*/



/*import kotlinx.coroutines.*
fun main() = runBlocking {
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i->
            println("I'm sleeping $i")
            delay(500)
        }
        println("Done") // будет отменено до того, как выдаст такой результат
    }
    println("Result is $result")
}*/




/*import kotlinx.coroutines.*
var acquired = 0
class Resource {
    init {
        acquired++ // Получение ресурса
    }
    fun close() {acquired--} // Освобождаем ресурс
}
fun main() {
    runBlocking {
        repeat(100_000) { // Запускаем 100K сопрограмм
            launch {
                val resource = withTimeout(60) { // Тайм-аут 60 мс
                    delay(50) // Задержка на 50 мс
                    Resource() // Получить ресурс и вернуть его из блока withTimeout
                }
                resource.close() // Освобождаем ресурс
            }
        }
    }
    // Вне выполнения Блокировка всех сопрограмм завершена
    println(acquired) // Вывести количество ресурсов, которые еще были получены
}*/




/*import kotlinx.coroutines.*
var acquired = 0
class Resource {
    init {
        acquired++ // Получение ресурса
    }
    fun close() {acquired--} //Освобождаем ресурс
}
fun main() {
    runBlocking {
        repeat(100_000) {
            launch {
                var resource: Resource? = null // Еще не получено
                try {
                    withTimeout(60) {
                        delay(50) // Задержка на 50 мс
                        resource = Resource() // Сохраняем ресурс в переменной, если он был получен
                    }
                    // Здесь мы можем сделать что-то еще с ресурсом
                } finally {
                    resource?.close() // Освобождаем ресурс, если он был получен
                }
            }
        }
    }
    // Вне выполнения Блокировка всех сопрограмм завершена
    println(acquired) // Вывести количество ресурсов, которые еще были получены
}*/



/*import kotlinx.coroutines.*
import kotlin.system.*
fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = doSomething1()
        val two = doSomething2()
    }
    println("Completed in $time ms")
}

suspend fun doSomething1(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomething2(): Int {
    delay(1000L)
    return 29
}*/



/*import kotlinx.coroutines.*
import kotlin.system.*
fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async { do1() }
        val two = async { do2() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun do1(): Int {
    delay(1000L)
    return 13
}

suspend fun do2(): Int {
    delay(1000L)
    return 29
}*/


/*import kotlinx.coroutines.*
fun main(): Unit = runBlocking {
    launch {
        println("This is executed before the first delay")
        stallForTime()
        println("This is executed after the first delay")
    }
    launch {
        println("This is expected before the second delay")
        stallForTime()
        println("This is executed after the second delay")
    }
}

suspend fun stallForTime() {
    withContext(Dispatchers.Default) {
        delay(2000L)
    }
}*/



/*import kotlinx.coroutines.*
fun main() {
    GlobalScope.launch {
        println("This is executed before the first delay")
        stallForTime()
        println("This is executed after the first delay")
    }
    GlobalScope.launch(Dispatchers.Main) {
        println("This is expected before the second delay")
        stallForTime()
        println("This is executed after the second delay")
    }
}

suspend fun stallForTime() {
    withContext(Dispatchers.Default) {
        delay(2000L)
    }
}*/



/*import kotlinx.coroutines.*
fun main(): Unit {
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
    for (i in 0.rangeTo(10)) print(i)
    val num = 0..10
    val num1 = num.step(2).reversed()
    num1.forEach { print(it) }

}*/



/*class Person(name: String) {
    fun printMe() = println(this)
}
class Building(val address: String) {
    inner class Reception(telephone: String) {
        fun printAddress() = println(this@Building.address)
    }
}
fun main() {
    val word = "Print my characters".forEach { println(it) }
    val frr = arrayOf(4, 6, 8, 0, 3)
    for (index in frr.indices) println("Element $index = ${frr[index]}")
    Person("Marco").printMe()
    Building("Street").Reception("09873275").printAddress()
}*/



/*open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // public по умолчанию

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a не видно
    // b, c и d видно
    // класс Nested и e видно

    override val b = 5   // 'b' - protected
}

class Unrelated(o: Outer) {
    // o.a, o.b не видно
    // o.c и o.d видно (тот же модуль)
    // Outer.Nested не видно, и Nested::e также не видно
}*/



/*class Person2(firstName: String, lastName: String, howOld: Int?) {
    private val name: String
    private val age: Int?
    init {
        name = "$firstName,$lastName"
        age = howOld
    }
    fun getName(): String = name
    fun getAge(): Int? = age
}

fun main() {
    println(Person2("Nelly", "Smith", 18).getName())
}*/



/*class BasicGraphWithInner(graphName: String) {
    private val name: String
    init {
        name = graphName
    }
    inner class InnerLine(val x1: Int, val y1: Int, val x2: Int, val y2:
    Int) {
        fun draw(): Unit {println("Drawing Line from ($x1:$y1) to ($x2, $y2) for graph $name ")
        }
    }
    fun draw(): Unit {
        println("Drawing the graph $name")
    }
}

fun main() {
    BasicGraphWithInner("Name").InnerLine(5, 7, 4, 7).draw()
}*/


/*class A{
    private val someField: Int = 5
    inner class B{
        private val some: Int = 8
        fun foo(s: String){
            println("Field <some> from B $some")
            println("Field <some> from B" + this@B.some)
            println("Field <some> from A" + this@A.someField)
        }
    }
}

fun main() {
    A().B().foo("Hello")
}*/


/*data class Payment(val id: String, val user: String, val amount: Double)
inline class Millis(val timeout:Long)
fun updatePayment(payment:Payment, timeout:Millis):Unit {
//update your storage
}
inline class Seconds(val timeout:Long){
    fun toMillis():Millis = Millis(timeout * 1000)
}
inline class Minute(val timeout:Long){
    fun toMillis():Millis= Millis(timeout * 1000 * 60)
}
inline class Hours(val timeout: Long) {
    fun toMillis(): Millis = Millis(timeout * 1000 * 60 * 60)
}
fun main() {
    updatePayment(Payment(";","l", 20.0), Seconds(10).toMillis())
}*/


/*open class Container {
    protected open val fieldA: String = "Some value"
}
class DerivedContainer : Container() {
    public override val fieldA: String = "Something else"
}
fun main() {
    val derivedContainer = DerivedContainer()
    println("DerivedContainer.fieldA:${derivedContainer.fieldA}")
    val container:Container=derivedContainer
    println("fieldA:${container.fieldA}")
}*/



/*fun varar(name: String, vararg secondName: String){
    println(name)
    secondName.forEach { println(it) }
}

fun main() {
    varar("Michael", "Jackson", "Maiyers")
}*/



/*fun main() {
    val strings = arrayOf("a", "b", "c", "d", "e")
    multiprint("Start", *strings, suffix = "End")
}

fun multiprint(str1: String, vararg arr: String, suffix: String) {
    arr.forEach { println(it) }
}*/



/*fun countDown(i: Int) {
    var x = i
    print("${x--}, ")
    if (x > 0) countDown(x)
    else print(x)

}
fun main() {
    countDown(5)
}*/


