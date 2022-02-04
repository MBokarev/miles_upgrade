public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(1200, 20); // price - цена билета, min - количество рублей для начисления одной бонусной мили
        System.out.println("Ваши бонусы за купленный билет - " + miles + " миль");

    }
}
