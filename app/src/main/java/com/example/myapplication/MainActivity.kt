package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var attempt = 1;
    private var xScore = 0;
    private var oScore = 0;
    private lateinit var b1: Button;
    private lateinit var b2: Button;
    private lateinit var b3: Button;
    private lateinit var b4: Button;
    private lateinit var b5: Button;
    private lateinit var b6: Button;
    private lateinit var b7: Button;
    private lateinit var b8: Button;
    private lateinit var b9: Button;
    private lateinit var resetBtn: Button;
    private lateinit var scoreBtn: Button;
    private lateinit var scoreTV: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        resetBtn = findViewById(R.id.reset);
        scoreBtn = findViewById(R.id.getScore);

        b1.setOnClickListener{
            if (attempt == 1) {
                b1.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b1.setText("O")
                attempt =1;
            }
        }
        b2.setOnClickListener{
            if (attempt == 1) {
                b2.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b2.setText("O")
                attempt =1;
            }
        }
        b3.setOnClickListener{
            if (attempt == 1) {
                b3.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b3.setText("O")
                attempt =1;
            }
        }
        b4.setOnClickListener{
            if (attempt == 1) {
                b4.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b4.setText("O")
                attempt =1;
            }
        }
        b5.setOnClickListener{
            if (attempt == 1) {
                b5.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b5.setText("O")
                attempt =1;
            }
        }
        b6.setOnClickListener{
            if (attempt == 1) {
                b6.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b6.setText("O")
                attempt =1;
            }
        }
        b7.setOnClickListener{
            if (attempt == 1) {
                b7.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b7.setText("O")
                attempt =1;
            }
        }
        b8.setOnClickListener{
            if (attempt == 1) {
                b8.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b8.setText("O")
                attempt =1;
            }
        }
        b9.setOnClickListener{
            if (attempt == 1) {
                b9.setText("X");
                attempt =2;
            }
            else if (attempt == 2) {
                b9.setText("O")
                attempt =1;
            }
        }
        resetBtn.setOnClickListener{
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            xScore = 0;
            oScore = 0;
            attempt = 1;
        }
        scoreBtn.setOnClickListener{
            calScore();
            displayWin();
        }
    }

    fun calScore(){

        //Horizontal
        if (b1.text == "X" && b2.text == "X" && b3.text == "X") {
            xScore += 1;
        }
        if (b1.text == "O" && b2.text == "O" && b3.text == "O") {
            oScore += 1;
        }
        if (b4.text == "X" && b5.text == "X" && b6.text == "X") {
            xScore += 1;
        }
        if (b4.text == "O" && b5.text == "O" && b6.text == "O") {
            oScore += 1;
        }
        if (b7.text == "X" && b8.text == "X" && b9.text == "X") {
            xScore += 1;
        }
        if (b7.text == "O" && b8.text == "O" && b9.text == "O") {
            oScore += 1;
        }

        //Vertical
        if (b1.text == "X" && b4.text == "X" && b7.text == "X") {
            xScore += 1;
        }
        if (b1.text == "O" && b4.text == "O" && b7.text == "O") {
            oScore += 1;
        }
        if (b2.text == "X" && b5.text == "X" && b8.text == "X") {
            xScore += 1;
        }
        if (b2.text == "O" && b5.text == "O" && b8.text == "O") {
            oScore += 1;
        }
        if (b3.text == "X" && b6.text == "X" && b9.text == "X") {
            xScore += 1;
        }
        if (b3.text == "O" && b6.text == "O" && b9.text == "O") {
            oScore += 1;
        }

        // /
        if (b1.text == "X" && b5.text == "X" && b9.text == "X") {
            xScore += 1;
        }
        if (b1.text == "O" && b5.text == "O" && b9.text == "O") {
            oScore += 1;
        }

        // \
        if (b7.text == "X" && b5.text == "X" && b3.text == "X") {
            xScore += 1;
        }
        if (b7.text == "O" && b5.text == "O" && b3.text == "O") {
            oScore += 1;
        }
    }

    fun displayWin() {
        scoreTV = findViewById(R.id.scoreTV);
        if (xScore > oScore) {
            scoreTV.setText("X is Winning!!!");
        }
        else if (xScore < oScore) {
            scoreTV.setText("O is Winning!!!");
        }
        else {
            scoreTV.setText("Game is Tie");
        }
    }
}