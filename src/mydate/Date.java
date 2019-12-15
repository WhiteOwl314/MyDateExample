package mydate;

public class Date {
    //변수 선언
    private int year;
    private int month;
    private int day;

    //일 설정

    public void setDay(int day) {
        //우선 달을 가져옴
        //그 달에 따라서 일수가 달라짐

        if(month < 13 || month >0){
            switch (month){
                case 1 : case 3 : case 5: case 7: case 8 : case 10 : case 12 :
                    if(day < 32 && day>0){
                        this.day = day;
                    } else{
                        System.out.println("올바른 날짜를 입력해주세요.");
                    }
                    break;
                case 2 :
                    if(day < 29 && day>0){
                        this.day = day;
                    } else {
                        System.out.println("올바른 날짜를 입력해주세요.");
                    }
                    break;
                case 4: case 6: case 9:
                    if(day < 31 && day>0){
                        this.day = day;
                    } else {
                        System.out.println("올바른 날짜를 입력해주세요.");
                    }
                    break;
            }
        } else {
            System.out.println("올바른 달을 설정하세요.");
        }
      }

    //일 가져오기
    public int getDay() {
        return day;
    }

    //달 설정
    public void setMonth(int month) {
        if (month <1 || month > 12){
            System.out.println("유효하지 않은 달 입니다.");
        } else {
            this.month = month;
        }
    }

    //달 가져오기
    public int getMonth() {
        return month;
    }

    //년 설정
    public void setYear(int year) {
        this.year = year;
    }

    //년 가져오기
    public int getYear() {
        return year;
    }
}
