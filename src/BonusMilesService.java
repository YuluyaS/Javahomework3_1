public class BonusMilesService {


    public int calculate(int arg) {

        int price = arg; // стоимость билета
        int mile = 20; // количество рублей для одной бонусной мили
        int total; //всего бонусов

        total = price / mile;

        return total;
    }
}
