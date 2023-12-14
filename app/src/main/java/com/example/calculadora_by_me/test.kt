package com.example.calculadora_by_me


fun main() {

try {
    val resultado = calculadorExpressao(10,"+",5,"*" ,2)
    println(resultado)
} catch (e : java.lang.IllegalArgumentException){

    println("Error")
}


}




fun calculadorExpressao(vararg elementos: Any): Int {

    //Modolo de 2 para garantir que existe pelo menos dois numero dentro do objeto
    if (elementos.isEmpty() || elementos.size % 2 == 0){
        throw java.lang.IllegalArgumentException("Expressão Invalida")
    }

    //Atribuição do primeiro valor para nosso resultado
    var resultado = elementos[0] as Int

    for( i in 1 until elementos.size step 2 ){

        val operação = elementos[i] as String
        val numero = elementos[i +1 ] as Int

        resultado = when(operação){
            "+" -> resultado + numero
            "-" -> resultado - numero
            "*" -> resultado * numero
            "/" -> resultado / numero
            else -> throw java.lang.IllegalArgumentException("Operação Inválida:")
        }
    }

    return resultado
}