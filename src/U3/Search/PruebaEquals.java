package U3.sem3_colecciones_mapas;

public class PruebaEquals {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedro", "Lora"); 
        Persona persona2 = new Persona("Cesar", "Lora");
        System.out.println("¿Son homónimos? " + persona1.equals(persona2));
    }

    static class Persona { // Cambiado de clase interna a estática
        private String nombres;
        private String apellidos;

        public Persona() {
        }

        public Persona(String nombres, String apellidos) {
            this.nombres = nombres;
            this.apellidos = apellidos; 
        }
        
        // Getters and Setters 
        public String getNombres() { 
            return nombres;
        }   
        public void setNombres(String nombres) {
            this.nombres = nombres;
        }
        public String getApellidos() {
            return apellidos;
        }
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
        
        // Sobreescribir el método Equals
        @Override
        public boolean equals(Object ele) {
            if (this == ele) {
                return true; 
            }

            if (ele == null || getClass() != ele.getClass()) {
                return false;
            }

            Persona persona = (Persona) ele;
            return nombres.equals(persona.getNombres()) && apellidos.equals(persona.getApellidos());
        }
    }
}
