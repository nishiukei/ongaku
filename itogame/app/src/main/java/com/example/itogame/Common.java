package com.example.itogame;

import android.app.Application;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Common extends Application {

    private List<Integer> q_number = new ArrayList<>();
    private List<String> players = new ArrayList<>();
    private List<List<Integer>> answer = new ArrayList<>();
    private List<Integer> order = new ArrayList<>();
    private int miss = 0;
    private int n = 1;

    public static void set_number(List<Integer> number){
        for(int i = 1; i <= 99; i++) {
            number.add(i);
        }
        Collections.shuffle(number);
    }

    public void onCreate(){
        super.onCreate();
        set_number(q_number);
    }

    public List<Integer> getQ_Number(){
        return q_number;
    }
    public List<String> getPlayers(){
        return players;
    }
    public List<List<Integer>> getAnswer(){
        return answer;
    }
    public List<Integer> getOrder(){
        return order;
    }
    public int getMiss(){
        return miss;
    }
    public int getN(){
        return n;
    }

    public void setPlayers(String player, int n){
        players.set(n, player);
    }
    /**
    public void getAnswer(){
    }
    public void getOrder(){
    }
     */
    public void getMiss(int num){
        miss = miss + num;
    }
    public void getN(int num){
        n = n + num;
    }


}
