package com.example.estructuraproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    //Initializacion mas adelante
    private lateinit var nameEditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var greetingButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val greetingTextView: TextView = findViewById(R.id.greeting_text_view)
        greetingTextView.text = "Probando cambiar texto"*/
        bind()
        greetingButton.setOnClickListener {
            greeting()
        }
    }

    /* Enlaza las instancias creadas desde el XML */
    private fun bind() {
        val nameLayout: TextInputLayout =  findViewById(R.id.name_edit_text)
        nameEditText = nameLayout.editText!!
        resultTextView = findViewById(R.id.greeting_text_view)
        greetingButton = findViewById(R.id.greeting_button)
    }

    private fun greeting() {
        val name = nameEditText.text.toString()
        if (name.isEmpty())
            resultTextView.text = getString(R.string.helper_name)
        else
            resultTextView.text = getString(R.string.template_greeting,name)
    }

    fun onGreeting(view: View) {
        greeting()
    }

}