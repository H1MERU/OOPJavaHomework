package chap01;

public class PersonalInfo {
    enum SexEnum{
        MALE,
        FEMALE;
    }
    private String name;        //姓名
    private SexEnum sex;        //性别
    private String birthplace;  //籍贯
    private String address;     //住址

    private void PrintInfo(){
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        PersonalInfo Lynn = new PersonalInfo();
        Lynn.name = "林金樱";
        Lynn.sex = SexEnum.FEMALE;
        Lynn.birthplace = "Fujian";
        Lynn.address = "WHU-CS-C7";
        Lynn.PrintInfo();
    }
}
