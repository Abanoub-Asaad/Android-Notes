

fun main(args:Array<String>) {

    var name:String?=null
    println(name)

    //!! means if txt equal null, make an exception
    //That's happening because of Null Safety
    var txt:String?=null
    txt = "H"
    println(txt!!)
}