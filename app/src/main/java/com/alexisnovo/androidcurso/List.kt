package com.alexisnovo.androidcurso

fun main(){
	//inmutableList()
	mutablelist()
}

fun mutablelist(){
	var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
	//println(weekDays)

	weekDays.add(0,"AlexisDays")
	println(weekDays)

	if (weekDays.isEmpty()){
		println("no hay")
	}else{
		weekDays.forEach{ println(it)}
	}

	if (weekDays.isNotEmpty()){
		weekDays.forEach { println(it) }
	}
}

fun inmutableList(){
	val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

	println(readOnly.size)
	println(readOnly)
	println(readOnly[0])
	println(readOnly.last())
	println(readOnly.first())

	//filtrar
	val example = readOnly.filter { it.contains("a") }
	println(example)

	//iterar
	readOnly.forEach { weekDay -> println(weekDay) } // readOnly.forEach { println(weekDay)}
}