

fun main(args: Array<String>) {

    var number:Int = readLine()!!.toInt()
    if (number > 15) {
        number += 10;
        println("You're doing great!  $number")
    } else {
        println("NOPE")
    }

    println("Enter your age")
    var age = readLine()!!.toInt()
    if (age < 10) {
        println("You're a kid")
    } else if (age < 18 ) {
        println("You're a teenager")
    } else {
        println("You're an adult")
    }
}
