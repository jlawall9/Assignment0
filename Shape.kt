abstract class Shape (_name: String) : Dimensionable {
    var name = _name

    init{
        printName()
    }

    abstract override fun setDimensions(vararg _dimensions: Double)

    abstract override fun printDemensions()

    abstract fun getArea(): String

    fun printName(){
        println("Shape Name: ${name}")

    }

}