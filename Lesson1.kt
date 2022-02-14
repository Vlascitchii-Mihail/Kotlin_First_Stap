/*fun main(args: Array<String>){
    println("Pow!")
}*/



fun main(){
    var x = 3
    val name ="Cornoran"
    x *=10
    println("x is $x.")

    while(x>20){
        x -=1
        println("x is now $x")
    }
    for(i in 1..10){
        x += 1
        println("x is now $x")
    }

    if(x == 20){
        println("x must be 20")
    }else {
        println("x isn't 20")
    }
    if(name.equals("Cornoran")){
        println("$name Strike")
    }
}




/*fun main(){
    var x =1
    println("Before the loop x = $x")
    while(x<4){
        println("In the loop x =$x")
        x +=1
    }
    println("After the loop x = $x")
}*/




/*fun main(){
    val x=1
    val y=3
    /*if(x > y) println("x is greater than y")
    else println("x isn't greater than y")
    println("This line runs no matter what")*/
    println(if(x>y) "x is greater than y" else "x isn't greater than y")
}*/



/*fun main(){
    var x=1
    while(x<3){
        print(if(x==1) "Yab" else "Dab")
        print("ba")
        x +=1
    }
    if(x==3) println("Do")
}*/



/*fun main(){
    var x =1
    while(x<10){
        if(x>3)println("x = $x.")
        x +=1
    }
}*/



/*fun main(){
    var x = 10
    while(x>1){
        x -=1
        if(x<3)println("x = $x.")
    }
}*/



/*fun main(){
    var x=10
    while(x>1) {
        x -=1
        if(x<3)println("x = $x.")
    }
}*/


//var x:Int = 10.5.toInt()

/*fun main(){
    val wordArray1 = arrayOf("27/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size
    //kotlin.random.Random.nextInt()
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
 }*/


//var myArray: Array<Long> = arrayOf(1,2,3)



/*fun main(args: Array<String>){
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x=0
    while(x<4){
        println("${hobbits[x]} is a god Hobbit name")
        x +=1
    }
}*/



/*fun main(args: Array<String>){
    val fireman = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0
    while (firemanNo < 6){
        println("Fireman number $firemanNo is ${fireman[firemanNo]}")
        firemanNo +=1
    }
}*/


/*fun main(args: Array<String>){
    val fruit = arrayOf("Apple", "Banana", "Chery", "Blueberry", "Pomegranate")
   val index = arrayOf(1, 3, 4, 2)
    var x=0
    while(x<4) {
        var y = index[x]
        println("Fruit = ${fruit[y]}")
        x +=1
    }
}*/


/*fun main(args: Array<String>){
    val x = arrayOf(0,1,2,3,4)
    x[3]=x[2]
    x[4]=x[0]
    x[2]=x[1]
    x[1]=x[0]
    x[0]=x[1]
    x[4]=x[3]
    x[3]=x[2]
    x[2]=x[4]
    var y=0
    while(y<6){
        println("${x[y]}")
        y+=1
    }
}*/


/*fun main(args: Array<String>){
    val options = arrayOf("Rock", "Paper", "Scissors")
    //fun max(a:Int, b:Int) = if(a>b)a else b
   /* fun max(a:Int, b:Int):Int{
        val maxWal = if(a>b)a else b
        return maxWal
    }*/
   // println("${getGameChoice(options)}")
    val gameChoice: String = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
    }

