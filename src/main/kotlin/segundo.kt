interface Tier {
    var patas: Int
    var cabeza: Int
    var cola: Int
    fun comer() = println("ha comido")

}

/**
 * la clase "Hund" hereda de la interface animal, obtiene sus variables y funciones; crea uno nuevo
 * específico
 */
class Hund(override var patas: Int, override var cabeza: Int, override var cola: Int) : Tier
{
    fun ladrar()= println("ladra")
}

/**
 * la clase Cat hereda de la interface animal e implementa una las variables e introduce una funcion propia del gato
 */
class Cat(override var patas: Int, override var cabeza: Int, override var cola: Int) :Tier
{
    fun maullar() = println("maulla")
}

fun main(){

    var cat:Cat = Cat(4,1,1)
    var dog:Hund=Hund(4,1,1)
    cat.maullar()
    dog.ladrar()
    dog.comer()
    cat.comer()

}