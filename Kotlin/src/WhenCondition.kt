

fun main(args: Array<String>) {

    var number: Int = readLine()!!.toInt()

    // When is like switch in C++, but "when" has new features
    when (number) {
        1-> {
            println("You entered 1")
        }
        2-> {
            println("You entered 2")
        }
        3-> {
            println("You entered 3")
        }
        4,5,6-> {
            println("You entered 4 or 5 or 6")
        }
        in 10..50-> {
            println("You entered a number in range from 10 to 50")
        }
        !in 10..50-> {
            println("You entered a number that is not between 10 to 50")
        }
        else-> {
            println("Out of range")
        }
    }

}