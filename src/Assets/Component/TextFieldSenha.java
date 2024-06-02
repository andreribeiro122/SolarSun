package solarsun.Assets.Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class TextFieldSenha extends JPasswordField {
    
    private Color BG = Color.WHITE;
    
    public TextFieldSenha() {
        setBackground(new Color(255, 255, 255, 0));
        setOpaque(false);
        setBorder(new EmptyBorder(0, 15, 0, 15));
        setFont(new java.awt.Font("sansserif", 0, 14));
        setSelectionColor(new Color(80, 199, 255));
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(BG);
        g2.fillRoundRect(0, 0, width, height, height, height);
        super.paintComponent(g);
    }  
}
