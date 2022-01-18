/**
 * @author Jesús López Sánchez
 */


fun main() {
    val gato = Gato(4,1,1)
    gato.comer()
    gato.maullar()
    val perro = Perro(4,1,1)
    perro.comer()
    perro.ladrar()

}

/**
 * @param la clase Animal es la superclase que implementa las caracteristica comunes
 */
open class Animal(var patas: Int = 4, var cabeza: Int = 1, var cola: Int = 1) {

    fun comer() = println("ha comido")

}

/**
 * la clase Perro hereda de la superclase animal, obtiene sus funciones y crea uno nuevo
 * específico de su clas
 */
class Perro(patas: Int, cabeza: Int, cola: Int) : Animal(patas, cabeza, cola){

    fun ladrar()= println("ladra")

}

/**
 * la clase Gato hereda de la clase animal e implementa una función propia del gato
 */
class Gato(patas: Int, cabeza: Int, cola: Int) : Animal(patas, cabeza, cola){

    fun maullar() = println("maulla")
}


/*
c) Di que tipo de herencia es: (Especialización, Extensión, Especificación, Construcción).

extensión

d) ¿Quién es la superclase y subclase?

la superclase es : animal
la subclase son : perro y gato

e) ¿Existe otra forma de implementarlo que no sea a través de la herencia?
a través de una interface
f) Piensa y comenta qué ventajas aporta esta implementación de herencia, con respecto a otra.

desde la superclase que implementa características y funciones comunes (animal) se extiende las mismas funciones
y se pueden implementar nuevas funciones. Las subclases pueden hacer las funciones de la clase heredada.

 */