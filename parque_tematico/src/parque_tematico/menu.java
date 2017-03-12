
package parque_tematico;

import java.util.Scanner;

public class menu {
    Scanner tec = new Scanner(System.in);
    persona p;


    public menu() {
        p =new persona();
    }
    
 public void menu_parque() {
        int op=0;
       while (op != 4) {
           
            System.out.println("1.ingrese su edad:");
            System.out.println("2. que tipo de boleta quiere comprar ");
            System.out.println("3.precio boleta es");
            System.out.println("4.salir");
            op = tec.nextInt();

            switch (op) {
                
                case 1:
                     System.out.println("por favor dijite su edad:");
                     p.edad= tec.nextInt();
                     
                    break;
                case 2:
                    System.out.println("quetipo deboleta deseea");
                    p.full= tec.nextInt();
                    p.intermedio= tec.nextInt();
                    p.basico = tec.nextInt();
                    break;

                case 3:
                    System.out.println("el descuento dela boleta es:"+p.calcular_descuento());
                    break;

                case 4:
                    System.out.println("ud ha salido con exito");
                    
                    break;
            }
           
        }
    }    
}

