/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.border.Border;

/**
 *
 * @author ASUS
 */
public class fondoOdontograma implements Border {
    private BufferedImage image = null;
    
    public fondoOdontograma(BufferedImage pimagen) {
        image = pimagen;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (image != null) {
            g.drawImage(image, 0, 0, width, height, null);
        }
    }

    public Insets getBorderInsets(Component c) {
        return new Insets (0, 0, 0, 0);
    }

    public boolean isBorderOpaque() {
        return true;
    }
    
    
}
