package com.alexisnovo.androidcurso.sintaxis

fun main(){
	getSemester(3)
}

fun result(value: Any){
	when(value){
		is Int -> value + value
		is String -> println(value)
		is Boolean -> if(value) println("pepe")
	}
}

fun getMonth(month: Int){
	if(month == 1){
		println("enero")
	}else if (month == 2){
		println("febrero")
	}else if (month == 3){
		println("marzo")
	}else if (month == 4){
		println("abril")
	}else if (month == 5){
		println("mayo")
	}else if (month == 6){
		println("junio")
	}else if (month == 7){
		println("julio")
	}else if (month == 8){
		println("agosto")
	}else if (month == 9){
		println("septiembre")
	}else if (month == 10){
		println("octubre")
	}else if (month == 11){
		println("noviembre")
	}else if (month == 12) {
		println("diciembre")
	}else{
		println("no exite este mes")
	}
}

fun getMonth2(month:Int){
	when(month){
		1 -> println("enero")
		2 -> println("febrero")
		3 -> println("enero")
		4 -> println("febrero")
		5 -> println("enero")
		6 -> println("febrero")
		7 -> println("enero")
		8 -> println("febrero")
		9 -> println("enero")
		10 -> println("febrero")
		11 -> {
			println("enero")
			println("pepe")
		}
		12 -> println("febrero")
		else -> println("no es un mes valido")
	}
}

fun getTrimester(month:Int){
	when(month){
		1,2,3 -> println("Primer trimestre")
		4,5,6 -> println("Segundo trimestre")
		7,8,9 -> println("Tercer trimestre")
		10,11,12 -> println("Cuarto trimestre")
		else -> println("no es valido el trimestre")
	}
}

fun getSemester(month: Int) = when(month){
		in 1..6 -> "Primer semestre"
		in 7..12 -> "Segundo semestre"
		!in 1..12 -> "Semestre no valido"
		else -> "pepe"
	}
