import java.util.HashMap;

/*Разработать программу, имитирующую поведение коллекции HashSet.
 В программе содать метод add добавляющий элемент, 
 и метод позволяющий выводить эллементы коллекции в консоль. 
 Формат данных Integer.*/

public class seminar6 {
    private static HashMap <Integer,Object> hMap = new HashMap<>();
    private static final  Object OBJECT = new Object();
    public static void main (String[] args) {
        add(10988);
        add(56890592);
        add(168757);
        add(2743);
        add(11113);
        add(25553);
        add(3443743);
        Print();
        
}
public static void add(Integer numbers) {

    hMap.put(numbers, OBJECT);

}
public static void Print() {
    System.out.println(hMap.keySet());
}


}