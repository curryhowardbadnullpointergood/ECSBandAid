package music;

import java.util.List;

public interface Composition {
    public String getName();
    public void addScore(String instrumentName, List<String> notes, boolean soft);
    public MusicScore[] getScores();
    public int getLength();
    public int getNoteLength();
    
}
