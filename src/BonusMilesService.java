public class BonusMilesService {
    public int calculate(int price, int min) {
        int bonus = price / min;
        return bonus;
    }
}
