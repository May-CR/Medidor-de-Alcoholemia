class Persona {
    private String nombre;
    private int edad;
    private double gradoDeAlcohol;

    public Persona(String nombre, int edad, double gradoDeAlcohol){
        this.nombre = nombre;
        this.edad = edad;
        this.gradoDeAlcohol = gradoDeAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getGradoDeAlcohol() {
        return gradoDeAlcohol;
    }

    public void setGradoDeAlcohol(double gradoDeAlcohol) {
        this.gradoDeAlcohol = gradoDeAlcohol;
    }       

}
