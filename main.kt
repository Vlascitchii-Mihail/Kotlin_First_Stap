/*fun main(args: Array<String>) {
    println("Hello World!")
    println("GitHub")
    println("Do it")
    var x = 0
}*/


data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegetarian: Boolean = false,
                  val difficulty: String = "Easy") {
    class MashRooms(val size: Int, val isMagic: Boolean) {
        constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
            //code in the constructor
        }
    }

    fun findRecipes(title : String = "", ingredient: String = "",
                    isVegetarian: Boolean, difficulty: String) : Array<Recipe> {
        return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
    }
}

fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}

fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}

fun main() {
    val r1 = Recipe("Thai Curry", "Chicken")
    val r2 = Recipe(mainIngredient = "Chicken", title = "Thai Curry")
    val r3 = r1.copy(title = "Chicken Banana")
    //val r2 = r1.copy(isVegetarian = true)
    println(r2.toString())
    println(r2.component1())
    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("$title $vegetarian")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 == r2? ${r1==r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    val m1 = Recipe.MashRooms(6, false)
    println("n1 size is ${m1.size} and isMagic is ${m1.isMagic}")

    val m2 = Recipe.MashRooms(true)
    println("n1 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(2, 5))
    println(addNumbers(1.6, 7.3))
}