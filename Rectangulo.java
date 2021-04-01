public class Rectangulo{

    private int numRectCreados;
    private String nombre, nomClase; 
    private double coordX1, coordY1, coordX2, coordY2, verticeInferiorIzquierdo, verticeSuperiorDerecho;


    public Rectangulo(){
        this.verticeInferiorIzquierdo = 0.0;
        this.verticeSuperiorDerecho = 1.1;
    }

    public Rectangulo(double x1, double y1, double x2, double y2){
        this.coordX1 = x1;
        this.coordX2 = x2;
        this.coordY1 = y1;
        this.coordY2 = y2;
    }

    public Rectangulo(int base, int altura){
        this.verticeInferiorIzquierdo = 0.0;
        this.verticeSuperiorDerecho = base * altura;
    }

    public Rectangulo(Rectangulo r){
        this.verticeInferiorIzquierdo = 0.0;
        this.verticeSuperiorDerecho = 1.1;
    }

    public void calcularSuperficieYPerimetro(int base, int altura){
        
    }

    public int getNumRectCreados() {
        return this.numRectCreados;
    }

    public void setNumRectCreados(int numRectCreados) {
        this.numRectCreados = numRectCreados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNomClase() {
        return this.nomClase;
    }

    public void setNomClase(String nomClase) {
        this.nomClase = nomClase;
    }

    public double getCoordX1() {
        return this.coordX1;
    }

    public void setCoordX1(double coordX1) {
        this.coordX1 = coordX1;
    }

    public double getCoordY1() {
        return this.coordY1;
    }

    public void setCoordY1(double coordY1) {
        this.coordY1 = coordY1;
    }

    public double getCoordX2() {
        return this.coordX2;
    }

    public void setCoordX2(double coordX2) {
        this.coordX2 = coordX2;
    }

    public double getCoordY2() {
        return this.coordY2;
    }

    public void setCoordY2(double coordY2) {
        this.coordY2 = coordY2;
    }

    public double getVerticeInferiorIzquierdo() {
        return this.verticeInferiorIzquierdo;
    }

    public void setVerticeInferiorIzquierdo(double verticeInferiorIzquierdo) {
        this.verticeInferiorIzquierdo = verticeInferiorIzquierdo;
    }

    public double getVerticeSuperiorDerecho() {
        return this.verticeSuperiorDerecho;
    }

    public void setVerticeSuperiorDerecho(double verticeSuperiorDerecho) {
        this.verticeSuperiorDerecho = verticeSuperiorDerecho;
    }
}