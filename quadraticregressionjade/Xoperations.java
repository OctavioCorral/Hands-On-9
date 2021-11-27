package quadraticregressionjade;
/**
 *
 * @author Tavin
 */
public class Xoperations {
    
    int i,j;
    double totaly,totalx,totalx2,totalx3,totalx4;
    
    
    
    // Sumar los numeros guardados en los arreglos de xi
    public double NumerosXi(double numerosx[]) {
        for (i = 0; i < numerosx.length; i++) {
            totalx += numerosx[i];  
        }
     
        return totalx;
    }

    // Sumar los numeros guardados en los arreglos de yi
    public double NumerosYi(double numerosy[]) {
        for (j = 0; j < numerosy.length; j++) {
            totaly += numerosy[j];
        }

        return totaly;
    }

    // X2
    public double NumerosX2(double numerosx[]) {
        for (i = 0; i < numerosx.length; i++) {
            totalx2 += Math.pow(numerosx[i], 2);
        }

        return totalx2;
    }
    
    // X3
    public double NumerosX3(double numerosx[]) {
        for (i = 0; i < numerosx.length; i++) {
            totalx3 += Math.pow(numerosx[i], 3);
        }

        return totalx3;
    }
    
    // X4
    public double NumerosX4(double numerosx[]) {
        for (i = 0; i < numerosx.length; i++) {
            totalx4 += Math.pow(numerosx[i], 4);
        }

        return totalx4;
    }
  
}
