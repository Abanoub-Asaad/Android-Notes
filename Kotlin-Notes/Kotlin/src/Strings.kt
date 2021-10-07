import kotlin.reflect.typeOf

fun main(args: Array<String>) {

    val escpingString: String = "I am escaped String!\n"
    val rawString : String = """This is going to be a
    multi-line string and will
    not have any escape sequence
    """
    println(escpingString)
    println(rawString)


    val name : String
    name = "Abanoub Asaad"
    println(name)
    println("Hello, $name")
    println("Name length: ${name.length}")
    println(name[3])
    println(name.length) //property
    println(name.count())  //function
    println("The index of last character in name is: " + name.lastIndex) //lastIndex is the length - 1
    println("Upper case of name: " + name.uppercase())
    println("Lower case of name: " + name.lowercase() + "\n")

    //Concatination
    var firstName : String = "Sara "
    var secondName : String = "Eid"
    println("Full Name: " + firstName + secondName)
    println("Full Name: " + firstName.plus(secondName)+"\n")


    //Trim Characters from a String
    var tempName : String = "Mariam Alaa"
    println("Remove first two characters: " + tempName.drop(2))
    println("Remove last two characters: " + tempName.dropLast(2) + "\n")


    var quote : String = "'Focus!'"
    println(quote)
    var quote2 : String = "Foncus on Your Goals!"
    println(""+quote2.indexOf("Your") + "\n")


    //Comparing two strings
    var str1 : String = "Apple"
    var str2 : String = "Apple"
    println("" + str1.compareTo(str2) + "\n") //it returns zero if they're identical


    var str : String = "Nada"
    println(str.getOrNull(2))
    println("" + str.getOrNull(5) + "\n")


    var num : Int = 52
    println(num.toString())
    println(num.javaClass.kotlin.simpleName)
}