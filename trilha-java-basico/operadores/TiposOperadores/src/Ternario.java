import javax.lang.model.util.ElementScanner14;

public class Ternario {
    public static void main(String [] args) {

    int a, b;

    a = 5;
    b = 6; 
    String resultado = "";
    if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";

    System.out.println(resultado);
    }
    //* String resultado = a==b ? "verdadeiro" : "falso";*/
}