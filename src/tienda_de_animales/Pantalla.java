
package tienda_de_animales;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class Pantalla extends javax.swing.JFrame{
    
    Conexion conectar = new Conexion();
    Connection con;
    String url = "jdbc:mysql://localhost:3306/tienda_de_animales_1";
    String user = "root";
    String password = "";
    
    //datos
    String raza;
    String genero;
    String tamaño;
    String precio;
    
    public Pantalla() {
        initComponents();
        conectar.getConexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jDialog3 = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jDialog6 = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jDialog7 = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jButton42 = new javax.swing.JButton();
        jDialog8 = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jDialog9 = new javax.swing.JDialog();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jDialog10 = new javax.swing.JDialog();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(790, 560));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel12.setText("Tienda  de animales");
        jDialog1.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 290, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jDialog1.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 690, 20));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Perros");
        jDialog1.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Gatos");

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Gato.png")); // NOI18N

        jButton7.setText("Ver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 190));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Perro.png")); // NOI18N

        jButton8.setText("Ver");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 200, 190));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Conejos");

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Conejo.png")); // NOI18N

        jButton21.setText("Ver");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addGap(53, 53, 53))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 190, 190));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Peces");

        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Pez.png")); // NOI18N

        jButton28.setText("Ver");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel16))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton28)
                .addGap(57, 57, 57))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 190, 190));

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Juguetes");

        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Juguetes.png")); // NOI18N
        jLabel47.setText("jLabel47");

        jButton35.setText("Ver");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel17))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 200, 190));

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Comida");

        jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Comida.png")); // NOI18N

        jButton36.setText("Ver");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton36)
                        .addGap(51, 51, 51))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 190, 190));

        jButton55.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Carrito.png")); // NOI18N
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 40, -1));

        jDialog2.setMinimumSize(new java.awt.Dimension(580, 500));
        jDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel6.setText("Tienda de animales");
        jDialog2.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 255, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Portada.png")); // NOI18N
        jLabel7.setText("jLabel5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel7)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jDialog2.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro"));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Contraseña");

        jButton6.setText("Registrarse");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Teléfono");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton6)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(42, 42, 42))
        );

        jDialog2.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 370, 300));

        jDialog3.setMinimumSize(new java.awt.Dimension(862, 653));
        jDialog3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de perros"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Raza");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 37, -1));

        jLabel23.setText("Género");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jLabel24.setText("Tamaño");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel25.setText("Precio");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 37, -1));
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, -1));
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 192, -1));
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 190, -1));

        jLabel20.setText("Id");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField5.setEditable(false);
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));

        jDialog3.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 340, 200));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Raza", "Género", "Tamaño", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jDialog3.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 710, 220));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("Añadir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        jButton10.setText("Modificar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 30));

        jButton11.setText("Eliminar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        jButton12.setText("Mostrar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        jButton14.setText("Borrar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jButton49.setText("Carrito compra");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jDialog3.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 340, 200));

        jLabel26.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel26.setText("Tienda de animales");
        jDialog3.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton13.setText("Cerrar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jDialog4.setMinimumSize(new java.awt.Dimension(862, 653));
        jDialog4.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de gatos"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setText("Raza");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 37, -1));

        jLabel28.setText("Género");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jLabel29.setText("Tamaño");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel30.setText("Precio");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 37, -1));
        jPanel9.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));
        jPanel9.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, -1));
        jPanel9.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 192, -1));
        jPanel9.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, -1));

        jLabel31.setText("Id");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField14.setEditable(false);
        jPanel9.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));

        jDialog4.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 340, 200));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Raza", "Género", "Tamaño", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jDialog4.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 710, 220));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setText("Añadir");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        jButton16.setText("Modificar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 30));

        jButton17.setText("Eliminar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        jButton18.setText("Mostrar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        jButton19.setText("Borrar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jButton50.setText("Carrito compra");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jDialog4.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 340, 200));

        jLabel32.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel32.setText("Tienda de animales");
        jDialog4.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton20.setText("Cerrar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jDialog4.getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jDialog5.setMinimumSize(new java.awt.Dimension(862, 653));
        jDialog5.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de conejos"));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setText("Raza");
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 37, -1));

        jLabel35.setText("Género");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jLabel36.setText("Tamaño");
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel37.setText("Precio");
        jPanel12.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 37, -1));
        jPanel12.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));
        jPanel12.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, -1));
        jPanel12.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 192, -1));
        jPanel12.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, -1));

        jLabel38.setText("Id");
        jPanel12.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField19.setEditable(false);
        jPanel12.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));

        jDialog5.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 340, 200));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Raza", "Género", "Tamaño", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jDialog5.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 710, 220));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton22.setText("Añadir");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        jButton23.setText("Modificar");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 30));

        jButton24.setText("Eliminar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        jButton25.setText("Mostrar");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        jButton26.setText("Borrar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jButton51.setText("Carrito compra");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jDialog5.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 340, 200));

        jLabel39.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel39.setText("Tienda de animales");
        jDialog5.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton27.setText("Cerrar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jDialog5.getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jDialog6.setMinimumSize(new java.awt.Dimension(862, 653));
        jDialog6.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de peces"));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setText("Raza");
        jPanel15.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 37, -1));

        jLabel42.setText("Género");
        jPanel15.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jLabel43.setText("Tamaño");
        jPanel15.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel44.setText("Precio");
        jPanel15.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 37, -1));
        jPanel15.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));
        jPanel15.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, -1));
        jPanel15.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 192, -1));
        jPanel15.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, -1));

        jLabel45.setText("Id");
        jPanel15.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField24.setEditable(false);
        jPanel15.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));

        jDialog6.getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 340, 200));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Raza", "Género", "Tamaño", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jDialog6.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 710, 220));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton29.setText("Añadir");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        jButton30.setText("Modificar");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 30));

        jButton31.setText("Eliminar");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        jButton32.setText("Mostrar");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        jButton33.setText("Borrar");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jButton52.setText("Carrito compra");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jDialog6.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 340, 200));

        jLabel46.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel46.setText("Tienda de animales");
        jDialog6.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton34.setText("Cerrar");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jDialog6.getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jDialog7.setMinimumSize(new java.awt.Dimension(862, 653));
        jDialog7.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de juguetes"));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setText("Tipo animal");
        jPanel19.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jLabel50.setText("Tipo juguete");
        jPanel19.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        jLabel51.setText("Tamaño");
        jPanel19.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel52.setText("Precio");
        jPanel19.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 37, -1));
        jPanel19.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));
        jPanel19.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, -1));
        jPanel19.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 192, -1));

        jLabel53.setText("Id");
        jPanel19.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField29.setEditable(false);
        jPanel19.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));
        jPanel19.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, -1));

        jDialog7.getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 340, 200));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo animal", "Tipo juguete", "Tamaño", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jDialog7.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 710, 220));

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton37.setText("Añadir");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        jButton38.setText("Modificar");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 30));

        jButton39.setText("Eliminar");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        jButton40.setText("Mostrar");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        jButton41.setText("Borrar");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jButton53.setText("Carrito compra");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jDialog7.getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 340, 200));

        jLabel54.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel54.setText("Tienda de animales");
        jDialog7.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton42.setText("Cerrar");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jDialog7.getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jDialog8.setMinimumSize(new java.awt.Dimension(862, 653));
        jDialog8.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de comida"));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setText("Tipo");
        jPanel21.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jLabel56.setText("Marca");
        jPanel21.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        jLabel57.setText("Precio");
        jPanel21.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel58.setText("Edad");
        jPanel21.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 37, -1));
        jPanel21.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));
        jPanel21.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, -1));
        jPanel21.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 192, -1));
        jPanel21.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, -1));

        jLabel59.setText("Id");
        jPanel21.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField34.setEditable(false);
        jPanel21.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));

        jDialog8.getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 340, 200));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Marca", "Precio", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jDialog8.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 710, 220));

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton43.setText("Añadir");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        jButton44.setText("Modificar");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 30));

        jButton45.setText("Eliminar");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        jButton46.setText("Mostrar");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        jButton47.setText("Borrar");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jButton54.setText("Carrito compra");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jDialog8.getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 340, 200));

        jLabel60.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel60.setText("Tienda de animales");
        jDialog8.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton48.setText("Cerrar");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jDialog8.getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jDialog9.setMinimumSize(new java.awt.Dimension(600, 400));
        jDialog9.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel61.setText("Carrito de la compra");
        jDialog9.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Marca/Raza", "Precio"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        jDialog9.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 250));

        jButton56.setText("Imprimir");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jDialog9.getContentPane().add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jButton57.setText("Cerrar");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jDialog9.getContentPane().add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDialog9.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 290, 40));

        jDialog10.setMaximumSize(new java.awt.Dimension(650, 500));
        jDialog10.setMinimumSize(new java.awt.Dimension(650, 500));
        jDialog10.setPreferredSize(new java.awt.Dimension(650, 500));
        jDialog10.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel62.setText("Carrusel de perros");
        jDialog10.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 300, -1));

        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDialog10.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 360, 280));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setText("Tienda de animales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexb\\Documents\\NetBeansProjects\\Tienda_de_animales\\Portada.png")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel5)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Log In"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        jButton2.setText("Acceder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("¿No tienes cuenta?");

        jButton3.setText("Registrarse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(43, 43, 43))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton2)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 370, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String username = jTextField1.getText();
        String contra = jPasswordField1.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            String sql = "select * from empleados where nombre = ? and contraseña = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jPasswordField1.getText());
            ResultSet rs;
            rs = pst.executeQuery();
            
            if(rs.next()){
                jDialog1.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Cuenta no creada");
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDialog2.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String username = jTextField2.getText();
        String contra = jPasswordField2.getText();
        String email = jTextField3.getText();
        String telefono = jTextField4.getText();
            
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            Statement st = con.createStatement();
            String sql = "insert into empleados (nombre,contraseña,email,telefono)"+
                   "values('" + username + "', '" + contra + "' , '" + email + "' , '"+ telefono + "')"; 
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Datos añadidos correctamente");
        }catch(Exception e){
            System.out.println("error");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jDialog3.setVisible(true);
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //select de perros
        mostrar("perros",jTable1);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jDialog3.setVisible(false);
        jDialog1.setVisible(true);  
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        insertar("perros",jTextField6,jTextField7,jTextField8,jTextField9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        eliminar("perros",jTextField5,"perro");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        int idc = Integer.parseInt ((String) jTable1.getValueAt(fila,0).toString());
        String raza = (String) jTable1.getValueAt(fila, 1);
        String genero = (String) jTable1.getValueAt(fila, 2);
        String tamaño = (String) jTable1.getValueAt(fila, 3);
        String precio = (String) jTable1.getValueAt(fila, 4);
        
        jTextField5.setText(String.valueOf(idc));
        jTextField6.setText(raza);
        jTextField7.setText(genero);
        jTextField8.setText(tamaño);
        jTextField9.setText(precio);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        modificar("perros",jTextField5,jTextField6,jTextField7,jTextField8,jTextField9,"perro");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        borrar(jTextField5,jTextField6,jTextField7,jTextField8,jTextField9);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog4.setVisible(true);
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int fila = jTable2.getSelectedRow();
        int idc = Integer.parseInt ((String) jTable2.getValueAt(fila,0).toString());
        String raza = (String) jTable2.getValueAt(fila, 1);
        String genero = (String) jTable2.getValueAt(fila, 2);
        String tamaño = (String) jTable2.getValueAt(fila, 3);
        String precio = (String) jTable2.getValueAt(fila, 4);
        
        jTextField14.setText(String.valueOf(idc));
        jTextField10.setText(raza);
        jTextField11.setText(genero);
        jTextField12.setText(tamaño);
        jTextField13.setText(precio);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        insertar("gatos",jTextField10,jTextField11,jTextField12,jTextField13);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        modificar("gatos",jTextField14,jTextField10,jTextField11,jTextField12,jTextField13,"gato");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        eliminar("gatos",jTextField14,"gato");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        mostrar("gatos",jTable2);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        borrar(jTextField14,jTextField10,jTextField11,jTextField12,jTextField13);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jDialog4.setVisible(false);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jDialog5.setVisible(true);
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int fila = jTable3.getSelectedRow();
        int idc = Integer.parseInt ((String) jTable3.getValueAt(fila,0).toString());
        String raza = (String) jTable3.getValueAt(fila, 1);
        String genero = (String) jTable3.getValueAt(fila, 2);
        String tamaño = (String) jTable3.getValueAt(fila, 3);
        String precio = (String) jTable3.getValueAt(fila, 4);
        
        jTextField19.setText(String.valueOf(idc));
        jTextField15.setText(raza);
        jTextField16.setText(genero);
        jTextField17.setText(tamaño);
        jTextField18.setText(precio);
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        insertar("conejos",jTextField15,jTextField16,jTextField17,jTextField18);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        modificar("conejos",jTextField19,jTextField15,jTextField16,jTextField17,jTextField18,"conejo");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        eliminar("conejos",jTextField19,"conejo");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        mostrar("conejos",jTable3);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        borrar(jTextField19,jTextField15,jTextField16,jTextField17,jTextField18);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jDialog5.setVisible(false);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jDialog6.setVisible(true);
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        int fila = jTable4.getSelectedRow();
        int idc = Integer.parseInt ((String) jTable4.getValueAt(fila,0).toString());
        String raza = (String) jTable4.getValueAt(fila, 1);
        String genero = (String) jTable4.getValueAt(fila, 2);
        String tamaño = (String) jTable4.getValueAt(fila, 3);
        String precio = (String) jTable4.getValueAt(fila, 4);
        
        jTextField24.setText(String.valueOf(idc));
        jTextField20.setText(raza);
        jTextField21.setText(genero);
        jTextField22.setText(tamaño);
        jTextField23.setText(precio);
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        insertar("peces",jTextField20,jTextField21,jTextField22,jTextField23);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        modificar("peces",jTextField24,jTextField20,jTextField21,jTextField22,jTextField23,"pez");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        eliminar("peces",jTextField24,"pez");
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        mostrar("peces",jTable4);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        borrar(jTextField24,jTextField20,jTextField21,jTextField22,jTextField23);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jDialog6.setVisible(false);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jDialog7.setVisible(true);
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        int fila = jTable5.getSelectedRow();
        int idc = Integer.parseInt ((String) jTable5.getValueAt(fila,0).toString());
        String tipo_animal = (String) jTable5.getValueAt(fila, 1);
        String tipo_juguete = (String) jTable5.getValueAt(fila, 2);
        String tamaño = (String) jTable5.getValueAt(fila, 3);
        String precio = (String) jTable5.getValueAt(fila, 4);
        
        jTextField29.setText(String.valueOf(idc));
        jTextField25.setText(tipo_animal);
        jTextField26.setText(tipo_juguete);
        jTextField27.setText(tamaño);
        jTextField28.setText(precio);
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        insertar_juguetes("juguetes",jTextField25,jTextField26,jTextField27,jTextField28);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        modificar_juguetes("juguetes",jTextField29,jTextField25,jTextField26,jTextField27,jTextField28,"juguete");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        eliminar("juguetes",jTextField29,"juguete");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        mostrar_juguetes("juguetes",jTable5);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        borrar(jTextField29,jTextField25,jTextField26,jTextField27,jTextField28);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        jDialog7.setVisible(false);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        insertar_alimentos("alimentos",jTextField30,jTextField31,jTextField32,jTextField33);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        modificar_alimentos("alimentos",jTextField34,jTextField30,jTextField31,jTextField32,jTextField33,"alimento");
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        eliminar("alimentos",jTextField34,"alimento");
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        mostrar_alimentos("alimentos",jTable6);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        borrar(jTextField34,jTextField30,jTextField31,jTextField32,jTextField33);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        jDialog8.setVisible(false);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        int fila = jTable6.getSelectedRow();
        int idc = Integer.parseInt ((String) jTable6.getValueAt(fila,0).toString());
        String tipo = (String) jTable6.getValueAt(fila, 1);
        String marca = (String) jTable6.getValueAt(fila, 2);
        String precio = (String) jTable6.getValueAt(fila, 3);
        String edad = (String) jTable6.getValueAt(fila, 4);
        
        jTextField29.setText(String.valueOf(idc));
        jTextField25.setText(tipo);
        jTextField26.setText(marca);
        jTextField27.setText(precio);
        jTextField28.setText(edad);
    }//GEN-LAST:event_jTable6MouseClicked

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        carrito("compras","Perro",jTextField6,jTextField9);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        carrito("compras","Gato",jTextField10,jTextField13);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        carrito("compras","Conejo",jTextField15,jTextField18);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        carrito("compras","Pez",jTextField20,jTextField23);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        carrito_juguetes("compras",jTextField25,jTextField26,jTextField27);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        carrito_juguetes("compras",jTextField30,jTextField31,jTextField32);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        jDialog8.setVisible(true);
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        jDialog9.setVisible(false);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        Toolkit tk = jDialog9.getToolkit();
        PrintJob pj = tk.getPrintJob(this, null, null);
        Graphics g = pj.getGraphics();
        jDialog9.print(g);
        g.dispose();
        pj.end();
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        jDialog1.setVisible(false); 
        
        String sql = "select * from compras";
        Statement st;

        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Tipo");
        model.addColumn("Raza/Marca");
        model.addColumn("Precio");
        jTable7.setModel(model);
         
        String [] datos = new String [4];
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                model.addRow(datos);
            }
             
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error" );
        }
        
        suma_importe(jLabel63);
        
        jDialog9.setVisible(true);  
    }//GEN-LAST:event_jButton55ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
    
    //metodos del programa
    public void mostrar(String tabla,JTable tablita){
        String sql = "select * from " + tabla;
        Statement st;

        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("raza");
        model.addColumn("genero");
        model.addColumn("tamaño");
        model.addColumn("precio");
        tablita.setModel(model);
         
        String [] datos = new String [5];
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                model.addRow(datos);
            }
             
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error" );
        }
    }
    
    public void insertar(String tabla, JTextField raza,JTextField genero,JTextField tamaño,JTextField precio){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "insert into " + tabla + " (Raza, Género, Tamaño, Precio) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, raza.getText());
            pst.setString(2, genero.getText());
            pst.setString(3, tamaño.getText());
            pst.setString(4, precio.getText());
            
            pst.executeUpdate();
            System.out.println("Datos añadidos correctamente");
        }catch(Exception e){
            System.out.println(e + "error");
        }
    }

    public void eliminar(String tabla,JTextField id,String campo){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "delete from " + tabla + " where Id_" + campo + " = " + id.getText();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Datos eliminados correctamente");;
        }catch(Exception e){
            System.out.println(e + "error al borrar");
        }
    }
    
    public void modificar(String tabla,JTextField id,JTextField raza,JTextField genero,JTextField tamaño,JTextField precio,String campo){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "update " + tabla + " set Raza = '" + raza.getText() + "', Género = '" + genero.getText() + "', Tamaño = " + tamaño.getText() + ", Precio = " + precio.getText() + " where Id_" + campo +" = " + id.getText();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Datos modificados correctamente");
        }catch(Exception e){
            System.out.println(e + "error al modificar");
        }
    }
    
    public void borrar(JTextField id,JTextField raza,JTextField genero,JTextField tamaño,JTextField precio){
        id.setText("");
        raza.setText("");
        genero.setText("");
        tamaño.setText("");
        precio.setText("");
    }
    
    public void insertar_juguetes(String tabla, JTextField tipo_animal,JTextField Tipo_juguete,JTextField tamaño,JTextField precio){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "insert into " + tabla + " (Tipo_animal,Tipo_juguete , Tamaño, Precio) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tipo_animal.getText());
            pst.setString(2, Tipo_juguete.getText());
            pst.setString(3, tamaño.getText());
            pst.setString(4, precio.getText());
            
            pst.executeUpdate();
            System.out.println("Datos añadidos correctamente");
        }catch(Exception e){
            System.out.println(e + "error");
        }
    }
    
    public void mostrar_juguetes(String tabla,JTable tablita){
        String sql = "select * from " + tabla;
        Statement st;

        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Tipo animal");
        model.addColumn("Tipo juguete");
        model.addColumn("Tamaño");
        model.addColumn("Precio");
        tablita.setModel(model);
         
        String [] datos = new String [5];
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                model.addRow(datos);
            }
             
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error" );
        }
    }
    
    public void modificar_juguetes(String tabla,JTextField id,JTextField tipo_animal,JTextField Tipo_juguete,JTextField tamaño,JTextField precio,String campo)
    {
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "update " + tabla + " set Tipo_animal = '" + tipo_animal.getText() + "', Tipo_juguete = '" + Tipo_juguete.getText() + "', Tamaño = " + tamaño.getText() + ", Precio = " + precio.getText() + " where Id_" + campo +" = " + id.getText();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Datos modificados correctamente");
        }catch(Exception e){
            System.out.println(e + "error al modificar");
        }
    }
    
    public void insertar_alimentos(String tabla, JTextField tipo,JTextField marca,JTextField precio,JTextField edad){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "insert into " + tabla + " (Tipo,marca , precio, edad) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tipo.getText());
            pst.setString(2, marca.getText());
            pst.setString(3, precio.getText());
            pst.setString(4, edad.getText());
            
            pst.executeUpdate();
            System.out.println("Datos añadidos correctamente");
        }catch(Exception e){
            System.out.println(e + "error");
        }
    }
    
    public void modificar_alimentos(String tabla,JTextField id,JTextField tipo,JTextField marca,JTextField precio,JTextField edad,String campo){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "update " + tabla + " set Tipo = '" + tipo.getText() + "', Marca = '" + marca.getText() + "', Precio = " + precio.getText() + ", Edad = " + edad.getText() + " where Id_"+ campo +" = " + id.getText();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Datos modificados correctamente");
        }catch(Exception e){
            System.out.println(e + "error al modificar");
        }
    }
    
    public void mostrar_alimentos(String tabla,JTable tablita){
        String sql = "select * from " + tabla;
        Statement st;

        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Tipo");
        model.addColumn("Marca");
        model.addColumn("Precio");
        model.addColumn("Edad");
        tablita.setModel(model);
         
        String [] datos = new String [5];
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                model.addRow(datos);
            }
             
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error" );
        }
    }
    
    public void carrito(String tabla,String animal,JTextField raza,JTextField precio){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "insert into " + tabla + " (Tipo, Raza, Precio) values (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, animal);
            pst.setString(2, raza.getText());
            pst.setString(3, precio.getText());
            
            pst.executeUpdate();
            System.out.println("Datos añadidos correctamente");
        }catch(Exception e){
            System.out.println(e + "error");
        }
    }
    
    public void carrito_juguetes(String tabla,JTextField tipo, JTextField animal,JTextField precio){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql = "insert into " + tabla + " (Tipo, Raza, Precio) values (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tipo.getText());
            pst.setString(2, animal.getText());
            pst.setString(3, precio.getText());
            
            pst.executeUpdate();
            System.out.println("Datos añadidos correctamente");
        }catch(Exception e){
            System.out.println(e + "error");
        }
    }
    
    public void suma_importe(JLabel etiqueta){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);           
            String sql =  "select sum(precio) as Total from compras";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                double suma = rs.getDouble("Total");
                etiqueta.setText("Total de la compra realizada: " + suma);
            }
            
            System.out.println("Datos modificados correctamente");
        }catch(Exception e){
            System.out.println(e + "error al sumar el Total");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog10;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JDialog jDialog8;
    private javax.swing.JDialog jDialog9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
