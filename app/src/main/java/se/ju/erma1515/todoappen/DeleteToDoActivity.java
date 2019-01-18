package se.ju.erma1515.todoappen;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;

public class DeleteToDoActivity extends AppCompatActivity {


    // Functions
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
    }

    public void onDeleteButtonClicked(View view) {
        System.out.println("DELETE THIS TODO");

        Integer position = getIntent().getIntExtra("todoIndex", -1);
        Data.ToDo todoToDelete = Data.todos.get(position);

        new AlertDialog.Builder(this).setTitle("Delete this ToDo?").setMessage("Do you really want to delete this ToDo?")
                .setPositiveButton(
                        android.R.string.yes,
                        new DialogInterface().OnClickListener(){
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // delete it
                            }
                        }
                ).setNegativebutton(
                        android.R.string.no,
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // do not delete it
                            }
                        }
                ).show();


    }
}
