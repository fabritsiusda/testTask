import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        NumberTask task1 = new NumberTask();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("0. выход\n1. Задание первое\n2. Задание второе\n3. Задание третье");
            String answer = scanner.nextLine();
            if (answer.equals("0"))
                break;
            switch (answer){
                case "1":
                    task1.show(100);
                    break;
                case "2":
                   secondTask(scanner, answer);
                    break;
                case "3":
                    thirdTask(scanner, answer);
                    break;
                default:
                    System.out.println("incorrect input string");
            }
        }
    }

    private static void secondTask(Scanner scanner, String answer){
        System.out.println("Введите r");
        answer = scanner.nextLine();
        int r;
        try {
            r = Integer.parseInt(answer);
        } catch (Exception e) {
            System.out.println("не вверный ввод");
            return;
        }
        System.out.println("Введите m");
        answer = scanner.nextLine();
        int m;
        try {
            m = Integer.parseInt(answer);
        } catch (Exception e) {
            System.out.println("не вверный ввод");
            return;
        }
        if (m < r) {
            System.out.println("не вверный ввод");
            return;
        }
        FactorialTask task = new FactorialTask(r, m);
        System.out.println(task.calculate());
    }

    private static void thirdTask(Scanner scanner, String answer) throws IOException {
        System.out.println("ВВедите путь к файлу");
        answer = scanner.nextLine();
        String text = new String(Files.readAllBytes(Paths.get(answer)));
        TextTask task = new TextTask();
        task.setText(text);
        task.showWords();
    }

}
