package Kaycee.Kim.itopia;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Competition extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competitionpage);


        Button btnweek = findViewById(R.id.button15);

        btnweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Competition.this);

//dialog title
                builder.setTitle("Challenge of the Week");
//dialog content
                builder.setMessage("Challenge");

//show the dialog
                builder.show();

            }
        });





    }



}