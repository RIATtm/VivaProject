/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import javax.swing.JLayeredPane;

/**
 *
 * @author Win -8
 */
public class LPMoveRightTemp {

    int Fx, Fy, Fh, Ey, Eh, Ex, Ckx, Cky;

    public void tempPane(final Component c, final JLayeredPane l) {
        final int xC = c.getX();
        final int yC = c.getY();
        final int hC = c.getHeight();
        if (xC == 80 || xC == 190) {
            if (xC == 80) {
                Fx = 190;
                Fy = 159;
                Fh = 610;
                Ckx = 320;
                Cky = 80;
                Ey=24;
            }
            if (xC == 190) {
                Fx = 320;
                Fy = 60;
                Fh = 610;
                Ey = 56;
                Eh = 127;
                Ckx = 320;
                Cky = 80;
                Ex = 1;

            }

            if (xC < Ckx && yC > Cky) {
                for (int lx = xC - Ex, ly = yC - Ey, lh = hC; lx <= Fx && ly >= Fy && lh <= Fh; lx++, ly--, lh++) {
                    lx++;
                    lx++;
                    c.setLocation(lx, ly);
                    try {
                        Thread.sleep(4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(ly);
                    c.setSize(727, lh + Eh);
                }
            }
        }
        if (xC == 320) {
            if (xC == 320) {
                Fx = 450;
                Fy = 159;
                Fh = 440;
                Ckx = 320;
                Eh = 129;
                Ey = 59;
                Ex = 8;
            }

            if (Ckx == xC) {
                for (int lx = xC + Ex, ly = yC + Ey, lh = hC - Eh; lx <= Fx && ly <= Fy /*&& lh >= Fh*/; lx++, ly++, lh--) {
                    lx++;
                    lx++;
                    c.setLocation(lx, ly);

                    try {
                        Thread.sleep(4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    c.setSize(727, lh);



                }

            }
        }

        if (xC == 450) {
            if (xC==450) {
                Fx = 560;
                Fy = 220;
                Fh = 440;
                Ckx = 450;
                Eh = 149;
                Ey = 58;
                Ex = 102;
            }

            if (Ckx == xC) {
                for (int lx = xC + Ex, ly = yC + Ey, lh = hC - Eh; lx <= Fx /*&& ly <= Fy /*&& lh >= Fh*/; lx++, ly++, lh--) {
                    lx++;
                    lx++;
                    c.setLocation(lx, ly);

                    try {
                        Thread.sleep(4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    c.setSize(727, lh);
                }

            }
        }
        if(xC==560){
            
                Fx = 80;
                Fy = 219;
                Fh = 330;
                Ckx = 560;
                Eh = 129;
                Ey = 59;
                Ex = 2;
                if (Ckx == xC) {
                    
                   
                for (int lx = xC+Ex/* , ly = yC, lh = hC */; lx >= Fx /*&& ly <= Fy /*&& lh >= Fh*/; lx--) {
                    lx--;
                    lx--;
                    c.setLocation(lx, Fy);
                    try {
                        Thread.sleep(4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(lx);
                    c.setSize(727, Fh);
                  
                }

            }
        }
    }
}
