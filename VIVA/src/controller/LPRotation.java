/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Component;
import javax.swing.JLayeredPane;
import model.LPMoveRightTemp;

/**
 *
 * @author Win -8
 */
public class LPRotation {

    public void rightAction(final Component c1,final Component c2, final Component c3, final JLayeredPane l) {
        final int xC = c1.getX();
        if(xC==80){}if(xC==190){}
        new Thread(new Runnable() {
            @Override
            public void run() {
                new LPMoveRightTemp().tempPane(c1, l);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                new LPMoveRightTemp().tempPane(c2, l);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                new LPMoveRightTemp().tempPane(c3, l);
            }
        }).start();
    }
}
