import kotlin.math.sqrt
open class Triangle(_name: String): Shape(_name) {

    var s1 :Double = 0.0
    var s2 :Double = 0.0
    var s3 :Double = 0.0


    open override fun getArea(): String {
        var perimeter = getPerimeter(s1, s2, s3) /2
        val area = heronFormula(perimeter, s1, s2, s3)
        return area.toString()
    }


    open fun getPerimeter(vararg _sides : Double) : Double{
        val perimeter = _sides[0] + _sides[1] + _sides[2]
        heronFormula(perimeter, s1, s2, s3)
        return perimeter
    }
    open fun heronFormula(_perimeter: Double, vararg _sides: Double): String{
        var area = sqrt( _perimeter * (_perimeter - _sides[0]) * (_perimeter - _sides[1]) * (_perimeter - _sides[2]))
        return area.toString()
    }


    override fun setDimensions(vararg _dimensions: Double) {
        if (_dimensions.size == 3){
            s1 = _dimensions[0]
            s2 = _dimensions[1]
            s3 = _dimensions[2]
            printDemensions()
        }

    }
    override fun printDemensions() {
        println("SET: \n Side 1: ${s1} \n Side 2: ${s2} \n Side 3: ${s3}")
    }
}