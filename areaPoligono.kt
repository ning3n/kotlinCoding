fun main(){
    area(triangle(10.0, 5.0))
    area(rectangle(5.0, 7.0))
    area(square(4.0))
}

interface Polygon {
    fun area(): Double
    fun printArea()
}

data class Triangle(val base: Double, val height: Double): Polygon {
    override fun area(): Double = base * height / 2
    override fun printArea() = println("El área del triángulo es ${area()}")
}

data class Rectangle(val length: Double, val width: Double): Polygon {
    override fun area(): Double = length * width
    override fun printArea() = println("El área del rectángulo es ${area()}")
}

data class Square(val side: Double): Polygon {
    override fun area(): Double = side * side
    override fun printArea() = println("El área del cuadrado es ${area()}")
}

private fun area(polygon: Polygon): Double {
    polygon.printArea()
    return polygon.area()
}