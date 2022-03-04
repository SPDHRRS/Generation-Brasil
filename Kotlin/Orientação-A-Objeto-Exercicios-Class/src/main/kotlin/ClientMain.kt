fun main() {

    //1) Crie uma classe cliente e apresente os atributos e métodos referentes
    //esta classe, em seguida crie um objeto cliente, defina as instancias deste
    //objeto e apresente as informações deste objeto no console.

    val dG = Client()

    dG.name = "Dogge"
    dG.age = 32
    dG.height = 1.71
    dG.weight = 78.00
    dG.wLLC = "Not now"
    dG.mood = "Happy Boi"


    println("Client Resume;")
    println("Name: ${dG.name}")
    println("Age: ${dG.age}")
    println("Height: ${dG.height}Cm")
    println("Weight: ${dG.weight}Kg")

}