fun getGameChoice(optionsParam: Array<String>)= optionsParam[(Math.random()
        * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String{
    var isValidChoice = false
    var userChoice: String =""
    //выполнять цикл пока пользователь не введет допустимый вариант
    while(!isValidChoice) {
        //запрсить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        //прочитать пользовательский ввод
        var userInput = readLine()
       //userInput = userInput.replaceFirstChar {it.uppercase()}
        //userInput = userInput.uppercase()
        //проверить пльзовательский ввод
        if(userInput != null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        //если выбран недопустимый вариант, сооющить пользователю
        if(!isValidChoice) println("You must enter a valid choice")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String
    //определить результат
    if(userChoice == gameChoice) result = "Tie!"
    else if((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "Yow win!"
    else result = "You lose!"
    println("Ypu chose $userChoice. I choice $gameChoice. $result")
}*/



/*fun main(args: Array<String>){
    val options = arrayOf("Rock", "Paper", "Scissors")
    updateArray(options)
    println(options[2])
}

fun updateArray(optionParam: Array<String>){
    optionParam[2]="Fred"
}*/



/*fun main(args: Array<String>){
    var x=0;var y=20
    for(outer in 1..3){
        for(inner in 4 downTo 2){
            x=x+y
            y=x-7
            y++
            x+=3
        }
        y-=2
    }
    println("$x $y")
}*/



/*class Song(val title: String, val artist: String){
    fun play(){println("Playing the song $title by $artist")}
    fun stop(){println("Stop playing $title")}
}

fun main(args: Array<String>){
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jum")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}*/



/*class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean){
    fun playTopHat(){if(hasTopHat)println("ding ding ba-da-bing!")}
    fun playSnare(){if(hasSnare)println("bang bang bang!")}
}

fun main(args: Array<String>){
    val d = DrumKit(true, true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()
}*/



/*class Dod(val name: String, var weight: Int, breed_param:String){
    init{println("Dog $name has been created!")}
    var activities = arrayOf("Walks")
    var breed = breed_param.uppercase()
    init{println("The Breed is $breed")}
}



fun main(){
    var word: String = "capitalize"
    word = word.replaceFirstChar{it.uppercase()}
    println(word)
}*/



/*class TapeDeck{
    var hasRecorder = false
    fun playTape(){println("Tape Playing")}
    fun recordTape(){if(hasRecorder) println("Tape recording")}
}

fun main(args: Array<String>){
    var t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}*/


/*class DVDPlayer(var hasRecorder: Boolean){
    fun playDVD(){println("Playing DVD")}
    fun recordDVD(){println("DVD Recording")}
}

fun main(args: Array<String>){
    val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}*/




/*class Dog(val name: String, weight_param: Int, breed_param: String){
    var weight = weight_param
    set(value){if(value > 0) field  = value}
    val weightInKgs: Double
    get()=weight/2.2
}

fun main(args: Array<String>){
    var dog = Dog("Tom", 34, "Has")
    println("Weight in kg: ${dog.weightInKgs} and weight in ft: ${dog.weight}")
}*/




/*class Dog(val name: String, weight_param: Int, breed_param: String){
    init{println("Dog $name has been created.")}
    var activities = arrayOf("Walks")
    val breed = breed_param.uppercase()
    init{println("The breed is $breed")}

    var weight = weight_param
    set(value) {if (value > 0) field = value}

    val weightInKg: Double
    get() = weight / 2.2

    fun bark(){println(if (weight < 20)"Yip" else "Woof")}
}

fun main(args: Array<String>){
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in kg is ${myDog.weightInKg}")
    myDog.weight = -3
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {println("My dog enjoys $item")}
    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"),
    Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}*/




/*class Rectangle(var width: Int, var height: Int){
    val isSquare: Boolean
    get() = (width == height)

    val area: Int
    get() = width * height
}

fun main(args: Array<String>){
    val r = arrayOf(Rectangle(1,1), Rectangle(1,1),
        Rectangle(1,1), Rectangle(1,1))
    for (x in 0..3){
        r[x].width = (x+1)*3
        r[x].height = x+5
        print("Rectangle $x has area ${r[x].area}.")
        println(" It is ${if (r[x].isSquare)"" else "not"} a square")
    }
}*/




/*
interface Roamable{
    fun roam()
}
abstract class Animal: Roamable{
    abstract val image: String
    abstract  val food: String
    abstract val habitat: String
    open var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam(){
        println("The animal is roaming")
    }

    fun sleep(){
        println("The animal is sleeping")
    }
}

class Hippo : Animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise(){
        println("Grunt! Grunt!")
    }

    override fun eat(){
        println("The hippo is eating $food")
    }
}

abstract class Canine: Animal(){
    override fun roam(){
       println("The canine is roaming")
    }
}

class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise(){
        println("Hoooooowl!")
    }

    override fun eat(){
        println("The wolf is eating $food")
    }
}

class Vehicle: Roamable{
    override fun roam(){
        println("The vehicle is roaming")
    }
}

class Vet{
    fun giveShot(animal:Animal){
        animal.makeNoise()
    }
    var w: Wolf? = Wolf()
}

fun getAlphaWolf(): Wolf?{
    return Wolf()
}

fun main(args: Array<String>){
    val w = Wolf()
    val hippo = Hippo()
    w.makeNoise()
    w.roam()
    w.sleep()
    var animal: Animal = Wolf()
    animal.eat()
    val anim = arrayOf(Hippo(), Wolf())
    for (item in anim){
        item.roam()
        item.eat()
    }
    val vet = Vet()
    vet.giveShot(w)
    vet.giveShot(hippo)
   //var animals = Animal()

    var roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) item.eat()
    }

    val animal2: Animal = Wolf()
    if ( animal2 is Wolf) animal2.eat()
    val set = println(if (animal is Wolf)"Wolf" else "not Wolf")
    if (roamables is Animal && roamables.hunger > 5) println("True")
    if (roamables !is Animal && animal2.hunger >= 5) println("True2")

    var x = when (w){
        is Animal -> 2
    else -> 0
    }
    when (x){
        0 -> println("x is 0")
        1, 2 -> println("x is 1 or 2")
        else -> {
            println("x is neither 0, 1 or 2")
            println("x is some another value")
        }
    }

    when (roamables[0]){
        is Wolf ->{println("wolf")}
        is Hippo -> {println("Hippo")}
        is Animal -> {println("Animal")}
    }

    if (animal is Wolf){
        animal.eat()
        animal.makeNoise()
    }

    var r: Roamable = Wolf()
    var wolf = r as Wolf
    wolf.eat()

    if (r is Wolf){
        val wolf2 = r as Wolf
        r.eat()
    }

    var dog: Wolf? = Wolf()
    if (dog != null) dog.eat()

    fun myFun() {
        var dog2: Wolf? = Wolf()
        if (dog2 != null) dog2.eat()
    }

    dog?.eat()
    dog?.hunger

    var cat: Vet? = Vet()
    println(cat?.w?.hunger)

    var g = cat?.w?.hunger
    cat?.w?.hunger = 6

    cat?.w?.let{
        println(it.hunger)
    }

    getAlphaWolf()?.let{
        it.eat()
    }

    dog = null
    println(dog?.hunger?:-1)
}*/




/*open class Monster{
    open fun frighten(): Boolean{
        println("Aargh")
        return true
    }
}

class Vampire : Monster(){
    override fun frighten(): Boolean{
        println("Fancy a bite?")
        return false
    }
}

class Dragon: Monster(){
    override fun frighten(): Boolean{
        println("Fire!")
        return true
    }
}

fun main(args: Array<String>){
    val m = arrayOf(Vampire(), Dragon(), Monster())
    for (item in m){
        item.frighten()
    }
}*/




/*abstract class Appliance{
    var pluggedIn = true
    abstract val color: String
    abstract fun consumePower()
}

class CoffeeMaker: Appliance(){
    override val color=""
    var coffeeLeft = false

    override fun consumePower(){
        println("Consuming power")
    }

    fun fillWithWater(){
        println("Fill with water")
    }

    fun makeCoffee(){
        println("Make the coffee")
    }
}*/




/*abstract class Top{}

class Tip: Top(){}*/


/*abstract class Alpha{}

abstract class Omega: Alpha(){}*/



/*interface Foo{
    fun min()
}

open class Bar: Foo{
    override fun min(){
        println("Bar")
    }
}

class Baz: Bar(){}*/



/*interface Fi{
    fun fi()
}

interface Fee{
    fun fee()
}

open class Fo: Fi{
   override fun fi(){
        println("Fi")
    }
}

class Fum: Fo(), Fee{
    override fun fee(){
        println("Fee")
    }
}*/




/*interface Flyable{
    val x: String
    fun fly(){
        println("$x is flying")
    }
}

class Bird: Flyable{
    override val x = "Bird"
}

class Plane: Flyable{
    override val x = "Plane"
}

class Superhero: Flyable{
    override val x = "Superhero"
}

fun main(args: Array<String>) {
    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
    while (x in 0..2){
        /*when(f[x]){
            is Bird ->{
                x++
                f[x].fly()
            }
            is Plane, is Superhero -> f[x].fly()
        }*/

            val y = when(f[x]){
                is Bird -> false
                else -> true
            }
        if(y) f[x].fly()
        x++
    }
}*/










///МОДУЛЬ 7 ///////////////////////



/*fun main(args: Array<String>){
    val x = 10
    val y = 12
    if (x == y){
        println("Equal")
    } else println("Not equal")
}*/

/*class Wolf{
    val quantity = 10
}

fun main(args: Array<String>){
    val w1 = Wolf()
    var w2 = Wolf()
    println(if (w1 == w2)"equal" else "not equal" )
    w2 = w1
    println(w1.equals(w2))
    println(w1.hashCode())
    println(w1.toString())
}*/




/*data class Recipe(val title: String, val isVegetarian: Boolean) {
}
    fun main(args: Array<String>){
    val r1 = Recipe("Chicken Bhuna", false)
    val r2 = Recipe("Chicken Bhuna", false)
    println(if (r1 === r2)"true" else "false")
    println(r1.hashCode())
    println(r2.hashCode())
        println(r1.toString())
    val r11 = r1.copy(isVegetarian = true)
        println(r11.isVegetarian)
        val (title,vegetarian) = r1
        println("$title,    $vegetarian")
}*/




/*data class Recipe(val title: String, val isVegetarian: Boolean)

fun main(args: Array<String>){
    val r1 = Recipe("Thai Curry", false)
    val r2 = Recipe("Thai Curry", false)
    val r3 = r1.copy(title = "Chicken Bhuna") //создание копии
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hashcode: ${r2.hashCode()}")
    println("r3 hashcode: ${r3.hashCode()}")
    println("r1 toString(): ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 ===r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    println("r1 === r3? ${r1 === r3}")
    //деструктуизация
    val (title, vegetarian) = r1
    println("title is $title and vegetarian is $vegetarian")
}*/




/*class s1(var a: Int, var b : Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as s1

        if (a != other.a) return false
        if (b != other.b) return false

        return true
    }

    override fun hashCode(): Int {
        var result = a
        result = 31 * result + b
        return result
    }
}*/




/*data class Movie(val title: String, val year: String,
val isVegetarian: Boolean = false, val difficulty: String = "Easy",
val mainIngredient: String = "Beef")

class Song(val title: String, val artist: String)

fun main(Args: Array<String>){
    var m1 = Movie("Black Panter", "2018", difficulty = "Hard")
    var m2 = Movie("Jurassic World", "2015", mainIngredient = "Chick en")
    var m3 = Movie("Jurassic World", "2015")
    var s1 = Song("Love Cats", "The Cure")
    var s2 = Song("Wild Horses", "The Rolling Stones")
    var s3 = Song("Love Cats", "The Cure")
    println(m2 == m3)
    println(s1 == s3)
    var m4 = m1.copy()
    println(m1 == m4)
    var m5 = m1.copy()
    println(m1 === m5)
    var m6 = m2
    m2 = m3
    println(m3 == m6)
}*/




/*class Mushrooms(val size: Int, val isMagic: Boolean){
    constructor(isMagic_Param: Boolean): this(0, isMagic_Param){
        //Code
    }
}

fun main(args: Array<String>){
    val m = Mushrooms(0,true)
}*/



/*data class Recipe(val title: String, val mainIngredient: String,
val isVegetarian: Boolean = false, val difficulty: String = "Easy" )

class Mushrooms(val size: Int, val isMagic: Boolean){
    constructor(isMagic_Param: Boolean): this(0, isMagic_Param){
        //Code
    }
}

fun findRecipe(title: String = "", ingredient: String = "",
               isVegetarian: Boolean = false, difficulty: String = ""): Array<Recipe>{
    //Code
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}

fun addNumbers(a: Int, b: Int): Int{
    return a+b
}

fun addNumbers(a: Double, b: Double): Double{
    return a+b
}*/




/*fun main(args: Array<String>){
    findRecipe(isVegetarian = false, ingredient = "apples")
    val r1 = Recipe("Thai Curry", "Chicken")
    val r2 = Recipe("Thai Curry", "Chicken")
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash code : ${r1.hashCode()}")
    println("r2 hash code : ${r2.hashCode()}")
    println("r3 hash code : ${r3.hashCode()}")
    println("r1 toString : ${r1.toString()}")
    println("r1 == r2? ${r1 ==r2}")
    println("r1 === r2? ${r1 ===r2}")
    println("r1 == r3? ${r1 == r3}")
    val (title, mainIngredient,vegetarian, difficulty) = r1
    println("title is $title and vegetarian is $vegetarian")
    val m1 = Mushrooms(0, false)
    println("m1 size is ${m1.size} and magic is ${m1.isMagic}")
    val m2 = Mushrooms(true)
    println("m1 size is ${m1.size} and magic is ${m1.isMagic}")
    println(addNumbers(2, 5))
    println(addNumbers(1.6, 7.3))
 }*/




/*data class Student(val firstName: String, val lastName: String,
val house: String, val year: Int = 1)

fun main(args: Array<String>){
    val s1 = Student("Ron", "Weasly", "Griffindor")
    val s2 = Student("Draco", "Malfoy", house = "Slytherin")
    val s3 = s1.copy(firstName = "Fred", year = 3)
    val s4 = s3.copy(firstName = "George")

    val array = arrayOf(s1, s2, s3,s4)
    for ((firstName, lastName, house, year) in array){
        println("$firstName $lastName is in $house year $year")
    }
}*/




/*data class Student(val firstName: String, val lastName: String,
val house: String, val year: Int = 1)

fun main(args: Array<String>){
    val s1 = Student("Ron", "Weasley", "Griffindor")
    val s2 = Student(lastName = "Malfoy", firstName = "Draco", year = 1,
    house = "Slytherin")
    val s3 = s1.copy(firstName = "Fred", year = 3)
    val s4 = s3.copy(firstName = "George")
    val array = arrayOf(s1, s2, s3, s4)
    for (s in array){
        println("${s.firstName} ${s.lastName} is in ${s.house} year ${s.year}")
    }
}*/



/*fun main() {
    println("Mississippi".count {it == 's'})
    val greeting: String = {val currentYear = 2021
    "Welcome to SimVillage, Mayor! (copyright $currentYear)"}()
    println(greeting)
}*/



/*fun main() {
    val greetingFunction = { playerName: String, numBuilders: Int ->
        val currentYear = 2021
        "Welcome to SimVillage $numBuilders, $playerName (copyright $currentYear)"
    }
    println(greetingFunction("Marty", 2))
}*/



/*fun main() {
//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2021
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }
    runSimulation("Marty", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2021
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..9).shuffled().last() //сдуяайно выбрать 1-9
    println(greetingFunction(playerName, numBuildings))
    costPrinter(numBuildings)
}

fun printConstructionCost(numBuilding: Int) {
    val cost = 500
    println("Construction cost: ${cost * numBuilding}")
}*/




/*fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Marty"))
}

fun configureGreetingFunction(): (String) ->String {
    val structureType = "hospitals"
    var numBuildings = (1..9).shuffled().last()
    return { playerName: String ->
        val currentYear = 2021
        numBuildings +=1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

fun main() {
    runSimulation()
}*/


/*fun main() {
    val f = null
    println(f)
}*/