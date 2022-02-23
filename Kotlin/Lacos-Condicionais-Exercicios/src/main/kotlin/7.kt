fun main(){

    /*
    Receber valores de base e altura de um triângulo e verificar se são valores válidos
	(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	 */


    println("Enter the base value: ")
    val vE = readLine()!!.toFloat()

    println("Enter the height: ")
    val hT = readLine()!!.toFloat()

    if(vE > 0 && hT > 0){

        println("The are of the triangle is: ${vE * hT / 2}")

    }else{

        println("There's no area to calculate")

    }




}