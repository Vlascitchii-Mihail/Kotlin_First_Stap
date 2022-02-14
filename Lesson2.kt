/////Модуль 8 /////

/*fun main(args: Array<String>){
    var str: String? = null
    println(str)
}*/




/*class Cat(var name: String?= ""){
    fun Meow() {println("Meow!")}
}

fun main(args: Array<String>){
    var myCats = arrayOf(Cat("Mysry"), null, Cat("Socks"))
    for(cat in myCats){
        if(cat != null){
            print("${cat.name} : ")
            cat.Meow()
        }
    }
}*/




/*class Cat(var name: String?= null){
    fun Meow() {println("Meow!")}
}

fun main(args: Array<String>){
    var myCats = arrayOf(Cat("Mysry"), Cat(null), Cat("Socks"))
    for(cat in myCats){
            print("${cat.name} : ")
            cat.Meow()
    }
}*/




/*class Cat(var name: String?= null){
    fun Meow() {println("Meow!")}
}

fun main(args: Array<String>){
    var myCats = arrayOf(Cat("Mysry"), null, Cat("Socks"))
    for(cat in myCats){
        println(cat?.name?:-1)
        cat!!.name
        cat?.name?.let{
            print("$it : ")
            cat.Meow()
        }
        }

    var array = arrayOf("Hi", "Hello", null)
    for (item in array){
        item?.let{
            println(it)
        }
    }
}*/




/*class Cat(var name: String?= ""){
    fun Meow() {println("Meow!")}
}

fun main(args: Array<String>){
    var myCats = arrayOf(Cat("Mysry"), Cat(null), Cat("Socks"))
    for(cat in myCats){
        if(cat != null){
            print("${cat?.name} : ")
            cat?.Meow()
        }
    }
}*/




/*class Wolf{
    var hunger: Int? = 10
    val food = "meat"
    fun eat(){
        println("The wolf eating $food")
    }
}

class myWolf{
    var wolf: Wolf? = Wolf()
    fun myFunction(){
        wolf?.eat()
    }
}

fun getAlphaWolf(): Wolf?{
    return Wolf()
}

fun main(args: Array<String>){
    var w: Wolf? = Wolf()
    //w = null
    if(w != null) w.eat()
    var x = w?.hunger
    println("The value of x is $x")

    w?.hunger = null
    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf = myWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) item?.let{println(it)}

    getAlphaWolf()?.let{it.eat()}
    //w = null
   // var z = w!!.hunger
}*/




/*class Duck(val height: Int? = null){
    fun quack(){
        println("Quack! Quack!")
    }
}

class MyDucks(var myDucks: Array<Duck>){
    fun quack(){
        for(duck in myDucks){
            duck?.let{it.quack()}
        }
    }
    fun totalDuckHeight(): Int{
        var h: Int = 0
        for (duck in myDucks){
            h += duck?.height?:0
        }
        return h
    }
}*/




/*fun myFunction(str: String){
    try {
        val x = str.toInt()
        println(x)
    } catch(e: NumberFormatException){
        println("Bummer")
        e.printStackTrace()
    }finally{println("Finally")}
    println("Function has finished")
}

fun main(args: Array<String>){
    myFunction("One")
}*/




/*fun setWorkRatePercentage(x: Int){
    if (x !in 0..100) {
        throw IllegalArgumentException("Percentage not in range 0 ..100 $x")
    }
}

fun main(args: Array<String>){
    val t = try{
        setWorkRatePercentage(110)
    }catch(e:IllegalArgumentException){null}
    println(t)
    val h = t ?: throw IllegalArgumentException()
}*/




/* class BadException: Exception()

fun riskyCode(test: String){
    println("Start risky code")
    if (test == "Yes"){
        throw BadException()
    }
    println("End risky code")//
}

fun main(args: Array<String>){
    val test: String = "Yes"
    try{
        println("Start try")
        riskyCode(test)
        println("End of try")//
    } catch(e: BadException){
        println("BadException")
    } finally{
        println("Finally")
    }
    println("End of main")
}*/




