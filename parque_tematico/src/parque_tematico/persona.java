
package parque_tematico;

public class persona {
    
    int edad;
    int full,intermedio,basico;
    int descuento;

    public persona(int edad, int full, int intermedio, int basico) {
        this.edad = edad;
        this.full = 100000;
        this.intermedio = 75000;
        this.basico = 50000;
    }

public persona() {
    }

 public int calcular_descuento(){
     
        
        if(edad>65){
            
            if(descuento == full){
                 full=100000*25/100;
            }else
                if(descuento == intermedio){
                    intermedio=75000*20/100;
            }else
                   descuento = basico=50000*15/100;
            
            return descuento;
        }
              
                     
            if(edad<10){
                if(descuento== full){
                 full=100000*20/100;
            }else
                if(descuento == intermedio){
                    intermedio=75000*15/100;
            }else
                   descuento= basico=50000*10/100;
            return descuento;
            }
            
            else
             descuento=0;   
            
                     
        
        return descuento ;
    }
    
    
    
    }
    
  //pedir la fecha denacimiento y pedri la edad
    // leerherencia
    
    
   
         

   

