package Presentacion;

import Negocio.Matricula;
import Negocio.Pagos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ifm_Mantenimiento_Pagos extends javax.swing.JInternalFrame {

    ArrayList<Pagos> listaPagos;
    
    int indice = 0;
    Pagos pagos;
    String cedula;
    String nombreEstu;
    String mes;
    String modo;
    String fecha;
    String grado;
    String idioma;
    int total;
    DefaultTableModel tablaPagos;

    public ifm_Mantenimiento_Pagos() {
        initComponents();
        pagos = new Pagos();
        listaPagos = pagos.leerArchivo();
        
        cedula = "";
        nombreEstu = "";
        mes = "";
        modo = "";
        fecha = "";
        grado = "";
        idioma = "";
        total = 0;
        

        cargarTablaEstudiantes();
        actualizarTablaEstudiantes();
    }
    
    public void cargarTablaEstudiantes() { 
        tablaPagos = new DefaultTableModel(); 
        tablaPagos.addColumn("Cedula");
        tablaPagos.addColumn("Estudiante");
        tablaPagos.addColumn("Mes a Pagar");
        tablaPagos.addColumn("Modo de Pago");
        tablaPagos.addColumn("Fecha");
        tablaPagos.addColumn("Idioma Matriculado");
        tablaPagos.addColumn("Grado");
        tablaPagos.addColumn("Total a pagar");
        this.jbl_pagos.setModel(tablaPagos); 
    }

    public void actualizarTablaEstudiantes() { 
        tablaPagos.setRowCount(0); 
        for (int i = 0; i < listaPagos.size(); i++) { 
            
            Object[] fila = {listaPagos.get(i).getCedula(), 
                             listaPagos.get(i).getNombreEstu(), 
                             listaPagos.get(i).getMes(), 
                             listaPagos.get(i).getModo(),
                             listaPagos.get(i).getFecha(),
                             listaPagos.get(i).getIdioma(),
                             listaPagos.get(i).getGrado(),
                             listaPagos.get(i).getTotal()};
                             tablaPagos.addRow(fila); 
        } 
    }
    
    public void estructurarArchivo(){ 
    String informacion = ""; 
        for (int i = 0; i < jbl_pagos.getRowCount(); i++) {
            informacion += tablaPagos.getValueAt(i, 0)+"/"+ //ced
                           tablaPagos.getValueAt(i, 1)+"/"+ // nom
                           tablaPagos.getValueAt(i, 2)+"/"+  // mes
                           tablaPagos.getValueAt(i, 3)+"/"+ // modo
                           tablaPagos.getValueAt(i, 4)+"/"+ // fecha
                           tablaPagos.getValueAt(i, 5)+"/"+ // idioma 
                           tablaPagos.getValueAt(i, 6)+"/"+ // grado
                           tablaPagos.getValueAt(i, 7)+"\n"; // total
                           
             
        }
        pagos.guardarArchivo(informacion); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_ced = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreEstu = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbx_grado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cbx_mes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_modo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_idioma = new javax.swing.JTextField();
        btn_pagar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbl_pagos = new javax.swing.JTable();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(19, 25, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema de Pagos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(204, 255, 204))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Cedula del Estudiante");

        txt_ced.setBackground(new java.awt.Color(0, 0, 102));
        txt_ced.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_ced.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nombre del Estudiante");

        txt_nombreEstu.setBackground(new java.awt.Color(0, 0, 102));
        txt_nombreEstu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_nombreEstu.setForeground(new java.awt.Color(255, 255, 255));

        jbtn_buscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Gradoa a Matricular");

        cbx_grado.setBackground(new java.awt.Color(0, 0, 102));
        cbx_grado.setForeground(new java.awt.Color(255, 255, 255));
        cbx_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-kinder", "Kinder.", "1° Grado.", "2° Grado.", "3° Grado.", "4° Grado.", "5° Grado.", "6° Grado." }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_grado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ced))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbtn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_ced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtn_buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        cbx_mes.setBackground(new java.awt.Color(204, 204, 204));
        cbx_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero. ", "Febrero.", "Marzo.", "Abril .", "Mayo. ", "Junio.", "Julio.", "Agosto.", "Septiembre.", "Octubre.", "Nomviembre.", "Diciembre" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mes a Pagar");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modo de Pago");

        cbx_modo.setBackground(new java.awt.Color(204, 204, 204));
        cbx_modo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual .", "Mensual. " }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha");

        txt_fecha.setBackground(new java.awt.Color(204, 204, 204));
        txt_fecha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Idioma Matriculado");

        txt_idioma.setBackground(new java.awt.Color(204, 204, 204));
        txt_idioma.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btn_pagar.setBackground(new java.awt.Color(255, 204, 255));
        btn_pagar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagar.png"))); // NOI18N
        btn_pagar.setText("Pagar");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(255, 204, 255));
        btn_modificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_mes, 0, 128, Short.MAX_VALUE)
                            .addComponent(cbx_modo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_fecha)
                            .addComponent(txt_idioma))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbx_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_modo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pagar)
                    .addComponent(btn_modificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbl_pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jbl_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_pagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jbl_pagos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
         cedula = txt_ced.getText();
         nombreEstu = txt_nombreEstu.getText();
         mes = cbx_mes.getSelectedItem().toString();
         modo = cbx_modo.getSelectedItem().toString();
         fecha = txt_fecha.getText();
         idioma = txt_idioma.getText();
         grado = cbx_grado.getSelectedItem().toString();
         
         
        boolean estadoMandarin = false;
        boolean estadoAleman = false;
        
        int mensual = 134000; 
        int año = 1575000;
        int idiomas = 54000;
        
        int mesMatricula = 0, mesMadarin = 0, mesAleman = 0 , pagoMtricula = 0, pagoMandarin = 0, pagoAleman = 0;
         if ((mesMatricula + listaPagos.get(indice).getPagoMatricula()) > 12){
            JOptionPane.showMessageDialog(null, "El estudiante ya ha realizado el pago de " + listaPagos.get(indice).getPagoMatricula() + " cuotas de Matricula \n Porfavor, ingrese los datos correctamente");
        }else if ((mesMadarin + listaPagos.get(indice).getPagoMandarin()) > 12 && estadoMandarin == false){
            JOptionPane.showMessageDialog(null,"El estudiante ya ha realizado el pago de " + listaPagos.get(indice).getPagoMandarin()+ " cuotas del curso de Mandarín \n Porfavor, ingrese los datos correctamente");
        }else if ((mesAleman + listaPagos.get(indice).getPagoAleman()) > 12 && estadoAleman == false){
            JOptionPane.showMessageDialog(null,"El estudiante ya ha realizado el pago de " + listaPagos.get(indice).getPagoAleman()+ " cuotas del curso de Alemán \n Porfavor, ingrese los datos correctamente");
        }else{
            listaPagos.get(indice).setCedula(listaPagos.get(indice).getCedula());
            listaPagos.get(indice).setNombreEstu(listaPagos.get(indice).getNombreEstu());
            listaPagos.get(indice).setPagoMatricula(listaPagos.get(indice).getPagoMatricula() + mesMatricula);
            if(listaPagos.get(indice).getPagoMandarin()==13||listaPagos.get(indice).getPagoAleman()==13){
        if(estadoMandarin==true){
            listaPagos.get(indice).setPagoMandarin(listaPagos.get(indice).getPagoMandarin());
        }
        if(estadoAleman==true){
           listaPagos.get(indice).setPagoAleman(listaPagos.get(indice).getPagoAleman());
        }
        }else{
        listaPagos.get(indice).setPagoMandarin(listaPagos.get(indice).getPagoMandarin()+mesMadarin);
        listaPagos.get(indice).setPagoAleman(listaPagos.get(indice).getPagoAleman()+mesAleman);       
        } 
        pagos = new Pagos(cedula, nombreEstu, mes , modo, fecha, idioma, grado, total);  
         listaPagos.add(pagos);
        
        JOptionPane.showMessageDialog(this, "Pago realizado con exito...");
        actualizarTablaEstudiantes();
       } 
    }//GEN-LAST:event_btn_pagarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int fila = jbl_pagos.getSelectedRow();
        if (fila >= 0) {
                        jbl_pagos.setValueAt(txt_ced.getText(),fila,0);
                        jbl_pagos.setValueAt(txt_nombreEstu.getText(),fila,1);
                        jbl_pagos.setValueAt(cbx_mes.getSelectedItem(),fila,2);
                        jbl_pagos.setValueAt(cbx_modo.getSelectedItem(),fila,3);
                        jbl_pagos.setValueAt(txt_fecha.getText(),fila,4);
                        jbl_pagos.setValueAt(cbx_grado.getSelectedItem(),fila,5);
                        jbl_pagos.setValueAt(txt_idioma.getText(),fila,6);
                        } else {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla pagos...");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        estructurarArchivo();
    }//GEN-LAST:event_formInternalFrameClosed

    private void jbl_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_pagosMouseClicked
        int fila = jbl_pagos.rowAtPoint(evt.getPoint()); 
                    txt_ced.setText(String.valueOf(jbl_pagos.getValueAt(fila, 0)));
                    txt_nombreEstu.setText(String.valueOf(jbl_pagos.getValueAt(fila, 1)));
                    cbx_mes.setSelectedItem(String.valueOf(jbl_pagos.getValueAt(fila, 2)));
                    cbx_modo.setSelectedItem(String.valueOf(jbl_pagos.getValueAt(fila, 3)));
                    txt_fecha.setText(String.valueOf(jbl_pagos.getValueAt(fila, 4)));
                    cbx_grado.setSelectedItem(String.valueOf(jbl_pagos.getValueAt(fila, 5)));
                    txt_idioma.setText(String.valueOf(jbl_pagos.getValueAt(fila, 6)));
    }//GEN-LAST:event_jbl_pagosMouseClicked

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
           Matricula matricula;
        matricula = new Matricula();
        ArrayList<Matricula> listaMatricula;
        listaMatricula = matricula.leerArchivo(); 
        boolean encontrado = false;
        if (txt_ced.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digete la  cédula a buscar");
        } else {
            for (int i = 0; i < listaMatricula.size(); i++) {
                if (listaMatricula.get(i).getCedula().equals(txt_ced.getText())) {

                    int fila = (i);
                    txt_nombreEstu.setText(listaMatricula.get(i).getNombreEstudiante());
                    cbx_grado.setSelectedItem(listaMatricula.get(i).getGrado());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "No encontrado");
            }
        }
    }//GEN-LAST:event_jbtn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_pagar;
    private javax.swing.JComboBox<String> cbx_grado;
    private javax.swing.JComboBox<String> cbx_mes;
    private javax.swing.JComboBox<String> cbx_modo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jbl_pagos;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JTextField txt_ced;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_idioma;
    private javax.swing.JTextField txt_nombreEstu;
    // End of variables declaration//GEN-END:variables
}
