package mania.pc;

public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistema;
    public HardwareBasico hardwareBasico;
    public MemoriaUSB memoriaUSB;
    public int memoriaRAM;
    public int armazenamento;

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Sistema Operacional " + sistema.nome + " (" + sistema.tipo + " bits)");
        System.out.println("Processador: " + hardwareBasico.nome + " - " + hardwareBasico.capacidade + " Mhz");
        System.out.println("Memória RAM: " + memoriaRAM + "Gb de Memória RAM");
        System.out.println("Armazenamento: " + armazenamento + "Gb de HD");
        if(memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.nome + " - " + memoriaUSB.capacidade + " GB");
        }

    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
}
