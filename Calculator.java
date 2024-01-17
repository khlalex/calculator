import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите два числа от 1 до 10 и математическую операцию между ними:");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] string = str.split(" ");
            if (string.length <= 2) {
                throw new Exception("Строка не является математической операцией или пропущен пробел между оперантом и оператором");
            }
            if (string[0].length() > 2 || string[2].length() > 2) {
                throw new Exception("Вы ввели слишком большое число");
            }
            int a = Integer.parseInt(string[0]);
            String s = string[1];
            char operator = s.charAt(0);
            int b = Integer.parseInt(string[2]);
            if (string.length > 3) {
                throw new Exception("Формат математической операции не удовлетворяет заданию");
            }
            if (a <= 0 || a > 10 || b <= 0 || b > 10) {
                throw new Exception("Введённое значение не удовлетворяет условию");
            }
            switch (operator) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                default:
                    throw new Exception("Символ не является математической операцией");
            }
    }
}
