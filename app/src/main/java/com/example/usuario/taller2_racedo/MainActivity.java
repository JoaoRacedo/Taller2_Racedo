package com.example.usuario.taller2_racedo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Operations operations = new Operations();
    TextView show;
    int op = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_main);
        show = (TextView) findViewById(R.id.textView);
    }
//NUMBERS
    //zero
    public void Zero(View view) {
        if(operations.sumres == false){
            operations.Number1(0);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(0);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //one
    public void One(View view) {
        if(operations.sumres == false){
            operations.Number1(1);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(1);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //two
    public void Two(View view) {
        if(operations.sumres == false){
            operations.Number1(2);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(2);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //Three
    public void Three(View view) {
        if(operations.sumres == false){
            operations.Number1(3);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(3);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //Four
    public void Four(View view) {
        if(operations.sumres == false){
            operations.Number1(4);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(4);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //Five
    public void Five(View view) {
        if(operations.sumres == false){
            operations.Number1(5);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(5);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //Six
    public void Six(View view) {
        if(operations.sumres == false){
            operations.Number1(6);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(6);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //Seven
    public void Seven(View view) {
        if(operations.sumres == false){
            operations.Number1(7);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(7);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //Eight
    public void Eight(View view) {
        if(operations.sumres == false){
            operations.Number1(8);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(8);
            show.setText(String.valueOf(operations.num2));
        }
    }
    //Nine
    public void Nine(View view) {
        if(operations.sumres == false){
            operations.Number1(9);
            show.setText(String.valueOf(operations.num1));

        }else{
            operations.Number2(9);
            show.setText(String.valueOf(operations.num2));
        }
    }
//OPERATIONS

    //Sum
    public void Sum(View view) {
        if(operations.sumres == false){
            operations.checkR();
            op = 1;
        }
    }
    //Rest
    public void Rest(View view) {
        if(operations.sumres == false){
            operations.checkR();
            op = 2;
        }
    }
    //Equal
    public void Equal(View view) {
        if(op == 1){
            operations.Sum();
        }else{
            if(op == 2){
                operations.Rest();
            }
        }
        show.setText(String.valueOf(operations.res));
        operations.Number1(0);
        operations.Number2(0);
        op = 0;
    }
}
