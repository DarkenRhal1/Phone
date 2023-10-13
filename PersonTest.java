package unittwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    @Test

    void personTest() {
        Person name = new Person();
        String whatIsYourName = "Mik";
        String expected = whatIsYourName;
        String actual = name.person("Jake");
        assertEquals(expected, actual);
    }

    @Test

    void ageTest() {
        Person age = new Person();
        int whatIsYourage = 7;
        int expected = whatIsYourage;
        int actual = age.person(5);
        assertEquals(expected, actual);
    }

    @Test

    void personnTest() {
        Person age = new Person();
        String name = "Mik ";
        int whatIsYourage = 7;
        String expected = name + whatIsYourage;
        String actual = age.person("Mik ", 7);
        assertEquals(expected, actual);
    }

    @Test

    void setNameTest() {
        Person setNamee = new Person();
        String name = "Mk";
        setNamee.setName(name);
        String expected = name;
        String actual = "Mk";
        assertEquals(expected, actual, setNamee.getName());

    }

    @Test

    void setAgeTest() {
        Person setAgee = new Person();
        int age = 6;
        setAgee.setAge(age);
        int expected = age;
        int actual = 6;
        assertEquals(expected, actual);
    }


    @Test

    void getNameTest() {
        Person name = new Person();
        String whatIsYourName = "Stone";
        String expected = whatIsYourName;
        String actual = name.getName();
        assertEquals(expected, actual);
    }

    @Test

    void getAgeTest() {
        Person age = new Person();
        Integer whatIsYourName = 12;
        Integer expected = whatIsYourName;
        Integer actual = age.getAge();
        assertEquals(expected, actual);
    }

    @Test

    void addNameTest() {
        Person setNamee = new Person();
        String name = "Ezekiel";
        setNamee.addName(name);
        String expected = name;
        String actual = "Ezekiel";
        assertEquals(expected, actual);

    }

    @Test

    void removeNameTest() {
        Person setNamee = new Person();
        String name = "Stone";
        setNamee.removeName(name);
        String expected = name;
        String actual = "Stone";
        assertEquals(expected, actual);

    }

    @Test

    void getListOfTest() {
        Person list = new Person();
//        list.addName("Stone");
//        list.addName("Cassandra");
//        list.addName("Ezekiel");
        list.getSizeOfList();
        int sizeList = 4;
        list.getSizeOfList();
        int expected = sizeList;
        int actual = 4;
        assertEquals(expected, actual);

    }

}