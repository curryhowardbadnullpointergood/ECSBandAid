import music.Composition;
import music.MusicSheet;
import people.conductors.Conductor;
import people.musicians.Cellist;
import people.musicians.Musician;
import people.musicians.Pianist;
import people.musicians.Violinist;
import utils.SoundSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ECSBandAid {
    SoundSystem soundSystem;
    public Musician[] ListofMusicians;
    public Musician[] InvitedMusicianList;
    public List<Musician> invitedmusic = new ArrayList<Musician>();
    public Composition[] ListofPieces;
    public int val = 0;
    
    
    public List<String> violinmusicians = new ArrayList<String>();
    public ECSBandAid(SoundSystem Sound, Musician[] World, Composition[] Songs){
        soundSystem = Sound;
        ListofMusicians = World;
        ListofPieces = Songs;
     
        
        

    }

    public void InviteMuscican(String name){
        // works System.out.println("Val dhould be 0: "+ val);
        // works System.out.println("Does this work! ");
        // method works as intended
        if(val<16){
            
            for(int y=0; y<ListofMusicians.length; y++){
                //System.out.println(ListofMusicians[y].getName());
                if(ListofMusicians[y].getName1().equals(name)){
                    
                    invitedmusic.add(ListofMusicians[y]);
                    //System.out.println(ListofMusicians[y].getName());
                    val = val+1;
                }
            }
            
            
        }
        else{
            System.out.println("More than 16 musicians have been invited! No space left!");
        }
        
    }

    public void performForAYear(){
        // randomly choosing compositions:
        //System.out.println("Does performfor a year start?");
        Random Songsplaying = new Random();
        int[] numm = new int[3];
        for(int l = 0; l<3; l++){
            //System.out.println("Does this print 3 times?");
            //System.out.println(l);
            int ki = Songsplaying.nextInt(ListofPieces.length);
            //System.out.println("This random numb should occur 3 times:"+ ki);
            numm[l] = ki;
            //numm.add(ki);
            //System.out.println("Check if same as ki: " + numm[l]);
        }
        // now numm will have 3 random numbers in it, which will be the three compositions that are to be played
        //System.out.println("here!");
        // only invited musicians: 
        // am going to registed all invited musicians with the conductor:
        Conductor Toscanini = new Conductor("Toscanini", soundSystem);
        // works System.out.println("Do we get here?");
        // He is a famous conductor, theres a very funny video of him on youtube :)
        //System.out.println("here!");
        for(int v = 0; v<invitedmusic.size(); v++){
            // works System.out.println(invitedmusic.size());
            Toscanini.registerMusician(invitedmusic.get(v));
            //System.out.println(invitedmusic.get(v));
            // registeres the invited musicians into the orchestra:
        }
        // performing the chosen compositions:
        //System.out.println("here!");
        for(int d = 0; d<3; d++){
            // works System.out.println(d);
            // plays all3 pieces!
            //System.out.println("name of music is: "+ ListofPieces[numm[d]].getName());
            Toscanini.playComposition(ListofPieces[numm[d]]);
        
        }
        //System.out.println("here!");
        // end of the performance each musician has  a 50% chance to be kciked from the orchestra for bad performace by Toscanini :)
        // so half of the invited musican list must be gone
        // have made a method that removed muscians from the conductor 
        Random KickedorNot = new Random();
        int Fate;
        // works System.out.println("Does code reach this point?");
        for(int r = 0; r<invitedmusic.size(); r++){
            Fate = KickedorNot.nextInt(2);
            //System.out.println("This is fate: "+ Fate);
            if(Fate==0){
                // bad luck
                Toscanini.kickMusician(invitedmusic.get(r));

            }
            if(Fate ==1){
                // good luck for thr musician lol
            }

        }

    }

 

    public static void main(String[] args){

        try{
            // agrs[0] is musicians config file
            // args[1] is compositions config file
            // args[2] is the number of uears to perform, will convert to int later on 
            //String [] args1 = {"musicians.txt","compositions.txt" };
            //System.out.println("works");
            BufferedReader readingmusiciansfile = new BufferedReader(new FileReader(args[0]));
            BufferedReader readingcompositionsfile = new BufferedReader(new FileReader(args[1]));
            String lineoftxtmusicians;
            String lineoftxtcompositions;
            SoundSystem SoundSYS = new SoundSystem();
            int linesinmusicianfile =0;
            int sheets = 0;
            int count = 0;
         
            
            while((lineoftxtmusicians = readingmusiciansfile.readLine()) != null){
                linesinmusicianfile = linesinmusicianfile +1;

            }
            //System.out.println(linesinmusicianfile);
            BufferedReader readingmusiciansfile1 = new BufferedReader(new FileReader(args[0]));
            
            // makes an array to accomodate all musicians
            Musician[] Musiciansinfilearray = new Musician[linesinmusicianfile];



            for(int t =0; t<linesinmusicianfile; t++){
                
                //System.out.println(lineoftxtmusicians);
                lineoftxtmusicians = readingmusiciansfile1.readLine();
                String[] Linearr = lineoftxtmusicians.split("\\(");
                String Name = Linearr[0];
                String[] mewtwo = Linearr[1].split("\\)");
                //System.out.println("--"+Name+"--");
                //System.out.println(mewtwo[0]);
                if(mewtwo[0].equals("Violin")){
                    Musiciansinfilearray[t] = new Violinist(Name, SoundSYS);
                    
                    //System.out.println(Musiciansinfilearray[t]);
                }
                if(mewtwo[0].equals("Cello")){
                    Musiciansinfilearray[t] = new Cellist(Name, SoundSYS);
                    
                    //System.out.println(Musiciansinfilearray[t]);
                }
                if(mewtwo[0].equals("Piano")){
                    Musiciansinfilearray[t] = new Pianist(Name, SoundSYS);
                    
                    //System.out.println(Musiciansinfilearray[t]);
                }
                
                //ArrayFlashCard.add(new FlashCard(Question, Answer));
                

            }
            while((lineoftxtcompositions = readingcompositionsfile.readLine()) != null){
        
                //System.out.println(lineoftxtcompositions);
                String[] threeparam = lineoftxtcompositions.split(" ");
                //System.out.println(threeparam[0]);
                if(threeparam[0].equals("Name:")){
                    sheets = sheets +1;
                }
            }
            //System.out.println("Number of songs in file: "+ sheets);
            MusicSheet[] arrayofcompositionsfromfile = new MusicSheet[sheets];
            String[] Nameofsongsarray = new String[sheets];
            String[] Tempoofsongsarray = new String[sheets];
            Integer[] Lengthofsongsarray = new Integer[sheets];

            BufferedReader readingcompositionsfile1 = new BufferedReader(new FileReader(args[1]));


            while((lineoftxtcompositions = readingcompositionsfile1.readLine()) != null){
        
                //System.out.println(lineoftxtcompositions);
                String[] threeparam = lineoftxtcompositions.split(" ");
                threeparam[0] = threeparam[0].trim();
                //System.out.println(threeparam[0]);
                if(threeparam[0].equals("Name:")){
                    String[] nameofpie = lineoftxtcompositions.split(":");
                    //System.out.println("Names of pieces: "+ nameofpie[1]);
                    Nameofsongsarray[count] = nameofpie[1];
                }
                if(threeparam[0].equals("Tempo:")){
                    String[] nameofpie = lineoftxtcompositions.split(":");
                    //System.out.println("Tempo of pieces:"+ nameofpie[1]);
                    Tempoofsongsarray[count] = nameofpie[1].trim();
                    //System.out.println(Tempoofsongsarray[count]);
                }
                if(threeparam[0].equals("Length:")){
                    String[] nameofpie = lineoftxtcompositions.split(":");
                    //System.out.println("Length of pieces: "+ nameofpie[1]);
                    // need to convert from string to integer
                    String x = nameofpie[1];
                    String[] len = x.split(" ");
                    //System.out.println("--"+len[1]+"--");
                    int h = Integer.parseInt(len[1]);
                    //System.out.println(h);
                    Lengthofsongsarray[count] = h;
                    //System.out.println(count+" :before end:");
                    MusicSheet songsfromfile = new MusicSheet(Nameofsongsarray[count], Tempoofsongsarray[count], Lengthofsongsarray[count]);
                    arrayofcompositionsfromfile[count] = songsfromfile;
                    //System.out.println(arrayofcompositionsfromfile[count]);
                    count = count+1;
                    //System.out.println(count+" :after end:");
                    
                }
                if(threeparam[0].equals("Violin,")){
                    //System.out.println("Violin are part of music!"+ arrayofcompositionsfromfile[count-1]);
                    String[] softornot = threeparam[1].split(",");
                    //System.out.println("--"+softornot[0]+"--");
                    //System.out.println(threeparam[2]);
                    String[] notescomposition = lineoftxtcompositions.split("\\{");
                    String[] notescomposition1 = notescomposition[1].split("\\}");
                    //System.out.println("score: "+notescomposition1[0]);
                    String[] mimi = notescomposition1[0].split(",");
                    String[] allnotesinsong = new String[Lengthofsongsarray[count-1]]; 
                    String[] dl = new String[Lengthofsongsarray[count-1]];
                    for(int h=0; h<Lengthofsongsarray[count-1]; h++){
                        //System.out.println("notes:"+ mimi[h]);
                        dl[h] = mimi[h].trim();
                        //System.out.println("notes:"+dl[h]);
                        allnotesinsong[h] = dl[h];
                        //System.out.println(allnotesinsong[h]);
                        
                    }
                    boolean soft4;
                    if(softornot[0].equals("soft")){
                        soft4 = true;

                    }
                    else{
                        soft4 = false;
                    }
                    
                    arrayofcompositionsfromfile[count-1].addScore("Violin", Arrays.asList(allnotesinsong), soft4);
                    //String nam =arrayofcompositionsfromfile[count-1].getName();
                    //System.out.println(nam);
                    

                }
                if(threeparam[0].equals("Piano,")){
                    //System.out.println("Violin are part of music!"+ arrayofcompositionsfromfile[count-1]);
                    String[] softornot = threeparam[1].split(",");
                    //System.out.println("--"+softornot[0]+"--");
                    //System.out.println(threeparam[2]);
                    String[] notescomposition = lineoftxtcompositions.split("\\{");
                    String[] notescomposition1 = notescomposition[1].split("\\}");
                    //System.out.println("score: "+notescomposition1[0]);
                    String[] mimi = notescomposition1[0].split(",");
                    String[] allnotesinsong = new String[Lengthofsongsarray[count-1]]; 
                    String[] dl = new String[Lengthofsongsarray[count-1]];
                    for(int h=0; h<Lengthofsongsarray[count-1]; h++){
                        //System.out.println("notes:"+ mimi[h]);
                        dl[h] = mimi[h].trim();
                        //System.out.println("notes:"+dl[h]);
                        allnotesinsong[h] = dl[h];
                        //System.out.println(allnotesinsong[h]);
                        
                    }
                    boolean soft4;
                    if(softornot[0].equals("soft")){
                        soft4 = true;

                    }
                    else{
                        soft4 = false;
                    }
                    
                    arrayofcompositionsfromfile[count-1].addScore("Piano", Arrays.asList(allnotesinsong), soft4);
                    //String nam =arrayofcompositionsfromfile[count-1].getName();
                    //System.out.println(nam);
                    

                }
                if(threeparam[0].equals("Cello,")){
                    //System.out.println("Violin are part of music!"+ arrayofcompositionsfromfile[count-1]);
                    String[] softornot = threeparam[1].split(",");
                    //System.out.println("--"+softornot[0]+"--");
                    //System.out.println(threeparam[2]);
                    String[] notescomposition = lineoftxtcompositions.split("\\{");
                    String[] notescomposition1 = notescomposition[1].split("\\}");
                    //System.out.println("score: "+notescomposition1[0]);
                    String[] mimi = notescomposition1[0].split(",");
                    String[] allnotesinsong = new String[Lengthofsongsarray[count-1]]; 
                    String[] dl = new String[Lengthofsongsarray[count-1]];
                    for(int h=0; h<Lengthofsongsarray[count-1]; h++){
                        //System.out.println("notes:"+ mimi[h]);
                        dl[h] = mimi[h].trim();
                        //System.out.println("notes:"+dl[h]);
                        allnotesinsong[h] = dl[h];
                        //System.out.println(allnotesinsong[h]);
                        
                    }
                    boolean soft4;
                    if(softornot[0].equals("soft")){
                        soft4 = true;

                    }
                    else{
                        soft4 = false;
                    }
                    
                    arrayofcompositionsfromfile[count-1].addScore("Cello", Arrays.asList(allnotesinsong), soft4);
                    //String nam =arrayofcompositionsfromfile[count-1].getName();
                    //System.out.println(nam);
                    

                }
             
                
            }
            
            readingmusiciansfile.close();
            readingmusiciansfile1.close();
            readingcompositionsfile.close();
            readingcompositionsfile1.close();
            ECSBandAid Ashwin = new ECSBandAid(SoundSYS, Musiciansinfilearray, arrayofcompositionsfromfile);
            
            Ashwin.InviteMuscican("Gilgamesh");
            Ashwin.InviteMuscican("Ultimecia");
            Ashwin.InviteMuscican("Sephiroth");
            Ashwin.InviteMuscican("Necron");
            Ashwin.InviteMuscican("Chaos");
            int yugio = Integer.parseInt(args[2]);
            for(int z=0; z<yugio; z++){
                Ashwin.performForAYear();
            }


        } 
        catch (Exception e) {
            // TODO Auto-generated catch block
            
            System.out.println("Error in main method in ECSBandAid;");
        }


    }

    

   
}
