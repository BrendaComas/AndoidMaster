package com.curso.androidmaster

fun main(){
    var name: String ="Bren"
    var name1: String ="Bren"
    var name2: String ="Bren"
    var name3: String ="Bren"


    //Indice 0-7
    //Tamaño 8
val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo")

    //println(weekDays[0])
    //println(weekDays.size)

    //Tamaños
    if (weekDays.size >=8){
       // println(weekDays[7])
    }else{
        //println("No hay mas dias")
    }


    //Modificar valores
    weekDays[0] = "Feliz lunes"

    //println(weekDays[0])


    //Bucles para Arrays
    for (position in weekDays.indices){
        //println(weekDays[position])
    }

    for((position, value)in weekDays.withIndex()){
        //println("La posicion $position contiene $value")
    }
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}