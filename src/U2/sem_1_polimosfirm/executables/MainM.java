package U2.sem_1_polimosfirm.executables;
import java.io.File;
import java.util.Scanner;
import U2.sem_1_polimosfirm.Music.*;
import Utils.PrintColor;

public class MainM {
    public static void main(String[] args) {
        get_choice();
    }

    public static int get_choice() {
        Scanner input = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        PrintColor.printlnColor("Hola, soy pedro.", PrintColor.YELLOW);
        PrintColor.printlnColor("Selecciona el reproductor de música: ", PrintColor.CYAN);
        PrintColor.printlnColor("1. Spotify\n2. YTMusic", PrintColor.GREEN);
        PrintColor.printlnColor("Coloca tu opción: ", PrintColor.GREEN);
        int choice = input.nextInt();
        if(choice == 1) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            opt1();
        }else {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            opt2();
        }
        input.close();
        return choice;
    }

    public static void opt1() {
        Scanner input = new Scanner(System.in);
        Music[] songs = get_songs();
        Spotify re = new Spotify(songs);
        re.load_music();
        System.out.println("----------------------------------------------");
        PrintColor.printlnColor("Canciones encontradas con Spotify: ", PrintColor.GREEN_BACKGROUND);
        for (int i = 0; i < songs.length; i++) {
            Music m = songs[i];
            PrintColor.printlnColor((i+1) + ") " + m.name + " ("+ m.age + ")", PrintColor.BLUE);   
        }
        PrintColor.printColor("Ingresa tu opción: ", PrintColor.YELLOW);
        re.start_music(input.nextInt()-1);
        input.close();
    }

    public static void opt2() {
        Scanner input = new Scanner(System.in);
        Music[] songs = get_songs();
        YTMusic re = new YTMusic(songs);
        System.out.println("----------------------------------------------");
        PrintColor.printlnColor("Canciones encontradas con YTMusic: ", PrintColor.RED_BACKGROUND);
        re.load_music();
        for (int i = 0; i < songs.length; i++) {
            Music m = songs[i];
            PrintColor.printlnColor((i+1) + ") " + m.name + " ("+ m.artist + "), año: " + m.age , PrintColor.BLUE);   
        }
        PrintColor.printColor("Ingresa tu opción: ", PrintColor.YELLOW);
        re.start_music(input.nextInt()-1);
        input.close();
    }

    public static Music[] get_songs() {
        //export
        Music[] music = new Music[]{
            new Electro("Alastor's Game", 185, "The Living Tombstone", 2020, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\AlastorsGame.wav")),
            new Rock("Come As You Are", 244, "Nirvana", 1991, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\ComeAsYouAre.wav")),
            new Rock("Holiday", 232, "Green Day", 2005, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\Holiday.wav")),
            new Rock("Life is Life", 244, "Opus", 1984, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\LifeIsLife.wav")),
            new Rock("Lo Peor de Todo", 243, "Rio", 1986, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\LoPeorDeTodo.wav")),
            new Electro("Mortals", 229, "Wariyo", 2016, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\MortalsWariyo.wav")),
            new Electro("Sonic Wave", 182, "F-777", 2014, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\SonicWave.wav")),
            new Rock("Yendo A La Casa de Damián", 255, "El Cuarteto De Nos", 2006, new File("C:\\Users\\Dell\\Desktop\\u ene ce yo\\CICLO II\\Algoritmos\\Java-2023-II\\src\\U2\\sem_1_polimosfirm\\Music\\song\\YendoALaCasaDeDamian.wav"))
        };
        return music;
    }
}
