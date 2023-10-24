//Ejercicio 1. Crear la clase planeta. Propiedades: nombre, tipo y masa (con al menos 3 métodos)
fun main(){
    val planeta1 = Planeta("Tierra", "Rocoso", 4.365724367327867E20)
    val planeta2 = Planeta("Saturno", "Gaseoso", 8.908989450890458E27)
    planeta1.mostarNombre()
    planeta1.mostrarTipo()
    planeta1.mostrarMasa()
    println(planeta2.toString())
}
class Planeta(var nombre: String, var tipo: String, var masa: Double){

    fun mostarNombre(){
        println("El planeta se llama $nombre")
    }

    fun mostrarTipo(){
        println("El planeta es de tipo $tipo")
    }

    fun mostrarMasa(){
        println("El planeta tiene una masa de $masa")
    }

    override fun toString(): String {
        return "$nombre\n$tipo\n$masa"
    }
}
