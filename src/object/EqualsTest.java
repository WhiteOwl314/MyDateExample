package object;

class Student {
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){

            Student std = (Student)obj;
            return (this.studentNum == std.studentNum);
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return studentNum;
    }



}

public class EqualsTest{

    public static void main (String [] arg){

        Student Lee = new Student(100, "이순신");
        Student Lee2 = Lee;
        Student Shin = new Student(100, "이순신");

        System.out.println(Lee == Lee2); //같은 주소
        System.out.println(Lee == Shin); //다른 주소
        System.out.println(Lee.equals(Shin));

        System.out.println(Lee.hashCode());
        System.out.println(Shin.hashCode());

        Integer i1 = 101;
        Integer i2 = 101;

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
    }
}
