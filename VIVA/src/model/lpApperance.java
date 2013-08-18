/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.visibility;
import javax.swing.JLayeredPane;

/**
 *
 * @author Win -8
 */
public class lpApperance {

    public void pVisible(JLayeredPane[] l) {
        for (int noL = 0; noL < l.length; noL++) {
            new visibility().vTure(l[noL]);
        }
    }
    public void pInVisible(JLayeredPane[] l) {
        for (int noL = 0; noL < l.length; noL++) {
            new visibility().vFalse(l[noL]);
        }
    }
}
