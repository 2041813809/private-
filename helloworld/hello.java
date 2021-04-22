package helloworld;

public class hello {

    String name;

    private int age;
    //private方法只能再本类中使用

    public void setAge(int a){
        if (a<0 || a>150){
            System.out.println("您输入的年龄有误！");
        }else {
            age = a;
            //使用 set变量名 的方法来设置age的值
        }
    }

    private int getAge(){
        return age;
        //使用 get变量名 的方法来获取成员变量的值
    }

    public void homework() {

        System.out.println(name+","+age);
    }
}

