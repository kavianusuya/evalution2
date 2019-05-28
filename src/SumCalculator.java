public class SumCalculator
{
        double firstNumber;
        double secondNumber;
        public double getFirstNumber()
    {
            return firstNumber;
    }
    public double getSecondNumber()
    {
            return secondNumber;
    }
    public void setFirstNumber(double firstNumber)
    {
            this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
            this.secondNumber = secondNumber;
    }
    public double getAdditionResult()
    {
            return firstNumber+secondNumber;
    }
    public double getSubtractionResult()
    {
            return firstNumber-secondNumber;
    }
    public double getMultiplicationResult()
    {
            return firstNumber*secondNumber;
    }
    public double getDivisionResult()
    {
            if(secondNumber!=0){
                return firstNumber/secondNumber;
            }
            return 0;
    }

    public static void main(String[] args)
    {
        SumCalculator calculator = new SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);
        System.out.println("add= " +calculator.getAdditionResult());
        System.out.println("sub= " +calculator.getSubtractionResult());
        System.out.println("multiply= " +calculator.getMultiplicationResult());
        System.out.println("division= "+calculator.getDivisionResult());
    }
}

