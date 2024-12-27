package orchestra;

import java.util.HashMap;

import people.musicians.Musician;

public class Orchestra {
    HashMap<Integer, Musician> seating;
    // for the sitdown method! below
    private int val1;
    // 
    // for is seated 
    private boolean fh1;
    //

    public Orchestra(){
        seating = new HashMap<Integer,Musician>();

    }
    
    public int sitDown(Musician M){
      
        try{
            // checking if musician is already seated
          
            if(seating.size() <= 16){
                for(int i =0; i<16; i++){
                    if(seating.get(i) != M){
                        if(seating.get(i) == null){
                            if(M.getSeatNum()>0){
                                int d = M.getSeatNum();
                                d = d-1;
                                M.setSeat(d);
                                seating.put(d,M);
                                val1=0;
                                break;

                            }
                       
                            else{
                                M.setSeat(i);
                                seating.put(i,M);
                                val1 = 0;
                                break;

                            }
                        
                        }
                    }
                    else{
                        val1 = 2;
                        break;
                    }
                }
            }
            else{
                val1 = 1;
            }
            
            
        
           
            
        }
        catch(Exception e){
            System.out.println("Error in Orchestra sitdown method!:");
            
        }
        
        return val1;

    }

    public boolean isSeated(Musician MU){
        
        try{
            for(Musician mun: seating.values()){
                if(mun==MU){
                    fh1 = true;
                }
                else{
                    fh1 = false;
                }
            }
        }
        catch(Exception e){
            System.out.println("isseated method doesn't work in orchestra! ");
        }
        return fh1;
    }

    public void standUp(Musician gig){
        try{
            for(Integer jik: seating.keySet()){
                Musician tem = seating.get(jik);
                if(tem==gig){
                    seating.remove(jik);
                }
                    
                
            }
        }
        catch(Exception e){
            System.out.println("Standup method isnt working as intended!");
        }
    }

    public void playNextNote(){
        for(Musician j: seating.values()){
            j.playNextNote();
        }
    }



}
