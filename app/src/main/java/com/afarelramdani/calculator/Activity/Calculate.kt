package com.afarelramdani.calculator.Activity

import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class Calculate(var tvInput: TextView, var tvOutput: TextView) {
    fun calculate() {
        val input = ExpressionBuilder(tvInput.text.toString()).build()
        val output = input.evaluate()
        val longOutput = output.toLong()
        if (output == longOutput.toDouble()) {
            tvOutput.text = longOutput.toString()
        } else {
            tvOutput.text = output.toString()
        }
    }

    fun appendOnClick(clear: Boolean, string: String) {
        if (tvOutput.text.isNotEmpty()) {
            tvInput.text = ""
        }

        if (clear) {
            tvOutput.text = ""
            tvInput.append(string)
        } else {
            tvInput.append(tvOutput.text)
            tvInput.append(string)
            tvOutput.text = ""
        }
    }

    private fun clear() {
        tvInput.text = ""
        tvOutput.text = ""
    }

    fun getClear() {
        return clear()
    }

    fun clear(input: String) {
        val input = input
        if (input.isNotEmpty()) {
            tvInput.text = input.substring(0, input.length - 1)
        }
        tvOutput.text = ""
    }
}