/*class BadException(): Exception()

fun myFunction(test: String){
    print("t")
    print("h")
    riskyCode(test)
}

fun riskyCode(test: String){
    try{
        if (test == "Yes"){
            throw BadException()
        }
        print("r")
        print("o")
    } catch(e: BadException){print("a")}
    finally{
        print("w")
        print("s")
    }
}*/

/*fun main(args: Array<String>){
    myFunction("Yes")
    println("")
    myFunction("No")
}*/




/*class Cat(var name: String?= ""){
    fun Meow() {println("Meow!")}
}

fun main(args: Array<String>){
    var myCats = arrayOf(Cat("Mysry"), Cat(null), Cat("Socks"))
    for(cat in myCats){
        cat?.name?.let {
            print("$it : ")
            cat.Meow()
        }
    }
}*/




/*fun main(args:Array<String>){
    val array = arrayOf(1, 2, 3)
    println(array.size)
    array.reverse()
    for(item in array) print("$item, ")
    println(array.contains(2))
    println(array.sum())
    println(array.average())
    println("${array.minOrNull()} and ${array.maxOrNull()}")
    array.sort()
    array[0] = 4
    for (item in array) print(item)
}*/




/*fun main(args: Array<String>){
    //создание списка
    val shopping: List<String> = listOf("Tea", "Eggs", "Milk")
//    //вывести на экран
    //if(shopping.size > 0) println(shopping.get(0))//or shopping[0]
    //for (item in shopping) println(item)
    //shopping.forEach{item -> println(item)}
    if (shopping.contains("Milk")) println(shopping.indexOf("Milk"))
    val mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add("Milk")
    mShopping.add(0, "IceTea")
////    mShopping.sort()
////    mShopping.reverse()
////    mShopping.shuffle()
//    if (mShopping.contains("IceTea")) mShopping.remove("IceTea")
//    if (mShopping.size > 2) mShopping.removeAt(2)
    //if (mShopping.size > 0) mShopping.set(0, "Coffee")
    //if(mShopping.contains("IceTea")) mShopping.set(mShopping.indexOf("IceTea"), "Coffee")
    val toAll = listOf("Cookies", "Sugar")
    mShopping.addAll(toAll)
    val toRemove = listOf("IceTea", "Sugar")
//    //удалаяет одинаковые эдементы
    mShopping.removeAll(toRemove)
    val toRetain = listOf("Milk", "Sugar")
//    //удаляет разные элементы
    mShopping.retainAll(toRetain)
//    ///mShopping.clear()
    val shoppingCopy = mShopping.toList()
//    val shoppingCopy = mShopping.sorted()//возвращакт отсортированный List
//    //for (item in mShopping) println(item)
//    //for (item in shoppingCopy) println(item)
    mShopping.forEach {item -> println(item)}
//    println("list: $mShopping")
}*/




/*data class Recipe(var name: String)

fun main(args: Array<String>){
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if (mShoppingList.contains("Tea"))
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe 1" to r1, "Recipe 2" to r2, "Recipe 3" to r3)
    println("Recipe original: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe 1")){
        println("Recipe 1 is: ${mRecipeMap.getValue("Recipe 1")}")
    }
}*/




/*fun main(args: Array<String>){
    var a: MutableList<String> = mutableListOf()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3, "Six")
    println(a)
    if (a.contains("Zero")) a.add("Eight")
    a.removeAt(0)
    println(a)
    if (a.indexOf("Four") != 4) a.add("Ten")
    println(a)
    if (a.contains("Zero")) a.add("Twelve")
    println(a)
}*/




/*fun main(args:Array<String>){
    val friendSet = setOf("Jim", "Sue", "Nick", "Sue")
    val isFredGoing: Boolean = friendSet.contains("Fred")
    friendSet.forEach{item -> println(item)}
}*/




