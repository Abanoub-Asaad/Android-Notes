interface Audio {
    
    fun printHello() {
        println("Hey from the interface")
    }
 
 	abstract fun test()
 	
    //In interfaces, default functions are abstract 
    fun test2()
 
}

interface Video {
    
    fun printVideoFormat()
}

class Base(): Audio, Video {
    
    override fun test() {
        println("Hey from test")
    }
    
    override fun test2() {
        println("Hey from test2")
    }
    
    override fun printVideoFormat() {
        println("Hey from mp4")
    }
    
}

fun main() {
    val obj = Base()
    obj.printHello()
    obj.test()
    
    obj.printVideoFormat()
}