public class Main042 extends Person{
    public class student{
        public double grade01;
        public double grade02;
        public double averageGrade;

    public double getGrade01(){
        return grade01;
    }
    public void setGrade01(final int grade01){
        this.grade01 = grade01;
    }

    public double getGrade02(){
        return grade02;
    }
    public void setGrade02(final int grade02){
        this.grade02 = grade02;
    }

    public void averageGrade(){
        averageGrade = (grade01 + grade02) / 2;
    }
    public double getAverageGrade(){
        return averageGrade;
    }

    }    
}
