public class Calculadora {

    public int dividir(int n1, int n2) throws Exception {

        if ((n1 < 1) || (n1 > 10)) {
            throw new Exception("Número deve estar entre 1 e 10");
        }

        return n1 / n2;
    }

}
