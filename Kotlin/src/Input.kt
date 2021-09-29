

fun main(args:Array<String>) {

    //!! means "name" can't be null
    print("Enter your name:  ")
    var name:String = readLine()!!
    println(name)


    // !!.toInt() means make an exception when the input isn't integer
    print("Enter your age:  ")
    var age:Int = readLine()!!.toInt()
    println(age)


    print("Enter your department:  ")
    var dep = readLine()
    println(dep)


    // !!.toDouble() means make an exception when the input isn't double
    print("Enter avg:  ")
    var avg:Double = readLine()!!.toDouble()
    println(avg)
}