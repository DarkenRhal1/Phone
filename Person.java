package unittwo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> listOfNames = new ArrayList<>();

    public Person() {
    }

    public String person(String name){
        this.name = name;
        return name;
    }

    public int person(int age){
        return age;
    }

    public String person(String name, int age) {

        return name + age;
    }

    public void setName(String name){
        this.name = name;
        System.out.println(name);

    }

    public void setAge(int age){
        this.age = age;
        System.out.println(age);
    }

    public String getName() {

        return "Stone";
    }

    public Integer getAge() {
        return 12;
    }


    public void addName(String name){
        System.out.println(name);
    }

    public void removeName(String name){
        System.out.println(name);
    }

    public int getSizeOfList(){

        return listOfNames.size();
    }


}
