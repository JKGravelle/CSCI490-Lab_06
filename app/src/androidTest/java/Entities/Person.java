package Entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

public class Person {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
