/***
 * ∂ØÃ¨º”‘ÿ±≥æ∞
 */
package com.tools;
import java.awt.*;

import javax.swing.*;

public class ImagePanel extends JPanel {
Image im;
public ImagePanel(Image im)
{
	this.im=im;
int w=Toolkit.getDefaultToolkit().getScreenSize().width;
int h=Toolkit.getDefaultToolkit().getScreenSize().height;
this.setSize(w,h);
}

public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);
}
}
