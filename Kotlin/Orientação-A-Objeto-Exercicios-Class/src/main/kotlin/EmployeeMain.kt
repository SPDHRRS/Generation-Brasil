fun main(){

    //Crie uma classe funcionário e apresente os atributos e métodos
    //referentes esta classe, em seguida crie um objeto funcionário, defina as
    //instancias deste objeto e apresente as informações deste objeto no
    //console.

    val ePY = Employee()

    ePY.name = "T-Rexus"
    ePY.age = 23
    ePY.height = 1.95
    ePY.weight = 125.00
    ePY.health = "Perfect"
    ePY.sLRY = 10000.00

    println("Employee Info;")
    println("Name: ${ePY.name}")
    println("Age: ${ePY.age}")
    println("Height: ${ePY.height}Cm")
    println("Weight: ${ePY.weight}Kg")
    println("Heath State: ${ePY.health}")
    println("Base Salary: $${ePY.sLRY}")



}