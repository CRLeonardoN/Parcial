import javax.swing.*;

public class Matriz2 {

    private int[][] matriz;

    private int fila;

    private int columna;

    private int valor;

    public void ordenMatriz(){

        fila = Integer.parseInt(JOptionPane.showInputDialog("Filas: ")); //INGRESO DE FILAS

        columna = Integer.parseInt(JOptionPane.showInputDialog("Columnas: ")); //INGRESO DE COLUMNAS

        matriz = new int[fila][columna];

    }
    public void agregarMatriz(){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                valor = Integer.parseInt(JOptionPane.showInputDialog("Valores: ")); //INGRESO DE LOS VALORES DE LA MATRIZ

                matriz[i][j] = valor;
            }
        }
    }
    public void mostrarMatriz(){
        System.out.println("------ MATRIZ ------");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[i].length; j++){    //ORDENANDO LOS VALORES DENTRO DE LA MATRIZ
                System.out.print(matriz[i][j]+" "); //MOSTRANDO LA MATRIZ ORDENADA CON LOS VALORES
            }
            System.out.println();
        }
    }
    public void inversaMatriz(){
        System.out.println("------ INVERSA ------");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz.length;j++){
                int row = j;
                int column = i;
                System.out.print(matriz[i][j]=0);

                if(i==j){
                    System.out.print(matriz[i][j]=1);
                }
            }
            System.out.println();
        }
    }

    public static void main (String[] args){
        Matriz2 matriz = new Matriz2();
        matriz.ordenMatriz();
        matriz.agregarMatriz();
        matriz.mostrarMatriz();
        matriz.inversaMatriz();
    }

}

