fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println("hi")

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    println(printSum(3, 5))
}
