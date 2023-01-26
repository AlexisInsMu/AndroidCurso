package com.alexisnovo.androidcurso.sintaxis

val age: Int = 30

fun main(){
    showMyName()
    showMyAge(age)
    add()
    val mysubtract = subtract(23,45)
    println(mysubtract)
}

fun showMyName(){
    println("Mellamo Alexis")
}

fun showMyAge(currentage:Int) {
    println("Tengo $currentage años")
}
fun add(firstNumber: Int = 4, secondNumber:Int = 2) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber:Int) = firstNumber - secondNumber


fun booleano(){
    //booleanos o logicos

    val booleano:Boolean = true
    val booleano_1:Boolean = false
    val booleano_2 = true

    //print(booleano_2)
    }

fun  alfaNumericos(){
    /* holaaa*/

    variableNumericas()
    val charExample:Char = 'e'

    val charExample2:Char = 'p'

    //string aca el string es donde madamos lo que no sabes mos ni que es

    val stringExample:String = "HOl papi ajaja"
    val stringExample1:String = "23"
    val stringExample2:String = "23"

    println(stringExample1.toInt() + stringExample2.toInt())
    var strinsConcatenada:String = "Hola"
    strinsConcatenada = "Hola se llama $stringExample2 y age $age"
    println(strinsConcatenada)
    val example123:String = age.toString()
}

fun variableNumericas() {

    val example:Long = 39

    var age_1:Int = 34
    age_1 = 17
    //println(age_1)
    age_1 = 18
    //println(age_1)

    val floatExample:Float = 324.5f
    val doubleExample:Double = 2232.1323231321
    println("sumar")
    println(age + age_1)

    println("Restar")
    println(age-age_1)
    println("Multiplicar")
    println(age+age_1)
    println("Dividir")
    println(age/age_1)
    println("modulo")
    println(age%age_1)
    var exampleSuma: Int = age + floatExample.toInt()

    println(exampleSuma)
}