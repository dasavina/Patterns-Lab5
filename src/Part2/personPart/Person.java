package Part2.personPart;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;
    private String gender;
    private GenericList<Person> friends;
    private GenericList<Person> enemies;
    private GenericList<String> tasks;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = new GenericList<>();
        this.enemies = new GenericList<>();
        this.tasks = new GenericList<>();
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Friends: " + this.friends.getList());
        System.out.println("Enemies: " + this.enemies.getList());
        System.out.println("Tasks: " + this.tasks.getList());
    }

    public ArrayList<Person> getFriends() {
        return friends.getList();
    }

    public ArrayList<Person> getEnemies() {
        return enemies.getList();
    }

    public ArrayList<String> getTasks() {
        return tasks.getList();
    }
}

