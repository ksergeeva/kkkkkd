import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Выберете операцию : ");
            System.out.println("1 - Добавить покупку ");
            System.out.println("2 - Показать корзину ");
            System.out.println("3 - Удалить покупку  ");
            System.out.println("4 - Выход ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Какую покупку хотите добавить?");
                String bpy = scanner.nextLine();
                list.add(bpy);
                System.out.println("Покупка добавлена : " + bpy);
                continue;
            }
            if (input.equals("2")) {
                System.out.println("Список покупок ");
                printList(list);
                continue;
            }
            if (input.equals("3")) {
                String number = scanner.nextLine();
                try {
                    System.out.println("Какую покупку хотите удалить? ");
                    list.remove(Integer.parseInt(number) - 1);
                    System.out.println("Список покупок ");
                    printList(list);
                } catch (NumberFormatException e) {
                    list.remove(list.indexOf(number));
                    System.out.println("Покупка удалена :  " + number);
                    System.out.println("Список покупок ");
                    printList(list);
                    continue;
                }
            }
            if ("4".equals(input)) break;
        }
    }

    private static void printList(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("Список покупок пуст");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " - " + list.get(i));
        }
    }
}














