/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class jifNuevaConsulta extends javax.swing.JInternalFrame {
DefaultTableModel modelo;
jifSearchHistorias historias;
Funciones.funciones cnn = new Funciones.funciones();
Date hoy = new Date();

    /**
     * Creates new form jifNuevaConsulta
     */
    public jifNuevaConsulta() {
        this.model1 = new String[1];
        initComponents();
        cargar_doctor();
        modelo = new DefaultTableModel();
        DateFormat ffecha = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(ffecha.format(hoy));
        DateFormat fhora = new SimpleDateFormat("hh:mm");
        System.out.println(fhora.format(hoy));
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservaciones = new javax.swing.JTextArea();
        btnPaciente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cboDoctor = new javax.swing.JComboBox<>();
        dtchFecha = new com.toedter.calendar.JDateChooser();
        txtNombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellidoPat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoMat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        spiHora = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        spiMinutos = new javax.swing.JComboBox<>();
        lblampm = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Nueva consulta");

        jLabel1.setText("Fecha");

        jLabel2.setText("Hora");

        jLabel4.setText("Observaciones");

        txaObservaciones.setColumns(20);
        txaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txaObservaciones);

        btnPaciente.setText("Historia Clínica");
        btnPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Doctor");

        cboDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        cboDoctor.setNextFocusableComponent(txaObservaciones);

        dtchFecha.setMinSelectableDate(hoy);
        dtchFecha.setNextFocusableComponent(spiHora);

        txtNombres.setNextFocusableComponent(dtchFecha);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        jLabel7.setText("Apellido Paterno");

        txtApellidoPat.setNextFocusableComponent(txtApellidoMat);
        txtApellidoPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPatKeyTyped(evt);
            }
        });

        jLabel9.setText("Nombres");

        txtApellidoMat.setNextFocusableComponent(txtNombres);
        txtApellidoMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMatKeyTyped(evt);
            }
        });

        jLabel8.setText("Apellido Materno");

        jLabel6.setText("DNI");

        txtDni.setNextFocusableComponent(txtApellidoPat);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        btnGuardar.setText("Registrar consulta");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        spiHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09", "10", "11", "12", "04", "05", "06", "07" }));
        spiHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                spiHoraItemStateChanged(evt);
            }
        });
        spiHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spiHoraActionPerformed(evt);
            }
        });

        jLabel12.setText(":");

        spiMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "40" }));

        lblampm.setText("am");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(8, 8, 8))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(cboDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPaciente)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1))
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(spiHora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spiMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblampm))
                                            .addComponent(dtchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnPaciente)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(spiHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spiMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblampm))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        if (historias == null || historias.isClosed()) {
            historias = new jifSearchHistorias();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = historias.getSize();
            historias.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(historias);
            historias.show();
            historias.btnGuardar.setEnabled(true);
            historias.btnConsulta.setEnabled(false);
            historias.btnNuevaHistoria.setEnabled(true);
        }
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char caracter = evt.getKeyChar();
        if (caracter < '0' || caracter > '9' && caracter != '\b') {
            evt.consume();
        } else {
            if (txtDni.getText().length() >= 8) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtApellidoPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPatKeyTyped
        if (txtApellidoPat.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPatKeyTyped

    private void txtApellidoMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMatKeyTyped
        if (txtApellidoMat.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMatKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        if (txtNombres.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    String[] model1 = new String[] {"20"};
    String[] model2 = new String[] {"00", "40"};
    
    private void spiHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spiHoraActionPerformed
        
    }//GEN-LAST:event_spiHoraActionPerformed

    private void spiHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_spiHoraItemStateChanged
        spiMinutos.removeAllItems();
    switch (spiHora.getSelectedIndex()) {
        case 0:
            spiMinutos.addItem("00");
            spiMinutos.addItem("40");
            lblampm.setText("am");
            break;
        case 1:
            spiMinutos.addItem("20");
            lblampm.setText("am");
            break;
        case 2:
            spiMinutos.addItem("00");
            spiMinutos.addItem("40");
            lblampm.setText("am");
            break;
        case 3:
            spiMinutos.addItem("20");
            lblampm.setText("pm");
            break;
        case 4:
            spiMinutos.addItem("00");
            spiMinutos.addItem("40");
            lblampm.setText("pm");
            break;
        case 5:
            spiMinutos.addItem("20");
            lblampm.setText("pm");
            break;
        case 6:
            spiMinutos.addItem("00");
            spiMinutos.addItem("40");
            lblampm.setText("pm");
            break;
        case 7:
            spiMinutos.addItem("20");
            lblampm.setText("pm");
            break;
        default:
            break;
    }
    }//GEN-LAST:event_spiHoraItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cargar_doctor() {
        try {
            String sql = "SELECT CONCAT (apellido_pat, ' ', apellido_mat, ' ', nombres) FROM doctor";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cboDoctor.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void consultar_dni_doctor(String texto) {
        try {
            String resultado;
            String sql = "SELECT dni FROM doctor WHERE CONCAT (apellido_pat, ' ', apellido_mat, ' ', nombres) = '" +
                    texto + "'";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                resultado = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnPaciente;
    private javax.swing.JComboBox<String> cboDoctor;
    private com.toedter.calendar.JDateChooser dtchFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblampm;
    private javax.swing.JComboBox<String> spiHora;
    private javax.swing.JComboBox<String> spiMinutos;
    private javax.swing.JTextArea txaObservaciones;
    public static javax.swing.JTextField txtApellidoMat;
    public static javax.swing.JTextField txtApellidoPat;
    public static javax.swing.JTextField txtDni;
    public static javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}