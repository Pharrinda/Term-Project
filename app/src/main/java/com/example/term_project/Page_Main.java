package com.example.term_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Page_Main extends AppCompatActivity {

    ImageView img_bot,img_me;
    TextView  scAI,scMe;
    TextView btn_start,btn_rock,btn_scissors,btn_paper,btn_random;

    int SC_me,SC_AI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper);

        img_bot = (ImageView)findViewById(R.id.img_Me);
        img_me = (ImageView)findViewById(R.id.img_bot);
        scAI = (TextView)findViewById(R.id.scAI);
        scMe = (TextView)findViewById(R.id.scMe);

        btn_start = (TextView)findViewById(R.id.btn_start);
        btn_rock = (TextView)findViewById(R.id.btn_rock);
        btn_scissors = (TextView)findViewById(R.id.btn_scissors);
        btn_paper = (TextView)findViewById(R.id.btn_paper);
        btn_random = (TextView)findViewById(R.id.btn_random);

    }

    public void clickStart(View v){
        SC_me = 0;
        SC_AI = 0;
        scMe.setText(" ");
        scAI.setText(" ");
        img_me.setImageResource(0);
        img_bot.setImageResource(0);

    }


    //    ################ Rock ################
    public void clickRock(View v){
        img_me.setImageResource(R.drawable.rock_right);

        Random rand = new Random();
        int rd = rand.nextInt(3);

        if (rd == 0){
            img_bot.setImageResource(R.drawable.rock);
        }
        else if (rd == 1){
            img_bot.setImageResource(R.drawable.scissors);
            SC_me++;
            scMe.setText(""+SC_me);
        }
        else if (rd == 2){
            img_bot.setImageResource(R.drawable.paper);
            SC_AI++;
            scAI.setText(""+SC_AI);
        }
    }


    //    ################ Paper ################
    public void clickPaper(View v){
        img_me.setImageResource(R.drawable.paper_right);

        Random rand = new Random();
        int rd = rand.nextInt(3);

        if (rd == 0){
            img_bot.setImageResource(R.drawable.rock);
            SC_me++;
            scMe.setText(""+SC_me);
        }
        else if (rd == 1){
            img_bot.setImageResource(R.drawable.scissors);
            SC_AI++;
            scAI.setText(""+SC_AI);
        }
        else if (rd == 2){
            img_bot.setImageResource(R.drawable.paper);
        }
    }


    //    ################ Scissors ################
    public void clickScissors(View v){
        img_me.setImageResource(R.drawable.scissors_rigth);

        Random rand = new Random();
        int rd = rand.nextInt(3);

        if (rd == 0){
            img_bot.setImageResource(R.drawable.rock);
            SC_AI++;
            scAI.setText(""+SC_AI);
        }
        else if (rd == 1){
            img_bot.setImageResource(R.drawable.scissors);
        }
        else if (rd == 2){
            img_bot.setImageResource(R.drawable.paper);
            SC_me++;
            scMe.setText(""+SC_me);
        }
    }


    //    ################ Random ################
    public void clickRandom(View v){

        Random rand = new Random();
        int rd = rand.nextInt(3);

        if (rd == 0){
            img_bot.setImageResource(R.drawable.rock);
        }
        else if (rd == 1){
            img_bot.setImageResource(R.drawable.scissors);
        }
        else if (rd == 2){
            img_bot.setImageResource(R.drawable.paper);
        }


//        img_Me
        Random rand2 = new Random();
        int rd2 = rand2.nextInt(3);

        if (rd2 == 0){
            img_me.setImageResource(R.drawable.rock_right);
            if (rd == 0){}
            if (rd == 1){
                SC_me++;
                scMe.setText(""+SC_me);
            }
            if (rd == 2){
                SC_AI++;
                scAI.setText(""+SC_AI);
            }
        }
        else if (rd2 == 1){
            img_me.setImageResource(R.drawable.scissors_rigth);

            if (rd == 0){
                SC_AI++;
                scAI.setText(""+SC_AI);
            }
            if (rd == 1){}
            if (rd == 2){
                SC_me++;
                scMe.setText(SC_me);
            }
        }
        else if (rd2 == 2){
            img_me.setImageResource(R.drawable.paper_right);

            if (rd == 0){
                SC_me++;
                scMe.setText(""+SC_me);
            }
            if (rd == 1){
                SC_AI++;
                scAI.setText(""+SC_AI);
            }
            if (rd == 2){}
        }
    }//close random

}
