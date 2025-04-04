import mania.pc.Cliente;
import mania.pc.Computador;
import mania.pc.HardwareBasico;
import mania.pc.SistemaOperacional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[10];
        int possui;
        int totalClientes = 0;
        int continuar;


        System.out.println("Ola , seja bem-vindo ao PCMania !");
        System.out.println("Aqui você encontra os melhores preções do mercado ! ");
        System.out.println("VAMOS COMEÇAR ----->");



        do {
            Cliente cliente = new Cliente();
            System.out.print("Informe seu nome: ");
            cliente.nome =sc.nextLine();
            System.out.print("Informe seu CPF: ");
            cliente.cpf = sc.nextLong();
            sc.nextLine();


            do {
                System.out.println(" ");
                System.out.println("Escolha uma promoção:");
                System.out.println("1 - Promoção Apple");
                System.out.println("2 - Promoção Samsung");
                System.out.println("3 - Promoção Dell");
                System.out.println("0 - Finalizar compra");
                possui = sc.nextInt();
                sc.nextLine();

                Computador computador = null;
                switch (possui) {
                    case 1:
                        computador = new Computador();
                        computador.marca = "Apple";
                        computador.preco = 9798 ;
                        computador.sistema = new SistemaOperacional();
                        computador.sistema.nome = "Linux Ubuntu";
                        computador.sistema.tipo = 32;
                        computador.hardwareBasico = new HardwareBasico();
                        computador.hardwareBasico.nome = "Pentium Core i3";
                        computador.hardwareBasico.capacidade = 2200;
                        computador.memoriaRAM=8;
                        computador.armazenamento=500;
                        System.out.println("Acompanha Pen-drive de 16Gb");
                        break;
                    case 2:
                        computador = new Computador();
                        computador.marca = "Samsung";
                        computador.preco =  9798 + 1234 ;
                        computador.sistema = new SistemaOperacional();
                        computador.sistema.nome = "Windows 8";
                        computador.sistema.tipo = 64;
                        computador.hardwareBasico = new HardwareBasico();
                        computador.hardwareBasico.nome = "Pentium Core i5";
                        computador.hardwareBasico.capacidade = 3370;
                        computador.memoriaRAM=16;
                        computador.armazenamento=1000;
                        System.out.println("Acompanha Pen-drive de 32Gb");
                        break;
                    case 3:
                        computador = new Computador();
                        computador.marca = "Dell";
                        computador.preco = 9798 + 5678 ;
                        computador.sistema = new SistemaOperacional();
                        computador.sistema.nome = "Windows 10";
                        computador.sistema.tipo = 64;
                        computador.hardwareBasico = new HardwareBasico();
                        computador.hardwareBasico.nome = "Pentium Core i7";
                        computador.hardwareBasico.capacidade = 4500 ;
                        computador.memoriaRAM=32;
                        computador.armazenamento=2000;
                        System.out.println("Acompanha HD Externo 1Tb");
                        break;
                    case 0:
                        System.out.println("Compra finalizada com sucesso !");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
                if (computador != null) {
                    cliente.comprar(computador);
                }
            } while (possui != 0);

            clientes[totalClientes] = cliente;
            totalClientes++;

            cliente.mostraComputadores();
            System.out.println("------------------------------------");
            System.out.println("");
            System.out.print("Deseja cadastrar outro cliente? (1 - Sim ou 0 - Não): ");
            continuar = sc.nextInt();
            sc.nextLine();
        } while (continuar == 1);



    }
}
