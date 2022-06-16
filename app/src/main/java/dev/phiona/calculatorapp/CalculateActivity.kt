package dev.phiona.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculateActivity : AppCompatActivity() {
    lateinit var tilNum1:TextInputLayout
    lateinit var tilNum2:TextInputLayout
    lateinit var etNumber1:TextInputEditText
    lateinit var etNum2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnMinus:Button
    lateinit var btnDivide:Button
    lateinit var btnModulus:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilNum1=findViewById(R.id.tilNum1)
        tilNum2=findViewById(R.id.tilNum2)
        etNumber1=findViewById(R.id.etNumber1)
        etNum2=findViewById(R.id.etNum2)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivide=findViewById(R.id.btnDivide)
        btnMinus=findViewById(R.id.btnMinus)
        btnModulus=findViewById(R.id.btnModulus)


        btnAdd.setOnClickListener {
            val inputs = obtainInput()
            inputs(inputs!!.number1, inputs!!.number2)
        }
        btnMinus.setOnClickListener {
            val inputs = obtainInput()
            inputs(inputs!!.number1, inputs!!.number2)
        }
        btnDivide.setOnClickListener {
            val inputs = obtainInput()
            inputs(inputs!!.number1, inputs!!.number2)

        }

        btnModulus.setOnClickListener {
            var inputs = obtainInput()
            inputs(inputs!!.number1,inputs!!.number2)



            data class Inputs(var number1: Double, var number2: Double)

            fun obtainInput(): Inputs?{
                var Num1 = etNum2.text.toString()
                var Num2 = etNumber1.text.toString()
                if (Num1.isBlank()){
                    etNum2.error = "First Number required"
                    return null
                }
                if (Num2.isBlank()){
                    etNumber1.error="Second Number is required"
                }
                return null
            }
        }

    }
    }






















