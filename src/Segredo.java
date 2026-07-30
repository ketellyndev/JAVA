public class Segredo {

    static void main() {

        String segredo = "777";
        String tentativa = "";

        while (!segredo.equals(tentativa)) {
            IO.println("Errouuuuuu");
            tentativa = IO.readln("Digite o segredo");
        }
        IO.println("Parabéns vc acertouuu");
    }
}