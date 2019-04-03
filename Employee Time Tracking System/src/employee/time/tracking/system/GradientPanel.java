/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.time.tracking.system;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.Serializable;
import javax.swing.JPanel;


/**
 *
 * @author InanEvin
 */
public class GradientPanel extends JPanel implements Serializable {

 
    private Color colorBegin = Color.BLACK;
    private Color colorEnd = Color.WHITE;
    
    public void setColorBegin(Color bgn) { this.colorBegin = bgn; }
    public Color getColorBegin() { return this.colorBegin; } 
    public void setColorEnd(Color end) { this.colorEnd = end; }
    public Color getColorEnd() { return this.colorEnd; }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = colorBegin;
        Color color2 = colorEnd;
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

}