/*fun main(args: Array<String>){
    val mFriendSet = mutableSetOf("Jim", "Sue")
    mFriendSet.add("Nick")
    //mFriendSet.remove("Sue")
    val to = setOf("Jim", "Joe", "Mia")
    //mFriendSet.retainAll(to)
    //mFriendSet.removeAll(to)
    mFriendSet.addAll(to)
    //mFriendSet.clear()
    val friendSetCopy = mFriendSet.toSet()
    val mFriendList = friendSetCopy.toMutableList()
    mFriendList.add("Jim")
    if (mFriendList.size > mFriendList.toSet().size) println("List contain duplicate")
    //mFriendSet.forEach{item -> println(item)}
    //friendSetCopy.forEach{item -> println(item)}
    mFriendList.forEach{item -> println(item)}
}*/




/*class Duck(val size: Int = 17){
//    override fun equals(other: Any?): Boolean{
//        if(this === other) return true
//        if(other is Duck && size == other.size) return true
//        return false
//    }

//    override fun hashCode(): Int{
//        return size
//    }
}

fun main(args: Array<String>){
    val set = setOf(Duck(), Duck(17))
    println(set)
}*/


/*data class Duck(val size: Int = 18)

fun main(args:Array<String>){
    val set = setOf(Duck(), Duck(17))
    println(set)
}*/


/*data class Recipe(val title: String, var isVegetarian: Boolean)

fun main(args: Array<String>){
    val chicken = Recipe("Chicken", false)
    val rice = Recipe("Chicken", false)
    println(chicken == rice)
}*/



/*fun main(args: Array<String>){
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")
    var petsAll  = petsLiam.toMutableList()
    petsAll.addAll(petsSophia)
    petsAll.addAll(petsNoah)
    petsAll.addAll(petsEmily)
    println("All animals: ${petsAll.size}")
    println("All different kind of animals: ${petsAll.toMutableSet().size}")
    println("Sort on alphabet order: ${petsAll.sort()} ${petsAll.toSet()}")
}*/



/*data class Recipe(val name: String)

fun main(args: Array<String>) {
    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    var a: Int

    val recipeMap: Map<String, Recipe> = mapOf("Recipe 1" to r1, "Recipe 2" to r2, "Recipe 3" to r3)
//    println(recipeMap.containsKey("Recipe 2"))
//    println(recipeMap.containsValue(r1))
    val recipeToCheck = Recipe("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck)) println("True")
    if (recipeMap.containsKey("Recipe 1")) {
        println(recipeMap.getValue("Recipe 1"))
    }
    //for((key, value) in recipeMap) println("Key is $key, value is $value")
//    recipeMap.forEach { (key, value) -> println("Key: $key, value = $value") }
    val mRecipeMap: MutableMap<String, Recipe> = mutableMapOf("Recipe 1" to r1, "Recipe 2" to r2)
    println(mRecipeMap.put("Recipe 3", r3))
    mRecipeMap.put("Recipe 1", r3)
    val recipeToAdd = mapOf("Recipe 4" to r4, "Recipe 5" to r5)
    mRecipeMap.putAll(recipeToAdd)
    //mRecipeMap.remove("Recipe 2")
    val recipeToRemove = Recipe("Quinoa Salad")
    mRecipeMap.remove("Recipe 2", recipeToRemove)
//    //mRecipeMap.clear()
    //mRecipeMap.forEach{(key, value) -> println("$key, $value")}
    val recipeMapCopy = mRecipeMap.toMap()
    recipeMapCopy.forEach{(key, value) -> println("$key, $value")}
    val RecipeList = mRecipeMap.toList()
    RecipeList.forEach{item -> println(item)}
     println(RecipeList[0])
    val recipeEntries = mRecipeMap.entries
    recipeEntries.forEach{item -> println(item)}
    println(mRecipeMap.keys)
    println(mRecipeMap.values)
    if(mRecipeMap.size > mRecipeMap.values.toSet().size)
        println("mRecipeMap contains duplicates")
    else println("mRecipeMap don't contains duplicates")
    println("${mRecipeMap.values.toSet()}")
}*/




/*fun main(){
    var a =1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}*/




