package se.ju.erma1515.todoappen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create); // initiates the activity_create with the identifyer activity_main
    }

    public void createButtonClicked(View view){

        EditText inputToDoText = (EditText) findViewById(R.id.ToDotextField);   // takes string from the TextBox input
        String enteredTitle = inputToDoText.getText().toString();

        Data.todos.add(new Data.ToDo(enteredTitle)); // adds my Todoitem to the array
        System.out.println(Data.todos);
        finish();
    }


}
