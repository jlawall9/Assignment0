class EquilateralTriangle(_name: String) : Triangle(_name) {
    var s : Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {

        s = dimensions[0]
        printDemensions()

    }
    override fun printDemensions() {
        println("SET: \n All 3 sides are: ${s} ")
    }
    override fun getArea(): String {
        val perimeter = getPerimeter(s, s, s) /2
        val area = heronFormula(perimeter, s, s, s)
        return area.toString()
    }
}