/*fun main(){
    val term1 = "Array"
    val term2 = "List"
    val term3 = "Map"
    val term4 = "MutableList"
    val term5 = "MutableMap"
    val term6 = "MutableSet"
    val term7 = "Set"

    val def1 = "Holds values is no particular order"
    val def2 = "Hold key/value pairs"
    val def3 = "Holds values in a sequence"
    val def4 = "Can be updated"
    val def5 = "Can't be updated"
    val def6 = "Can be resized"
    val def7 = "Can't be resized"

    val glossary = mapOf(term4 to "$def3 $def4 $def6",
    term7 to "$def1 $def5 $def7",
    term1 to "$def3 $def4 $def7",
    term5 to "$def2 $def4 $def6",
    term2 to "$def3 $def5 $def7",
    term6 to "$def1 $def4 $def6",
    term3 to "$def2 $def5 $def7")
    //for((key, value) in glossary) println("$key: $value")
    glossary.forEach{(key, value) -> println("$key: $value")}
}*/




/*fun main(){
    val mList = mutableListOf("Football", "Baseball", "Basketball")
    mList.sort()
    println(mList)
    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for(item in mList) mMap.put(x.toString(), item)
    println(mMap.values)
    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set)
    mList.sort()
    mList.reverse()
    println(mList)
    val c = "True"
    println(c.toBooleanStrictOrNull())
}*/




/////////////////Module 10////////////////




/*abstract class Pet(var name: String)
class Cat(name: String): Pet(name)
class Dog(name: String): Pet(name)
class Fish(name: String): Pet(name)
class PetOwner<T: Pet>(t: T){
    val pets = mutableListOf(t)

    fun add(t: T){
        pets.add(t)
    }

    fun remove(t: T){
        pets.remove(t)
    }
}
class Contest<T: Pet>(var vet: Vet<in T>){
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0){
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T>{
        val highScore = scores.values.maxOrNull()
        val winners: MutableSet<T> = mutableSetOf()
        for((t, score) in scores)
            if (score == highScore) winners.add(t)
        return winners
    }
}

fun <T: Pet> listPet(t : T): MutableList<T>{
    println("Create and return MutableList")
    return mutableListOf(t)
}


interface Retailer<out T>{
    fun sell(): T
}

class CatRetailer: Retailer<Cat>{
    override fun sell(): Cat{
        println("Sell Cat")
        return Cat("Katsu")
    }

}

class DogRetailer: Retailer<Dog>{
    override fun sell(): Dog{
        println("Sell Dog")
        return Dog("")
    }
}

class FishRetailer: Retailer<Fish>{
    override fun sell(): Fish {
    println("Sell Fish")
        return Fish("")
    }
}

class Vet<T: Pet>{
    fun treat(t: T){
        println("Treat Pet ${t.name}")
    }
}

fun main(){
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catVet = Vet<Cat>()
    val dogVet = Vet<Dog>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.treat(Cat("Fuzz Lightyear"))
    petVet.treat(Cat("Katsu"))
    petVet.treat(Fish("Finny McGraw"))

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(Cat("Fuzz Lightyear"), 50)
    catContest.addScore(Cat("Katsu"), 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val catList = listPet<Cat>(Cat("Zazzles"))

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(petVet)

    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)

    val catRetailer1 = CatRetailer()
    val catRetailer2: CatRetailer = CatRetailer()
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    println(petRetailer.sell().name)
}*/




/*//types of products
open class Food

class VeganFood: Food()

//sellers
interface Seller<out T>

class FoodSeller: Seller<Food>

class VeganFoodSeller: Seller<VeganFood>

//consumer
interface Consumer<in T>

class Person: Consumer<Food>

class Vegan: Consumer<VeganFood>

fun main(args: Array<String>){
    var foodSeller: Seller<Food>
    foodSeller = FoodSeller()
    foodSeller = VeganFoodSeller()

    var veganFoodConsumer: Consumer<VeganFood>
    veganFoodConsumer = Vegan()
    veganFoodConsumer = Person()
}*/





////Module 11





/*import java.util.Scanner
fun main(){
    val scanner1 = Scanner(System.`in`)

    val line = scanner1.nextLine()
    val num = scanner1.nextInt()
    val string = scanner1.next()
    println("$line , $num , $string")
}*/




