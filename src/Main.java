public class Main {

    public static void main(String[] args) {

        int balance = 1000; // Количество денег на текущем счёте (переменная)
        int refill = 400; // сумма пополнения (переменная)
        int bonuses = (refill - 1000) / 100; // количество бонусных рублей (результат)
        int total = balance + refill + bonuses; // итоговый счёт (результат)


        if (refill > 1000) {
            System.out.println("Количество бонусных рублей: " + bonuses);
            System.out.println("Итого на счете: " + total);
        } else {
            System.out.println("Количество бонусных рублей: " + 0);
            System.out.println("Итого на счете: " + (balance + refill));
        }


    }
}



