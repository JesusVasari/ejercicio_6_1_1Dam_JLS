fun main() {
    val gato = Gato(4,1,1)
    gato.comer()
    gato.maullar()
    val perro = Perro(4,1,1)
    perro.comer()
    perro.ladrar()

}


open class Animal(var patas: Int = 4, var cabeza: Int = 1, var cola: Int = 1) {

    fun comer() = println("ha comido")

}
class Perro(patas: Int, cabeza: Int, cola: Int) : Animal(patas, cabeza, cola){

    fun ladrar()= println("ladra")

}


class Gato(patas: Int, cabeza: Int, cola: Int) : Animal(patas, cabeza, cola){

    fun maullar() = println("maulla")
}