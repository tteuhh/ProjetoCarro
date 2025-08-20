public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.marca = "Audi";
        carro.modelo = "R8";
        carro.ano = 2015;

        carro.mostrarDados();
        carro.desligarMotor();

        carro.marca = "Honda";
        carro.modelo = "NSX Senna";
        carro.ano = 2000;
        
        carro.mostrarDados();
        carro.ligarMotor();
    }
}
