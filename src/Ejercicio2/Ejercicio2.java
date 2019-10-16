package Ejercicio2;

import javax.swing.*;

public class Ejercicio2 {
    private static final int NUMERO_MAYOR=10;
    public static void main(String[] args) {
        try {
            int respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero mayor que "+NUMERO_MAYOR+" "));
            if (respuesta<NUMERO_MAYOR) throw new IllegalArgumentException();
            ContarAdelante desdeCero = new ContarAdelante(respuesta);
            ContarAtras hastaCero = new ContarAtras(respuesta);
            Thread t1 = new Thread(desdeCero);
            Thread t2 = new Thread(hastaCero);
            t1.start();
            t2.start();
        } catch (NumberFormatException nfe ){
            JOptionPane.showMessageDialog(null,"No has introducido un número válido","",JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException iae ){
            JOptionPane.showMessageDialog(null,"El número introducido debe ser mayor de "+NUMERO_MAYOR,"",JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
