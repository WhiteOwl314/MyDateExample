package mydate;

public class MyDate extends Date implements HandlingDate {
    public int getDate() {
        if (getYear() != 0 && getMonth() != 0 && getDay() != 0) {
            return (getYear()*10000 + getMonth()*100 + getDay());
        } else{
            return 0;
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
        if(getDate() != 0 ) {
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
