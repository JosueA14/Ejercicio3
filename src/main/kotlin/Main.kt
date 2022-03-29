import Comercial
import Repartidor

fun main(args: Array<String>) {
    println("Bienvenido")

    var repartidor1 = Repartidor("zona 3","Diego", 22, 600)
    var repartidor2 = Repartidor("zona 4","Fernanda", 26, 800)
    var comercial1 = Comercial(200.0,"Kevin", 22, 500)
    var comercial2 = Comercial(300.0,"Jeremy", 31, 900)

    repartidor1.plus()
    repartidor2.plus()
    comercial1.plus()
    comercial2.plus()

    println("Repartidor1: " + repartidor1.salario)
    println("Repartidor2: " + repartidor2.salario)
    println("Comercial1: " + comercial1.salario)
    println("Comercial2: " + comercial2.salario)
}