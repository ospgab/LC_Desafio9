public class Travel {

    int[][] matrizOcorrencia = {{0,1,2,2,2,0,0,3},
                      {2,0,1,1,1,0,0,2},
                      {0,0,0,0,0,0,0,0},
                      {1,1,1,0,2,0,0,1},
                      {0,0,1,0,0,0,0,1},
                      {0,0,2,0,1,0,0,2},
                      {0,0,2,0,1,0,0,2},
                      {0,0,0,0,0,0,0,0}};

    private int getNumero(String nome){
        int posicao;
        switch (nome){
            case "POA":
                posicao = 0;
                break;
            case "BSB":
                posicao = 1;
                break;
            case "NAT":
                posicao = 2;
                break;
            case "GRU":
                posicao = 3;
                break;
            case "SSA":
                posicao = 4;
                break;
            case "SDU":
                posicao = 5;
                break;
            case "VCP":
                posicao = 6;
                break;
            case "REC":
                posicao = 7;
                break;
            default:
                System.out.println("Entrada inválida");
                throw new RuntimeException("Entrada inválida, tente novamente");
                //break;
        }
        return posicao;
    }



    public boolean isReachable(String from, String to, int numberConnections){

        int index1 = getNumero(from);
        int index2 = getNumero(to);





        if(matrizOcorrencia[index1][index2] == 0){
            return from.equals(to);
        } else if (matrizOcorrencia[index1][index2] <= numberConnections) {
            return true;
        }else if (matrizOcorrencia[index1][index2] > numberConnections){
            return false;
        } else {
            throw new RuntimeException("Valor inválido!");
        }

    }
}