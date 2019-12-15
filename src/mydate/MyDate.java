package mydate;

public class MyDate extends Date implements HandlingDate {
    @Override
    public void setDate(int year, int month, int day) {
       setYear(year);
       setMonth(month);
       setDay(day);

    }

    @Override
    public void showDescription() {

        System.out.println("입력된 날짜: " + getYear() + "년 " + getMonth() + "월 " + getDay() + "일 입니다.");
    }
}
