
package tienda_de_animales;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class MyIcon implements Icon{
    String imagen= "";
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        
    Image image =
    new ImageIcon(getClass().getResource(imagen)).getImage();
        g.drawImage(image,x ,y,c);
    }
    public int getIconWidth(){
        return 150;
    }
    public int getIconHeight(){
        return 150;
    }
}

