package javafaqproblemsset2;

public class P03_ArthematicOfAllOperatorsPriority {
    public static void main(String[] args) {
        System.out.println(9+6-3*4/2%5); //9+6-12/2%5 => 9+6-6%5 => 9+6-1 => 15-1 => 14

        // BODMAS Rule:
        // Brackets Of Division Multiplication Addition Substraction (highest priority: Left to Right)
    }
}
