
import java.util.Objects;


public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Song other = (Song) obj;
        if (this.durationInSeconds == other.durationInSeconds) {
            return true;
        }
        if (this.artist.equals(other.artist)) {
            return true;
        }
        if (this.name.equals(other.name)) {
            return true;
        }
        return false;
    }
    
    


}
