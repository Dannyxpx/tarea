import javax.sql.rowset.CachedRowSet;

public class condicionales {

    /**
     * @param args
     */
    public static void main(String[] args) {
       //**Ejercicio If**
        int numeroIf = -5;

       if(numeroIf>=0){
System.out.println("numero positivo");
        
       }
       else if (numeroIf<=0){
        System.out.println("numero negativo");
       }
     //**Ejercicio While**
       int numeroWhile = 2;
       while (numeroWhile < 3) {
           System.out.println(numeroWhile);
           numeroWhile = numeroWhile + 1;

       }
        //**Ejercicio Do While**
       int numeroWhiles = 2;
      do{ 
       numeroWhiles = numeroWhiles + 1;
       System.out.println(numeroWhiles);}
    while(numeroWhiles <= 3);

    //**Ejercicio For**
    for(int numerofor = 0;numerofor <=3;numerofor = numerofor+ 1){
        System.out.println(numerofor);
    }
    //**Ejercicio switch**
    var estacion = "Verano";
    switch(estacion){
        case "Verano":
        System.out.println("Verano");
        break;
        case "Invierno":
        System.out.println("Invierno");
        break;
        default:
        System.out.println("Estacion Incorrecta");
    }
    }
}