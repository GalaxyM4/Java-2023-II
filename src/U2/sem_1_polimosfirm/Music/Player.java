package U2.sem_1_polimosfirm.Music;

public abstract class Player extends Music{
    Music[] list_son;
    float rating;
    long users;
    long downloads;
    public abstract void load_music();
    public abstract void start_music(int opt);
}