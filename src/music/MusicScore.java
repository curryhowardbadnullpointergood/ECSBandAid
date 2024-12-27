package music;

public class MusicScore {
    public String Instrumentname;
    public int[] arrayofnotes;
    public boolean isitsoft;

    public MusicScore(String instrumentName, int[] notes, boolean soft){
        //instrumentName is the name of the instrument, e.g., "Piano", "Cello", or "Violin"
        Instrumentname = instrumentName;
        arrayofnotes = notes;
        isitsoft = soft;





    }

    public int getInstrumentID(){
        
        if(Instrumentname.equals("Violin")){
        
            return 41;
            
        }
        if(Instrumentname.equals("Cello")){
            return  43;
            
        }
        if(Instrumentname.equals("Piano")){
            return  1;

        }
        else{
            return 100;
            
        }
        
        
    }
    
    public int[] getNotes(){
        return arrayofnotes;
    }

    public boolean isSoft(){
        return isitsoft;
    }




}
