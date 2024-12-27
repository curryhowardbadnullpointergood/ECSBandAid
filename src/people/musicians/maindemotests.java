package people.musicians;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.platform.console.shadow.picocli.CommandLine.Help.TextTable.Cell;

import music.Composition;
import music.MusicScore;
import music.MusicSheet;
import orchestra.Orchestra;
import people.Person;
import people.conductors.Conductor;
import utils.SoundSystem;

public class maindemotests {
    public static void main(String[] args){
        // purely for testing purposes
        // tests if the constructor and getName methods work properly
        Person newi = new Person("newi");
        System.out.println(newi.getName());
        // should print out "newi"
        //
        // below tests musician classes implementations, violinist etc, 
        System.out.println("Testing part 1 methods");
        // creating sound system
        
       
        
        System.out.println("Testing part 3: ");
        try{
            SoundSystem SoundSYS = new SoundSystem();
            Violinist Ash = new Violinist("Ash", SoundSYS);
            Cellist Kaori = new Cellist("Kaori", SoundSYS);
            Pianist Luke = new Pianist("Luke", SoundSYS);
            Conductor Oldman = new Conductor("oldman", SoundSYS);
            Oldman.registerMusician(Luke);
            Oldman.registerMusician(Ash);
            Oldman.registerMusician(Kaori);
            List<String> jiji = new ArrayList<String>();
            jiji.add("A0");
            jiji.add("B0");
            jiji.add("A0");
            jiji.add("B0");
            jiji.add("B0");
            jiji.add("B0");
            jiji.add("B0");
            jiji.add("B0");
            jiji.add("B0");
            jiji.add("B0");
            jiji.add("C6");
            jiji.add("C6");
            jiji.add("C6");
            jiji.add("C6");
            System.out.println(jiji);

            
           
            List<String> newscore = new ArrayList<String>();
            String[] musiq = {"C4", "C4", "D4", "none", "C4", "none", "F4", "none", "E4", "none", "none", "none",
            "C4", "C4", "D4", "none", "C4", "none", "G4", "none", "F4", "none", "none", "none",
            "C4", "C4", "C5", "none", "A4", "none", "F4", "none", "E4", "none", "D4", "none",
            "A4", "none", "F4", "none", "G4", "none", "F4", "none", "none", "none"};
            newscore.addAll(Arrays.asList(musiq));
            System.out.println(newscore);
            int jkl = newscore.size();
            // works System.out.println("Does it reach here?");
            MusicSheet net = new MusicSheet("dontknow","Larghissimo",jkl);
            net.addScore("Violin", newscore, false);
            Pianist Nami = new Pianist("Nami", SoundSYS);
            Conductor Robin = new Conductor("Robin", SoundSYS);
            // works System.out.println("Does it reach here?");
            Robin.registerMusician(Nami);
            System.out.println("Does it reach here?");
            Robin.playComposition(net);            

        }
        catch(Exception e){
            System.out.println("Test for part 3 has failed:");
        }
        try{
            System.out.println("Testing part 5: ");
            SoundSystem soundSYS = new SoundSystem();
            Violinist Kaori = new Violinist("Kaori", soundSYS);
            Violinist Kim = new Violinist("Kim", soundSYS);
            Cellist Sophie = new Cellist("Sohpie", soundSYS);
            Cellist Brooke = new Cellist("Brooke", soundSYS);
            Pianist Noman = new Pianist("Noman", soundSYS);
            Pianist Bill = new Pianist("Bill", soundSYS);
            Musician[] MusicianList = {Kaori,Kim,Sophie,Brooke,Noman,Bill};
            List<String> Song1 = new ArrayList<String>();
            List<String> Song2 = new ArrayList<String>();
            List<String> Song3 = new ArrayList<String>();
            List<String> Song4 = new ArrayList<String>();
            List<String> Song5 = new ArrayList<String>();
            List<String> Song6 = new ArrayList<String>();
            String[] S1 = {"A0","A0","A0","A0","A0","A0","A0","A0","A0"};
            String[] S2 = {"B0","B0","B0","B0","B0","B0","B0","B0","B0"};
            String[] S3 = {"A2","A2","A2","A2","A2","A2","A2","A2","A2"};
            String[] S4 = {"C3","C3","C3","C3","C3","C3","C3","C3","C3"};
            String[] S5 = {"G2","G2","G2","G2","G2","G2","G2","G2","G2"};
            String[] S6 = {"D6","D6","D6","D6","D6","D6","D6","D6","D6"};
            Song1.addAll(Arrays.asList(S1));
            Song2.addAll(Arrays.asList(S2));
            Song3.addAll(Arrays.asList(S3));
            Song4.addAll(Arrays.asList(S4));
            Song5.addAll(Arrays.asList(S5));
            Song6.addAll(Arrays.asList(S6));
            MusicSheet Piece1 = new MusicSheet("Song1", "Larghissimo", 9);
            Piece1.addScore("Violin", Song1, false);
            MusicSheet Piece2 = new MusicSheet("Song2", "Larghissimo", 9);
            MusicSheet Piece3 = new MusicSheet("Song3", "Larghissimo", 9);
            MusicSheet Piece4 = new MusicSheet("Song4", "Larghissimo", 9);
            MusicSheet Piece5 = new MusicSheet("Song5", "Larghissimo", 9);
            MusicSheet Piece6 = new MusicSheet("Song6", "Larghissimo", 9);
            Piece2.addScore("Violin", Song1, false);
            Piece3.addScore("Violin", Song1, false);
            Piece4.addScore("Violin", Song1, false);
            Piece5.addScore("Violin", Song1, false);
            Piece6.addScore("Violin", Song1, false);
            Composition[] ListSongs ={Piece1,Piece2,Piece3,Piece4,Piece5,Piece6};
            Violinist jiji = new Violinist("jiji", soundSYS);
            jiji.setSeat(10);
            String h = jiji.getName();
            int k = jiji.getSeatNum();
            System.out.println(k+"seatnum");
            


        }
        catch(Exception e){

        }
        



    }

    
}
