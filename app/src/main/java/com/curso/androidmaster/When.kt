package com.curso.androidmaster

fun main() {
result("asd")
}
fun result (value: Any){
    when(value){
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if (value) print("holis")
    }
}



fun getSemester(month: Int):String {
   val result = when(month){
        in 1..6-> return "Primer semestre"
        in 7..12-> return "Segundo semestre"
        !in 1..12 ->return "Semestre no valido"
        else -> "nada"

    }
    return result
}
