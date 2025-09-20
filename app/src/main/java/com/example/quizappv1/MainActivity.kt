package com.example.quizappv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enlazamos las variables del código con los botones
        val trueButton: Button = findViewById(R.id.true_button)
        val falseButton: Button = findViewById(R.id.false_button)

        // Creamos el evento onClick para el botón Verdadero
        trueButton.setOnClickListener {
            // Nos muestra este mensaje cuando damos clic verdadero
            Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()
        }

        // Clic falso
        falseButton.setOnClickListener {
            Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
        }
    }
}