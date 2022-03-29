class Repartidor : Empleados {
    var zona: String = ""

    constructor(zona: String, nombre: String, edad: Int, salario: Int) : super(nombre, edad, salario) {
        this.zona = zona
    }

    override fun plus() {
        if(this.edad < 25 && this.zona == "zona 3"){
            this.salario = (this.salario + this.PLUS)
        }
    }
}
//En repartidor, si tiene menos de 25 años  y reparte en la “zona 3”, este recibirá el plus.