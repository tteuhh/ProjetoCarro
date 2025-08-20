
public class Carro {

String marca;
String modelo;
int ano;
boolean ligado; 

void mostrarDados() {

            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Motor ligado / desligado: " + ligado);
        }

        void ligarMotor() {

            ligado = true;
            System.out.println("Motor do carro ligado!");

        }

        void desligarMotor() {

            ligado = false;
            System.out.println("Motor do carro Desligado!");

        }

}
