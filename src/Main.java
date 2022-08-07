import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        
        int 
        ///Base de Datos de Administración de la empresa...
        System.out.println();
        System.out.println("\Insertar Datos en la Tabla");
       
        JFrame frame = new JFrame(" Mi Base de Datos");
        JTable table = new JTable();
        DefaultTableModel tableModel = new DefaultTableModel(5, 3);
        JButton okButton = new JButton("ok");

        table.setModel(tableModel);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentRow = table.getSelectedRow();
                int currentColum = table.getSelectedColumn();
                JOptionPane.showMessageDialog(null, table.getValueAt(currentRow, currentColum));
            }
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.add(table, 0, 0);
        frame.add(okButton, 0, 1);
        frame.setVisible(true);
        
     

    }
}
