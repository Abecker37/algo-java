package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here
        int[] scores= new int [7];
        scores[0]=1;
        scores[1]=2;
        scores[2]=3;
        scores[3]=4;
        scores[4]=5;
        scores[5]=6;
        scores[6]=7;
        int moyenne=0;
        for(int i=0;i<scores.length; i++) {
            int score1 = scores[i];
            System.out.println(scores + " ");
        }
        System.out.println();
            for(int i=0;i<scores.length; i++){
                moyenne =moyenne+scores[i];

            }

            moyenne=moyenne/scores.length;
        System.out.println("moyenne "+moyenne);

        }
    }

