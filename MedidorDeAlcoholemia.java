class MedidorDeAlcoholemia {
    private double LIMITE_ALCOHOL = 0.1;
    private double valorAMedir;
    private Persona conductor;

    public MedidorDeAlcoholemia (Persona conductor){
        this.conductor = conductor;
        this.valorAMedir = conductor.getGradoDeAlcohol();
        emitirResultado(compararAlcoholemia(valorAMedir));

    }

    private boolean compararAlcoholemia(double valorAMedir) {
        return valorAMedir > LIMITE_ALCOHOL;
    }

    private void emitirResultado(boolean resultado) {
        double diferencia = obtenerDiferencia(valorAMedir);
        if (resultado == true)
            System.out.println("El conductor " + conductor.getNombre() +" se encuentra en estado de embriaguez, superando el " +
            "limite en " + (float)diferencia + "°");
        else
            System.out.println("El conductor " + conductor.getNombre() + " no se encuentra en estado de embriaguez");
            
    }

    private double obtenerDiferencia(double valorAMedir) {
        return valorAMedir - LIMITE_ALCOHOL;
    }

}