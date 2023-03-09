package Kaycee.Kim.itopia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Historypage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.historypage);

        Button btnwork = findViewById(R.id.button14);

        btnwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Historypage.this, Portfolio.class);
                startActivity(it);
            }
        });

        Button btnjournal = findViewById(R.id.button16);

        btnjournal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Historypage.this, Journalpage.class);
                startActivity(it);
            }
        });

        Button btnmywork = findViewById(R.id.button14);

        btnmywork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Historypage.this, Portfolio.class);
                startActivity(it);
            }
        });

    }
}