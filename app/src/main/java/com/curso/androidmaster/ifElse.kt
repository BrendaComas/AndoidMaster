package com.curso.androidmaster

fun main(){

    ifMultipleOr()
}
fun ifMultipleOr(){
    var pet ="cat"
    var isHappy =true

    if (pet == "dog" || (pet=="cat" && isHappy)){
        print("Es un gato o un perro")
    }
}


fun ifMultiple(){
    var age = 18
    var parentPermission = true
    var imHappy =true

    if (age>=18 && parentPermission && imHappy){
        println("Puedo beber cerveza")
    }
}



fun ifInt(){
    var age = 18
    if (age>=18){
        println("Beber cerveza")
    }else{
        println( "Beber jugo" )
    }

}

fun ifBoolean(){
    var soyFeliz: Boolean = false
    if (!soyFeliz){

    }
}


fun ifAnidado(){
    val animal ="Bren"

    if (animal == "dog"){
        println("Es un perro")
    }else if (animal == "cat"){
        println("Es un gato")
    }else if (animal=="bird"){
        println("Es un pajaro")
    }else{
        println("No es ninguno de los animales esperado")
    }
}



fun ifBasico(){
    val name ="Bren"

    if (name == "Juan"){
        println("LA variable es Bren")
    }else{
        println("Este no es Bren")
    }
}