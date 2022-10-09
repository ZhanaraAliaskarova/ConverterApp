package com.example.converterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var selectedUnitLayout:LinearLayout
    private lateinit var selectedUnitText:TextView
    private lateinit var editInput:EditText
    private lateinit var textResult: TextView
    private lateinit var resultTypeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedUnitLayout = findViewById(R.id.textCen)
        selectedUnitText = findViewById(R.id.textCen)
        editInput = findViewById(R.id.editInput)
        textResult = findViewById(R.id.textResult)
        resultTypeText = findViewById(R.id.textView3)


        editInput.addTextChangedListener(){
            var resultText:String = ""
            var inputVal = editInput.text.toString()
            val df = DecimalFormat("#.##")
            if (inputVal.isNotEmpty()){
                val doubleInput = inputVal.toDouble()
                resultText = df.format(doubleInput * 0.01)
                selectedUnitText.text = "Meter"
            }
            textResult.text = resultText
        }
    }


}