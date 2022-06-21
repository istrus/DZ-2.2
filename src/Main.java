public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // Первоначальный баланс
        int deposit = 1100; // Сумма пополнения
        int bonus = deposit / 100; // Кол-во бонусных рублей

        int total1 = initialBalance + deposit; // Итоговый счет, если сумма пополнения < 1000 рублей
        int total2 = initialBalance + deposit + bonus; // Итоговый счет, если сумма пополнения > 1000 рублей
        

        if (deposit > 1000) {
            System.out.println("Итоговый счет: " + total2 + " рублей");
            System.out.println("Начислено бонусных рублей: " + bonus);
        } else {
            System.out.println("Итоговый счет: " + total1 + " рублей");
            System.out.println("Начислено бонусных рублей: 0");
        }
    }
}
