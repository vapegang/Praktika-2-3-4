package praktika2;

// 3ПКС-27, Корабельников, Практическая работа №2
// Среднее гармоническое, арифметическое, геометрическое, квадратичное двух чисел
// Количество корней квадратного уравнения по 3 коэффициентам
public class Praktika2 {
    private static double getArifm(int a, int b) {
        return (a + b) / 2;
    }
    private static double getGeom(int a, int b) {
        return Math.sqrt(a * b);
    }
    private static double getGarmonic(double a, double b) {
        return 2 / (1/a + 1/b);
    }
    private static double getKvadr(int a, int b) {
        return Math.sqrt((a*a + b*b) / 2);
    }
    
    private static int getDiscriminant(int a, int b, int c) {
        return b*b - 4*a*c;
    }
    
    public static void main(String[] args) {
        int a = 30, b = 40;
        
        double arifm = getArifm(a, b);
        double geom = getGeom(a, b);
        double garmonic = getGarmonic(a, b);
        double kvadr = getKvadr(a, b);
        
        System.out.println("Входные числа: " + "a = " + a + ", b = " + b);
        System.out.println("Среднее арифметическое: " + arifm);
        System.out.println("Среднее геометрическое: " + geom);
        System.out.println("Среднее гармоническое: " + garmonic);
        System.out.println("Среднее квадратичное: " + kvadr);
        
        System.out.println("=====================================");
        
        int c = 4, d = 4, e = 1;
        System.out.println("Количество корней квадратного уравнения по 3 коэффициентам");
        System.out.println("Коэффициент a = " + c + ", b = " + d + ", c = " + e);
        int discriminant = getDiscriminant(c, d, e);
        
        System.out.println(discriminant < 0 ? "Уравнение не имеет корней" 
                : discriminant == 0 ? "Уравнение имеет один корень" : "Уравнение имеет два корня");
    }
}
