public class Retangulo extends FiguraGeometrica{
    @Override

    public int lado;

    public int getLado() {
        return lado;
    }public void setLado(int lado) {
        this.lado = lado;
    }


public void quadrado(Object quadrado){
    if(lado==4){
        quadrado=((lado/lado)*lado);
        System.out.println("O area do "+getNomeFigura()+"é de: A"+getQuadrado());
        System.out.println("E seu "+getPerimetro()+"é de: P"+getQuadrado());
        }else{
            System.out.println("Status de aprovação: Reprovado.");
        }

// public void retangulo2(Objetc retangulo2){
//     Objetc retangulo = retangulo2;
//     if(nomeFigura==retangulo){
//         retangulo=((lado/lado)*lado);
//         System.out.println("O area do "+getNomeFigura()+"é de: A"+getAreaRetangulo(int));
//         System.out.println("E seu "+getPerimetro()+"é de: P"+getRetangulo(int));
//         }
//     }
}
private String getQuadrado() {
    return null;
}
    
}