abstract class Empleados {
    var nombre: String
    var edad: Int
    var salario: Int
    val PLUS: Int = 300

    constructor(nombre: String, edad: Int, salario: Int){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    }
    abstract fun plus()
}