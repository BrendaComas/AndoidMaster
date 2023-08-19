package com.curso.androidmaster

fun main(){
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf ("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekDays.add(0,"Bren")
    println(weekDays)

    if(weekDays.isEmpty()){
        //no voy a pintar porque no hay nada
    }else{
        weekDays.forEach{ println(it) }
    }
    if (weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }
    weekDays.last()

    for (hola in weekDays){

    }


}
fun inmutableList(){
    val readOnly:List<String> = listOf ("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo")

    //println(readOnly.size)
    //println(readOnly)
   // println(readOnly[0])
    //println(readOnly.last())
   // println(readOnly.first())

//Filtrar
    //val example = readOnly.filter { it.contains("a") }
   // println(example)

    // readOnly.forEach{ weekDay -> println(weekDay) }
}