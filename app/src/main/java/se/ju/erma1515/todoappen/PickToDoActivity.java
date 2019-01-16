package se.ju.erma1515.todoappen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PickToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picktodo);

        ListView listView = (ListView) findViewById(R.id.ToDoListView);
        listView.setAdapter(new ArrayAdapter<Data.ToDo>(
            this,
            android.R.layout.simple_list_item_1,
            Data.todos
        ));

    }
}
