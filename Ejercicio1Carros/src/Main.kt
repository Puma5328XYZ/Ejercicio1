import carros.Toyota
import carros.Hyundai

fun crearCarros() {
    val toyota = Toyota()
    val hyundai = Hyundai()

    println("Modelo del carro : ${toyota.modelo}")
    println("Modelo del carro : ${hyundai.modelo}")

    toyota.conducir()
    hyundai.conducir()
}
fun main() {
    crearCarros()
}