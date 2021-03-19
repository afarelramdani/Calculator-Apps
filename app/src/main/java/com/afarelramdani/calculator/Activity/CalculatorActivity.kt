package com.afarelramdani.calculator.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.afarelramdani.calculator.Base.BaseActivity
import com.afarelramdani.calculator.R
import com.afarelramdani.calculator.databinding.ActivityCalculatorBinding
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : BaseActivity<ActivityCalculatorBinding>(), View.OnClickListener {
    private lateinit var cal: Calculate

    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_calculator
        super.onCreate(savedInstanceState)

        cal = Calculate(tv_input_calculate, tv_output_calculate)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnDot -> {
                cal.appendOnClick(true, ".")
            }
            R.id.btnPlus -> {
                cal.appendOnClick(false, "+")
            }
            R.id.btnMin -> {
                cal.appendOnClick(false, "-")
            }
            R.id.btnMultiply -> {
                cal.appendOnClick(false, "*")
            }
            R.id.btnDivide -> {
                cal.appendOnClick(false, "/")
            }
            R.id.btnBracketLeft -> {
                cal.appendOnClick(false, "(")
            }
            R.id.btnBracketRight -> {
                cal.appendOnClick(false, ")")
            }


        }
    }

    fun onClickNumber(v: View) {
        when (v?.id) {
            R.id.btn0 -> {
                cal.appendOnClick(true, "0")
            }
            R.id.btn1 -> {
                cal.appendOnClick(true, "1")
            }
            R.id.btn2 -> {
                cal.appendOnClick(true, "2")
            }
            R.id.btn3 -> {
                cal.appendOnClick(true, "3")
            }
            R.id.btn4 -> {
                cal.appendOnClick(true, "4")
            }
            R.id.btn5 -> {
                cal.appendOnClick(true, "5")
            }
            R.id.btn6 -> {
                cal.appendOnClick(true, "6")
            }
            R.id.btn7 -> {
                cal.appendOnClick(true, "7")
            }
            R.id.btn8 -> {
                cal.appendOnClick(true, "8")
            }
            R.id.btn9 -> {
                cal.appendOnClick(true, "9")
            }
        }

    }

    fun onClickAction(v: View) {
        when(v?.id) {
            R.id.btnClear -> {
                cal.getClear()
            }
            R.id.btnEqual -> {
                cal.calculate()
            }
            R.id.btn_backspace -> {
                cal.clear(tv_input_calculate.text.toString())
            }
        }

    }


}