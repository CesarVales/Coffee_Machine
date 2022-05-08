class Employee(val clothesSize: Int) {
    inner class Uniform {
        val uniformType = "suit"
        val uniformColor = "blue"
    }

    fun printUniformInfo() {
        val employee = Employee(clothesSize)
        println("The employee wears a ${employee.Uniform().uniformColor} ${employee.Uniform().uniformType}" +
                " in size ${this@Employee.clothesSize}")
    }
}