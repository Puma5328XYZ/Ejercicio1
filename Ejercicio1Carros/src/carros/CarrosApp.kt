package carros
interface AccionCarro {
    fun conducir()
}

abstract class Carro : AccionCarro {
    abstract val modelo: String
}

class Toyota : Carro() {
    override val modelo: String
        get() = "Toyota"

    override fun conducir() {
        println("El color del carro Toyota es negro")
    }
}

class Hyundai : Carro() {
    override val modelo: String
        get() = "Hyundai"

    override fun conducir() {
        println("El color del carro Hyundai es verde")
    }
}

