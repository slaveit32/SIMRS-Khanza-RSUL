/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Owner
 */
public class WarnaTableKasirRalan extends DefaultTableCellRenderer {
    public int kolom = 15;
    public int statrawat = 10;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 1){
            component.setBackground(new Color(255,246,244));
        }else{
            component.setBackground(new Color(255,255,255));
        }
//         if (table.getValueAt(row, kolom).toString().equals("Sudah Bayar")){
//            component.setBackground(new Color(57,143,240));
//        }
         if (table.getValueAt(row, statrawat).toString().equals("Batal")){
            component.setBackground(new Color(235,78,83));
        }
         if (table.getValueAt(row, statrawat).toString().equals("Sudah")){
            component.setBackground(new Color(78,235,115));
        }
         if (table.getValueAt(row, statrawat).toString().equals("Berkas Diterima")){
            component.setBackground(new Color(156,78,235));
        }
         if (table.getValueAt(row, statrawat).toString().equals("Dirujuk")){
            component.setBackground(new Color(167,165,189));
        }
         if (table.getValueAt(row, statrawat).toString().equals("Meninggal")){
            component.setBackground(new Color(178,133,104));
        } 
         if (table.getValueAt(row, statrawat).toString().equals("Dirawat")){
            component.setBackground(new Color(240,147,243));
        }
         if (table.getValueAt(row, statrawat).toString().equals("Pulang Paksa")){
            component.setBackground(new Color(243,156,80));
        }         
        return component;
    }

}
