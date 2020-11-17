import java.io.IOException
import java.lang.NumberFormatException

class Calculator {
    private val operators = arrayOf('/', 'X', '-', '+')

    // Calculator is only designed to handle two values at a time.
    private var valueX: String = "0.0"
    private var valueY: String = "0.0"
    private var numX: Double = 0.0
    private var numY: Double = 0.0
    var valueXIsNumeric = true
    var valueYIsNumeric = true
    var valueXNeedsToBeNegative = false
    var chosenOperatorIndex = 0
    var chosenOperation = '='

    fun calculate(calculationField: String): String {
        getValues(calculationField)

        try {
            numX = valueX.toDouble()
            numY = valueY.toDouble()

            if(chosenOperation == '/') {

                return (valueX.toDouble() / valueY.toDouble()).toString()
            }
            else if(chosenOperation == 'X') {
                return (valueX.toDouble() * valueY.toDouble()).toString()
            }
            else if(chosenOperation == '-') {
                return (valueX.toDouble() - valueY.toDouble()).toString()
            }
            else if(chosenOperation == '+') {
                return (valueX.toDouble() + valueY.toDouble()).toString()
            } else {
                return calculationField
            }
        } catch (e: NumberFormatException) {
            valueXIsNumeric = false
            valueYIsNumeric = false
            return "ERROR"
        }

    }

    /**
     * Function that is used to get the two values to be used
     * by the Calculator.
     */
    private fun getValues(equation: String) {
        println("Equation: " + equation)
        if(equation[0] == '-') {
            valueXNeedsToBeNegative = true
            for (operator in operators) {
                // start at 1 since 0 is a negative character
                if(equation.substring(1).contains(operator)) {
                    chosenOperation = equation[equation.indexOf(operator)]
                    chosenOperatorIndex = equation.indexOf(operator)
                    println("Chosen operation is: " + Character.toString(chosenOperation))
                    valueX = (equation.substring(1, chosenOperatorIndex))
                    valueY = equation.substring(chosenOperatorIndex+1)
                    println("Value X: " + valueX + " Value Y: " + valueY)
                }
            }
        } else {

            for (operator in operators) {
                if(equation.contains(operator)) {
                    chosenOperation = equation[equation.indexOf(operator)]
                    chosenOperatorIndex = equation.indexOf(operator)
                    println("Chosen operation is: " + Character.toString(chosenOperation))
                    valueX = equation.substring(0, chosenOperatorIndex)
                    valueY = equation.substring(chosenOperatorIndex+1)
                    println("Value X: " + valueX + " Value Y: " + valueY)
                }
            }
        }

    }
}