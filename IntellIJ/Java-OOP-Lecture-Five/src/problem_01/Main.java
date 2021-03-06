package problem_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer age = Integer.valueOf(scanner.nextLine());

        try {
            Child child = new Child(name, age);
            System.out.println(child.toString());
            String personClassName = Person.class.getSimpleName();
            String childClassName = Child.class.getSimpleName();
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }

    }
}

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }

        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge()));

        return sb.toString();
    }

}

class Child extends Person {

    public Child(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void setAge(Integer age) {
        if (age >= 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }

        super.setAge(age);
    }
}
