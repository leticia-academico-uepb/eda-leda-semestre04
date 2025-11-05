package custo_iteracao_e_recursao;

public class Fatorial {

    public static int fatorialIterativo(int valor) {
        int fatorial = 1;

        for (int i = valor; i > 0; i--) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static long fatorialRecursivo(int valor) {
        if (valor == 0) {
            return 1;
        } else {
            return valor * fatorialRecursivo(valor - 1);
        }
    }

}
