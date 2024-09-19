package src.exe123;

public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
   
    public double getArea(){
        double r = this.raio;
        r = r *r;
        r = r * 3.14;
        return r;
    }
    
    public double getCircunferencia(){
        double r = this.raio;
        r = r * (3.14 * 3.14);
        return r;
    }
    
    public void aumentarRaio(double r){
        this.raio = this.raio + (this.raio * (r/100));
        System.out.println(this.raio);
    }
}
