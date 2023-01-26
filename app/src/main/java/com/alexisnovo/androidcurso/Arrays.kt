package com.alexisnovo.androidcurso

import kotlin.reflect.typeOf

fun main(){
	var name:String = "AristiDevs"
	var name1:String = "AristiDevs"
	var name2:String = "AristiDevs"
	var name3:String = "AristiDevs"

	//indice 0-6
	//tamaño 7
	val weekDays = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
	//modificar valores
	weekDays[0] = "Feliz lunes"
	println(weekDays[0])

	println(weekDays.size)
	if (weekDays.size >= 8) {
		println(weekDays[7])
	}else{
		println("no hay mas valores en la array")
	}

	//bucles de arrays
	for (position in weekDays.indices){
		 //println("he pasado por aqui $position")
		//println(weekDays[position])
	}
	for ((position,value) in weekDays.withIndex()){
		//println("la posicion $position, contiene $value")
	}

	for (Suscribete in weekDays){
		println("Ahora es $Suscribete")
	}
}