

fun main(args: Array<String>) {

    //one for loop
    for (i in 1..5) {
        print("$i ")
    }
    println("\n\n")


    //two for loops
    for (i in 1..5) {
        for (j in 1..2) {
            print("i: $i, j: $j")
            println()
        }
        println()
    }


    //Write hello 4 times using while loop
    var count = 1
    while (count < 5) {
        println("Hello")
        count += 1
    }


    // do while
    var n = 5
    do {
        println("HEY")
        n--
    } while (n != 0)

}