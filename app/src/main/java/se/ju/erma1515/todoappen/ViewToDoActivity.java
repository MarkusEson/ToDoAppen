package se.ju.erma1515.todoappen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;


public class ViewToDoActivity extends AppCompatActivity {

    // Outlets + Views

    // Variables


    // Functions
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewtodo);

        TextView ToDoTextView = findViewById(R.id.task_todo_title); // initiate textview

        Integer position = getIntent().getIntExtra("todoIndex", -1);    // gets the position from the intent extra
        Data.ToDo todoToPrint = Data.todos.get(position);   // gets the text from the ToDoo with the help from the position
        ToDoTextView.setText(todoToPrint.title);
    }
}

