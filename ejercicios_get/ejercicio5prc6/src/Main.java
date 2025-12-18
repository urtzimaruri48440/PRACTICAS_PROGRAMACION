import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static String [] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    private static HashMap <String , HashMap <Integer, Integer>> tarjeta= new HashMap<>();
    public static void main(String[] args) {

        tarjeta.put("Enero", new HashMap<>());
        tarjeta.get("Enero").put(1,100);
        tarjeta.get("Enero").put(14,150);
        tarjeta.put("Febrero", new HashMap<>());
        tarjeta.get("Febrero").put(12,200);
        tarjeta.get("Febrero").put(23,50);
        tarjeta.get("Febrero").put(30,10);
        tarjeta.put("Marzo", new HashMap<>());
        tarjeta.get("Marzo").put(3,100);
        tarjeta.get("Marzo").put(14,150);
        tarjeta.put("Abril", new HashMap<>());
        tarjeta.get("Abril").put(12,200);
        tarjeta.get("Abril").put(23,50);
        tarjeta.put("Mayo", new HashMap<>());
        tarjeta.get("Mayo").put(30,10);
        tarjeta.put("Junio", new HashMap<>());
        tarjeta.get("Junio").put(3,100);
        tarjeta.get("Junio").put(14,150);
        tarjeta.put("Julio", new HashMap<>());
        tarjeta.get("Julio").put(12,200);
        tarjeta.get("Julio").put(23,50);
        tarjeta.put("Agosto", new HashMap<>());
        tarjeta.get("Agosto").put(30,10);
        tarjeta.put("Septiembre", new HashMap<>());
        tarjeta.get("Septiembre").put(3,100);
        tarjeta.get("Septiembre").put(14,150);
        tarjeta.put("Octubre", new HashMap<>());
        tarjeta.get("Octubre").put(12,200);
        tarjeta.get("Octubre").put(23,50);
        tarjeta.put("Noviembre", new HashMap<>());
        tarjeta.get("Noviembre").put(30,10);
        tarjeta.put("Diciembre", new HashMap<>());
        tarjeta.get("Diciembre").put(3,100);


        cargarDatos();
        mostrarResultadosMesesOrdenadoDeMenorAMayor();
        mostrarResultadosAñoTotal();

    }
    public static void cargarDatos(){

        for (int i = 0; i< meses.length; i++){
            System.out.println("Ingrese los gastos del mes de " + meses[i] + " (formato: dia gasto). Ingrese -1 para finalizar el mes.");
            while (true){
                int dia = sc.nextInt();
                if (dia == 0){
                    break;
                }
                int gasto = sc.nextInt();
                if (!tarjeta.containsKey(meses[i])){
                    tarjeta.put(meses[i], new HashMap<>());
                }
                tarjeta.get(meses[i]).put(dia, gasto);
            }

        }

    }
    public static void mostrarResultadosMesesOrdenadoDeMenorAMayor(){
        for (int i = 0; i< meses.length; i++){
            String mes = meses[i];
            int totalMes = 0;
            if (tarjeta.containsKey(mes)){
                for (int gasto : tarjeta.get(mes).values()){
                    totalMes += gasto;
                }
            }
            System.out.println("Total gastos del mes de " + mes + ": " + totalMes);
        }
    }
    public static void mostrarResultadosAñoTotal(){
        int totalAño = 0;
        for (String mes : meses){
            if (tarjeta.containsKey(mes)){
                for (int gasto : tarjeta.get(mes).values()){
                    totalAño += gasto;
                }
            }
        }
        System.out.println("Total gastos del año: " + totalAño);
    }
}