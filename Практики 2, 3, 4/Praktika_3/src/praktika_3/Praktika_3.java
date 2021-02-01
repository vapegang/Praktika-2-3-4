package praktika_3;

// 3ПКС-27, Корабельников, Практическая работа №3
// Перевод Discord тега (#9063) в шестнадцетиричную СС
public class Praktika_3 {
    private static String convertIntToHex(int a) {
        String hex = "";
        
        switch(a) {
            case 10:
                hex = "A";
                break;
            case 11:
                hex = "B";
                break;
            case 12:
                hex = "C";
                break;
            case 13:
                hex = "D";
                break;
            case 14:
                hex = "E";
                break;
            case 15:
                hex = "F";
                break;
        }
        
        return hex;
    }
    
    public static void main(String[] args) {
        int tag = 9063, remainder;
        String result = "";
        
        while (tag > 16) {
            remainder = tag % 16;
            tag = tag / 16; 
            
            if(remainder > 9 && remainder < 16) {
                result += convertIntToHex(remainder);
            } else {
                result += remainder;
            }
       }
        
       if (tag > 0 && tag < 16) result += tag;
       
       StringBuilder reverseString = new StringBuilder();
       reverseString.append(result);
       reverseString.reverse();
       
       result = reverseString.toString();
       
       System.out.println(result);
    }
}
