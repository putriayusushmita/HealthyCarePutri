package com.example.healthycare2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MenuActivity extends AppCompatActivity implements  View.OnClickListener {
    public CardView card1,card2,card3,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    @Override
    public void onClick(View v) {
            Intent i;
            switch (v.getId()){
                case R.id.cardOlahraga:
                    i= new Intent(this,OlahragaActivity.class);
                    startActivity(i);
                    break;
                case R.id.cardDiet:
                    i= new Intent(this,DietActivity.class);
                    startActivity(i);
                    break;
                case R.id.cardMakananMinuman:
                    i= new Intent(this,MakananMinumanActivity.class);
                    startActivity(i);
                    break;
                case R.id.cardManajemenWaktu:
                    i= new Intent(this,WaktuActivity.class);
                    startActivity(i);
                    break;
            }
    }

}
