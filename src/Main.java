public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // Первоначальный баланс
        int deposit = 1100; // Сумма пополнения
        int bonus = deposit / 100; // Кол-во бонусных рублей

        int total; // Итоговый счет

        if (deposit > 1000) {
            total = initialBalance + deposit + bonus;
        } else {
            total = initialBalance + deposit;
        }


        System.out.println("Итоговый счет: " + total + " рублей");

        if (deposit > 1000) {
            ;
            System.out.println("Начислено бонусных рублей: " + bonus);
        } else {
            System.out.println("Начислено бонусных рублей: 0");
        }
    }
}
