package edu.okstate.cs.bjf.w06_fletcher_brandon

import Calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    var calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sevenBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "7"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "7"
            }
        }

        eightBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "8"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "8"
            }
        }

        nineBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "9"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "9"
            }
        }

        fourBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "4"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "4"
            }
        }

        fiveBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "5"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "5"
            }
        }

        sixBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "6"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "6"
            }
        }

        oneBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "1"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "1"
            }
        }

        twoBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "2"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "2"
            }
        }

        threeBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "3"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "3"
            }
        }

        zeroBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "0"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "0"
            }
        }

        decimalBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "0."
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "."
            }
        }

        // Clears out the calculation field.

        // COMPLETED: Resolve issue where calculations stop working after the CE is clicked.
        clearBtn.setOnClickListener {
            calculationTextView.text = ""
        }
        clearAllBtn.setOnClickListener {
            calculationTextView.text = "0"
        }
        equalBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = calculationTextView.text.toString()
            } else {
                calculationTextView.text = calculator.calculate(calculationTextView.text.toString())
            }
        }

        divideBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "/"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "/"
            }
        }

        multiplyBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "X"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "X"
            }
        }

        minusBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "-"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "-"
            }
        }

        addBtn.setOnClickListener {
            if (calculationTextView.text.toString() == "" || calculationTextView.text.toString() == "ERROR") {
                calculationTextView.text = "+"
            } else {
                calculationTextView.text = calculationTextView.text.toString() + "+"
            }
        }

    }

}
