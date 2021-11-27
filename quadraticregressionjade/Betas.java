package quadraticregressionjade;
/**
 *
 * @author Tavin
 */
public class Betas {
     double b1, b0, b2, ds;

     
    //Determinante del sistema
     public double DS (int n, double xi, double x2, double x3, double x4, double yi, double xiyi, double x2yi){
         
         ds = ((n * x2 * x4) + (xi * x3 * x2) + (x2 * xi * x3) - (xi * xi * x4) - (n * x3 * x3) - (x2 * x2 * x2));
         
         return ds;
     }
     
     
     // Operacion para sacar B0
     public double DB0(int n, double xi, double x2, double x3, double x4, double yi, double xiyi, double x2yi) {
        b0 = (yi * x2 * x4)+(xi * x3 * x2yi)+(xiyi * x3 * x2)-(x2 * x2 * x2yi)-(x3 * x3 * yi)-(xiyi * xi * x4);
        b0 = b0/ds;

        return b0;
    }
    
    // Operacion para sacar B1
    public double DB1(int n, double xi, double x2, double x3, double x4, double yi, double xiyi, double x2yi) {
        b1 = (n * xiyi * x4)+(yi * x3 * x2)+(xi * x2yi *x2)-(x2 * xiyi * x2)-(x3 * x2yi * n)-(xi * yi * x4);
        b1 = b1/ds;

        return b1;
    }

    // Operacion para sacar B0
    public double DB2(int n, double xi, double x2, double x3, double x4, double yi, double xiyi, double x2yi) {
        b2 = (n * x2 * x2yi)+(xi * xiyi * x2)+(xi * x3 * yi)-(yi * x2 * x2)-(xiyi * x3 * n)-(xi * xi *x2yi);
        b2 = b2/ds;

        return b2;
    }
    
    
    
}
