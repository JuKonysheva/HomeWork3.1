public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int miles = service.calculate(14_000);

        System.out.println("Бонусные мили: " + miles);


    }
}