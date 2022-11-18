
public class tarea {

    public static void main(String[] args) {
        suma(10, 30, 40);
        auto miauto = new auto();
        miauto.sumarpuestas();
        miauto.sumarpuestas();
        miauto.sumarpuestas();
        miauto.sumarpuestas();
        System.out.println(miauto.puertas);
    }
public static void suma(int a, int b, int c){
        int resultado;
    resultado = a + b + c;
        System.out.println(resultado);
}
}
class auto{
    public int puertas = 4;
    public void sumarpuestas(){
        this.puertas++;
    }
}