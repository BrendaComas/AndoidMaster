package com.curso.androidmaster

//VARIABLES NUMERICAS
val age: Int = 26


fun main() {
    showMyName("Brenda")
    showMyAge(25)
    add(25, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun showMyName(name:String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}
fun subtract(firstNumber: Int, secondNumber: Int):Int {
return firstNumber - secondNumber
}
//FUNCIONES
fun variablesBoolean() {
    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3: Boolean = false
}

fun variablesAlfanumericas() {


    //Variables Alfanumericas

    //CHAR
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'


    //String
    val stringExample: String = "Bren y Michi"
    val stringExample2 = "4"
    val stringExample3 = "23"
    // print(stringExample2.toInt() + stringExample3.toInt())

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola somos $stringExample"
    print(stringConcatenada)
}


fun variablesNumericas() {

//INT -2, 147, 483, 647 a 2 , 147, 483, 647
    val age: Int = 26
    var age2: Int = 24


    //LONG  -9, 223, 372, 036, 854, 775, 807 a 9, 223, 372, 036, 854, 775, 807
    val example: Long = 26

    //FLOAT
    val floatExample: Float = 26.5f

    //DOUBLE
    val doubleExample: Double = 3241.3123123

    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age - age2)


    println("Multiplicar:")
    println(age * age2)

    println("Dividir:")
    println(age / age2)


    println("Módulo:")
    println(age % age2)

}


