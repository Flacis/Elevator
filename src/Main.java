import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int inputFloor = scanner.nextInt();
            if (inputFloor > 25 || inputFloor < 0) {
                System.out.println("Такого этажа нет в доме");
                continue;
            }
            if (inputFloor == 0) {
                System.out.println("Лифт проследовал по следующим этажам: ");
                while (!queue.isEmpty()) {
                    System.out.printf("Этаж %d -> ", queue.poll());
                }
                System.out.println("Этаж 0");
                break;
            }
            queue.offer(inputFloor);
        }
    }
}


