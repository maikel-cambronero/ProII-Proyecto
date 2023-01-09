
package Presentacion;

import java.awt.Image;
import java.awt.Toolkit;


public class frm_principal extends javax.swing.JFrame {

    
    public frm_principal() {
        initComponents();
        this.setLocationRelativeTo(null); // ejecuta el codigo en el centro de la pantalla
        getIconImage();
        
    }
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkp_principal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        menu_principal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al Sistema");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N

        btn_salir.setBackground(new java.awt.Color(204, 0, 0));
        btn_salir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        dkp_principal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkp_principal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkp_principal.setLayer(btn_salir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkp_principalLayout = new javax.swing.GroupLayout(dkp_principal);
        dkp_principal.setLayout(dkp_principalLayout);
        dkp_principalLayout.setHorizontalGroup(
            dkp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkp_principalLayout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(dkp_principalLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel2)
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkp_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dkp_principalLayout.setVerticalGroup(
            dkp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkp_principalLayout.createSequentialGroup()
                .addComponent(btn_salir)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");
        menu_principal.add(jMenu1);

        jMenu2.setText("Sistema");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/matricula.png"))); // NOI18N
        jMenuItem1.setText("Matrincular");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/costo.png"))); // NOI18N
        jMenuItem2.setText("Factura ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        menu_principal.add(jMenu2);

        setJMenuBar(menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkp_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkp_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ifm_Mantenimiento_Matricula ventanaMatricula = new ifm_Mantenimiento_Matricula();  
        dkp_principal.add(ventanaMatricula); 
        ventanaMatricula.show(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ifm_Mantenimiento_Pagos ventanaPagos = new ifm_Mantenimiento_Pagos(); 
        dkp_principal.add(ventanaPagos); 
        ventanaPagos.show();  
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JDesktopPane dkp_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menu_principal;
    // End of variables declaration//GEN-END:variables
}
