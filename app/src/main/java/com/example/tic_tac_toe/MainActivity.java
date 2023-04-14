package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int position=0;
    Button btn11,btn12,btn13,btn21,btn22,btn23,btn31,btn32,btn33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn21=findViewById(R.id.btn21);
        btn22=findViewById(R.id.btn22);
        btn23=findViewById(R.id.btn23);
        btn31=findViewById(R.id.btn31);
        btn32=findViewById(R.id.btn32);
        btn33=findViewById(R.id.btn33);



        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn11.getText()==""){
                    btn11.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&&btn11.getText()==""){
                    btn11.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn12.getText()==""){
                    btn12.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&btn12.getText()==""){
                    btn12.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn13.getText()==""){
                    btn13.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&&btn13.getText()==""){
                    btn13.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn21.getText()==""){
                    btn21.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1){
                    btn21.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn22.getText()==""){
                    btn22.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&&btn22.getText()==""){
                    btn22.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn23.getText()==""){
                    btn23.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&&btn23.getText()==""){
                    btn23.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn31.getText()==""){
                    btn31.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&&btn31.getText()==""){
                    btn31.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn32.getText().toString()==""){
                    btn32.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&&btn31.getText().toString()==""){
                    btn32.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0&&btn33.getText().toString()==""){
                    btn33.setText("X");
                    position+=1;
                    checkWinner();
                }
                else if(position==1&&btn33.getText().toString()==""){
                    btn33.setText("O");
                    position-=1;
                    checkWinner();
                }
            }
        });

    }
    private void checkWinner(){
        if(btn11.getText().toString().equals("X")&&btn12.getText().toString().equals("X")&&btn13.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn21.getText().toString().equals("X")&&btn22.getText().toString().equals("X")&&btn23.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn31.getText().toString().equals("X")&&btn32.getText().toString().equals("X")&&btn33.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn11.getText().toString().equals("O")&&btn12.getText().toString().equals("O")&&btn13.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn21.getText().toString().equals("O")&&btn22.getText().toString().equals("O")&&btn23.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn31.getText().toString().equals("O")&&btn32.getText().toString().equals("O")&&btn33.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn11.getText().toString().equals("X")&&btn22.getText().toString().equals("X")&&btn33.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn11.getText().toString().equals("O")&&btn22.getText().toString().equals("O")&&btn33.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn11.getText().toString().equals("X")&&btn21.getText().toString().equals("X")&&btn31.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn12.getText().toString().equals("X")&&btn22.getText().toString().equals("X")&&btn32.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn13.getText().toString().equals("X")&&btn23.getText().toString().equals("X")&&btn33.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn11.getText().toString().equals("O")&&btn21.getText().toString().equals("O")&&btn31.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn12.getText().toString().equals("O")&&btn22.getText().toString().equals("O")&&btn32.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn13.getText().toString().equals("O")&&btn23.getText().toString().equals("O")&&btn33.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn13.getText().toString().equals("X")&&btn22.getText().toString().equals("X")&&btn31.getText().toString().equals("X")){
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }
        else if(btn13.getText().toString().equals("O")&&btn22.getText().toString().equals("O")&&btn31.getText().toString().equals("O")){
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            freezebtn();
        }


    }
    public void freezebtn(){
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn31.setEnabled(false);
        btn32.setEnabled(false);
        btn33.setEnabled(false);
    }
}