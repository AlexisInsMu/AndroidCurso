package com.alexisnovo.androidcurso.sintaxis

fun main(){
	var name:String? = "pepe"

	println(name?.get(3) ?: "Es nnulo wey")
}