class Square (_name: String): Shape(_name) {
    var length = 0.0
    var height = 0.0

    override fun setDimensions(vararg _dimensions: Double) {
        if (_dimensions.size == 2){
            length = _dimensions[0]
            height = _dimensions[1]
            printDemensions()
        }

    }

    override fun printDemensions() {
        println("SET: \n Height: ${height} \n Length: ${length}")
    }

    override fun getArea(): String {
        val area = length * height
        return area.toString()
    }







}