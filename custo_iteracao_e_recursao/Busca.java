package custo_iteracao_e_recursao;

public class Busca {

    public static void main(String[] args) {
        int[] array = {0, 3, 8, 3, 9, 13};

        // System.out.println(Busca.linearIterativa(array, 9));
        // System.out.println(Busca.linearIterativa(array, 7));

        // System.out.println(Busca.linearRecursiva(array, 0));
        // System.out.println(Busca.linearRecursiva(array, 7));

        System.out.println(Busca.binariaIterativa(array, 13));
        System.out.println(Busca.binariaIterativa(array, 7));

        System.out.println(Busca.binariaRecursiva(array, 13));
        System.out.println(Busca.binariaRecursiva(array, 7));
    }

    public static int linearIterativa(int[] vetorA, int valorBuscado) {

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == valorBuscado) {
                return i;
            }
        }

        return -1;
    }

    public static int linearRecursiva(int[] vetorA, int valorBuscado, int i) {
        if (i >= vetorA.length) {
            return -1;
        }

        if (vetorA[i] == valorBuscado) {
            return i;
        }

        return linearRecursiva(vetorA, valorBuscado, i + 1);
    }

    public static int linearRecursiva(int[] vetorA, int valorBuscado) {
        return linearRecursiva(vetorA, valorBuscado, 0);
    }

    public static int binariaIterativa(int[] vetorA, int valorBuscado) {
        int inicio = 0;
        int fim = vetorA.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetorA[meio] == valorBuscado) {
                return meio;
            }

            if (vetorA[meio] < valorBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static int binariaRecursiva(int[] vetorA, int valorBuscado, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = inicio + (fim - inicio) / 2;

        if (vetorA[meio] == valorBuscado) {
            return meio;
        }


        if (vetorA[meio] < valorBuscado) {
            inicio = meio + 1;
        } else {
            fim = meio - 1;
        }

        return binariaRecursiva(vetorA, valorBuscado, inicio, fim);
    }

    public static int binariaRecursiva(int[] vetorA, int valorBuscado) {
        return binariaRecursiva(vetorA, valorBuscado, 0, vetorA.length - 1);
    }

}
