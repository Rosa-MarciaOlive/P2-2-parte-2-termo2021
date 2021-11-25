public class Retangulo implements FiguraGeometrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado() {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "retangulo";
    }

    @Override
    public int getArea() {
        int area;
        area = this.lado*this.lado;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro;
        perimetro = this.lado * 4;
        return perimetro;
    }

}