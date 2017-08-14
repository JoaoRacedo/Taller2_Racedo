package com.example.usuario.taller2_racedo;

import java.io.Serializable;

/**
 * Created by Usuario on 14/08/2017.
 */

public class Operations implements Serializable{

    int num1, num2, res;
    boolean sumres;

    public Operations(){
        this.num1 = 0;
        this.num2 = 0;
        this.res = 0;
        this.sumres = false;

    }

    public void checkR(){
        if(this.sumres == false){
            this.sumres = true;
        }
    }
    public void Number1(int number){
        this.num1 = this.num1*10 + number;
    }

    public void Number2(int number){
        this.num2 = this.num2*10 + number;;
    }

    public void Sum() {
        this.res = this.num1+this.num2;

    }
    public void Rest() {
        this.res = this.num1-this.num2;
    }

}

