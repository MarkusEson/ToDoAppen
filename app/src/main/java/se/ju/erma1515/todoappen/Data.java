package se.ju.erma1515.todoappen;

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;


public class Data {

    public static ArrayList<ToDo> todos = new ArrayList<>();
    static {
        todos.add(new Data.ToDo("ToDo A", "nothing here yet"));
        todos.add(new Data.ToDo("ToDo B", "nothing here yet"));
    }

    public static class ToDo {

        public String title;
        public String description;

        public ToDo(String title, String description) {this.title = title; this.description = description;}


        @Override
        public String toString() { return "Todo: " + title; }
    }
}

