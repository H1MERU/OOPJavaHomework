package chap01;

public class PersonalInfo {
    enum SexEnum{
        MALE,
        FEMALE;
    }
    private String name;        //����
    private SexEnum sex;        //�Ա�
    private String birthplace;  //����
    private String address;     //סַ

    private void PrintInfo(){
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        PersonalInfo Lynn = new PersonalInfo();
        Lynn.name = "�ֽ�ӣ";
        Lynn.sex = SexEnum.FEMALE;
        Lynn.birthplace = "Fujian";
        Lynn.address = "WHU-CS-C7";
        Lynn.PrintInfo();
    }
}
