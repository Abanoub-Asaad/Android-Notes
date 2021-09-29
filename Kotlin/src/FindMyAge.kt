import java.util.*

fun main(args:Array<String>) {

    print("Enter your year of birth: ")
    var yearOfBirth:Int = readLine()!!.toInt()

    var curYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = curYear - yearOfBirth
    print("Your age = $age years")

}