import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Ingrese la dimension cuadrada");
        n= sc.nextInt();
        Objvehiculo[][] M =new Objvehiculo[n][n];
        Metodos c =new Metodos();
        M =c.LlenarMatriz(M);
        M =c.CalcularPetrico23(M);
        M =c.MostrarMatriz(M);
        sc.close();
    }
}
