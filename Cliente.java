package mania.pc;
public class Cliente {
        public String nome;
        public long cpf;
        public Computador[] computadoresC = new Computador[10];
        int cont = 0;
        float total = 0;

        public void comprar(Computador c) {
            if (cont < computadoresC.length) {
                computadoresC[cont] = c;
                cont++;
            } else {
                System.out.println("Limite atingido de compra !");
            }
        }

        public float calculaTotalCompra() {
            for (int i = 0; i < cont; i++) {
                total += computadoresC[i].preco;
            }
            return total;
        }

        public void mostraComputadores() {
            System.out.println("AQUI ESTÁ TUDO SOBRE SUA COMPRA ----->");
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Computador comprado:");
            for (int i = 0; i < cont; i++) {
                computadoresC[i].mostraPCConfigs();
            }
            System.out.println("Total da sua compra: R$ " + calculaTotalCompra());
        }
    }




