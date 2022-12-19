package exp_01;

/**
 *     ������Animal����ֱ�Ӵ����������Ƿ���Ҫ���캯����Ϊʲô��
 *     �����Ƿ���ڴ���Ϊʲô��Ӧ������޸ģ�
 *     ���Duck���ڴ��������ʱ��ϣ��ͬʱָ��Animal��name���Ժ�Duck��size���ԣ�
 * ��ôӦ����α�д���캯������ε��ø���Ĺ��캯����
 *
 * public abstract class Animal{
 *     private String name;
 *     public String getName(){
 *         return name;
 *     }
 *     public Animal(String theName){           1.no need for "public"(dont count as a mistake)
 *         name = theName;
 *     }
 * }
 * public class Duck extends Animal {           2.cannot declare two public class in one file
 *     int size;
 *     public Duck(int newSize){                3.no default constructor available - sol:use"super()", and add a default constructor to class "Animal" visibily
 *         size = newSize;
 *     }
 * }
 *
 * !!!!�޸�����
 *
 */

public abstract class Animal{
    private String name;

    public String getName(){
        return name;
    }

    Animal(){}

    Animal(String newName){
        name = newName;
    }
}

class Duck extends Animal {
    int size;

    Duck(int newSize){
        super();
        size = newSize;
    }

    Duck(int newSize, String newName){
        super(newName);
        size = newSize;
    }
}

