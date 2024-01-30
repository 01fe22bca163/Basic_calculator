/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class Calculator{

    float addition(float  operand_1, float operand_2){
        return(operand_1 + operand_2);
    }
    float substraction(float  operand_1, float operand_2){
        return(operand_1 - operand_2);
    }
    float multiplication(float  operand_1, float operand_2){
        return(operand_1 * operand_2);
    }
    float division(float  operand_1, float operand_2){
        return(operand_1 / operand_2);
    }
    float square(float operand_1){
        return(operand_1*operand_1);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        float operand_1 = 8;
        float operand_2 = 4;
       float add_result = calc.addition(operand_1, operand_2);
       System.out.println("Addition="+add_result);
       float sub_result = calc.substraction(operand_1, operand_2);
       System.out.println("Substraction="+sub_result);
       float mult_result = calc.multiplication(operand_1, operand_2);
       System.out.println("Multiplication="+mult_result);
       float div_result = calc.division(operand_1, operand_2);
       System.out.println("Division="+div_result);
       float sq_result = calc.square(operand_1);
       System.out.println("Squared="+sq_result);
    }

}