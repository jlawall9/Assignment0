class Circle(_name: String): Shape(_name) {
    var radius = 0.0

    override fun getArea(): String {
        val area = Math.PI * radius * radius
        return area.toString()
    }

    override fun setDimensions(vararg _dimensions: Double) {
        if (_dimensions.size == 1){
            radius = _dimensions[0]
        }
    }

    override fun printDemensions() {
        println("SET: \n Radius: ${radius}")
    }


}