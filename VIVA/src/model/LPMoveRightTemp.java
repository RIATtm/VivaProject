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

    int Fx, Fy, Fh, Ey, Eh, Ckx, Cky;

    public void tempPane(final Component c, final JLayeredPane l) {
        final int xC = c.getX();
        final int yC = c.getY();
        final int hC = c.getHeight();
        if (xC == 80) {
            Fx = 190;
            Fy = 110;
            Fh = 610;
            Ckx = 320;
            Cky = 80;

        }
        if (xC == 190) {
            Fx = 320;
            Fy = 60;
            Fh = 610;
            Ey = 7;
            Eh = 127;
            Ckx = 320;
            Cky = 80;

        }
        if (xC == 320) {
            Fx = 450;
            Fy = 110;
            Fh = 610;
            Ckx = 320;
            if (Ckx == xC && Cky < yC) {
                for (int lx = xC, ly = yC - Ey, lh = hC; lx <= Fx && ly <= Fy /*&& lh >= Fh*/; lx++, ly++, lh--) {
                    lx++;
                    c.setLocation(lx, ly);
                    lx++;
                    try {
                        Thread.sleep(4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    c.setSize(727, lh + Eh);
                }

            }
        }
        if (xC < Ckx && yC > Cky) {
            for (int lx = xC, ly = yC - Ey, lh = hC; lx <= Fx && ly >= Fy && lh <= Fh; lx++, ly--, lh++) {
                lx++;
                c.setLocation(lx, ly);
                lx++;
                try {
                    Thread.sleep(4);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c.setSize(727, lh + Eh);
            }
        }
    }
}
