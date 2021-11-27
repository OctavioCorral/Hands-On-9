package quadraticregressionjade;
/**
 *
 * @author Tavin
 */
public class Multixy {
    
    int i,j;
    double xiyi,x2yi;
    
    
    // Multiplicacion de xi y yi entre si
    public double NumerosXiYi(double numerosx[], double numerosy[]) {
        for (i = 0; i < numerosx.length; i++) {
            xiyi += (numerosx[i] * numerosy[i]);
        }

        return xiyi;
    }
    
    // Multiplicacion de x2 y yi entre si
    public double NumerosX2Yi(double numerosx[], double numerosy[]) {
        for (i = 0; i < numerosx.length; i++) {
            x2yi += (Math.pow(numerosx[i],2)) * numerosy[i];
        }

        return x2yi;
    }   

}
    
    