/*fun main(){
    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Int.SIZE_BITS)
    println(Int.SIZE_BYTES)
}*/





/*fun main() {
    // put your code here
    val a = "Hello"
    val b = "World"
    val c = "123" + 456 + true+"\n"
    val string = """
        But wherefore do not you a mightier way
        Make war upon this bloody tyrant Time,
        And fortify yourself in your decay
        With means more blessd than my barren rhyme?
        Now stand you on the top of happy hours,
        And many maiden gardens, yet unset,
        With virtuous wish would bear your living flowers,
        Much liker than your painted counterfeit:
        So should the lines of life that life repair
        Which this time's pencil or my pupil pen
        Neither in inward worth nor outward fair
        Can make you live yourself in eyes of men:
        To give away yourself keeps yourself still,
        And you must live drawn by your own sweet skill.
    """.trimIndent()
//    val b = readLine()!!
//    val c = readLine()!!
//    val d = readLine()!!
//    val e = readLine()!!
    println("$a")
    println(a.length)
    println(a + b)
    println(b+a)
    println(c.repeat(2))
    println("The \"World\" is beautiful")
    println(string)
}*/


/*fun main() {
    val (a, b, c, d) = readLine()!!.split(" ")
    println("$a $b $c $d")
}*/



/*fun main() {
    val (a, b) = readLine()!!.split(" ")
    println("$a + $b")
}*/




/*fun main() {
//    val (a, b, c) = readLine()!!.split(" ")
//    val (d, e, f) = readLine()!!.split(" ")
//    println("$a:$b:$c $d/$e/$f")
    var a = 1
    println(a++ * a)
    var num = 0
    num = num++
    println(num)
}*/




/*fun main(){
    val addInts: (Int, Int) -> Int = {x, y -> x+y}
    val addFive: (Int) -> Int = {it + 5}
    println(addFive(4))
    //val result = addInts(6, 7)
    println(addInts(6, 7))
}*/



/*fun convert(x: Double, converter: (Double) -> Double): Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double): Double{
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun main(args: Array<String>){
    var addFive = {x: Int -> x+5}
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = {x: Int, y: Int -> x+y}
    val result = addInts.invoke(6,7)
    println("Pass 6, 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = {x, y -> x+y}
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = {it + 7}
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: ()-> Unit = {println("Hi!")}
    myLambda()

    convert(20.0) {println(it)
        it * 1.8 + 32}
    convertFive{it*1.8+32}
}*/



/*fun main(){
    val (lam, lam2) = Array(2) {readLine()!!.toInt()}
    println(lam + lam2)
}*/



/*fun main(args: Array<String>){
    val x = 20
    val y = 2.3

    val lam1 = {x: Int -> x}
    println(lam1(x+6))

    val lam2: (Double) -> Double = {(it*2)+5}
    println(lam2(y))

    val lam3: (Double, Double) -> Unit = {x, y -> println(x+y)}
    lam3(y,y)

    var lam4 = {y: Int -> (y/2).toDouble()}
    println(lam4(x))
    lam4 = {it + 6.3}
    println(lam4(7))

//    val b: Byte = (100 + 100).toByte()
//    println(b)

//    val b1: Byte = 5         // Line 1
//    val b2: Byte = 2 + 3     // Line 2
//    val s1: Short = 2 + b1   // Line 3 don't work
//    val s2: Short = 10 + 3L  // Line 4 don't work
}*/




/*fun main() {
    println("Enter hour1, minute1, second1")
    val time1: MutableList<Int> = mutableListOf()
    for (item in 0..2){
        time1.add(item, readLine()!!.toInt())
    }
    println("Enter hour2, minute2, second2")
    val time2: MutableList<Int> = mutableListOf()
    for(item in 0..2){
        time2.add(item, readLine()!!.toInt())
    }
    val seconds1 = time1[0] * 60 *60+ time1[1] * 60 + time1[2]
    val seconds2 = time2[0] * 60 *60+ time2[1] * 60 + time2[2]
    println(seconds2 - seconds1)
}*/


