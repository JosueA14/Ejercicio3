class Comercial : Empleados {
    var comision: Double = 0.0

    constructor(comision: Double, nombre: String, edad: Int, salario: Int) : super(nombre, edad, salario) {
        this.comision = comision
    }

    override fun plus() {
        if(this.edad > 30 && this.comision > 200){
            this.salario = (this.salario + this.PLUS)
        }
    }
}

//En comercial, si tiene más de 30 años y cobra una comisión de más de $200, se le aplicara el plus.