fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println("Welcome to shape builder!")

    //SQUARE
    println("Begin by creating a square! \n Enter the height and length of the square(one at a time)! \n " +
            "Example:\n 3.0 \n 7.9")
    val length = readLine()?.toDouble() ?:0.0
    val height = readLine()?.toDouble() ?:0.0

    val square = Square("BestSquare")
    square.setDimensions(length, height)
    println("Area Calc: ${square.getArea()}")

    //CIRCLE
    println("Now we create a Circle. \n enter one double to set the radius")
    val radius = readLine()?.toDouble() ?:0.0
    val circle = Circle("BestCircle")
    circle.setDimensions(radius)
    print("Area Calc: ${circle.getArea()}")

    //TRIANGLE
    println("\n\nNow we create a normal (non-equilateral) triangle. You will enter 3 doubles:" )
    val triangle = Triangle("BestTriangle")
    var s1 = readLine()?.toDouble() ?:0.0
    val s2 = readLine()?.toDouble() ?:0.0
    val s3 = readLine()?.toDouble() ?:0.0
    triangle.setDimensions(s1,s2,s3)
    println(" Area Calc: ${triangle.getArea()}")

    //EQUILATERAL TRIANGLE
    println("Now we create an equilateral triangle. You will enter 1 double.")
    val eTriangle = EquilateralTriangle("BestEquilateralTriangle")
    val s = readLine()?.toDouble() ?:0.0

    eTriangle.setDimensions(s)
    println("Area Calc: ${eTriangle.getArea()}")




}