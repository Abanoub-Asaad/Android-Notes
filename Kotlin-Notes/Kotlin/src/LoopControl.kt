

fun main(args: Array<String>) {

    /**
     * Loop Control:break & continue
     *
     * There's labels we can use for loops
     */

    outterLoop@
     for (item in 1..10) {
        for (i in 1..10) {
            if (i in 1..3) {
                println("Yo")
            } else {
                break@outterLoop
            }
        }
    }

}