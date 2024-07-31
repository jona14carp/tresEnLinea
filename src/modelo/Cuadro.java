
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cuadro extends JPanel{
    private int ancho;
    private int alto;
    private Color color;
    private TipoImagen tipoImagen;
    private boolean dibujado;
    private int i;
    private int j;
    
    public Cuadro(int ancho, int alto, Color color){
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        dibujado = false;
        init();
    }
    private void init(){
        setSize(ancho,alto);
        setBackground(color);
    }

    @Override
    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D)gg;
        
        ImageIcon imagen = new ImageIcon();
        if (tipoImagen==tipoImagen.CIRCULO) 
            imagen=new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        else if (tipoImagen==tipoImagen.EQUIS) 
            imagen=new ImageIcon(getClass().getResource(Ruta.EQUIS));
        else if(tipoImagen==tipoImagen.LINEA1)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA1));
        else if(tipoImagen==tipoImagen.LINEA2)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA2));
        else if(tipoImagen==tipoImagen.LINEA3)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA3));
        else if(tipoImagen==tipoImagen.LINEA4)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA4));
        else if(tipoImagen==tipoImagen.LINEA5)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA5));
        else if(tipoImagen==tipoImagen.LINEA6)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA6));
        else if(tipoImagen==tipoImagen.LINEA7)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA7));
        else if(tipoImagen==tipoImagen.LINEA8)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA8));
        
        g.drawImage(imagen.getImage(),0, 0, this.getWidth(), this.getHeight(), null);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public boolean isDibujado() {
        return dibujado;
    }

    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
    
    
}