//fun main() = println(readLine()!!.reversed().toInt())


//fun main() = print(readLine()?.last())

//fun main() = println(readLine()!!.get(0))

/*fun main() {
    fun readTime(): Int {
        val (hour, min, sec) = List(3) { readLine()!!.toInt() }
        return sec + min * 60 + hour * 60 * 60
    }
    println(-readTime() + readTime())
}*/




/*fun main() {
    val durationOfVacation = readLine()!!.toInt()
    val costOfFoodPerDay = readLine()!!.toInt()
    val oneWayFlightCost = readLine()!!.toInt()
    val costOfOneNightOfYheHotel = readLine()!!.toInt()
    val costOfFood = costOfFoodPerDay * durationOfVacation
    val hotel = costOfOneNightOfYheHotel * (durationOfVacation - 1)
    println("${costOfFood + hotel + oneWayFlightCost * 2}")
}*/




/*fun main() {
    val squirrels = readLine()!!.toInt()
    val nuts = readLine()!!.toInt()
    println(nuts%squirrels)
}*/



/*fun main(){
    val number = readLine()!!.toInt()
    println(number % 100 / 10)
}*/



/*fun main() {
    val number = readLine()!!.toInt()
    println("${number % 10 + number / 100 + number % 100 / 10}")
    }*/



/*fun main(){
    var group1 = readLine()!!.toInt()
    if (group1 % 2 != 0) ++group1
    var group2 = readLine()!!.toInt()
    if (group2 % 2 != 0) ++group2
    var group3 = readLine()!!.toInt()
    if (group3 % 2 != 0) ++group3
    var desk = (group1 + group2 + group3) / 2
    println(desk)
}*/




/*fun main(){
    val number = 123
    println("${number % 10}${number / 10 % 10}${number / 100}")
}*/



/*fun main(){
    var number = readLine()!!.toInt()
    if (number % 2 == 0) return println(number + 2)
    if (number % 2 != 0) return println(number + 1)
}*/



/*fun main(){
    val cups = readLine()!!.toInt()
    val weekend= readLine()!!.toBoolean()
    val party= weekend && (15 <= cups || cups <= 25)
}*/



/*fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is convert to $result")
    return result
}

fun main() {
    convert(readLine()!!.toDouble())  { it * 1.8 + 32 }
}*/




/*fun unless(condition: Boolean, code: ()-> Unit) {
    if (!condition) {
        code()
    }
}

fun getConversionLambda(str: String):(Double) -> Double{
    if (str == "CentigradeToFahrenheit"){
        return {it * 1.8 + 32}
    } else if (str == "KgsToPounds"){
        return {it * 2.204623}
    } else if (str == "PoundsToUSTons"){
        return {it * 2000.0}
    } else {
        return {it}
    }
}

fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is convert to $result")
    return result
}

fun main(args: Array<String>) {
    val options = arrayOf("Red", "Amber", "Green")
    val crossWalk = options[(Math.random() * options.size).toInt()]
    if (crossWalk == "Green") {
        println("Walk!")
    }
    unless (crossWalk == "Green") {println("Stop!")}

    val pounds = getConversionLambda("KgsToPounds")(2.5)

    convert(20.0, getConversionLambda("CentigradeToFahrenheit"))
}*/




/*fun main() {
    val butterCup = readLine()!!.toInt()
    val weekend = readLine()!!.toBoolean()
    print("${(!weekend && butterCup in 10..20) || (weekend && butterCup in 15..25)}")
}*/




/*fun combine(lambda1: (Double) -> Double, lambda2: (Double) -> Double)
: (Double) -> Double{
    return {x: Double -> lambda2(lambda1(x))}
}

fun main(){
    val kgsToPounds = {x: Double -> x * 2.204623}
    val poundsToUSTones = {x: Double -> x / 2000.0}
    val result = combine (kgsToPounds, poundsToUSTones)(1000.0)
    println(result)
}*/


//fun main() = println(readLine()!!.toInt() in 1 .. 10)


/*fun main() {
    val (a, b, c) = Array(3) {readLine()!!.toInt()}
    println(a + b == 20 || a + c == 20 || c + b == 20)
}*/


