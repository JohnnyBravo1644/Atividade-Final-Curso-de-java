import javax.swing.*;

public class AtividadeFinal {

    public static void main(String[] args) {

        int ctrl;

        ctrl = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Cliente: "));

        int quantidadeClientes[] = new int[ctrl];
        int quantidadePecas;
        int quantidadeVendidoDia = 0;
        int vendasDiarias = 0;
        double valorPecaDeRoupa[] = new double[ctrl];
        double totalArrecadadoDia = 0;
        double somaCompra = 0;
        double valorCompra = 0;
        String pecaDeRoupa[] = new String[ctrl];


        for (int i = 0; i < quantidadeClientes.length; i++) {

            quantidadePecas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens comprados: "));

            System.out.println("------" + i + "* Cliente------");


            for (int j = 0; j < quantidadePecas; j++) {

                pecaDeRoupa[i] = JOptionPane.showInputDialog("Digite o nome do item Comprado: ");
                valorPecaDeRoupa[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor deste item: "));
                quantidadeVendidoDia += 1;
                somaCompra += valorPecaDeRoupa[i];


                System.out.println(pecaDeRoupa + " -> " + valorPecaDeRoupa);


                if (quantidadePecas < 3) {
                    valorCompra = somaCompra;
                }

                if (quantidadePecas >= 3) {
                    valorCompra = somaCompra - ((somaCompra * 10) / 100);
                }

                if (quantidadePecas >= 6) {
                    valorCompra = somaCompra - ((somaCompra * 20) / 100);
                }

                if (quantidadePecas >= 10) {
                    valorCompra = somaCompra - ((somaCompra * 10) / 100);
                }

                if (quantidadePecas < 0) {
                    System.out.println("Valor invalido!!!");
                }
            }

            System.out.println("O total da sua compra foi : R$" + valorCompra);
            System.out.println("-----------------------\n");

            totalArrecadadoDia += valorCompra;
            vendasDiarias++;
            somaCompra = 0;
        }

        for (int i = 0; i < quantidadeClientes.length; i++){
            for (int j = 0; j < i; j++){
            System.out.println(pecaDeRoupa[j] + " -> " + valorPecaDeRoupa[j]);
            System.out.println("");
            }
        }

    }

}
