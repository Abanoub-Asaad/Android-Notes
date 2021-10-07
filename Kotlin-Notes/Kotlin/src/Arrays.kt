import java.util.*

fun main(args: Array<String>) {

    // Different ways of creating arrays
    val fruits = arrayOf("Apple", "Mango", "Banana", "Orange")
    val fruits2 = arrayOf<String>("Apple", "Mango", "Banana", "Orange")
    val arrayOfNulls = kotlin.arrayOfNulls<String>(9)


    val num = intArrayOf(1, 2, 3, 4)
    val chars = charArrayOf('a', '2', 'e')


    // different ways of printing the array's elements
    for (element in fruits) {
        println(element)
    }
    println("------------------")
    println(Arrays.toString(chars))
    println("------------------")
    println(fruits[2])
    println(fruits.get(2)) // get element in index 2
    fruits.set(2, "Guava") // set "Guava" to element in index 2
    println(fruits.get(2))
    println(fruits.size) // property
    println(fruits.count()) //function
    println("------------------")


    val arrNum = IntArray(4) // array of size 4
    val arrNum2 = IntArray(5, {2}) // array of size 5 and values 2
    println(Arrays.toString(arrNum))
    println(Arrays.toString(arrNum2))
    println("------------------")


    //Check if an Element Exists
    if ("Mango" in fruits) {
        println("Mango exists")
    } else {
        println("Mango doesn't exist")
    }
    println("------------------")


    // Distinct Values from Array
    val vegetables = arrayOf<String>("Tomato", "Cucmber", "Tomato")
    val distinct = vegetables.distinct()
    for (i in distinct) {
        println(i)
    }
    println("------------------")


    //Dropping Elements from Array
    val result = fruits.drop(2) //drop function returns a list
    println(result) // I can println result by this way because it's a list, but I can't do this with fruits because it's an array
    for (i in result) {
        println(i)
    }
    println("------------------")


    //Checking an Empty Array
    if (fruits.isEmpty()) {
        println("fruits array is empty")
    } else {
        println("fruits array isn't empty")
    }
}