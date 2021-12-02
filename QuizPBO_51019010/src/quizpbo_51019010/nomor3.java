/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quizpbo_51019010;
import java.awt.*;
/**
 *
 * @author helnat
 */
public class nomor3 extends Panel {
    nomor3(){
        
    }
    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
       //mobil
         g.setColor(Color.blue);
        g.fill3DRect(200,250,360,180,true);
        g.setColor(Color.blue);
        g.fill3DRect(150,170,250,250,false);
        //ban
        g.setColor(Color.RED);
        g.fillArc(230,380,90,100,0,-180);
        g.fillOval(350,350,130,130);
    }
        
    public static void main (String[] args){
       Frame f = new Frame ("Quiz2_PBO");
       nomor3 hadiah= new nomor3();   
       f.add(hadiah);
       f.setSize(900,900);
       f.setVisible(true);
    }
    
}
