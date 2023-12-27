package sem_2.Tarea.ClassObj;

public class TRIANGULO {
    private String Pololo;
    private int l1;
    private int l2;
    private int l3;

    public TRIANGULO(String pololo, int l1, int l2, int l3) {
        Pololo = pololo;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    public String getPololo() {
        return Pololo;
    }
    public void setPololo(String pololo) {
        Pololo = pololo;
    }
    public int getL1() {
        return l1;
    }
    public void setL1(int l1) {
        this.l1 = l1;
    }
    public int getL2() {
        return l2;
    }
    public void setL2(int l2) {
        this.l2 = l2;
    }
    public int getL3() {
        return l3;
    }
    public void setL3(int l3) {
        this.l3 = l3;
    }
    
    public void consola() {
        double semip = (l1+l2+l3) / 2;  
        double eq = Math.sqrt(semip * (semip - l1) * (semip - l2) * (semip - l3));
        if (eq<=0){
            System.out.println("El mas inteligente creando un triangulo con un lado menor a 0 🧠");
            return;
        }

        System.out.println(Pololo+"El Resultado es: ");
        System.out.println("El área es: " + eq);
        System.out.println("El perímetro es: "+ (l1+l2+l3));
    }
}
