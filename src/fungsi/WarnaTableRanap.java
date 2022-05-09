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
public class WarnaTableRanap extends DefaultTableCellRenderer {
    public int kolom = 16;
    public int statbayar = 20;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 1){
            component.setBackground(new Color(255,246,244));
        }else{
            component.setBackground(new Color(255,255,255));
        }
         if (table.getValueAt(row, kolom).toString().equals("Sehat")){
            component.setBackground(new Color(78,235,115));
        }
         if (table.getValueAt(row, kolom).toString().equals("Rujuk")){
            component.setBackground(new Color(167,165,189));
        }
         if (table.getValueAt(row, kolom).toString().equals("APS")){
            component.setBackground(new Color(243,156,80));
        }
         if (table.getValueAt(row, kolom).toString().equals("+")){
            component.setBackground(new Color(178,133,104));
        }
         if (table.getValueAt(row, kolom).toString().equals("Meninggal")){
            component.setBackground(new Color(178,133,104));
        }
         if (table.getValueAt(row, kolom).toString().equals("Sembuh")){
            component.setBackground(new Color(78,235,115));
        }
         if (table.getValueAt(row, kolom).toString().equals("Membaik")){
            component.setBackground(new Color(78,235,115));
        }
         if (table.getValueAt(row, kolom).toString().equals("Pulang Paksa")){
            component.setBackground(new Color(243,156,80));
        }
         if (table.getValueAt(row, kolom).toString().equals("Status Belum Lengkap")){
            component.setBackground(new Color(57,143,240));
        }
//         if (table.getValueAt(row, statbayar).toString().equals("Sudah Bayar")){
//            component.setBackground(new Color(57,143,240));
//        }         
        return component;
    }

}
