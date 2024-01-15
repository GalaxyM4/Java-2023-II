package U2.sem_1_polimosfirm.Music;
import java.io.File;

public class Rock extends Genre implements IMusic {
    public Rock(String name, double time, String artist,int age, File f) {
        this.name = name;
        this.time = time;
        this.artist = artist;
        this.age = age;
        this.path = f;
        //properities
        this.instrument = "Guitarra Eléctrica";
        this.voice = true;
        this.use = "Entretenimiento y relajo";
    }

    @Override
    public void play() {  
        System.out.println(this.toString());
    }
    
    @Override
    public void stop() {
        System.out.println("La música paró.");
    }

    @Override
    public void unir(Music second) {
        System.out.println("La música se unió a ");
    }

    @Override
    public String toString() {
        int minutes = (int)this.time/60;
        int seconds = (int)this.time%60;
        return "Que viva el rock, " + this.name + "("+this.artist+") del año " + this.age +"\n(00:00/"+minutes+":"+seconds+")";
    };
}