package Presentacion;

import Negocio.Matricula;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class ifm_Mantenimiento_Matricula extends javax.swing.JInternalFrame {

    ArrayList<Matricula> listaMatricula;
    Matricula matricula;
    String cedula;
    String nombreEstudiante;
    int edad;
    String genero;
    String grado;
    String idiomas;
    String nombreEncargado;
    int telefono;
    String direccion;
    int año;
    DefaultTableModel tablaEstudiantes;

    public ifm_Mantenimiento_Matricula() {
        initComponents();

        matricula = new Matricula();
        listaMatricula = matricula.leerArchivo();

        cedula = "";
        nombreEstudiante = "";
        edad = 0;
        genero = "";
        grado = "";
        idiomas = "";
        nombreEncargado = "";
        telefono = 0;
        direccion = "";
        año = 0;

        cargarTablaEstudiantes();
        actualizarTablaEstudiantes();
        cargarComboAño();
        
    }

    public void cargarComboAño() {
        for (int i = 2009; i < 2023; i++) {
            cbx_año.addItem(String.valueOf(i));
        }
    }

    

    public void cargarTablaEstudiantes() {
        tablaEstudiantes = new DefaultTableModel();
        tablaEstudiantes.addColumn("Cedula");
        tablaEstudiantes.addColumn("Estudiante");
        tablaEstudiantes.addColumn("Edad");
        tablaEstudiantes.addColumn("Genero");
        tablaEstudiantes.addColumn("Grado");
        tablaEstudiantes.addColumn("Idioma");
        tablaEstudiantes.addColumn("Encargado");
        tablaEstudiantes.addColumn("Telefono");
        tablaEstudiantes.addColumn("Dirección");
        tablaEstudiantes.addColumn("Año de Matricula");
        this.jbl_estudiantes.setModel(tablaEstudiantes);
    }

    public void actualizarTablaEstudiantes() {
        tablaEstudiantes.setRowCount(0);
        for (int i = 0; i < listaMatricula.size(); i++) {

            Object[] fila = {listaMatricula.get(i).getCedula(),
                listaMatricula.get(i).getNombreEstudiante(),
                listaMatricula.get(i).getEdad(),
                listaMatricula.get(i).getGenero(),
                listaMatricula.get(i).getGrado(),
                listaMatricula.get(i).getIdiomas(),
                listaMatricula.get(i).getNombreEncargado(),
                listaMatricula.get(i).getTelefono(),
                listaMatricula.get(i).getDireccion(),
                listaMatricula.get(i).getAño()};

            tablaEstudiantes.addRow(fila);
        }
    }

    public void estructurarArchivo() {
        String informacion = "";
        for (int i = 0; i < jbl_estudiantes.getRowCount(); i++) {
            informacion += tablaEstudiantes.getValueAt(i, 0) + "/"
                    + tablaEstudiantes.getValueAt(i, 1) + "/"
                    + tablaEstudiantes.getValueAt(i, 2) + "/"
                    + tablaEstudiantes.getValueAt(i, 3) + "/"
                    + tablaEstudiantes.getValueAt(i, 4) + "/"
                    + tablaEstudiantes.getValueAt(i, 5) + "/"
                    + tablaEstudiantes.getValueAt(i, 6) + "/"
                    + tablaEstudiantes.getValueAt(i, 7) + "/"
                    + tablaEstudiantes.getValueAt(i, 8) + "/"
                    + tablaEstudiantes.getValueAt(i, 9) + "\n";

        }
        matricula.guardarArchivo(informacion);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGenero = new javax.swing.ButtonGroup();
        buttonGroupIdioma = new javax.swing.ButtonGroup();
        jPanelfondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombreestu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nom_pad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_direcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cell = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbl_estudiantes = new javax.swing.JTable();
        jPanelgenero = new javax.swing.JPanel();
        btn_masculino = new javax.swing.JRadioButton();
        btn_femenino = new javax.swing.JRadioButton();
        jPanelgenero1 = new javax.swing.JPanel();
        btn_Aleman = new javax.swing.JRadioButton();
        btn_mandarin = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cbx_grado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbx_año = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        txt_edad = new javax.swing.JTextField();

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

        jPanelfondo.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cédula del Estudiante :");

        txt_cedula.setBackground(new java.awt.Color(204, 204, 204));
        txt_cedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del Estudiante :");

        txt_nombreestu.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombreestu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad del Estudiante :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección Exacta :");

        txt_nom_pad.setBackground(new java.awt.Color(204, 204, 204));
        txt_nom_pad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre del encargado :");

        txt_direcion.setBackground(new java.awt.Color(204, 204, 204));
        txt_direcion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono del encargado :");

        txt_cell.setBackground(new java.awt.Color(204, 204, 204));
        txt_cell.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jbl_estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jbl_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_estudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jbl_estudiantes);

        jPanelgenero.setBackground(new java.awt.Color(204, 255, 255));
        jPanelgenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genro del Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        btn_masculino.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupGenero.add(btn_masculino);
        btn_masculino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_masculino.setText("Masculino ");
        btn_masculino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/masculino.png"))); // NOI18N
        btn_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masculinoActionPerformed(evt);
            }
        });

        btn_femenino.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupGenero.add(btn_femenino);
        btn_femenino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_femenino.setText("Femenino");
        btn_femenino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mujer.png"))); // NOI18N
        btn_femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_femeninoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelgeneroLayout = new javax.swing.GroupLayout(jPanelgenero);
        jPanelgenero.setLayout(jPanelgeneroLayout);
        jPanelgeneroLayout.setHorizontalGroup(
            jPanelgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelgeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_masculino)
                    .addComponent(btn_femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelgeneroLayout.setVerticalGroup(
            jPanelgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelgeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_masculino)
                .addGap(18, 18, 18)
                .addComponent(btn_femenino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelgenero1.setBackground(new java.awt.Color(204, 255, 255));
        jPanelgenero1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idiomas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        btn_Aleman.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupIdioma.add(btn_Aleman);
        btn_Aleman.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_Aleman.setText("Áleman");
        btn_Aleman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aleman.png"))); // NOI18N
        btn_Aleman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlemanActionPerformed(evt);
            }
        });

        btn_mandarin.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupIdioma.add(btn_mandarin);
        btn_mandarin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_mandarin.setText("Mandarín");
        btn_mandarin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madarin.png"))); // NOI18N
        btn_mandarin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mandarinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelgenero1Layout = new javax.swing.GroupLayout(jPanelgenero1);
        jPanelgenero1.setLayout(jPanelgenero1Layout);
        jPanelgenero1Layout.setHorizontalGroup(
            jPanelgenero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelgenero1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Aleman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btn_mandarin)
                .addContainerGap())
        );
        jPanelgenero1Layout.setVerticalGroup(
            jPanelgenero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelgenero1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelgenero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Aleman)
                    .addComponent(btn_mandarin))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Grado a Matricular :");

        cbx_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-kinder", "Kinder.", "1° Grado.", "2° Grado.", "3° Grado.", "4° Grado.", "5° Grado.", "6° Grado." }));
        cbx_grado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_gradoItemStateChanged(evt);
            }
        });
        cbx_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_gradoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Año de Matricula :");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btn_modificar.setBackground(new java.awt.Color(204, 255, 204));
        btn_modificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(204, 255, 204));
        btn_eliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(204, 255, 204));
        btn_buscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(204, 255, 204));
        btn_agregar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_buscar)
                        .addGap(48, 48, 48)
                        .addComponent(btn_eliminar)
                        .addGap(44, 44, 44)
                        .addComponent(btn_modificar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(btn_agregar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txt_edad.setBackground(new java.awt.Color(204, 204, 204));
        txt_edad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanelfondoLayout = new javax.swing.GroupLayout(jPanelfondo);
        jPanelfondo.setLayout(jPanelfondoLayout);
        jPanelfondoLayout.setHorizontalGroup(
            jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelfondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelfondoLayout.createSequentialGroup()
                        .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelfondoLayout.createSequentialGroup()
                                .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelfondoLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanelfondoLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_nombreestu, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(txt_cedula)))
                            .addGroup(jPanelfondoLayout.createSequentialGroup()
                                .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelfondoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_edad))))
                        .addGap(88, 88, 88)
                        .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelfondoLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cbx_año, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelfondoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nom_pad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_direcion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelfondoLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_cell, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelfondoLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(jPanelgenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelfondoLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jPanelgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelfondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addGroup(jPanelfondoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelfondoLayout.setVerticalGroup(
            jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelfondoLayout.createSequentialGroup()
                        .addComponent(jPanelgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelgenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelfondoLayout.createSequentialGroup()
                        .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_nom_pad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_cell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nombreestu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_direcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masculinoActionPerformed
        this.genero = "Masculino";
    }//GEN-LAST:event_btn_masculinoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        cedula = txt_cedula.getText();
        nombreEstudiante = txt_nombreestu.getText();
        edad = Integer.parseInt(txt_edad.getText());
        genero = this.genero;
        grado = cbx_grado.getSelectedItem().toString();
        idiomas = this.idiomas;
        nombreEncargado = txt_nom_pad.getText();
        telefono = Integer.parseInt(txt_cell.getText());
        direccion = txt_direcion.getText();
        año = Integer.parseInt(cbx_año.getSelectedItem().toString());
        
        if ((cedula.equals("") || nombreEstudiante.equals("") || edad == 0 || nombreEncargado.equals("") || telefono == 0 || direccion.equals("") || ((edad < 4 || edad > 5) && grado.equals("Pre-kinder")))) {
            JOptionPane.showMessageDialog(this, "No puede ingresar por la edad");
        }else{
         matricula = new Matricula(cedula, nombreEstudiante, edad, genero, grado, idiomas, nombreEncargado, telefono, direccion, año);
        listaMatricula.add(matricula);
        JOptionPane.showMessageDialog(this, "Estudiante fue matriculado con exito...");
        actualizarTablaEstudiantes();
        }
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        estructurarArchivo();
    }//GEN-LAST:event_formInternalFrameClosed

    private void btn_femeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_femeninoActionPerformed
        this.genero = "Femenino";
    }//GEN-LAST:event_btn_femeninoActionPerformed

    private void btn_AlemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlemanActionPerformed
        this.idiomas = "Aleman";
    }//GEN-LAST:event_btn_AlemanActionPerformed

    private void btn_mandarinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mandarinActionPerformed
        this.idiomas = "Mandarin";
    }//GEN-LAST:event_btn_mandarinActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        boolean encontrado = false;
        if (txt_cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digete la  cédula a buscar");
        } else {
            for (int i = 0; i < listaMatricula.size(); i++) {
                if (listaMatricula.get(i).getCedula().equals(txt_cedula.getText())) {

                    int fila = (i);
                    txt_cedula.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 0)));
                    txt_nombreestu.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 1)));
                    txt_edad.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 2)));
                    cbx_grado.setSelectedItem(String.valueOf(jbl_estudiantes.getValueAt(fila, 4)));
                    txt_nom_pad.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 6)));
                    txt_cell.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 7)));
                    txt_direcion.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 8)));
                    cbx_año.setSelectedItem(String.valueOf(jbl_estudiantes.getValueAt(fila, 9)));

                    encontrado = true;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "No encontrado");
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = jbl_estudiantes.getSelectedRow();
        if (fila >= 0) {
            tablaEstudiantes.removeRow(fila);
            JOptionPane.showMessageDialog(this, "El estudiante fue eliminado...");
        } else {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla de articulos...");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int fila = jbl_estudiantes.getSelectedRow();
        if (fila >= 0) {
            jbl_estudiantes.setValueAt(txt_cedula.getText(), fila, 0);
            jbl_estudiantes.setValueAt(txt_nombreestu.getText(), fila, 1);
            jbl_estudiantes.setValueAt(txt_edad.getText(), fila, 2);
            jbl_estudiantes.setValueAt(this.genero, fila, 3);
            jbl_estudiantes.setValueAt(cbx_grado.getSelectedItem(), fila, 4);
            jbl_estudiantes.setValueAt(this.idiomas, fila, 5);
            jbl_estudiantes.setValueAt(txt_nom_pad.getText(), fila, 6);
            jbl_estudiantes.setValueAt(txt_cell.getText(), fila, 7);
            jbl_estudiantes.setValueAt(txt_direcion.getText(), fila, 8);
            jbl_estudiantes.setValueAt(cbx_año.getSelectedItem(), fila, 9);
        } else {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla matricula...");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void jbl_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_estudiantesMouseClicked
        int fila = jbl_estudiantes.rowAtPoint(evt.getPoint());
        txt_cedula.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 0)));
        txt_nombreestu.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 1)));
        txt_edad.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 2)));
        cbx_grado.setSelectedItem(String.valueOf(jbl_estudiantes.getValueAt(fila, 4)));
        txt_nom_pad.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 6)));
        txt_cell.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 7)));
        txt_direcion.setText(String.valueOf(jbl_estudiantes.getValueAt(fila, 8)));
        cbx_año.setSelectedItem(String.valueOf(jbl_estudiantes.getValueAt(fila, 9)));
    }//GEN-LAST:event_jbl_estudiantesMouseClicked

    private void cbx_gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_gradoActionPerformed

    }//GEN-LAST:event_cbx_gradoActionPerformed

    private void cbx_gradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_gradoItemStateChanged

    }//GEN-LAST:event_cbx_gradoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_Aleman;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JRadioButton btn_femenino;
    private javax.swing.JRadioButton btn_mandarin;
    private javax.swing.JRadioButton btn_masculino;
    private javax.swing.JButton btn_modificar;
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.ButtonGroup buttonGroupIdioma;
    private javax.swing.JComboBox<String> cbx_año;
    private javax.swing.JComboBox<String> cbx_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelfondo;
    private javax.swing.JPanel jPanelgenero;
    private javax.swing.JPanel jPanelgenero1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jbl_estudiantes;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cell;
    private javax.swing.JTextField txt_direcion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nom_pad;
    private javax.swing.JTextField txt_nombreestu;
    // End of variables declaration//GEN-END:variables
}
