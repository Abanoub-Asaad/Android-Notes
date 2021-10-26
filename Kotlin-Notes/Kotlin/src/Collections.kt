

fun main() {
    
    //Immutable collections are read only, you can't perform any operations on them
 	val names = listOf<String>("Abanoub", "Asaad", "Boules")
    println(names[1])
    
    for (name in names) {
        println(name)
    }
    
    names.forEach {println(it)} 
    println("-------------------------------")
    
    //Mutable collections, you can read them and also wirte into them
    val names2 = mutableListOf<String>("Mariv")
    names2.add("Marina")
    
    for (name in names2) {
        println(name)
    }
    println("--------------------------------")
    
    
    val names3 = setOf<String>("Mariam", "Mariam", "Forlorn", "Forlorn")
    names3.forEach {println(it)}
    println("--------------------------------")
    
    val names4 = mutableSetOf<String>("Mariam", "Mariam")
    names4.add("Forlorn")
    names4.add("Ali")
    names4.remove("Ali")
    names4.forEach {println(it)}
    println("--------------------------------")
    
    
    val students = mapOf<Int, String>(1 to "Abanoub", 2 to "Asaad")
    println(students[2])
    students.forEach { t, u ->
        println("$t: $u")
    }
    
}