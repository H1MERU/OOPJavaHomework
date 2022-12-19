package exp_01;

/**
 *     抽象类Animal不会直接创建出对象，是否还需要构造函数，为什么？
 *     代码是否存在错误，为什么，应该如何修改？
 *     如果Duck类在创建其对象时，希望同时指定Animal的name属性和Duck的size属性，
 * 那么应该如何编写构造函数，如何调用父类的构造函数？
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
 * !!!!修改如下
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

