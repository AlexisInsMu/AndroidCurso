package com.alexisnovo.androidcurso.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.alexisnovo.androidcurso.R

class FirstAppActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_first_app)
		//Al arrancar la pantalla
		val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
		val editText = findViewById<AppCompatEditText>(R.id.etName)

		btnStart.setOnClickListener {
			val name = editText.text.toString()
			if(name.isNotEmpty()){
				val intent = Intent(this, ResultActivity::class.java)
				intent.putExtra("EXTRA_NAME", name)
				startActivity(intent)
				Log.i("Alexis", "Button pulsado ${editText.text.toString()}")
			}else{
				Log.i("Alexis","ESCRIBE FLOJO")
			}
		}

	}
}