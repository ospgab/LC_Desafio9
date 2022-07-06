/*
A agência de turismo Brasil Adentro contratou você para desenvolver parte do seu novo site de viagens. A agência possui contrato para vender apenas alguns trechos de voo domésticos e precisa de um programa que calcule todas as rotas possíveis.

O mapa a seguir mostra quais trechos podem ser comercializados pela agência.

A seguinte interface foi definida como contrato para você desenvolver seu código:



            public interface Travel {
                boolean isReachable(String from, String to, int numberConnections);
            }

Ou seja, dada uma cidade de origem, uma de destino e a quantidade de conexões, é possível realizar a viagem?

        Entrada:

                travel.isReachable("GRU", "REC", 0)

        Saída:

                true

        Entrada:

                travel.isReachable("POA", "REC", 1)

        Saída:

                false

 */

public class Main {
    public static void main(String[] args) {
        Travel travel = new Travel();

        // POA BSB NAT GRU SSA SDU VCP REC
        // O método deve receber duas entradas do tipo string e uma int: origem, destino, número de conexões
        // O valor 0 corresponde à nenhuma viagem, só retorna true em casos travel.isReachable("BSB", "BSB", 0)

        System.out.println(travel.isReachable("POA", "REC", 3));
        System.out.println(travel.isReachable("VCP", "BSB", 6));
        System.out.println(travel.isReachable("SSA", "NAT", 2));
        System.out.println(travel.isReachable("GRU", "REC", 0));
        System.out.println(travel.isReachable("POA", "REC", 1));
        System.out.println(travel.isReachable("BSB", "BSB", 0));
        // System.out.println(travel.isReachable("BSB", "CGH", 0)); // Esta linha resulta em uma exceção por não ter CGH
        System.out.println(travel.isReachable("BSB", "VCP", 85));

    }
}