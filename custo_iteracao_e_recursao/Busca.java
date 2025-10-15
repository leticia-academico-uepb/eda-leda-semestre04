package custo_iteracao_e_recursao;

public class Busca {

    public static int linearIterativa(int[] vetorA, int valorBuscado) {

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == valorBuscado) {
                return i;
            }
        }

        return -1;
    }

}
