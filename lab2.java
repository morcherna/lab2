import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0 || num >= 15);
        int factorial = 1;
        int a = num;
        while (num >= 1) {
            factorial *= num;
            num--;
        }
        System.out.printf("Факториал %d : %s", a, factorial);
    }
}


//Пользователь вводит с клавиатуры целое
//неотрицательное число n (n<15). С помощью
//циклов for и while посчитать факториал n! и вывести на
//экран.