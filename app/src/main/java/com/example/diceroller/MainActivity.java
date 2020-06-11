package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
      private ImageView imageViewDicy;
      private ImageView imageViewDicy1;
      private Random myRandomNumber = new Random();
      private Random myRandomNumber1 = new Random();
     // Button button = findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public  void btn(View v){
             rollOurDice();
    }
    private void rollOurDice(){
        imageViewDicy= findViewById(R.id.imageView);
        imageViewDicy1=findViewById(R.id.imageView2);
        int myRanNumber= myRandomNumber.nextInt(6)+1;
        int myRanNumber1 = myRandomNumber1.nextInt(6)+1;
        switch(myRanNumber){
            case 1:
                imageViewDicy.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy.setImageResource(R.drawable.dice6);
                break;
        }
        switch (myRanNumber1){
            case 1:
                imageViewDicy1.setImageResource(R.drawable.dice01);
                break;
            case 2:
                imageViewDicy1.setImageResource(R.drawable.dice02);
                break;
            case 3:
                imageViewDicy1.setImageResource(R.drawable.dice03);
                break;
            case 4:
                imageViewDicy1.setImageResource(R.drawable.dice04);
                break;
            case 5:
                imageViewDicy1.setImageResource(R.drawable.dice05);
                break;
            case 6:
                imageViewDicy1.setImageResource(R.drawable.dice06);
                break;
        }
    }
}
