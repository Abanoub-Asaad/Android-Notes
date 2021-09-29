

fun main(args:Array<String>) {

    var n1:Double = 10.5
    var n2:Double = 4.5
    var sum = n1 + n2
    println("Sum = " + sum)
    println("Sum = $sum") // a different way using '$'


    print("Enter x: ")
    var x:Int = readLine()!!.toInt()
    print("Enter y: ")
    var y:Int = readLine()!!.toInt()
    var sum2 = x + y
    println("Sum2 = $sum2")
}
