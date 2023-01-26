package Kaycee.Kim.itopia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Hamburger extends AppCompatActivity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.hamburger);
            Button btn1 = findViewById(R.id.button10);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(Hamburger.this, Mainpage.class);
                    startActivity(it);
                }
            });


            Button btnhistory = findViewById(R.id.button11);

            btnhistory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(Hamburger.this, Historypage.class);
                    startActivity(it);
                }
            });

            Button btnchallenge = findViewById(R.id.button12);

            btnchallenge.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(Hamburger.this, Competition.class);
                    startActivity(it);
                }
            });

            Button btnart = findViewById(R.id.button13);

            btnart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(Hamburger.this, Arttherapy.class);
                    startActivity(it);
                }
            });

            Button btnmusic = findViewById(R.id.button14);
            btnmusic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(Hamburger.this, Musictherapy.class);
                    startActivity(it);
                }
            });

        }
}

