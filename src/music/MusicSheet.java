package music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import people.musicians.Musician;

public class MusicSheet implements Composition{
    String Piece;
    String cadence;
    int numnotes;
    int numscore = 0;
    int numscore1 =0;
    public MusicScore[] array1;
    public MusicScore[] array2;
    public MusicScore[] array3;
    private MusicScore[] arrayofscore;
    public MusicScore[] array4;
    public MusicScore[] array5;
    public MusicScore[] array6;
    public MusicScore[] array7;
    public MusicScore[] array8;
    public MusicScore[] array9;
    public MusicScore[] array10;
    public MusicScore[] array11;
    public MusicScore[] array12;
    public MusicScore[] array13;
    public MusicScore[] array14;
    public MusicScore[] array15;
    public MusicScore[] array16;
    public List<MusicScore> all;
    public MusicSheet(String name, String tempo, int length){
        Piece = name;
        cadence = tempo;
        numnotes = length;



    }

    public String getName(){
        return Piece;
    }




    public int getNoteLength(){
        
        if(cadence.equals("Larghissimo")){
            return 500;
            
        }
        if(cadence.equals("Lento")){
            return 350;
            
        }
        if(cadence.equals("Andante")){
            return 250;
            
        }
        if(cadence.equals("Moderato")){
            return 175;
            
        }
        if(cadence.equals("Allegro")){
            return 125;
            
        }
        if(cadence.equals("Presto")){
            return 75;
            
        }
        else{
            System.out.println("Cadence value wrong:");
            return 10000;
        }
    }

