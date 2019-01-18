package se.ju.erma1515.todoappen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PickToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picktodo);


        // DISPLAYS TODOS IN LISTVIEW
        ListView listView = (ListView) findViewById(R.id.listview_todo);
        listView.setAdapter(new ArrayAdapter<Data.ToDo>(
            this,
            android.R.layout.simple_list_item_1,
            Data.todos
        ));


        // SELECTS TODOS CLICKED ON BY GETTING POSITION CLICKED
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            // ON ITEM CLICKED
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent resultIntent = new Intent();                                                 // create intent to send back the position clicked
                resultIntent.putExtra("todoIndex", position);
                setResult(RESULT_OK, resultIntent);                                                 // send back result code and the intent with the position clicked
                finish();
            }
        });
    }
}
