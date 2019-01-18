package se.ju.erma1515.todoappen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // VARIABLES
    static final int PICK_TODO = 0;
    static final int DELETE_TODO = 1;

    // FUNCTIONS

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // initiates the activity_create with the identifyer activity_main
    }

    public void createButtonClicked(View view){

        Intent createIntent = new Intent(this, CreateActivity.class);  // identifies the activity CreateActivity and launches it
        startActivity(createIntent);
    }

    public void selectButtonClicked(View view){

        Intent pickToDoIntent = new Intent(this, PickToDoActivity.class);  // identifies the activity PickToDoActivity and launches it
        startActivityForResult(pickToDoIntent, PICK_TODO);
    }

    public void deleteButtonClicked(View view){

        Intent deleteToDoIntent = new Intent(this, PickToDoActivity.class);  // identifies the activity PickToDoActivity and launches it
        startActivityForResult(deleteToDoIntent, DELETE_TODO);
    }
    @Override


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // Check which request we're responding to
        if (requestCode == PICK_TODO) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {

                System.out.println("VIEW");

                Integer position = data.getIntExtra("todoIndex", -1);

                Intent viewToDointent = new Intent(MainActivity.this, ViewToDoActivity.class);
                viewToDointent.putExtra("todoIndex", position);
                startActivity(viewToDointent);

            }
        }
        if (requestCode == DELETE_TODO) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {

                System.out.println("DELETE");

                Integer position = data.getIntExtra("todoIndex", -1);

                Intent deleteToDointent = new Intent(MainActivity.this, DeleteToDoActivity.class);
                deleteToDointent.putExtra("todoIndex", position);
                startActivity(deleteToDointent);

            }
        }
    }
}
