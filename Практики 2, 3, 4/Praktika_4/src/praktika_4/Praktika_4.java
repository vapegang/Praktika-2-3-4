package praktika_4;

// 3ПКС-27, Корабельников, Практическая работа №4
// Создать программу, рассчитывающую наибольший общий делитель (НОД) и наименьшее общее кратное (НОК) двух введенных целых чисел.
public class Praktika_4 {
    private static int findNOD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        
        return a + b;
    }
    
    public static void main(String[] args) {
        int a = 50, b = 130;
        
        int nod = findNOD(a, b);
        int nok = (a * b) / nod;
        
        System.out.println("Входные числа: a = " + a + ", b = " + b);
        System.out.println("Наибольший общий делитель равен " + nod);
        System.out.println("наименьшее общее кратное равно " + nok);
    }  
}
