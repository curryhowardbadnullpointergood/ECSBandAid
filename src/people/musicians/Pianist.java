package people.musicians;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import people.Person;

import utils.SoundSystem;

public class Pianist extends Person implements Musician{
    int instrumentID = 1;
    int softVolume = 75;
    int loudVolume = 150;
    int seat;
    int loudness;
    private List<Integer> notes = new ArrayList<Integer>();
    private Iterator<Integer> nextNote;
    // sounds system for this instrument 
    SoundSystem soundSystem;
    //
    private String nameofthis;

    // constructor as describes in page 7 
    public Pianist(String name, SoundSystem Ss){
        super(name);
        // person constructor that sets name
        soundSystem = Ss;
        nameofthis = name;

    }

  

    public void setSeat(int seat1){
        seat = seat1;
        try{
            soundSystem.setInstrument(seat1, instrumentID);
            
        }
        catch(Exception e){
            System.out.println("set seat not working as intended- violinist");
        }
        
    }

    public Pianist(String Name, SoundSystem SoundSys, int seatnum){
        
        super(Name);
        seat = seatnum;
        setSeat(seatnum);
        nameofthis = Name;
        soundSystem = SoundSys;
        

    }

    public void readScore(int[] notes1, boolean soft1){

        try{
            // adds the input notes for readscore into the list of integers notes
            for(int i=0; i<notes1.length; i++){
                //notes.add(notes1[i]);
                int gg = notes1[i];
                notes.add(gg);
            }
        }
        catch(Exception e){
            System.out.println("Having trouble adding array of score to list-notes");
        }

        // loudness , true is soft/less loud, false is louder
        if(soft1==true){
            loudness = softVolume;
        }
        if(soft1==false){
            loudness = loudVolume;
        }
        // initilises the iterator for playnextnote method
        nextNote = notes.iterator();
    }

    public void  playNextNote(){
        boolean hasnextnote = nextNote.hasNext();
        if(hasnextnote==true){
            soundSystem.playNote(seat, nextNote.next(), loudness);

         
            
        }
    }
    public String getName1(){
        return nameofthis;
    }
    public int getSeatNum(){
        return seat;
    }










}
