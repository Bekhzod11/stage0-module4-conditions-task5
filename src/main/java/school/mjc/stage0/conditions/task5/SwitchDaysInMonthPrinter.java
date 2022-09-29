package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4,6,9,10,12:
                System.out.println(31);
                break;
            default:
                System.out.println("wrong number:");
        };
    }
}
