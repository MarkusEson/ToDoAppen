package se.ju.erma1515.todoappen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // initiates the activity_create with the identifyer activity_main
    }

    public void createButtonClicked(View view){
        System.out.println("CREATE button clicked");
        Intent createIntent = new Intent(this, CreateActivity.class);  // identifies the activity CreateActivity and launches it
        startActivity(createIntent);
    }

    public void selectButtonClicked(View view){
        System.out.println("SELECT button clicked");
    }

    public void deleteButtonClicked(View view){
        System.out.println("DELETE button clicked");
    }

}
