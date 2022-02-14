/*fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}*/

/*fun main() {
    val mass: ArrayList<Int> = arrayListOf()
    println(readLine())
    for (x in 0..20) mass.add(x)
    for ((index,item) in mass.withIndex()) println("Number ${index + item}")
}*/

/*class Dog(open val name: String, weight_param: Int, hhh: String) {
    val breed = hhh.uppercase()
    private var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    init {
        println("Hello dog")
    }
    lateinit var temp: String
    fun bark() {
        println(if (weight < 20) "Yip" else "Woof")
    }
    val weightKg: Double get() = weight / 2.2
    fun get() {
        println(weight)
    }
}

fun main() {
    var Fido = Dog("Fido", 15, "Mixed")
    println(Fido.name + " " + Fido.breed + " " + Fido.weightKg)
    Fido.get()
}*/

interface Roamable {
    fun roam()
}

abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat : String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The animal roaming")
    }

    fun sleep() {
        println("The animal sleeping")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override var food = "grass"
        set(value) {
            if (value == "grass") field = value
        }
    override val habitat get() = "Water"
    init {
        var hunger =  8
    }
    var iii = 5
        set(value) {
            if (value == 5) field = 5
        }

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("Hippo is eating $food")
    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}

open class Wolf : Canine() {
    override val image = "wolf.jpg"
    override  var food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooowl!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

class Vet {
    fun giveShot(animal : Animal) {
        animal.makeNoise()
    }
}

fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
        when (item) {
            is Wolf -> println("kfd")
            is Hippo -> println("dsfj")
            else -> println("khf")
        }
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
    val r : Roamable = Wolf()
    var t = r as Wolf
    t.eat()

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        println("Hello World")
        if (item is Animal) item.eat()
    }
}