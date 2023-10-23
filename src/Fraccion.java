import java.util.Objects;

public class Fraccion {
    public int numerador;
    public int denominador;

    public Fraccion(int numerador, int denominador) throws FraccionException {
        this.numerador = numerador;
        if(denominador==0){
            throw new FraccionException("Denominador no puede ser 0");
        }
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) throws FraccionException {
        if(denominador==0){
            throw new FraccionException("Denominador no puede ser 0");
        }
        this.denominador = denominador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraccion)) return false;
        Fraccion fraccion = (Fraccion) o;
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerador, denominador);
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }
}
