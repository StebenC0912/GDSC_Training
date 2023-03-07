package org.hanu.submit.domain.coder.model;

import org.bson.types.ObjectId;

public class Coder {
    private ObjectId id;
    private String name;
    private int age;

    public Coder(ObjectId id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static Coder create(String name, int age) {
        return new Coder(ObjectId.get(), name, age);
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
