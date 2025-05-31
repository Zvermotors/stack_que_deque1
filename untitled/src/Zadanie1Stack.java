import java.util.Stack;

public class Zadanie1Stack {
     public static void stacks1()//+
    {
        //Сформировать стек из 10 чисел. Найти сумму последних 5 чисел и результат поместить в стек
                // 1. Создаем стек и добавляем 10 чисел
                Stack<Integer> stack = new Stack<>();
                int []arr = {32,11,22,54,23,65,21,1,4,5};
               for (int j : arr) {
                         stack.push(j); // Добавляем числа от 1 до 10
                   }
                System.out.println("Исходный стек: " + stack);


                // 2. Суммируем последние 5 элементов
                int sum = 0;
                //временный стек
                Stack<Integer> tempStack = new Stack<>();
                // Извлекаем 5 элементов во временный стек
                for (int i = 0; i < 5; i++) {
                    if (!stack.isEmpty()) {
                        tempStack.push(stack.pop());
                    }
                }

                // Суммируем значения из временного стека
                while (!tempStack.isEmpty()) {
                    int num = tempStack.pop();
                    sum += num;
                    stack.push(num); // Возвращаем числа обратно
                }

                System.out.println("Сумма последних 5 чисел: " + sum);

                // 3. Добавляем сумму обратно в стек
                stack.push(sum);

                System.out.println("Итоговый стек: " + stack);


    }

    public static void stacks2(){
        //Сформировать стек из 8 чисел. Найти среднее арифметическое
        // второго и третьего чисел, результат поместить в стек
                int []arr = {32,11,22,54,23,65,21,1};
                // 1. Создаем стек и добавляем 8 чисел
                Stack<Integer> stack = new Stack<>();
                 for (int j : arr) {
                    stack.push(j); // Добавляем числа от 1 до 10
                             }

                System.out.println("Исходный стек: " + stack);
        System.out.println("верхушка стека: " + stack.peek());
        System.out.println("дно стека: " + stack.get(0));

                // 2. Получаем доступ ко 2-му и 3-му элементам (не извлекая их)
                Stack<Integer> tempStack = new Stack<>();
                // Извлекаем элементы до 3-го
                for (int i = 0; i < 5; i++) {
                    tempStack.push(stack.pop());
                }
                int thirdNum = stack.peek(); // 3-й элемент (не извлекаем)

                // Возвращаем один элемент обратно
                stack.push(tempStack.pop());
                int secondNum = stack.peek(); // 2-й элемент (не извлекаем)
                // 3. Вычисляем среднее
                double average = (secondNum + thirdNum) / 2.0;
                System.out.printf("третье число: %d, второе число: %d%n", secondNum, thirdNum);
                System.out.printf("Среднее арифметическое: %.1f%n", average);
                // 4. Добавляем результат в стек
                stack.push((int) Math.round(average));
                //и после этого арифметического действия кладём числа назад которые извлекли ранее
                       stack.push(23);
                       stack.push(65);
                       stack.push(21);
                       stack.push(1);
                System.out.println("Итоговый стек: " + stack);
            }


}
