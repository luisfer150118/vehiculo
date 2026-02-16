import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
        //vamos a llenar la matriz//
        public Objvehiculo[][] LlenarMatriz(Objvehiculo[][] M){
            //recorrer y llenar matriz//
           int numCelda=0;
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    Objvehiculo o = new Objvehiculo(); 
                System.out.println("Ingrese la marca del vehiculo");
                o.setMarca(sc.next());           
                System.out.println("Ingrese el tipo de vehiculo"); 
                o.setTipo(sc.next());
                System.out.println("Ingrese el cilindraje");
                o.setCilindraje(sc.nextInt());
                //iniciamos los condicionales//
                
                if (o.getCilindraje() >1000 && o.getCilindraje()<1600){
                    o.setPagoAnt(150.000);
             }  else if (o.getCilindraje()>=1600 && o.getCilindraje()>2000){
                o.setPagoAnt(200.000);
             }  else {
                o.setPagoAnt(250.000);
                         }  
                         o.setNumCelda(numCelda);
                         numCelda++;
                         M[i][j] = o;

            }
            }
            return M;
        }

        public Objvehiculo[][] CalcularPetrico23(Objvehiculo[][] M){
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    M[i][j].setPagoAct(M[i][j].getPagoAnt() * 1.23);

        }
    }
    return M;
}
public Objvehiculo[][] MostrarMatriz(Objvehiculo[][] M) {

    for (int i = 0; i < M.length; i++) {
        for (int j = 0; j < M.length; j++) {

            Objvehiculo o = M[i][j];

            System.out.println("-----------------------------");
            System.out.println("Celda [" + i + "][" + j + "]");
            System.out.println("Numero Celda: " + o.getNumCelda());
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Tipo: " + o.getTipo());
            System.out.println("Cilindraje: " + o.getCilindraje());
            System.out.println("Pago Anterior: " + o.getPagoAnt());
            System.out.println("Pago Actual: " + o.getPagoAct());
            System.out.println("-----------------------------");
        }
    }
    return M;
}
}