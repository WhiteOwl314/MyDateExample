package mydate;

public class MyDate extends Date implements HandlingDate {
    public String getDate() {
        if (getYear() != 0 && getMonth() != 0 && getDay() != 0) {
            return (getYear() + "년 " + getMonth() + "월 " + getDay() + "일");
        } else{
            return "ERROR";
        }
    }
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

    @Override
    public boolean equals(Object obj) {
        MyDate objDown = (MyDate) obj;
        MyDate thisDown = (MyDate) this;
        if(getDate() != "ERROR") {
            if(this.getDate() == ((MyDate) obj).getDate()){
                return true;
            } else {
                return false;
            }
        } else{
            return false;
        }
    }
}