    public void addScore(String instrumentName, List<String> notes, boolean soft){
        try{
            numscore = numscore+1;
            //System.out.println("hello");
            // in hindsight should have used switch statement
            
            arrayofscore = new MusicScore[notes.size()];
            for(int m =0; m<notes.size(); m++){
                if(notes.get(m).equals("A0")){
                    int[] Azero = {21};
                    MusicScore A0 = new MusicScore(instrumentName, Azero, soft);
                    arrayofscore[m] = A0;
                    //System.out.println(arrayofscore[m].getNotes()[m]);
                }
                if(notes.get(m).equals("B0")){
                    int[] Bzero = {23};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C1")){
                    int[] Bzero = {24};
                    MusicScore C1 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = C1;
                    
                }
                if(notes.get(m).equals("D1")){
                    int[] Bzero = {26};
                    MusicScore D1 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = D1;
                    
                }
                if(notes.get(m).equals("E1")){
                    int[] Bzero = {28};
                    MusicScore E1 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = E1;
                    
                }
                if(notes.get(m).equals("F1")){
                    int[] Bzero = {29};
                    MusicScore F1 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = F1;
                    
                }
                if(notes.get(m).equals("G1")){
                    int[] Bzero = {31};
                    MusicScore G1 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = G1;
                    
                }
                if(notes.get(m).equals("A1")){
                    int[] Bzero = {33};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("B1")){
                    int[] Bzero = {35};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C2")){
                    int[] Bzero = {36};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("D2")){
                    int[] Bzero = {38};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("E2")){
                    int[] Bzero = {40};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("F2")){
                    int[] Bzero = {41};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("G2")){
                    int[] Bzero = {43};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("A2")){
                    int[] Bzero = {45};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("B2")){
                    int[] Bzero = {47};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C3")){
                    int[] Bzero = {48};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("D3")){
                    int[] Bzero = {50};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("E3")){
                    int[] Bzero = {52};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("F3")){
                    int[] Bzero = {53};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("G3")){
                    int[] Bzero = {55};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("A3")){
                    int[] Bzero = {57};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("B3")){
                    int[] Bzero = {59};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C4")){
                    int[] Bzero = {60};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("D4")){
                    int[] Bzero = {62};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("E4")){
                    int[] Bzero = {64};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("F4")){
                    int[] Bzero = {65};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    //System.out.println(B0.getInstrumentID());
                    
                }
                if(notes.get(m).equals("G4")){
                    int[] Bzero = {67};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("A4")){
                    int[] Bzero = {69};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("B4")){
                    int[] Bzero = {71};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C5")){
                    int[] Bzero = {72};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("D5")){
                    int[] Bzero = {74};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("E5")){
                    int[] Bzero = {76};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("F5")){
                    int[] Bzero = {77};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("G5")){
                    int[] Bzero = {79};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("A5")){
                    int[] Bzero = {81};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("B5")){
                    int[] Bzero = {83};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C6")){
                    int[] Bzero = {84};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("none")){
                    int[] Bzero = {0};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Db3")){
                    int[] Bzero = {49};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Eb3")){
                    int[] Bzero = {51};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Gb3")){
                    int[] Bzero = {54};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Ab3")){
                    int[] Bzero = {56};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Bb3")){
                    int[] Bzero = {58};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Db4")){
                    int[] Bzero = {61};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Eb4")){
                    int[] Bzero = {63};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Gb4")){
                    int[] Bzero = {66};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Ab4")){
                    int[] Bzero = {68};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Bb4")){
                    int[] Bzero = {70};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Db5")){
                    int[] Bzero = {73};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Eb5")){
                    int[] Bzero = {75};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Gb5")){
                    int[] Bzero = {78};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Ab5")){
                    int[] Bzero = {80};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Bb5")){
                    int[] Bzero = {82};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("Db6")){
                    int[] Bzero = {85};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("F#3")){
                    int[] Bzero = {54};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("G#3")){
                    int[] Bzero = {56};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("A#3")){
                    int[] Bzero = {58};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C#4")){
                    int[] Bzero = {61};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("D#4")){
                    int[] Bzero = {63};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("F#4")){
                    int[] Bzero = {66};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("G#4")){
                    int[] Bzero = {68};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("A#4")){
                    int[] Bzero = {70};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C#3")){
                    int[] Bzero = {49};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("D#3")){
                    int[] Bzero = {51};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C#5")){
                    int[] Bzero = {73};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("D#5")){
                    int[] Bzero = {75};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("F#5")){
                    int[] Bzero = {78};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("G#5")){
                    int[] Bzero = {80};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("A#5")){
                    int[] Bzero = {82};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
                if(notes.get(m).equals("C#6")){
                    int[] Bzero = {85};
                    MusicScore B0 = new MusicScore(instrumentName, Bzero, soft);
                    arrayofscore[m] = B0;
                    
                }
            

            }
            if(numscore==1){
                //int[] rr = new int[33];
                //all.add(new MusicScore("Violin", rr, false));
                //System.out.println(all.size());
                array1 = arrayofscore;
                
                
                

            }
            if(numscore==2){
                //all.add(arrayofscore);
                //System.out.println(all.size()+"when numscore is 2");
                array2 = new MusicScore[array1.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array1.length; w++){
                    array2[w] = array1[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array2[f+c] = arrayofscore[c];
    
                }
                

                
                
                
            }
            if(numscore==3){
                array3 = new MusicScore[array2.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array2.length; w++){
                    array3[w] = array2[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array3[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==4){
                array4 = new MusicScore[array3.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array3.length; w++){
                    array4[w] = array3[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array4[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==5){
                array5 = new MusicScore[array4.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array4.length; w++){
                    array5[w] = array4[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array5[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==6){
                array6 = new MusicScore[array5.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array5.length; w++){
                    array6[w] = array5[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array6[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==7){
                array7 = new MusicScore[array6.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array6.length; w++){
                    array7[w] = array6[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array7[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==8){
                array8 = new MusicScore[array7.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array7.length; w++){
                    array8[w] = array7[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array8[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==9){
                array9 = new MusicScore[array8.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array8.length; w++){
                    array9[w] = array8[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array9[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==10){
                array10 = new MusicScore[array9.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array9.length; w++){
                    array10[w] = array9[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array10[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==11){
                array11 = new MusicScore[array10.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array10.length; w++){
                    array11[w] = array10[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array11[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==12){
                array12 = new MusicScore[array11.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array11.length; w++){
                    array12[w] = array11[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array12[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==13){
                array13 = new MusicScore[array12.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array12.length; w++){
                    array13[w] = array12[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array13[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==14){
                array14 = new MusicScore[array13.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array13.length; w++){
                    array14[w] = array13[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array14[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==15){
                array15 = new MusicScore[array14.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array14.length; w++){
                    array15[w] = array14[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array15[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore==16){
                array16 = new MusicScore[array15.length+arrayofscore.length];
                int f = 0;
                for(int w = 0; w<array15.length; w++){
                    array16[w] = array15[w];
                    f = f +1;
                }
                for(int c = 0; c<arrayofscore.length; c++){
                    array16[f+c] = arrayofscore[c];
    
                }
                
                
                
            }
            if(numscore>16){
                System.out.println("You have more than 16 scores: can't be performed at the same time, so first 16 will be performed! ");
                
                
                
            }

            

        }
        catch(Exception e){
            System.out.println("addScore method not working as intended -- MusicSheet");
        }
        
    }

    public int getLength(){
        return numnotes;
    }

    public MusicScore[] getScores(){
        //return arrayofscore
        //System.out.println("here!");
        //System.out.println(numscore);
        if(numscore==1){
            
            return array1;
            
        }
        if(numscore==2){
            
            
            return array2;
        }
        if(numscore==3){
            return array3;  
        }
        if(numscore==4){
            return array4;  
        }
        if(numscore==5){
            return array5;  
        }
        if(numscore==6){
            return array6;  
        }
        if(numscore==7){
            return array7;  
        }
        if(numscore==8){
            return array8;  
        }
        if(numscore==9){
            return array9;  
        }
        if(numscore==10){
            return array10;  
        }
        if(numscore==11){
            return array11;  
        }
        if(numscore==12){
            return array12;  
        }
        if(numscore==13){
            return array13;  
        }
        if(numscore==14){
            return array14;  
        }
        if(numscore==15){
            return array3;  
        }
        if(numscore==16){
            return array16;  
        }
        else{
            System.out.println("Tried to register more than 16 scores per piece!, Musicians can't play 2 scores at the same time:");
            return array16;
            
            
        }

    }





}
