package com.alexisnovo.androidcurso.sintaxis

import java.util.*

fun main(){
	ifInt()
}

fun ifMultipleOr(){
	var pet = "dog"
	var isHappy = true

	if(pet == "cat" || (pet == "dog" && isHappy) ){
		println("es un gato o un perro")
	}
}


fun ifMultiple(){
	var age = 18
	var parentPermission = false
	var isHappy = true

	if (age >= 18 && parentPermission && isHappy){
		println("Puedes beber cerveza")
	}
}

fun ifInt(){
	var age = 29
	if(age < 18)
		println("beber cerverza")
	else
		println("bebe un jugo")

}

fun ifBoolean(){
	val soyFeliz:Boolean = true

	if(!soyFeliz){
		println("boton desactivado")
	}else if(soyFeliz){
		println("boton activado")
	}
}

fun ifControlAnidado(){
	val animal = "bird"
	if( animal == "Perrito") {
		println("Es un perriro")
	}else if (animal == "cat"){
		println("Es un gato")
	}else if (animal == "bird") {
		println("Es un pajaro")
	}else {
		println("No concuerda con ningun animal")
	}
}

fun ifBasico() {
	val name = "ilex"

	if(name.lowercase(Locale.getDefault()) == "alex"){
		println("la variable name es pepe")
	}else {
		println("Este no es Alexis")
	}
}
