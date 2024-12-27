package people.conductors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import music.Composition;
import music.MusicScore;
import orchestra.Orchestra;
import people.Person;
import people.musicians.Cellist;
import people.musicians.Musician;
import people.musicians.Pianist;
import people.musicians.Violinist;
import utils.SoundSystem;

public class Conductor extends Person{
    SoundSystem soundSystem;
    private List<Musician> Registery = new ArrayList<Musician>();
    private List<Musician> Violin = new ArrayList<Musician>();
    private List<Musician> Piano = new ArrayList<Musician>();
    private List<Musician> Cello = new ArrayList<Musician>();
    public Iterator<Musician> Musiciansinlist;
    public Orchestra Grandline = new Orchestra();

    public Conductor(String nm, SoundSystem SS){
        super(nm);
        soundSystem = SS;

    }

    public void registerMusician(Musician newbie){
        Registery.add(newbie);
        

    }

    public void kickMusician(Musician badperformance){
        // System.out.println("This is the register before kicking: "+ Registery);
        Registery.remove(badperformance);
        // System.out.println("This is the register after kicking: "+ Registery);
    }

    public void playComposition(Composition C){
        //System.out.println(C);
        MusicScore[] MS = C.getScores();
        //System.out.println("here!");
        Musiciansinlist = Registery.iterator();
        //System.out.println("here!");
        while(Musiciansinlist.hasNext()){
            Musician joke = Musiciansinlist.next();
            if(joke instanceof Violinist){
                Violin.add(joke);
            }
            if(joke instanceof Cellist){
                Cello.add(joke);
            }
            if(joke instanceof Pianist){
                Piano.add(joke);
                
            }
        }

        //System.out.println(MS.length+"should be 3");
        for(int i =0; i<MS.length;i++){
            
            int id = MS[i].getInstrumentID();
            //System.out.println(MS[i].getInstrumentID());
            if(id==41){
                
                for(int k = 0; k<Violin.size(); k++){
                    Musician Vivi = Violin.get(k);
                    Vivi.readScore(MS[i].getNotes(), MS[i].isSoft());
                    Grandline.sitDown(Vivi);
                }
              
                
            
            }
            
            if(id==43){
                // System.out.println("Does pianist ever make it here?");
                for(int k = 0; k<Cello.size(); k++){
                    Musician Vivi = Cello.get(k);
                    Vivi.readScore(MS[i].getNotes(), MS[i].isSoft());
                    Grandline.sitDown(Vivi);
                }
               
            }
            if(id==1){
                //System.out.println("Does pianist ever make it here?");
                for(int k = 0; k<Piano.size(); k++){
                    Musician Vivi = Piano.get(k);
                    Vivi.readScore(MS[i].getNotes(), MS[i].isSoft());
                    Grandline.sitDown(Vivi);
                }
            }

        }
        for(int k=0; k<C.getLength() ; k++){
            Grandline.playNextNote();
            int delay = C.getNoteLength();
            try{
                Thread.sleep (delay);
            } 
            catch (InterruptedException e){

            }

        }
        soundSystem.setTextMode(true);


    }
}
