
package ec.edu.espe.apanadossystem.view;

import ec.edu.espe.apanadossystem.model.Customer;
import ec.edu.espe.apanadossystem.model.Food;
import ec.edu.espe.apanadossystem.model.Order;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class FrmRate extends javax.swing.JFrame {
    ArrayList<Food> newFoodOrder;
    Order newOrder;
    Customer newCustomer;
    /**
     * Creates new form FrmRate
     */
    public FrmRate(ArrayList<Food> Order,Order order,Customer customer) {
        initComponents();
       newFoodOrder = Order;
       newOrder = order;
       newCustomer = customer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSentRate = new javax.swing.JButton();
        btnSalirCalificación = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Chocolate", 0, 36)); // NOI18N
        jLabel1.setText("¡Califícanos!");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Tu opinión es importante, ¡Ayúdanos a mejorar!");

        btnSentRate.setText("Enviar");
        btnSentRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSentRateActionPerformed(evt);
            }
        });

        btnSalirCalificación.setText("Salir");
        btnSalirCalificación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCalificaciónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(85, 85, 85))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnSalirCalificación)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSentRate)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSentRate)
                    .addComponent(btnSalirCalificación))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSentRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSentRateActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por ayudarnos a mejorar\nEn breve se le desplegará su factura");
        FrmInvoice windowFrmInvoice = new FrmInvoice(newFoodOrder,newOrder,newCustomer);
        windowFrmInvoice.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSentRateActionPerformed

    private void btnSalirCalificaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCalificaciónActionPerformed
        JOptionPane.showMessageDialog(this, "Gracias, A continuación se le desplegará su factura");
        FrmInvoice windowFrmInvoice = new FrmInvoice(newFoodOrder,newOrder,newCustomer);
        windowFrmInvoice.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirCalificaciónActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirCalificación;
    private javax.swing.JButton btnSentRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
