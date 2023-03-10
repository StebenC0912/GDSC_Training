package org.hanu.submit.domain.coder.model;


import org.bson.types.ObjectId;

public class Coder {
    private final ObjectId id;
    private final String name;
    private final int age;

    public Coder(ObjectId id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static Coder create(String name, int age) {
        return new Coder(new ObjectId(), name, age);
    }


    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
