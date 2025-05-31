import java.util.Stack;

class Element {

    int year;

    //конструктор поля класса year
    public Element(int year) {
        this.year = year;
    }
// переопределяем метод
    @Override
    public String toString() {
        return " год = " + year  ;
    }
}
public class SortStackzadanie3 {
    public static void main(String[] args) {
        // 1. Создаем и заполняем исходный стек
        Stack<Element> originalStack = new Stack<>();
        originalStack.push(new Element(2020));
        originalStack.push(new Element(2021));
        originalStack.push(new Element(2022));
        originalStack.push(new Element(2023));
        originalStack.push(new Element(2024));
        System.out.println("Исходный стек:");
        originalStack.forEach(System.out::println);
        // 2. Создаем два дополнительных стека
        Stack<Element> evenStack = new Stack<>(); // для четных годов
        Stack<Element> oddStack = new Stack<>();  // для нечетных годов
        // 3. Разделяем элементы по четности года
        while (!originalStack.isEmpty()) {
            Element current = originalStack.pop();
            if (current.year % 2 == 0) {
               oddStack.push(current);//место изменения наполнения стека
            } else {
                evenStack.push(current);//меняем местами получаем обратный результат наполнения
            }
        }
        // 4. Собираем элементы обратно: сначала четные, потом нечетные
        while (!oddStack.isEmpty()) {
            originalStack.push(oddStack.pop());
        }
        while (!evenStack.isEmpty()) {
            originalStack.push(evenStack.pop());
        }
        // 5. проверка вершин выводим результат
        System.out.println("\nвершина стека: "+originalStack.peek() );
        System.out.println("\nдно стека: "+originalStack.get(0));
        // 6. Выводим результат
        System.out.println("\nРезультат (сначала четные, потом нечетные):");
        originalStack.forEach(System.out::println);
        System.out.println("\nтеперь мы видим что на дне стека лежат четные элементы \nа на верхушке стека" +
                " нечетные , \nно в консоль мы получаем результат наоборот");
    }
}