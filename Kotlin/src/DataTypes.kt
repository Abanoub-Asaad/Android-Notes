

fun main(args:Array<String>) {

    // val means I can't change the value of this variable
    // var means I can change the value of this variable
    var age = 12
    val name = "Abanoub"
    println(name)
    println(age)
    age += 2
    println(age)
    println("-----------------")


    //var varName = any value of any data type
    //var varName:DataType = any value of the specified data type
    var x:String = "Yo"
    var y:Int = 4
    println(x)
    println(y)
    println("-----------------")


    // If I want to make a variable without initialization, I should specify the data type of this variable
    // var tmp          ❌
    // var tmp:String   ✔️
    var txt:String


    //If I don't intialize the variable with a value, I should at least make it null
    //Kotlin has a feature called **null safety**
    var tmp:String?=null
    println(tmp)
}