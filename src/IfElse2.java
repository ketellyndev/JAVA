import java.awt.image.ImagingOpException;

public class IfElse2 {
    // FESTA DA GRAZI
    static void main() {

        int idade = Integer.parseInt(IO.readln("Digite sua idade"));

        if (idade < 18 ){
            IO.println("Pode entrar e curtir");
        } else {
            IO.println("Ta velho dorme");
        }
    }
}
