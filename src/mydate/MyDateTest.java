package mydate;

public class MyDateTest {

    public static void main(String[] args) {
        Date date = new Date();

        date.setMonth(4);
        date.setDay(31);

        System.out.println(date.getDay() + "일 " + date.getMonth() + "월");
    }
}
