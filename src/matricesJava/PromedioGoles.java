package matricesJava;

import java.util.Scanner;

public class PromedioGoles {

    //Atributos
    int jugGo[][]=new int[5][3];
    float prom[]=new float[5];


    //contructor


    public PromedioGoles() {

    }

    //Metodos


    public void setJugGo(int[][] jugGo) {
        this.jugGo = jugGo;
    }

    public  int[][] ingrGoles(int[][] jugGo) {
        this.jugGo =jugGo;
        int p;
        int m;

        for(int i=0; i<jugGo.length; i++){
            for(int j = 0; j< jugGo[0].length; j++){
                m=i+1;
                p=j+1;
                Scanner lectura= new Scanner(System.in);
                System.out.println("Ingrese los goles del jugador: "+m+" del partido: "+p);
                jugGo[i][j]=lectura.nextInt();

            }

        }
        return jugGo;

    }

    public float[] promGol(int[][] jugGolM) {
        float prom[]= new float[jugGolM.length];
        float valorAnterior=0;
        for(int i=0; i<jugGolM.length; i++){
            valorAnterior=0;
            for(int j = 0; j< jugGolM[0].length; j++){
                valorAnterior=valorAnterior+jugGolM[i][j];


            }
            prom[i] = Math.round(( valorAnterior/jugGolM[0].length)*100)/100f;

        }

        this.prom=prom;


        return prom;

    }

    public static void imprimirPromedios(float[] imp){
        for (float num: imp
             ) {
            System.out.println(num);

        }
    }
}
