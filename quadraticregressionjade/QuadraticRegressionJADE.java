//Octavio Corral Tovar 5to "A" Sistemas
//No. Control 19011234

package quadraticregressionjade;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
/**
 *
 * @author Tavin
 */
public class QuadraticRegressionJADE extends Agent{

     @Override
    protected void setup(){
        
        System.out.println("Agente "+getLocalName()+" iniciado");
        addBehaviour(new MyOneShotBehaviour());
    
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
        
        Betas betas = new Betas();
        Xoperations operaciones = new Xoperations();
        Multixy multi = new Multixy();
        
        

        /*//Polinomial
        double numerosx [] = {50, 50, 50, 70, 70, 70, 80,80,80,90,90,90,100,100,100};
        double numerosy [] = {3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5,2.9,2.4,3.0,3.1,2.8,3.3,3.5,3.0};*/
        
        //Cuadratico
        /*double numerosx[] = {-3,-2,-1,0,1,2,3};
        double numerosy[] = {7.5,3,0.5,1,3,6,14};*/
        
        //Temperatura
        double numerosx[] = {0,20,40,60,80,100};
        double numerosy[] = {0.0002,0.0012,0.0060,0.0300,0.0900,0.2700};
        
        int n = numerosx.length;
        
        double xi = operaciones.NumerosXi(numerosx);
        double yi = operaciones.NumerosYi(numerosy);
        double x2 = operaciones.NumerosX2(numerosx);
        double x3 = operaciones.NumerosX3(numerosx);
        double x4 = operaciones.NumerosX4(numerosx);
        double xiyi = multi.NumerosXiYi(numerosx,numerosy);
        double x2yi = multi.NumerosX2Yi(numerosx,numerosy);
        double ds = betas.DS(n, xi, x2, x3, x4, yi, xiyi, x2yi);
        double beta0 = betas.DB0(n, xi, x2, x3, x4, yi, xiyi, x2yi);
        double beta1 = betas.DB1(n, xi, x2, x3, x4, yi, xiyi, x2yi);
        double beta2 = betas.DB2(n, xi, x2, x3, x4, yi, xiyi, x2yi);        
        

        System.out.print("\n n es: "+n);
        System.out.print("\n Xi es: "+xi);    
        System.out.print("\n Yi es: "+yi);    
        System.out.print("\n X^2 es: "+x2);    
        System.out.print("\n X^3 es: "+x3);   
        System.out.print("\n X^4 es: "+x4);    
        System.out.print("\n X*Y es: "+xiyi);
        System.out.print("\n X^2*Y es: "+x2yi+"\n");
        System.out.print("\n Ds es: "+ds);
        System.out.print("\n Beta 0 es: "+beta0);
        System.out.print("\n Beta 1 es: "+beta1);
        System.out.print("\n Beta 2 es: "+beta2+"\n");
    } 
    
    @Override
    public int onEnd() {
        System.out.println("\nAgente Muerto");
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }
    
}
