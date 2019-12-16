package mydate;

public class MyDateTest {

    public static void main(String[] args) {

        HandlingDate myDate = new MyDate();
        HandlingDate myDate2 = new MyDate();

        myDate.setDate(2019, 12, 31);
        myDate2.setDate(2019,12,31);
        myDate.showDescription();

        MyDate myDateDown = (MyDate) myDate;
        MyDate mydate2Down = (MyDate) myDate2;
        System.out.println(myDateDown.getDate());
        System.out.println(((MyDate) myDate2).getDate());
        System.out.println((myDateDown.getDate() == mydate2Down.getDate()));

        System.out.println(myDate.equals(myDate2));

        System.out.println(myDateDown.getDate());

        }
}
