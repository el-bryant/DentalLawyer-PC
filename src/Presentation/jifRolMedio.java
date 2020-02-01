/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class jifRolMedio extends javax.swing.JInternalFrame {
jifNuevaConsulta nuevaconsulta;
Funciones.funciones cnn = new Funciones.funciones();
String resultado;

    /**
     * Creates new form jifRolMedio
     */
    public jifRolMedio() {
        initComponents();
        cargar_doctor();
        cargar_rol("08:00am", lblL01, resultado);
        cargar_rol("08:30am", lblL02, resultado);
        cargar_rol("09:00am", lblL03, resultado);
        cargar_rol("09:40am", lblL04, resultado);
        cargar_rol("10:20am", lblL05, resultado);
        cargar_rol("11:00am", lblL06, resultado);
        cargar_rol("11:40am", lblL07, resultado);
        cargar_rol("12:20pm", lblL08, resultado);
        cargar_rol("04:00pm", lblL09, resultado);
        cargar_rol("04:40pm", lblL10, resultado);
        cargar_rol("05:20pm", lblL11, resultado);
        cargar_rol("06:00pm", lblL12, resultado);
        cargar_rol("06:40pm", lblL13, resultado);
        cargar_rol("07:20pm", lblL14, resultado);
        cargar_rol("08:00am", lblM01, resultado);
        cargar_rol("08:30am", lblM02, resultado);
        cargar_rol("09:00am", lblM03, resultado);
        cargar_rol("09:40am", lblM04, resultado);
        cargar_rol("10:20am", lblM05, resultado);
        cargar_rol("11:00am", lblM06, resultado);
        cargar_rol("11:40am", lblM07, resultado);
        cargar_rol("12:20pm", lblM08, resultado);
        cargar_rol("04:00pm", lblM09, resultado);
        cargar_rol("04:40pm", lblM10, resultado);
        cargar_rol("05:20pm", lblM11, resultado);
        cargar_rol("06:00pm", lblM12, resultado);
        cargar_rol("06:40pm", lblM13, resultado);
        cargar_rol("07:20pm", lblM14, resultado);
        cargar_rol("08:00am", lblX01, resultado);
        cargar_rol("08:30am", lblX02, resultado);
        cargar_rol("09:00am", lblX03, resultado);
        cargar_rol("09:40am", lblX04, resultado);
        cargar_rol("10:20am", lblX05, resultado);
        cargar_rol("11:00am", lblX06, resultado);
        cargar_rol("11:40am", lblX07, resultado);
        cargar_rol("12:20pm", lblX08, resultado);
        cargar_rol("04:00pm", lblX09, resultado);
        cargar_rol("04:40pm", lblX10, resultado);
        cargar_rol("05:20pm", lblX11, resultado);
        cargar_rol("06:00pm", lblX12, resultado);
        cargar_rol("06:40pm", lblX13, resultado);
        cargar_rol("07:20pm", lblX14, resultado);
        cargar_rol("08:00am", lblJ01, resultado);
        cargar_rol("08:30am", lblJ02, resultado);
        cargar_rol("09:00am", lblJ03, resultado);
        cargar_rol("09:40am", lblJ04, resultado);
        cargar_rol("10:20am", lblJ05, resultado);
        cargar_rol("11:00am", lblJ06, resultado);
        cargar_rol("11:40am", lblJ07, resultado);
        cargar_rol("12:20pm", lblJ08, resultado);
        cargar_rol("04:00pm", lblJ09, resultado);
        cargar_rol("04:40pm", lblJ10, resultado);
        cargar_rol("05:20pm", lblJ11, resultado);
        cargar_rol("06:00pm", lblJ12, resultado);
        cargar_rol("06:40pm", lblJ13, resultado);
        cargar_rol("07:20pm", lblJ14, resultado);
        cargar_rol("08:00am", lblV01, resultado);
        cargar_rol("08:30am", lblV02, resultado);
        cargar_rol("09:00am", lblV03, resultado);
        cargar_rol("09:40am", lblV04, resultado);
        cargar_rol("10:20am", lblV05, resultado);
        cargar_rol("11:00am", lblV06, resultado);
        cargar_rol("11:40am", lblV07, resultado);
        cargar_rol("12:20pm", lblV08, resultado);
        cargar_rol("04:00pm", lblV09, resultado);
        cargar_rol("04:40pm", lblV10, resultado);
        cargar_rol("05:20pm", lblV11, resultado);
        cargar_rol("06:00pm", lblV12, resultado);
        cargar_rol("06:40pm", lblV13, resultado);
        cargar_rol("07:20pm", lblV14, resultado);
        cargar_rol("08:00am", lblS01, resultado);
        cargar_rol("08:30am", lblS02, resultado);
        cargar_rol("09:00am", lblS03, resultado);
        cargar_rol("09:40am", lblS04, resultado);
        cargar_rol("10:20am", lblS05, resultado);
        cargar_rol("11:00am", lblS06, resultado);
        cargar_rol("11:40am", lblS07, resultado);
        cargar_rol("12:20pm", lblS08, resultado);
        cargar_rol("04:00pm", lblS09, resultado);
        cargar_rol("04:40pm", lblS10, resultado);
        cargar_rol("05:20pm", lblS11, resultado);
        cargar_rol("06:00pm", lblS12, resultado);
        cargar_rol("06:40pm", lblS13, resultado);
        cargar_rol("07:20pm", lblS14, resultado);
    }
    
    private void cargar_doctor() {
        try {
            String sql = "SELECT CONCAT (apellido_pat, ' ', apellido_mat, ' ', nombres) FROM doctor";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cboMedicos.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void consultar_dni_doctor() {
        try {
            String sql = "SELECT dni FROM doctor WHERE CONCAT (apellido_pat, ' ', apellido_mat, ' ', nombres) = '" +
                    cboMedicos.getSelectedItem().toString() + "'";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                resultado = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void cargar_rol(String hora, JLabel label, String dni) {
        try {
            String sql = "SELECT CONCAT(paciente.apellido_pat, ' ', paciente.apellido_mat, ' ', paciente.nombres, ' ', "
                    + "tratamiento.nombre) FROM consulta INNER JOIN detalle_consulta ON consulta.id_consulta = "
                    + "detalle_consulta.id_consulta INNER JOIN tratamiento ON detalle_consulta.id_tratamiento = "
                    + "tratamiento.id_tratamiento INNER JOIN historia_clinica ON consulta.n_historia = historia_clinica."
                    + "n_historia INNER JOIN paciente ON historia_clinica.dni_paciente = paciente.dni INNER JOIN "
                    + "doctor ON doctor.dni = consulta.dni_doctor AND consulta.hora = '" + hora + "' AND doctor.dni = '"
                    + dni + "'";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            label.setText(rs.getString(1));
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

        jLabel1 = new javax.swing.JLabel();
        cboMedicos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnL01 = new javax.swing.JPanel();
        lblL01 = new javax.swing.JLabel();
        pnM01 = new javax.swing.JPanel();
        lblM01 = new javax.swing.JLabel();
        pnX01 = new javax.swing.JPanel();
        lblX01 = new javax.swing.JLabel();
        pnV01 = new javax.swing.JPanel();
        lblV01 = new javax.swing.JLabel();
        pnS01 = new javax.swing.JPanel();
        lblS01 = new javax.swing.JLabel();
        pnJ01 = new javax.swing.JPanel();
        lblJ01 = new javax.swing.JLabel();
        pnS02 = new javax.swing.JPanel();
        lblS02 = new javax.swing.JLabel();
        pnV02 = new javax.swing.JPanel();
        lblV02 = new javax.swing.JLabel();
        pnX02 = new javax.swing.JPanel();
        lblX02 = new javax.swing.JLabel();
        pnM02 = new javax.swing.JPanel();
        lblM02 = new javax.swing.JLabel();
        pnL02 = new javax.swing.JPanel();
        lblL02 = new javax.swing.JLabel();
        pnJ02 = new javax.swing.JPanel();
        lblJ02 = new javax.swing.JLabel();
        pnJ03 = new javax.swing.JPanel();
        lblJ03 = new javax.swing.JLabel();
        pnV03 = new javax.swing.JPanel();
        lblV03 = new javax.swing.JLabel();
        pnL03 = new javax.swing.JPanel();
        lblL03 = new javax.swing.JLabel();
        pnX03 = new javax.swing.JPanel();
        lblX03 = new javax.swing.JLabel();
        pnM03 = new javax.swing.JPanel();
        lblM03 = new javax.swing.JLabel();
        pnS03 = new javax.swing.JPanel();
        lblS03 = new javax.swing.JLabel();
        pnJ04 = new javax.swing.JPanel();
        lblJ04 = new javax.swing.JLabel();
        pnM04 = new javax.swing.JPanel();
        lblM04 = new javax.swing.JLabel();
        pnL04 = new javax.swing.JPanel();
        lblL04 = new javax.swing.JLabel();
        pnX04 = new javax.swing.JPanel();
        lblX04 = new javax.swing.JLabel();
        pnV04 = new javax.swing.JPanel();
        lblV04 = new javax.swing.JLabel();
        pnS04 = new javax.swing.JPanel();
        lblS04 = new javax.swing.JLabel();
        pnS05 = new javax.swing.JPanel();
        lblS05 = new javax.swing.JLabel();
        pnL05 = new javax.swing.JPanel();
        lblL05 = new javax.swing.JLabel();
        pnV05 = new javax.swing.JPanel();
        lblV05 = new javax.swing.JLabel();
        pnM05 = new javax.swing.JPanel();
        lblM05 = new javax.swing.JLabel();
        pnX05 = new javax.swing.JPanel();
        lblX05 = new javax.swing.JLabel();
        pnJ05 = new javax.swing.JPanel();
        lblJ05 = new javax.swing.JLabel();
        pnL06 = new javax.swing.JPanel();
        lblL06 = new javax.swing.JLabel();
        pnV06 = new javax.swing.JPanel();
        lblV06 = new javax.swing.JLabel();
        pnM06 = new javax.swing.JPanel();
        lblM06 = new javax.swing.JLabel();
        pnX06 = new javax.swing.JPanel();
        lblX06 = new javax.swing.JLabel();
        pnJ06 = new javax.swing.JPanel();
        lblJ06 = new javax.swing.JLabel();
        pnS06 = new javax.swing.JPanel();
        lblS06 = new javax.swing.JLabel();
        pnM07 = new javax.swing.JPanel();
        lblM07 = new javax.swing.JLabel();
        pnV07 = new javax.swing.JPanel();
        lblV07 = new javax.swing.JLabel();
        pnS07 = new javax.swing.JPanel();
        lblS07 = new javax.swing.JLabel();
        pnX07 = new javax.swing.JPanel();
        lblX07 = new javax.swing.JLabel();
        pnJ07 = new javax.swing.JPanel();
        lblJ07 = new javax.swing.JLabel();
        pnL07 = new javax.swing.JPanel();
        lblL07 = new javax.swing.JLabel();
        pnV08 = new javax.swing.JPanel();
        lblV08 = new javax.swing.JLabel();
        pnM08 = new javax.swing.JPanel();
        lblM08 = new javax.swing.JLabel();
        pnJ08 = new javax.swing.JPanel();
        lblJ08 = new javax.swing.JLabel();
        pnL08 = new javax.swing.JPanel();
        lblL08 = new javax.swing.JLabel();
        pnS08 = new javax.swing.JPanel();
        lblS08 = new javax.swing.JLabel();
        pnX08 = new javax.swing.JPanel();
        lblX08 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        pnL09 = new javax.swing.JPanel();
        lblL09 = new javax.swing.JLabel();
        pnM09 = new javax.swing.JPanel();
        lblM09 = new javax.swing.JLabel();
        pnX09 = new javax.swing.JPanel();
        lblX09 = new javax.swing.JLabel();
        pnJ09 = new javax.swing.JPanel();
        lblJ09 = new javax.swing.JLabel();
        pnV09 = new javax.swing.JPanel();
        lblV09 = new javax.swing.JLabel();
        pnS09 = new javax.swing.JPanel();
        lblS09 = new javax.swing.JLabel();
        pnL10 = new javax.swing.JPanel();
        lblL10 = new javax.swing.JLabel();
        pnM10 = new javax.swing.JPanel();
        lblM10 = new javax.swing.JLabel();
        pnX10 = new javax.swing.JPanel();
        lblX10 = new javax.swing.JLabel();
        pnJ10 = new javax.swing.JPanel();
        lblJ10 = new javax.swing.JLabel();
        pnV10 = new javax.swing.JPanel();
        lblV10 = new javax.swing.JLabel();
        pnS10 = new javax.swing.JPanel();
        lblS10 = new javax.swing.JLabel();
        pnL11 = new javax.swing.JPanel();
        lblL11 = new javax.swing.JLabel();
        pnM11 = new javax.swing.JPanel();
        lblM11 = new javax.swing.JLabel();
        pnX11 = new javax.swing.JPanel();
        lblX11 = new javax.swing.JLabel();
        pnJ11 = new javax.swing.JPanel();
        lblJ11 = new javax.swing.JLabel();
        pnV11 = new javax.swing.JPanel();
        lblV11 = new javax.swing.JLabel();
        pnS11 = new javax.swing.JPanel();
        lblS11 = new javax.swing.JLabel();
        pnL12 = new javax.swing.JPanel();
        lblL12 = new javax.swing.JLabel();
        pnM12 = new javax.swing.JPanel();
        lblM12 = new javax.swing.JLabel();
        pnX12 = new javax.swing.JPanel();
        lblX12 = new javax.swing.JLabel();
        pnJ12 = new javax.swing.JPanel();
        lblJ12 = new javax.swing.JLabel();
        pnV12 = new javax.swing.JPanel();
        lblV12 = new javax.swing.JLabel();
        pnS12 = new javax.swing.JPanel();
        lblS12 = new javax.swing.JLabel();
        pnL13 = new javax.swing.JPanel();
        lblL13 = new javax.swing.JLabel();
        pnM13 = new javax.swing.JPanel();
        lblM13 = new javax.swing.JLabel();
        pnX13 = new javax.swing.JPanel();
        lblX13 = new javax.swing.JLabel();
        pnJ13 = new javax.swing.JPanel();
        lblJ13 = new javax.swing.JLabel();
        pnV13 = new javax.swing.JPanel();
        lblV13 = new javax.swing.JLabel();
        pnS13 = new javax.swing.JPanel();
        lblS13 = new javax.swing.JLabel();
        pnL14 = new javax.swing.JPanel();
        lblL14 = new javax.swing.JLabel();
        pnM14 = new javax.swing.JPanel();
        lblM14 = new javax.swing.JLabel();
        pnX14 = new javax.swing.JPanel();
        lblX14 = new javax.swing.JLabel();
        pnJ14 = new javax.swing.JPanel();
        lblJ14 = new javax.swing.JLabel();
        pnV14 = new javax.swing.JPanel();
        lblV14 = new javax.swing.JLabel();
        pnS14 = new javax.swing.JPanel();
        lblS14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dtchFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("Rol de programación médica - usuario");

        jLabel1.setText("Seleccione médico");

        cboMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        cboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMedicosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setAutoscrolls(true);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("08:00 - 08:30");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("08:30 - 09:00");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("09:00 - 09:40");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("09:40 - 10:20");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("10:20 - 11:00");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("11:00 - 11:40");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("11:40 - 12:20");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("12:20 - 01:00");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("01:00 - 04:00");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("04:00 - 04:40");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("04:40 - 05:20");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("05:20 - 06:00");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("06:40 - 07:20");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("06:00 - 06:40");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("07:20 - 08:00");

        pnL01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL01MouseClicked(evt);
            }
        });

        lblL01.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblL01.setOpaque(true);

        javax.swing.GroupLayout pnL01Layout = new javax.swing.GroupLayout(pnL01);
        pnL01.setLayout(pnL01Layout);
        pnL01Layout.setHorizontalGroup(
            pnL01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnL01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL01, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL01Layout.setVerticalGroup(
            pnL01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(pnL01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL01, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        pnM01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM01MouseClicked(evt);
            }
        });

        lblM01.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM01Layout = new javax.swing.GroupLayout(pnM01);
        pnM01.setLayout(pnM01Layout);
        pnM01Layout.setHorizontalGroup(
            pnM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM01Layout.setVerticalGroup(
            pnM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(pnM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM01, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        pnX01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX01MouseClicked(evt);
            }
        });

        lblX01.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX01Layout = new javax.swing.GroupLayout(pnX01);
        pnX01.setLayout(pnX01Layout);
        pnX01Layout.setHorizontalGroup(
            pnX01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnX01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX01Layout.setVerticalGroup(
            pnX01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(pnX01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX01, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        pnV01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV01MouseClicked(evt);
            }
        });

        lblV01.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV01Layout = new javax.swing.GroupLayout(pnV01);
        pnV01.setLayout(pnV01Layout);
        pnV01Layout.setHorizontalGroup(
            pnV01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnV01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV01Layout.setVerticalGroup(
            pnV01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(pnV01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV01, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        pnS01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS01MouseClicked(evt);
            }
        });

        lblS01.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS01Layout = new javax.swing.GroupLayout(pnS01);
        pnS01.setLayout(pnS01Layout);
        pnS01Layout.setHorizontalGroup(
            pnS01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS01Layout.setVerticalGroup(
            pnS01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(pnS01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS01, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        pnJ01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ01MouseClicked(evt);
            }
        });

        lblJ01.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ01Layout = new javax.swing.GroupLayout(pnJ01);
        pnJ01.setLayout(pnJ01Layout);
        pnJ01Layout.setHorizontalGroup(
            pnJ01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnJ01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ01Layout.setVerticalGroup(
            pnJ01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(pnJ01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ01, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        pnS02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS02MouseClicked(evt);
            }
        });

        lblS02.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS02Layout = new javax.swing.GroupLayout(pnS02);
        pnS02.setLayout(pnS02Layout);
        pnS02Layout.setHorizontalGroup(
            pnS02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS02Layout.setVerticalGroup(
            pnS02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS02, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV02MouseClicked(evt);
            }
        });

        lblV02.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV02Layout = new javax.swing.GroupLayout(pnV02);
        pnV02.setLayout(pnV02Layout);
        pnV02Layout.setHorizontalGroup(
            pnV02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV02Layout.setVerticalGroup(
            pnV02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV02, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX02MouseClicked(evt);
            }
        });

        lblX02.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX02Layout = new javax.swing.GroupLayout(pnX02);
        pnX02.setLayout(pnX02Layout);
        pnX02Layout.setHorizontalGroup(
            pnX02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX02Layout.setVerticalGroup(
            pnX02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX02, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM02MouseClicked(evt);
            }
        });

        lblM02.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM02Layout = new javax.swing.GroupLayout(pnM02);
        pnM02.setLayout(pnM02Layout);
        pnM02Layout.setHorizontalGroup(
            pnM02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM02Layout.setVerticalGroup(
            pnM02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM02, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL02MouseClicked(evt);
            }
        });

        lblL02.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL02Layout = new javax.swing.GroupLayout(pnL02);
        pnL02.setLayout(pnL02Layout);
        pnL02Layout.setHorizontalGroup(
            pnL02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL02, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL02Layout.setVerticalGroup(
            pnL02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL02, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ02MouseClicked(evt);
            }
        });

        lblJ02.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ02Layout = new javax.swing.GroupLayout(pnJ02);
        pnJ02.setLayout(pnJ02Layout);
        pnJ02Layout.setHorizontalGroup(
            pnJ02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ02Layout.setVerticalGroup(
            pnJ02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ02, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ03MouseClicked(evt);
            }
        });

        lblJ03.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ03Layout = new javax.swing.GroupLayout(pnJ03);
        pnJ03.setLayout(pnJ03Layout);
        pnJ03Layout.setHorizontalGroup(
            pnJ03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ03Layout.setVerticalGroup(
            pnJ03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ03, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV03MouseClicked(evt);
            }
        });

        lblV03.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV03Layout = new javax.swing.GroupLayout(pnV03);
        pnV03.setLayout(pnV03Layout);
        pnV03Layout.setHorizontalGroup(
            pnV03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV03Layout.setVerticalGroup(
            pnV03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV03, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL03MouseClicked(evt);
            }
        });

        lblL03.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL03Layout = new javax.swing.GroupLayout(pnL03);
        pnL03.setLayout(pnL03Layout);
        pnL03Layout.setHorizontalGroup(
            pnL03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL03Layout.setVerticalGroup(
            pnL03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(pnL03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        pnX03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX03MouseClicked(evt);
            }
        });

        lblX03.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX03Layout = new javax.swing.GroupLayout(pnX03);
        pnX03.setLayout(pnX03Layout);
        pnX03Layout.setHorizontalGroup(
            pnX03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX03Layout.setVerticalGroup(
            pnX03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX03, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM03MouseClicked(evt);
            }
        });

        lblM03.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM03Layout = new javax.swing.GroupLayout(pnM03);
        pnM03.setLayout(pnM03Layout);
        pnM03Layout.setHorizontalGroup(
            pnM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM03Layout.setVerticalGroup(
            pnM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM03, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS03MouseClicked(evt);
            }
        });

        lblS03.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS03Layout = new javax.swing.GroupLayout(pnS03);
        pnS03.setLayout(pnS03Layout);
        pnS03Layout.setHorizontalGroup(
            pnS03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS03Layout.setVerticalGroup(
            pnS03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS03, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ04MouseClicked(evt);
            }
        });

        lblJ04.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ04Layout = new javax.swing.GroupLayout(pnJ04);
        pnJ04.setLayout(pnJ04Layout);
        pnJ04Layout.setHorizontalGroup(
            pnJ04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ04Layout.setVerticalGroup(
            pnJ04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ04, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM04MouseClicked(evt);
            }
        });

        lblM04.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM04Layout = new javax.swing.GroupLayout(pnM04);
        pnM04.setLayout(pnM04Layout);
        pnM04Layout.setHorizontalGroup(
            pnM04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM04Layout.setVerticalGroup(
            pnM04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM04, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL04MouseClicked(evt);
            }
        });

        lblL04.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL04Layout = new javax.swing.GroupLayout(pnL04);
        pnL04.setLayout(pnL04Layout);
        pnL04Layout.setHorizontalGroup(
            pnL04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL04Layout.setVerticalGroup(
            pnL04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL04, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX04MouseClicked(evt);
            }
        });

        lblX04.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX04Layout = new javax.swing.GroupLayout(pnX04);
        pnX04.setLayout(pnX04Layout);
        pnX04Layout.setHorizontalGroup(
            pnX04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX04Layout.setVerticalGroup(
            pnX04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX04, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV04MouseClicked(evt);
            }
        });

        lblV04.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV04Layout = new javax.swing.GroupLayout(pnV04);
        pnV04.setLayout(pnV04Layout);
        pnV04Layout.setHorizontalGroup(
            pnV04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV04Layout.setVerticalGroup(
            pnV04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV04, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS04MouseClicked(evt);
            }
        });

        lblS04.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS04Layout = new javax.swing.GroupLayout(pnS04);
        pnS04.setLayout(pnS04Layout);
        pnS04Layout.setHorizontalGroup(
            pnS04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS04Layout.setVerticalGroup(
            pnS04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS04, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS05MouseClicked(evt);
            }
        });

        lblS05.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS05Layout = new javax.swing.GroupLayout(pnS05);
        pnS05.setLayout(pnS05Layout);
        pnS05Layout.setHorizontalGroup(
            pnS05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS05Layout.setVerticalGroup(
            pnS05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS05, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL05MouseClicked(evt);
            }
        });

        lblL05.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL05Layout = new javax.swing.GroupLayout(pnL05);
        pnL05.setLayout(pnL05Layout);
        pnL05Layout.setHorizontalGroup(
            pnL05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL05, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL05Layout.setVerticalGroup(
            pnL05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL05, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV05MouseClicked(evt);
            }
        });

        lblV05.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV05Layout = new javax.swing.GroupLayout(pnV05);
        pnV05.setLayout(pnV05Layout);
        pnV05Layout.setHorizontalGroup(
            pnV05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV05Layout.setVerticalGroup(
            pnV05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV05, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM05MouseClicked(evt);
            }
        });

        lblM05.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM05Layout = new javax.swing.GroupLayout(pnM05);
        pnM05.setLayout(pnM05Layout);
        pnM05Layout.setHorizontalGroup(
            pnM05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM05Layout.setVerticalGroup(
            pnM05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM05, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX05MouseClicked(evt);
            }
        });

        lblX05.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX05Layout = new javax.swing.GroupLayout(pnX05);
        pnX05.setLayout(pnX05Layout);
        pnX05Layout.setHorizontalGroup(
            pnX05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX05Layout.setVerticalGroup(
            pnX05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX05, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ05MouseClicked(evt);
            }
        });

        lblJ05.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ05Layout = new javax.swing.GroupLayout(pnJ05);
        pnJ05.setLayout(pnJ05Layout);
        pnJ05Layout.setHorizontalGroup(
            pnJ05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ05Layout.setVerticalGroup(
            pnJ05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ05, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL06MouseClicked(evt);
            }
        });

        lblL06.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL06Layout = new javax.swing.GroupLayout(pnL06);
        pnL06.setLayout(pnL06Layout);
        pnL06Layout.setHorizontalGroup(
            pnL06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL06Layout.setVerticalGroup(
            pnL06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL06, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV06MouseClicked(evt);
            }
        });

        lblV06.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV06Layout = new javax.swing.GroupLayout(pnV06);
        pnV06.setLayout(pnV06Layout);
        pnV06Layout.setHorizontalGroup(
            pnV06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV06Layout.setVerticalGroup(
            pnV06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV06, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM06MouseClicked(evt);
            }
        });

        lblM06.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM06Layout = new javax.swing.GroupLayout(pnM06);
        pnM06.setLayout(pnM06Layout);
        pnM06Layout.setHorizontalGroup(
            pnM06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM06Layout.setVerticalGroup(
            pnM06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM06, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX06MouseClicked(evt);
            }
        });

        lblX06.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX06Layout = new javax.swing.GroupLayout(pnX06);
        pnX06.setLayout(pnX06Layout);
        pnX06Layout.setHorizontalGroup(
            pnX06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX06Layout.setVerticalGroup(
            pnX06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX06, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ06MouseClicked(evt);
            }
        });

        lblJ06.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ06Layout = new javax.swing.GroupLayout(pnJ06);
        pnJ06.setLayout(pnJ06Layout);
        pnJ06Layout.setHorizontalGroup(
            pnJ06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ06Layout.setVerticalGroup(
            pnJ06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ06, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS06MouseClicked(evt);
            }
        });

        lblS06.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS06Layout = new javax.swing.GroupLayout(pnS06);
        pnS06.setLayout(pnS06Layout);
        pnS06Layout.setHorizontalGroup(
            pnS06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS06Layout.setVerticalGroup(
            pnS06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS06, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM07MouseClicked(evt);
            }
        });

        lblM07.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM07Layout = new javax.swing.GroupLayout(pnM07);
        pnM07.setLayout(pnM07Layout);
        pnM07Layout.setHorizontalGroup(
            pnM07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM07Layout.setVerticalGroup(
            pnM07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM07, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV07MouseClicked(evt);
            }
        });

        lblV07.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV07Layout = new javax.swing.GroupLayout(pnV07);
        pnV07.setLayout(pnV07Layout);
        pnV07Layout.setHorizontalGroup(
            pnV07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV07Layout.setVerticalGroup(
            pnV07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV07, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS07MouseClicked(evt);
            }
        });

        lblS07.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS07Layout = new javax.swing.GroupLayout(pnS07);
        pnS07.setLayout(pnS07Layout);
        pnS07Layout.setHorizontalGroup(
            pnS07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS07, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS07Layout.setVerticalGroup(
            pnS07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX07MouseClicked(evt);
            }
        });

        lblX07.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX07Layout = new javax.swing.GroupLayout(pnX07);
        pnX07.setLayout(pnX07Layout);
        pnX07Layout.setHorizontalGroup(
            pnX07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX07Layout.setVerticalGroup(
            pnX07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX07, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ07MouseClicked(evt);
            }
        });

        lblJ07.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ07Layout = new javax.swing.GroupLayout(pnJ07);
        pnJ07.setLayout(pnJ07Layout);
        pnJ07Layout.setHorizontalGroup(
            pnJ07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ07Layout.setVerticalGroup(
            pnJ07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ07, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL07MouseClicked(evt);
            }
        });

        lblL07.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL07Layout = new javax.swing.GroupLayout(pnL07);
        pnL07.setLayout(pnL07Layout);
        pnL07Layout.setHorizontalGroup(
            pnL07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL07Layout.setVerticalGroup(
            pnL07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL07, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV08.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV08MouseClicked(evt);
            }
        });

        lblV08.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV08Layout = new javax.swing.GroupLayout(pnV08);
        pnV08.setLayout(pnV08Layout);
        pnV08Layout.setHorizontalGroup(
            pnV08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV08Layout.setVerticalGroup(
            pnV08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV08, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM08.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM08MouseClicked(evt);
            }
        });

        lblM08.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM08Layout = new javax.swing.GroupLayout(pnM08);
        pnM08.setLayout(pnM08Layout);
        pnM08Layout.setHorizontalGroup(
            pnM08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM08Layout.setVerticalGroup(
            pnM08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM08, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ08.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ08MouseClicked(evt);
            }
        });

        lblJ08.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ08Layout = new javax.swing.GroupLayout(pnJ08);
        pnJ08.setLayout(pnJ08Layout);
        pnJ08Layout.setHorizontalGroup(
            pnJ08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ08Layout.setVerticalGroup(
            pnJ08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ08, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL08.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL08MouseClicked(evt);
            }
        });

        lblL08.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL08Layout = new javax.swing.GroupLayout(pnL08);
        pnL08.setLayout(pnL08Layout);
        pnL08Layout.setHorizontalGroup(
            pnL08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL08Layout.setVerticalGroup(
            pnL08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL08, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS08.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS08MouseClicked(evt);
            }
        });

        lblS08.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS08Layout = new javax.swing.GroupLayout(pnS08);
        pnS08.setLayout(pnS08Layout);
        pnS08Layout.setHorizontalGroup(
            pnS08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS08Layout.setVerticalGroup(
            pnS08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS08, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX08.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX08MouseClicked(evt);
            }
        });

        lblX08.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX08Layout = new javax.swing.GroupLayout(pnX08);
        pnX08.setLayout(pnX08Layout);
        pnX08Layout.setHorizontalGroup(
            pnX08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX08Layout.setVerticalGroup(
            pnX08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX08, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        jPanel74.setBackground(new java.awt.Color(255, 255, 0));
        jPanel74.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        pnL09.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL09MouseClicked(evt);
            }
        });

        lblL09.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL09Layout = new javax.swing.GroupLayout(pnL09);
        pnL09.setLayout(pnL09Layout);
        pnL09Layout.setHorizontalGroup(
            pnL09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL09Layout.setVerticalGroup(
            pnL09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL09, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM09.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM09MouseClicked(evt);
            }
        });

        lblM09.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM09Layout = new javax.swing.GroupLayout(pnM09);
        pnM09.setLayout(pnM09Layout);
        pnM09Layout.setHorizontalGroup(
            pnM09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM09Layout.setVerticalGroup(
            pnM09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM09, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX09.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX09MouseClicked(evt);
            }
        });

        lblX09.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX09Layout = new javax.swing.GroupLayout(pnX09);
        pnX09.setLayout(pnX09Layout);
        pnX09Layout.setHorizontalGroup(
            pnX09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX09Layout.setVerticalGroup(
            pnX09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX09, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ09.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ09MouseClicked(evt);
            }
        });

        lblJ09.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ09Layout = new javax.swing.GroupLayout(pnJ09);
        pnJ09.setLayout(pnJ09Layout);
        pnJ09Layout.setHorizontalGroup(
            pnJ09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ09Layout.setVerticalGroup(
            pnJ09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ09, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV09.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV09MouseClicked(evt);
            }
        });

        lblV09.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV09Layout = new javax.swing.GroupLayout(pnV09);
        pnV09.setLayout(pnV09Layout);
        pnV09Layout.setHorizontalGroup(
            pnV09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV09Layout.setVerticalGroup(
            pnV09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV09, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS09.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS09MouseClicked(evt);
            }
        });

        lblS09.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS09Layout = new javax.swing.GroupLayout(pnS09);
        pnS09.setLayout(pnS09Layout);
        pnS09Layout.setHorizontalGroup(
            pnS09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS09Layout.setVerticalGroup(
            pnS09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS09, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL10MouseClicked(evt);
            }
        });

        lblL10.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL10Layout = new javax.swing.GroupLayout(pnL10);
        pnL10.setLayout(pnL10Layout);
        pnL10Layout.setHorizontalGroup(
            pnL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL10Layout.setVerticalGroup(
            pnL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM10MouseClicked(evt);
            }
        });

        lblM10.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM10Layout = new javax.swing.GroupLayout(pnM10);
        pnM10.setLayout(pnM10Layout);
        pnM10Layout.setHorizontalGroup(
            pnM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM10Layout.setVerticalGroup(
            pnM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX10MouseClicked(evt);
            }
        });

        lblX10.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX10Layout = new javax.swing.GroupLayout(pnX10);
        pnX10.setLayout(pnX10Layout);
        pnX10Layout.setHorizontalGroup(
            pnX10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX10Layout.setVerticalGroup(
            pnX10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ10MouseClicked(evt);
            }
        });

        lblJ10.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ10Layout = new javax.swing.GroupLayout(pnJ10);
        pnJ10.setLayout(pnJ10Layout);
        pnJ10Layout.setHorizontalGroup(
            pnJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ10Layout.setVerticalGroup(
            pnJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV10MouseClicked(evt);
            }
        });

        lblV10.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV10Layout = new javax.swing.GroupLayout(pnV10);
        pnV10.setLayout(pnV10Layout);
        pnV10Layout.setHorizontalGroup(
            pnV10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV10Layout.setVerticalGroup(
            pnV10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS10MouseClicked(evt);
            }
        });

        lblS10.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS10Layout = new javax.swing.GroupLayout(pnS10);
        pnS10.setLayout(pnS10Layout);
        pnS10Layout.setHorizontalGroup(
            pnS10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS10Layout.setVerticalGroup(
            pnS10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL11MouseClicked(evt);
            }
        });

        lblL11.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL11Layout = new javax.swing.GroupLayout(pnL11);
        pnL11.setLayout(pnL11Layout);
        pnL11Layout.setHorizontalGroup(
            pnL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL11Layout.setVerticalGroup(
            pnL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM11MouseClicked(evt);
            }
        });

        lblM11.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM11Layout = new javax.swing.GroupLayout(pnM11);
        pnM11.setLayout(pnM11Layout);
        pnM11Layout.setHorizontalGroup(
            pnM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM11Layout.setVerticalGroup(
            pnM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX11MouseClicked(evt);
            }
        });

        lblX11.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX11Layout = new javax.swing.GroupLayout(pnX11);
        pnX11.setLayout(pnX11Layout);
        pnX11Layout.setHorizontalGroup(
            pnX11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX11Layout.setVerticalGroup(
            pnX11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ11MouseClicked(evt);
            }
        });

        lblJ11.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ11Layout = new javax.swing.GroupLayout(pnJ11);
        pnJ11.setLayout(pnJ11Layout);
        pnJ11Layout.setHorizontalGroup(
            pnJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ11Layout.setVerticalGroup(
            pnJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV11MouseClicked(evt);
            }
        });

        lblV11.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV11Layout = new javax.swing.GroupLayout(pnV11);
        pnV11.setLayout(pnV11Layout);
        pnV11Layout.setHorizontalGroup(
            pnV11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV11Layout.setVerticalGroup(
            pnV11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS11MouseClicked(evt);
            }
        });

        lblS11.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS11Layout = new javax.swing.GroupLayout(pnS11);
        pnS11.setLayout(pnS11Layout);
        pnS11Layout.setHorizontalGroup(
            pnS11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS11Layout.setVerticalGroup(
            pnS11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL12MouseClicked(evt);
            }
        });

        lblL12.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL12Layout = new javax.swing.GroupLayout(pnL12);
        pnL12.setLayout(pnL12Layout);
        pnL12Layout.setHorizontalGroup(
            pnL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL12Layout.setVerticalGroup(
            pnL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM12MouseClicked(evt);
            }
        });

        lblM12.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM12Layout = new javax.swing.GroupLayout(pnM12);
        pnM12.setLayout(pnM12Layout);
        pnM12Layout.setHorizontalGroup(
            pnM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM12Layout.setVerticalGroup(
            pnM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX12MouseClicked(evt);
            }
        });

        lblX12.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX12Layout = new javax.swing.GroupLayout(pnX12);
        pnX12.setLayout(pnX12Layout);
        pnX12Layout.setHorizontalGroup(
            pnX12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX12Layout.setVerticalGroup(
            pnX12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ12MouseClicked(evt);
            }
        });

        lblJ12.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ12Layout = new javax.swing.GroupLayout(pnJ12);
        pnJ12.setLayout(pnJ12Layout);
        pnJ12Layout.setHorizontalGroup(
            pnJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ12Layout.setVerticalGroup(
            pnJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV12MouseClicked(evt);
            }
        });

        lblV12.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV12Layout = new javax.swing.GroupLayout(pnV12);
        pnV12.setLayout(pnV12Layout);
        pnV12Layout.setHorizontalGroup(
            pnV12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV12Layout.setVerticalGroup(
            pnV12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS12MouseClicked(evt);
            }
        });

        lblS12.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS12Layout = new javax.swing.GroupLayout(pnS12);
        pnS12.setLayout(pnS12Layout);
        pnS12Layout.setHorizontalGroup(
            pnS12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS12Layout.setVerticalGroup(
            pnS12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL13MouseClicked(evt);
            }
        });

        lblL13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL13Layout = new javax.swing.GroupLayout(pnL13);
        pnL13.setLayout(pnL13Layout);
        pnL13Layout.setHorizontalGroup(
            pnL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL13Layout.setVerticalGroup(
            pnL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM13MouseClicked(evt);
            }
        });

        lblM13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM13Layout = new javax.swing.GroupLayout(pnM13);
        pnM13.setLayout(pnM13Layout);
        pnM13Layout.setHorizontalGroup(
            pnM13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM13Layout.setVerticalGroup(
            pnM13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX13MouseClicked(evt);
            }
        });

        lblX13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX13Layout = new javax.swing.GroupLayout(pnX13);
        pnX13.setLayout(pnX13Layout);
        pnX13Layout.setHorizontalGroup(
            pnX13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX13Layout.setVerticalGroup(
            pnX13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ13MouseClicked(evt);
            }
        });

        lblJ13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ13Layout = new javax.swing.GroupLayout(pnJ13);
        pnJ13.setLayout(pnJ13Layout);
        pnJ13Layout.setHorizontalGroup(
            pnJ13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ13Layout.setVerticalGroup(
            pnJ13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV13MouseClicked(evt);
            }
        });

        lblV13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV13Layout = new javax.swing.GroupLayout(pnV13);
        pnV13.setLayout(pnV13Layout);
        pnV13Layout.setHorizontalGroup(
            pnV13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV13Layout.setVerticalGroup(
            pnV13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS13MouseClicked(evt);
            }
        });

        lblS13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS13Layout = new javax.swing.GroupLayout(pnS13);
        pnS13.setLayout(pnS13Layout);
        pnS13Layout.setHorizontalGroup(
            pnS13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS13Layout.setVerticalGroup(
            pnS13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnL14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnL14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnL14MouseClicked(evt);
            }
        });

        lblL14.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblL14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnL14Layout = new javax.swing.GroupLayout(pnL14);
        pnL14.setLayout(pnL14Layout);
        pnL14Layout.setHorizontalGroup(
            pnL14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnL14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnL14Layout.setVerticalGroup(
            pnL14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnL14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblL14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnM14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnM14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnM14MouseClicked(evt);
            }
        });

        lblM14.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblM14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnM14Layout = new javax.swing.GroupLayout(pnM14);
        pnM14.setLayout(pnM14Layout);
        pnM14Layout.setHorizontalGroup(
            pnM14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnM14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnM14Layout.setVerticalGroup(
            pnM14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnM14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblM14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnX14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnX14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnX14MouseClicked(evt);
            }
        });

        lblX14.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblX14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnX14Layout = new javax.swing.GroupLayout(pnX14);
        pnX14.setLayout(pnX14Layout);
        pnX14Layout.setHorizontalGroup(
            pnX14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnX14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnX14Layout.setVerticalGroup(
            pnX14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnX14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblX14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnJ14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnJ14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnJ14MouseClicked(evt);
            }
        });

        lblJ14.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblJ14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnJ14Layout = new javax.swing.GroupLayout(pnJ14);
        pnJ14.setLayout(pnJ14Layout);
        pnJ14Layout.setHorizontalGroup(
            pnJ14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnJ14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnJ14Layout.setVerticalGroup(
            pnJ14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnJ14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblJ14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnV14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnV14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnV14MouseClicked(evt);
            }
        });

        lblV14.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblV14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnV14Layout = new javax.swing.GroupLayout(pnV14);
        pnV14.setLayout(pnV14Layout);
        pnV14Layout.setHorizontalGroup(
            pnV14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnV14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnV14Layout.setVerticalGroup(
            pnV14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnV14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblV14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnS14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnS14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnS14MouseClicked(evt);
            }
        });

        lblS14.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblS14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnS14Layout = new javax.swing.GroupLayout(pnS14);
        pnS14.setLayout(pnS14Layout);
        pnS14Layout.setHorizontalGroup(
            pnS14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(pnS14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        pnS14Layout.setVerticalGroup(
            pnS14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(pnS14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblS14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnL09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnM09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(pnX09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnJ09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnV09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnS09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnL01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnL02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnM02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnM01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(pnX02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnX01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnJ02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnJ01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnV02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnV01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnS02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnS01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnL01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnX01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnJ01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnV01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnM01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnS01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnL14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnX14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJ14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnV14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnM14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnS14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hora / día");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lunes");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Martes");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Miércoles");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Jueves");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Viernes");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sábado");

        jLabel17.setText("Fecha");

        dtchFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dtchFechaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMedicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboMedicos)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dtchFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnL01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL01MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, ( ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL01MouseClicked

    private void pnL02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL02MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL02MouseClicked

    private void pnL03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL03MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL03MouseClicked

    private void pnL04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL04MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL04MouseClicked

    private void pnL05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL05MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL05MouseClicked

    private void pnL06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL06MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL06MouseClicked

    private void pnL07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL07MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2,( ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL07MouseClicked

    private void pnL08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL08MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL08MouseClicked

    private void pnL09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL09MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, ( ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL09MouseClicked

    private void pnL10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL10MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL10MouseClicked

    private void pnL11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL11MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL11MouseClicked

    private void pnL12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL12MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL12MouseClicked

    private void pnL13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL13MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL13MouseClicked

    private void pnL14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnL14MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnL14MouseClicked

    private void pnM01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM01MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM01MouseClicked

    private void pnM02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM02MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM02MouseClicked

    private void pnM03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM03MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM03MouseClicked

    private void pnM04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM04MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM04MouseClicked

    private void pnM05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM05MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM05MouseClicked

    private void pnM06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM06MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM06MouseClicked

    private void pnM07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM07MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM07MouseClicked

    private void pnM08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM08MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM08MouseClicked

    private void pnM09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM09MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM09MouseClicked

    private void pnM10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM10MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM10MouseClicked

    private void pnM11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM11MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM11MouseClicked

    private void pnM12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM12MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM12MouseClicked

    private void pnM13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM13MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM13MouseClicked

    private void pnM14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnM14MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnM14MouseClicked

    private void pnX01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX01MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX01MouseClicked

    private void pnX02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX02MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX02MouseClicked

    private void pnX03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX03MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX03MouseClicked

    private void pnX04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX04MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX04MouseClicked

    private void pnX05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX05MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height )  / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX05MouseClicked

    private void pnX06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX06MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX06MouseClicked

    private void pnX07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX07MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX07MouseClicked

    private void pnX08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX08MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX08MouseClicked

    private void pnX09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX09MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX09MouseClicked

    private void pnX10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX10MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX10MouseClicked

    private void pnX11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX11MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX11MouseClicked

    private void pnX12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX12MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX12MouseClicked

    private void pnX13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX13MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX13MouseClicked

    private void pnX14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnX14MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnX14MouseClicked

    private void pnJ01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ01MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ01MouseClicked

    private void pnJ02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ02MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ02MouseClicked

    private void pnJ03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ03MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ03MouseClicked

    private void pnJ04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ04MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ04MouseClicked

    private void pnJ05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ05MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ05MouseClicked

    private void pnJ06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ06MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ06MouseClicked

    private void pnJ07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ07MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ07MouseClicked

    private void pnJ08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ08MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ08MouseClicked

    private void pnJ09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ09MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ09MouseClicked

    private void pnJ10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ10MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ10MouseClicked

    private void pnJ11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ11MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ11MouseClicked

    private void pnJ12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ12MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ12MouseClicked

    private void pnJ13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ13MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ13MouseClicked

    private void pnJ14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnJ14MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnJ14MouseClicked

    private void pnV01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV01MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV01MouseClicked

    private void pnV02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV02MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV02MouseClicked

    private void pnV03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV03MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV03MouseClicked

    private void pnV04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV04MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV04MouseClicked

    private void pnV05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV05MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV05MouseClicked

    private void pnV06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV06MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV06MouseClicked

    private void pnV07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV07MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV07MouseClicked

    private void pnV08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV08MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV08MouseClicked

    private void pnV09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV09MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV09MouseClicked

    private void pnV10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV10MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV10MouseClicked

    private void pnV11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV11MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV11MouseClicked

    private void pnV12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV12MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV12MouseClicked

    private void pnV13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV13MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV13MouseClicked

    private void pnV14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnV14MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnV14MouseClicked

    private void pnS01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS01MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS01MouseClicked

    private void pnS02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS02MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, ( ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS02MouseClicked

    private void pnS03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS03MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS03MouseClicked

    private void pnS04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS04MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS04MouseClicked

    private void pnS05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS05MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS05MouseClicked

    private void pnS06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS06MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS06MouseClicked

    private void pnS07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS07MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS07MouseClicked

    private void pnS08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS08MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS08MouseClicked

    private void pnS09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS09MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS09MouseClicked

    private void pnS10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS10MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS10MouseClicked

    private void pnS11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS11MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS11MouseClicked

    private void pnS12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS12MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS12MouseClicked

    private void pnS13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS13MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS13MouseClicked

    private void pnS14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnS14MouseClicked
        if (nuevaconsulta == null || nuevaconsulta.isClosed()) {
            nuevaconsulta = new jifNuevaConsulta();
            Dimension ds = frmMain.lypMain.getSize();
            Dimension fs = nuevaconsulta.getSize();
            nuevaconsulta.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            frmMain.lypMain.add(nuevaconsulta);
            nuevaconsulta.show();
        }
    }//GEN-LAST:event_pnS14MouseClicked

    private void dtchFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtchFechaPropertyChange
        
    }//GEN-LAST:event_dtchFechaPropertyChange

    private void cboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMedicosActionPerformed
        consultar_dni_doctor();
        /*cargar_rol("08:00am", lblL01, resultado);
        cargar_rol("08:30am", lblL02, resultado);
        cargar_rol("09:00am", lblL03, resultado);
        cargar_rol("09:40am", lblL04, resultado);
        cargar_rol("10:20am", lblL05, resultado);
        cargar_rol("11:00am", lblL06, resultado);
        cargar_rol("11:40am", lblL07, resultado);
        cargar_rol("12:20pm", lblL08, resultado);
        cargar_rol("04:00pm", lblL09, resultado);
        cargar_rol("04:40pm", lblL10, resultado);
        cargar_rol("05:20pm", lblL11, resultado);
        cargar_rol("06:00pm", lblL12, resultado);
        cargar_rol("06:40pm", lblL13, resultado);
        cargar_rol("07:20pm", lblL14, resultado);
        cargar_rol("08:00am", lblM01, resultado);
        cargar_rol("08:30am", lblM02, resultado);
        cargar_rol("09:00am", lblM03, resultado);
        cargar_rol("09:40am", lblM04, resultado);
        cargar_rol("10:20am", lblM05, resultado);
        cargar_rol("11:00am", lblM06, resultado);
        cargar_rol("11:40am", lblM07, resultado);
        cargar_rol("12:20pm", lblM08, resultado);
        cargar_rol("04:00pm", lblM09, resultado);
        cargar_rol("04:40pm", lblM10, resultado);
        cargar_rol("05:20pm", lblM11, resultado);
        cargar_rol("06:00pm", lblM12, resultado);
        cargar_rol("06:40pm", lblM13, resultado);
        cargar_rol("07:20pm", lblM14, resultado);
        cargar_rol("08:00am", lblX01, resultado);
        cargar_rol("08:30am", lblX02, resultado);
        cargar_rol("09:00am", lblX03, resultado);
        cargar_rol("09:40am", lblX04, resultado);
        cargar_rol("10:20am", lblX05, resultado);
        cargar_rol("11:00am", lblX06, resultado);
        cargar_rol("11:40am", lblX07, resultado);
        cargar_rol("12:20pm", lblX08, resultado);
        cargar_rol("04:00pm", lblX09, resultado);
        cargar_rol("04:40pm", lblX10, resultado);
        cargar_rol("05:20pm", lblX11, resultado);
        cargar_rol("06:00pm", lblX12, resultado);
        cargar_rol("06:40pm", lblX13, resultado);
        cargar_rol("07:20pm", lblX14, resultado);
        cargar_rol("08:00am", lblJ01, resultado);
        cargar_rol("08:30am", lblJ02, resultado);
        cargar_rol("09:00am", lblJ03, resultado);
        cargar_rol("09:40am", lblJ04, resultado);
        cargar_rol("10:20am", lblJ05, resultado);
        cargar_rol("11:00am", lblJ06, resultado);
        cargar_rol("11:40am", lblJ07, resultado);
        cargar_rol("12:20pm", lblJ08, resultado);
        cargar_rol("04:00pm", lblJ09, resultado);
        cargar_rol("04:40pm", lblJ10, resultado);
        cargar_rol("05:20pm", lblJ11, resultado);
        cargar_rol("06:00pm", lblJ12, resultado);
        cargar_rol("06:40pm", lblJ13, resultado);
        cargar_rol("07:20pm", lblJ14, resultado);
        cargar_rol("08:00am", lblV01, resultado);
        cargar_rol("08:30am", lblV02, resultado);
        cargar_rol("09:00am", lblV03, resultado);
        cargar_rol("09:40am", lblV04, resultado);
        cargar_rol("10:20am", lblV05, resultado);
        cargar_rol("11:00am", lblV06, resultado);
        cargar_rol("11:40am", lblV07, resultado);
        cargar_rol("12:20pm", lblV08, resultado);
        cargar_rol("04:00pm", lblV09, resultado);
        cargar_rol("04:40pm", lblV10, resultado);
        cargar_rol("05:20pm", lblV11, resultado);
        cargar_rol("06:00pm", lblV12, resultado);
        cargar_rol("06:40pm", lblV13, resultado);
        cargar_rol("07:20pm", lblV14, resultado);
        cargar_rol("08:00am", lblS01, resultado);
        cargar_rol("08:30am", lblS02, resultado);
        cargar_rol("09:00am", lblS03, resultado);
        cargar_rol("09:40am", lblS04, resultado);
        cargar_rol("10:20am", lblS05, resultado);
        cargar_rol("11:00am", lblS06, resultado);
        cargar_rol("11:40am", lblS07, resultado);
        cargar_rol("12:20pm", lblS08, resultado);
        cargar_rol("04:00pm", lblS09, resultado);
        cargar_rol("04:40pm", lblS10, resultado);
        cargar_rol("05:20pm", lblS11, resultado);
        cargar_rol("06:00pm", lblS12, resultado);
        cargar_rol("06:40pm", lblS13, resultado);
        cargar_rol("07:20pm", lblS14, resultado);*/
    }//GEN-LAST:event_cboMedicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMedicos;
    private com.toedter.calendar.JDateChooser dtchFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJ01;
    private javax.swing.JLabel lblJ02;
    private javax.swing.JLabel lblJ03;
    private javax.swing.JLabel lblJ04;
    private javax.swing.JLabel lblJ05;
    private javax.swing.JLabel lblJ06;
    private javax.swing.JLabel lblJ07;
    private javax.swing.JLabel lblJ08;
    private javax.swing.JLabel lblJ09;
    private javax.swing.JLabel lblJ10;
    private javax.swing.JLabel lblJ11;
    private javax.swing.JLabel lblJ12;
    private javax.swing.JLabel lblJ13;
    private javax.swing.JLabel lblJ14;
    private javax.swing.JLabel lblL01;
    private javax.swing.JLabel lblL02;
    private javax.swing.JLabel lblL03;
    private javax.swing.JLabel lblL04;
    private javax.swing.JLabel lblL05;
    private javax.swing.JLabel lblL06;
    private javax.swing.JLabel lblL07;
    private javax.swing.JLabel lblL08;
    private javax.swing.JLabel lblL09;
    private javax.swing.JLabel lblL10;
    private javax.swing.JLabel lblL11;
    private javax.swing.JLabel lblL12;
    private javax.swing.JLabel lblL13;
    private javax.swing.JLabel lblL14;
    private javax.swing.JLabel lblM01;
    private javax.swing.JLabel lblM02;
    private javax.swing.JLabel lblM03;
    private javax.swing.JLabel lblM04;
    private javax.swing.JLabel lblM05;
    private javax.swing.JLabel lblM06;
    private javax.swing.JLabel lblM07;
    private javax.swing.JLabel lblM08;
    private javax.swing.JLabel lblM09;
    private javax.swing.JLabel lblM10;
    private javax.swing.JLabel lblM11;
    private javax.swing.JLabel lblM12;
    private javax.swing.JLabel lblM13;
    private javax.swing.JLabel lblM14;
    private javax.swing.JLabel lblS01;
    private javax.swing.JLabel lblS02;
    private javax.swing.JLabel lblS03;
    private javax.swing.JLabel lblS04;
    private javax.swing.JLabel lblS05;
    private javax.swing.JLabel lblS06;
    private javax.swing.JLabel lblS07;
    private javax.swing.JLabel lblS08;
    private javax.swing.JLabel lblS09;
    private javax.swing.JLabel lblS10;
    private javax.swing.JLabel lblS11;
    private javax.swing.JLabel lblS12;
    private javax.swing.JLabel lblS13;
    private javax.swing.JLabel lblS14;
    private javax.swing.JLabel lblV01;
    private javax.swing.JLabel lblV02;
    private javax.swing.JLabel lblV03;
    private javax.swing.JLabel lblV04;
    private javax.swing.JLabel lblV05;
    private javax.swing.JLabel lblV06;
    private javax.swing.JLabel lblV07;
    private javax.swing.JLabel lblV08;
    private javax.swing.JLabel lblV09;
    private javax.swing.JLabel lblV10;
    private javax.swing.JLabel lblV11;
    private javax.swing.JLabel lblV12;
    private javax.swing.JLabel lblV13;
    private javax.swing.JLabel lblV14;
    private javax.swing.JLabel lblX01;
    private javax.swing.JLabel lblX02;
    private javax.swing.JLabel lblX03;
    private javax.swing.JLabel lblX04;
    private javax.swing.JLabel lblX05;
    private javax.swing.JLabel lblX06;
    private javax.swing.JLabel lblX07;
    private javax.swing.JLabel lblX08;
    private javax.swing.JLabel lblX09;
    private javax.swing.JLabel lblX10;
    private javax.swing.JLabel lblX11;
    private javax.swing.JLabel lblX12;
    private javax.swing.JLabel lblX13;
    private javax.swing.JLabel lblX14;
    private javax.swing.JPanel pnJ01;
    private javax.swing.JPanel pnJ02;
    private javax.swing.JPanel pnJ03;
    private javax.swing.JPanel pnJ04;
    private javax.swing.JPanel pnJ05;
    private javax.swing.JPanel pnJ06;
    private javax.swing.JPanel pnJ07;
    private javax.swing.JPanel pnJ08;
    private javax.swing.JPanel pnJ09;
    private javax.swing.JPanel pnJ10;
    private javax.swing.JPanel pnJ11;
    private javax.swing.JPanel pnJ12;
    private javax.swing.JPanel pnJ13;
    private javax.swing.JPanel pnJ14;
    private javax.swing.JPanel pnL01;
    private javax.swing.JPanel pnL02;
    private javax.swing.JPanel pnL03;
    private javax.swing.JPanel pnL04;
    private javax.swing.JPanel pnL05;
    private javax.swing.JPanel pnL06;
    private javax.swing.JPanel pnL07;
    private javax.swing.JPanel pnL08;
    private javax.swing.JPanel pnL09;
    private javax.swing.JPanel pnL10;
    private javax.swing.JPanel pnL11;
    private javax.swing.JPanel pnL12;
    private javax.swing.JPanel pnL13;
    private javax.swing.JPanel pnL14;
    private javax.swing.JPanel pnM01;
    private javax.swing.JPanel pnM02;
    private javax.swing.JPanel pnM03;
    private javax.swing.JPanel pnM04;
    private javax.swing.JPanel pnM05;
    private javax.swing.JPanel pnM06;
    private javax.swing.JPanel pnM07;
    private javax.swing.JPanel pnM08;
    private javax.swing.JPanel pnM09;
    private javax.swing.JPanel pnM10;
    private javax.swing.JPanel pnM11;
    private javax.swing.JPanel pnM12;
    private javax.swing.JPanel pnM13;
    private javax.swing.JPanel pnM14;
    private javax.swing.JPanel pnS01;
    private javax.swing.JPanel pnS02;
    private javax.swing.JPanel pnS03;
    private javax.swing.JPanel pnS04;
    private javax.swing.JPanel pnS05;
    private javax.swing.JPanel pnS06;
    private javax.swing.JPanel pnS07;
    private javax.swing.JPanel pnS08;
    private javax.swing.JPanel pnS09;
    private javax.swing.JPanel pnS10;
    private javax.swing.JPanel pnS11;
    private javax.swing.JPanel pnS12;
    private javax.swing.JPanel pnS13;
    private javax.swing.JPanel pnS14;
    private javax.swing.JPanel pnV01;
    private javax.swing.JPanel pnV02;
    private javax.swing.JPanel pnV03;
    private javax.swing.JPanel pnV04;
    private javax.swing.JPanel pnV05;
    private javax.swing.JPanel pnV06;
    private javax.swing.JPanel pnV07;
    private javax.swing.JPanel pnV08;
    private javax.swing.JPanel pnV09;
    private javax.swing.JPanel pnV10;
    private javax.swing.JPanel pnV11;
    private javax.swing.JPanel pnV12;
    private javax.swing.JPanel pnV13;
    private javax.swing.JPanel pnV14;
    private javax.swing.JPanel pnX01;
    private javax.swing.JPanel pnX02;
    private javax.swing.JPanel pnX03;
    private javax.swing.JPanel pnX04;
    private javax.swing.JPanel pnX05;
    private javax.swing.JPanel pnX06;
    private javax.swing.JPanel pnX07;
    private javax.swing.JPanel pnX08;
    private javax.swing.JPanel pnX09;
    private javax.swing.JPanel pnX10;
    private javax.swing.JPanel pnX11;
    private javax.swing.JPanel pnX12;
    private javax.swing.JPanel pnX13;
    private javax.swing.JPanel pnX14;
    // End of variables declaration//GEN-END:variables
}
