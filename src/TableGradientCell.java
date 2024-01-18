package src;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TableGradientCell extends DefaultTableCellRenderer {
    private Color color;
    private Color color1;
    private int x;
    private int width;
    private DefaultTableCellRenderer centerRender;

    public TableGradientCell(){
        setHorizontalAlignment(JLabel.CENTER);
    }

    public Component getTableCellRendererComponent(JTable table , Object value , boolean isSelected , boolean hasFocus , int row , int col){
        Component com = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,col);
        Rectangle cellRec = table.getCellRect(row,col,true);
        x=-cellRec.x;
        width= table.getWidth() - cellRec.x;
        table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        return com;
    }

//    protected void paintComponent(Graphics g){
//        Graphics2D g2 = (Graphics2D) g.create();
//        g2.setPaint(new GradientPaint(x,0,color,width,0,color1));
//        g2.fillRect(0,0,getWidth(),getHeight());
//        g2.dispose();
//        super.paintComponent(g);
//
//   }
}
