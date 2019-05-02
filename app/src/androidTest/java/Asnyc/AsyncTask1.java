package Asnyc;

import android.os.AsyncTask;

import Database.LabDatabase;
import Entities.Person;

public class AsyncTask1 extends AsyncTask {
    LabDatabase database;
    Person person;
    public AsyncTask1(LabDatabase database, Person person){
        this.database = database;
        this.person = person;
    }
    @Override
    protected Object doInBackground(Object[] objects) {
        database.personDao().insertPerson(person);
        return null;
    }
}
