package com.example.tanvigupta.minesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     private int currentStatus;
        public static final int INCOMPLETE=1;
        public static final int PLAYER_WON=2;
        LinearLayout rootlayout;
        
        public int SIZE = 9;
        public static final int LOST=3;
    public  static int mineCount=0;

    public ArrayList<LinearLayout> rows;
     private MButtons[][] board;

    private int m;//number of rows
        private int n; //number of columns


        private boolean areMinesSet = false;
        private int rowClicked;
        private int colClicked;
        private int noOfMines=0;
        private int[] x = {-1, -1, -1, 0, 0, +1, +1, +1};
        private int[] y = {-1, 0, +1, -1, +1, -1, 0, +1};
        static int count = 4;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);
    rootlayout = findViewById(R.id.rootlayout);


    public void setupBoard() {
        rows = new ArrayList<>();
        board = new MButtons[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1);
            linearLayout.setLayoutParams(layoutParams);
            rootlayout.addView(linearLayout);
            rows.add(linearLayout);
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MButtons button=new MButtons(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1);
                button.setLayoutParams(layoutParams);
                button.setOnClickListener(this);
                LinearLayout row = rows.get(i);
                row.addView(button);
                board[i][j] = button;
                }
        }
        }


    @Override
    public void onClick(View view) {
        

    }



    public static void setMne(MButtons[][] board){
        Random rand = new Random();
        while (mineCount<10){
            int randomi=(int)(rand.nextDouble()*board.length);
            int randomj=(int)(rand.nextDouble()*board[0].length);
            board[randomi][randomj].setText("-1");
            mineCount++;

        }


    }


}

