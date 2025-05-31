import java.util.Stack;
public class Zadanie2Stack {
       public static void stack3()//+
       {
           //поменять в стеке содержимое вершины и дна
           Stack stackr = new Stack();
           stackr.push(1);//0 - дно
           stackr.push(2);
           stackr.push(3);
           stackr.push(4);
           stackr.push(5);//4 - вершина
           System.out.println("первоначальный вид стэка "+ stackr);
           System.out.println(" вершина стэка "+ stackr.peek());
           System.out.println(" дно стэка "+ stackr.get(0));
           System.out.println("меняем в данном стэке содержимое вершины и дна ");
           System.out.println("вытаскиваем верхние элементы чтобы добраться до дна стэка");
           System.out.println("удаляем число - " + stackr.pop());
           System.out.println("удаляем число - " + stackr.pop());
           System.out.println("удаляем число - " + stackr.pop());
           System.out.println("удаляем число - " + stackr.pop());
           int r = 100;
           System.out.println("берём дно стэка " + stackr.get(0)+" и присваиваем ему новое значение " + r +
                   " и кладем обратно в стэк ");
           stackr.pop();
           stackr.push(r);
          System.out.println( " первый элемент , дно стэка индекс 0: "+ stackr.get(0));
           System.out.println( "второй элемент стэка нидекс 1: "+ stackr.push(2));
           System.out.println( "третий элемент стэка индекс 2: "+ stackr.push(3));
           System.out.println( "четвертый элемент стэка индекс 3: "+ stackr.push(4));
           System.out.println( "пятый элемент стэка вершина, индекс 4: "+ stackr.push(5));
           System.out.println("вид стэка с изменённым дном"+ stackr);
           System.out.println("далее меняем вершину удаляем старую "+stackr.pop()+" " +
                   "и ставим новую "+stackr.push(200));

           System.out.println("вид стэка с изменённым дном и вершиной"+ stackr);
           System.out.println("где "+ stackr.peek()+" вершина стэка");
           System.out.println(", а "+ stackr.get(0)+" дно стэка");


       }

}