/*fun main() {
    val (boy1Height, boy2Height, boy3Height) = List(3)  {readLine()!!.toInt()}
    print((boy1Height <= boy2Height && boy2Height <= boy3Height) ||
            (boy2Height >= boy3Height && boy1Height >= boy2Height))
}*/


/*fun main(){
    val (num1, num2, num3) = List(3) {readLine()!!.toInt()}
    println(num1 != num2 && num2 != num3 && num1 != num3)
}*/


/*fun main(){
    val (num1, num2, num3) = List(3) {readLine()!!.toInt()}
    println((num1 >= num2 && num3 >= num1) || (num1 <= num2 && num1 >= num3))
}*/



/*fun main() {
    val (num1, num2, num3) = List(3) {readLine()!!.toInt()}
    print((num1 <= 0 && num2 <= 0 && num3 >0) || (num1 > 0 && num2 <= 0 && num3 <= 0)
            || (num1 <= 0 && num2 > 0 && num3 <= 0))
}*/


/*fun main() {
    println(List(3) { readLine()!!.toInt() }.count { it > 0 } == 1)
}*/


/*fun isVowel(letter: Char): Boolean {
    val letterList = listOf('a', 'e', 'i', 'o', 'u')
    return letterList.contains(letter.lowercaseChar())
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}*/


/*fun divide(num1: Long, num2: Long) = if (num2 != 0.toLong()) num1 / num2.toDouble() else print("Second number is 0")

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}*/


/*fun getLastDigit(num: Int)= num.toString().last().digitToInt()

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}*/


/*class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {
    println(rectangle.height * rectangle.width)
}*/



/*typealias DoubleConversion = (Double) -> Double

fun convert(x: Double, converter: DoubleConversion): Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DoubleConversion{
//    if (str == "CentigradeToFahrenheit") return {it * 1.8 +32}
//    else if (str == "KgsToPounds") return {it * 2.204623}
//    else if (str == "PoundsToUSTons") return {it / 2000.0}
//    else return {it}
    when (str){
        "CentigradeToFahrenheit" -> return {it * 1.8 +32}
        "KgsToPounds" -> return {it * 2.204623}
        "PoundsToUSTons" -> return {it / 2000.0}
        else -> return {it}
    }
}

fun combine(Lambda1: DoubleConversion, Lambda2: DoubleConversion): DoubleConversion{
    return {x: Double-> Lambda2(Lambda1(x))}
}

fun main(){
    //преобразовать 2ю5 кг в фунты
    println("Convert 2.5 kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")

    //определить два лямбда-выражения для преобразования
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")

    //два лямбда-выоажения преобразуются в одно новое
    val kgsToUSTonesLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)

    //использовать новое лямбда-выражение для преобразования 17.4 кг в амер. тонны
    val value = 17.4
    println("$value kgs is ${convert(value, kgsToUSTonesLambda)} us tons7")
}*/



/*typealias Gro = (Grocery) -> Boolean

data class Grocery(val name: String, val category : String, val unit: String,
val unitPrice: Double)

fun search(list: List<Grocery>, criteria: Gro){
    for (l in list) if (criteria(l)) println(l.name)
}

fun main(){
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0),
        Grocery("Bagels", "Bakery", "Pack", 1.5),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0),
        Grocery("Ice cream", "Frozen", "Pack", 3.0))
    println("Expensive ingredients: ")
    search(groceries) {i: Grocery -> i.unitPrice > 5.0}
    println("All vegetables: ")
    search(groceries) {i: Grocery -> i.category == "Vegetable"}
    println("All packs: ")
    search(groceries) {i: Grocery -> i.unit == "Pack"}
}*/



/*fun unless(condition: Boolean, code: () -> Unit){
    if (!condition) code()
}

fun main(){
    val options = arrayOf("Red", "Amber", "Green")
    val crossWalk = options[(Math.random() * options.size).toInt()]
    if (crossWalk == "Green") println("Walk!")
    unless(crossWalk == "Green"){
        println("stop!")
    }
}*/


