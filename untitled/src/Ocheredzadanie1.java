import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Ocheredzadanie1 {
    //очередь заполнена случайными числами, сортировать данную очередь по возрастанию
    public static void que1()//+
    {
        Queue<Integer> queue = new ArrayDeque<>();
        Random random = new Random();
        // Заполнение очереди
        for (int i = 0; i < 30; i++) {
            queue.add(random.nextInt(100));
        }
        System.out.println("Исходная очередь: " + queue);
        // Преобразуем очередь в список
        List<Integer> tempList = new ArrayList<>(queue);
        // Сортируем список
        Collections.sort(tempList);
        // Очищаем очередь и заполняем заново
        queue.clear();
        queue.addAll(tempList);
        //выводим очередь
        System.out.println("Отсортированная очередь: " + queue);
    }
    //очередь заполнена случайными числами, удалить из очереди все двухзначные числа

    public static void que2()//+
    {
        // 1. Создаем и заполняем очередь случайными числами
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            queue.add(random.nextInt (100)); //  двузначные числа до 100
        }
        System.out.println("Исходная очередь: " + queue);
        // 2. Удаляем двузначные числа
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int num = queue.poll();//озвращает элемент из головы очереди и удаляет его
            // Проверяем, что число НЕ двузначное (включая отрицательные)
            if (!(Math.abs(num) >= 10 && Math.abs(num) <= 99)) {
                queue.add(num);
            }
        }
        System.out.println("Очередь  после удаления двузначных чисел: " + queue);
    }


    //записать очередь в обратном порядке очередь заполняется с клавиатуры
    public static void que3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        System.out.println("введите числа: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
        LinkedList<String> queue = new LinkedList<String>(List.of(list));
        Collections.reverse(queue);
        System.out.println(queue);
    }
}

