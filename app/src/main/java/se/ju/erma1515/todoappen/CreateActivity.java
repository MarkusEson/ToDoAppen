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
        System.out.println("CREATE button clicked");

        EditText inputToDoText = (EditText) findViewById(R.id.ToDotextField);
        String enteredTitle = inputToDoText.getText().toString();

        System.out.println(enteredTitle);

        Data.todos.add(new Data.ToDo(enteredTitle));
        System.out.println(Data.todos);
    }


}
