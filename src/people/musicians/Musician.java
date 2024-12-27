package people.musicians;

public abstract interface Musician {

    void setSeat(int seat);  
    void readScore(int[] notes, boolean soft);
    void playNextNote();
    String getName1();
    int getSeatNum();
    

    
}
