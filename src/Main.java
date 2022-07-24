public class Main {
    public static void main(String[] args) {

        int startCheck = 100; //пополнил счет на 100 рублей
        int startCheck1 = 1000; //пополнил счет на 1000 рублей
        boolean task = true; //условие для получения бонуса

        int percent;
        if (task) {
            percent = 1;
        } else {
            percent = 0;
        }

        int bonus = startCheck1 / 100 * percent;

        if (startCheck1 < 1000) {

            System.out.println("Бонус не получен");
            System.out.println("Итого бонусов:" + (startCheck + startCheck1));

        } else {
            System.out.println("Бонусов получено:" + bonus);
            System.out.println("Итого бонусов:" + (startCheck + startCheck1 + bonus));

        }
    }
}
