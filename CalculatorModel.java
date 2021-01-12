public class CalculatorModel{
    
    // It contains data in this case calculationValue
     private int calculationValue;

     // Performs the method that is needed
     public void addTwoNumber(int firstNumber, int secondNumber){
         calculationValue = firstNumber + secondNumber;
     }

     // Provides access to the data

     public int getCalculationValue() {
         return calculationValue;
     }

}