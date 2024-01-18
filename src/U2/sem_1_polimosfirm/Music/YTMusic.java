package U2.sem_1_polimosfirm.Music;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import Utils.PrintColor;

public class YTMusic extends Player {
    List<File> list_music = new ArrayList<>();

    public YTMusic(Music[] list_pl) {
        this.rating = 4.4f;
        this.users = 381000000l;
        this.downloads = 1000000000l;
        this.list_son = list_pl;
    }

    @Override
    public void load_music() {
        try {
            for (Music m : list_son) {
                var file = m.path.getAbsoluteFile();
                list_music.add(file);
            }
        }catch (Exception e){
            System.err.println("Hubo un error al cargar las canciones.");
            System.err.println(e);
        }
    }

    @Override
    public void start_music(int opt)  {
        try {
            int seconds = 1;
            Music m_class = list_son[opt];
            String sec_complete = (m_class.time%60 < 10) ? "0"+((int)m_class.time%60) : m_class.time%60+"";
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            PrintColor.printlnColor("Reproduciendo en YTGOD...", PrintColor.RED);
            PrintColor.printlnColor(m_class.name, PrintColor.CYAN);
            PrintColor.printlnColor("(0:00/"+(int)(m_class.time/60)+":"+sec_complete+")", PrintColor.WHITE_BACKGROUND);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(list_music.get(opt));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            while (seconds < m_class.time) {
                clip.start();
                int minutes = seconds/60;
                String sec = (seconds%60 < 10) ? "0"+(seconds%60) : seconds%60+"";
                
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                PrintColor.printlnColor("Reproduciendo en YTGod...", PrintColor.RED);
                PrintColor.printlnColor(m_class.name, PrintColor.CYAN);

                PrintColor.printlnColor("("+minutes+":"+sec+"/"+(int)(m_class.time/60)+":"+sec_complete+")", PrintColor.WHITE_BACKGROUND);

                int prog = (50*seconds)/(int)m_class.time;
                char[] iguales = new char[prog+1];
                char[] espacios = new char[(49-prog)];

                for(int i = 0; i < prog; i++) {
                    iguales[i] = '░';
                }
                for(int i = 0; i < (49-prog); i++) {
                    espacios[i] = '-';
                }
                System.out.println("("+String.valueOf(iguales)+String.valueOf(espacios)+")");
                seconds++;
            }
        }catch (Exception e){
            System.err.println("Hubo un error al reproducir las canciones.");
            System.err.println(e);
        }
    }
}