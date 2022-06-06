import ru.netology.CounterSQR;

public class Main {

    public static void main(String[] args) {

        CounterSQR numeric = new CounterSQR();

        int totalCount = numeric.counter(100,400);

        System.out.println("Итоговое число квадратов: " + totalCount);


    }
}
