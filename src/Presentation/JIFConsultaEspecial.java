/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryyv
 */
public class JIFConsultaEspecial extends javax.swing.JInternalFrame {
DefaultTableModel modelo;
JIFHistoriaEspecial historias;
Funciones.funciones cnn = new Funciones.funciones();
Date hoy = new Date();
jifOdontograma odontograma;

    /**
     * Creates new form JIFConsultaEspecial
     */
    public JIFConsultaEspecial() {
        initComponents();
        cargar_doctor();
        modelo = new DefaultTableModel();
        DateFormat ffecha = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(ffecha.format(hoy));
        DateFormat fhora = new SimpleDateFormat("hh:mm");
        System.out.println(fhora.format(hoy));
    }
    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservaciones = new javax.swing.JTextArea();
        txtApellidoMat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnPaciente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        cboDoctor = new javax.swing.JComboBox<>();
        dtchFecha = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoPat = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtMinuto = new javax.swing.JTextField();
        cboHora = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta irregular");

        jLabel4.setText("Observaciones");

        jLabel9.setText("Nombres");

        txaObservaciones.setColumns(20);
        txaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txaObservaciones);

        txtApellidoMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMatKeyTyped(evt);
            }
        });

        jLabel8.setText("Apellido Materno");

        btnPaciente.setText("Historia Clínica");
        btnPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI");

        jLabel11.setText("Doctor");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        cboDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        dtchFecha.setDateFormatString("dd-MM-yyyy");
        dtchFecha.setMinSelectableDate(hoy);

        jLabel12.setText(":");

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        btnGuardar.setText("Registrar consulta");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha");

        jLabel7.setText("Apellido Paterno");

        jLabel2.setText("Hora");

        txtApellidoPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPatKeyTyped(evt);
            }
        });

        txtHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraFocusLost(evt);
            }
        });
        txtHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraKeyTyped(evt);
            }
        });

        txtMinuto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMinutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMinutoFocusLost(evt);
            }
        });
        txtMinuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinutoKeyTyped(evt);
            }
        });

        cboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboDoctor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPaciente))
                                    .addComponent(txtApellidoMat)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoPat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboHora, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dtchFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dtchFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPaciente)))
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMatKeyTyped
        if (txtApellidoMat.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMatKeyTyped

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        if (historias == null || historias.isClosed()) {
            historias = new JIFHistoriaEspecial();
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

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed

    }//GEN-LAST:event_txtDniActionPerformed

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

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        if (txtNombres.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Negocio.daoConsulta log = new Negocio.daoConsulta();
            String dni_doctor = log.consultar_dni_doctor(cboDoctor.getSelectedItem().toString());
            String n_historia = log.consultar_historia(txtDni.getText());
            System.out.println(dni_doctor);
            System.out.println(n_historia);
            log.setDni_doctor(dni_doctor);
            Date date = dtchFecha.getDate();
            DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String ffecha = String.valueOf(dateformat.format(date));
            log.setFecha(ffecha);
            log.setHora(txtHora.getText() + ':' + txtMinuto.getText() + cboHora.getSelectedItem().toString());
            log.setN_historia(Integer.parseInt(n_historia));
            System.out.println(txaObservaciones.getText());
            log.setObservaciones(txaObservaciones.getText());
            if (log.separar_cita() == true) {
                JOptionPane.showMessageDialog(rootPane, "Consulta registrada con éxito");
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se pudo registrar consulta");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtApellidoPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPatKeyTyped
        if (txtApellidoPat.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPatKeyTyped

    private void txtHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraKeyTyped
        char character = evt.getKeyChar();
        if (character < '0' || character > '9') {
            evt.consume(); 
        } else {
            if (txtHora.getText().length() >= 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtHoraKeyTyped

    private void txtHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFocusGained
        txtHora.setBackground(Color.darkGray);
        txtHora.setForeground(Color.white);
        txtHora.selectAll();
    }//GEN-LAST:event_txtHoraFocusGained

    private void txtHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFocusLost
        txtHora.setBackground(Color.white);
        txtHora.setForeground(Color.black);
        if (txtHora.getText().length() == 1) {
            String numero = txtHora.getText();
            txtHora.setText("0" + numero);
        } else {
            if("".equals(txtHora.getText())) {
                txtHora.setText("00");
            }
        }
    }//GEN-LAST:event_txtHoraFocusLost

    private void txtMinutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinutoFocusGained
        txtMinuto.setBackground(Color.darkGray);
        txtMinuto.setForeground(Color.white);
        txtMinuto.selectAll();
    }//GEN-LAST:event_txtMinutoFocusGained

    private void txtMinutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinutoFocusLost
        txtMinuto.setBackground(Color.white);
        txtMinuto.setForeground(Color.black);
        if (txtMinuto.getText().length() == 1) {
            String numero = txtMinuto.getText();
            txtMinuto.setText("0" + numero);
        } else {
            if ("".equals(txtMinuto.getText())) {
                txtMinuto.setText("00");
            }
        }
    }//GEN-LAST:event_txtMinutoFocusLost

    private void txtMinutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutoKeyTyped
        if(txtMinuto.getText().length() >= 2){
            evt.consume();
        }
    }//GEN-LAST:event_txtMinutoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnPaciente;
    private javax.swing.JComboBox<String> cboDoctor;
    private javax.swing.JComboBox<String> cboHora;
    public static com.toedter.calendar.JDateChooser dtchFecha;
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
    private javax.swing.JTextArea txaObservaciones;
    public static javax.swing.JTextField txtApellidoMat;
    public static javax.swing.JTextField txtApellidoPat;
    public static javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMinuto;
    public static javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
