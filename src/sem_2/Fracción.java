package sem_2;

public class Fracción {
    int num;
    int den;
    public Fracción() {
        this.num = 1;
        this.den = 2;
    }

    public Fracción(int numer, int deno) {
        this.num = numer;
        this.den = deno;
        if(deno == 0) {
            this.den = 1;
        }
    }
}
