package frames;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kevin Rios
 */
public class gruposRegistrados extends javax.swing.JFrame {

    /**
     * Creates new form grupos_registrados
     */
    public gruposRegistrados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrupos = new javax.swing.JTable();
        lblNombreCurso = new javax.swing.JLabel();
        comboCursos = new javax.swing.JComboBox<>();
        btnEditarGrupo = new javax.swing.JButton();
        btnAgregarGrupo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnConsultarGrupo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(756, 551));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Grupos Registrados");

        tblGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grupo", "Nº Alumnos", "Días"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGrupos.setShowGrid(true);
        tblGrupos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblGrupos);
        if (tblGrupos.getColumnModel().getColumnCount() > 0) {
            tblGrupos.getColumnModel().getColumn(0).setMinWidth(100);
            tblGrupos.getColumnModel().getColumn(0).setMaxWidth(100);
            tblGrupos.getColumnModel().getColumn(1).setMinWidth(100);
            tblGrupos.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        lblNombreCurso.setText("Curso:");

        comboCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un curso" }));

        btnEditarGrupo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoEditar.png"))); // NOI18N
        btnEditarGrupo.setText("Editar");
        btnEditarGrupo.setBorder(null);
        btnEditarGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarGrupo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAgregarGrupo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoAgregarSmall.png"))); // NOI18N
        btnAgregarGrupo.setText("Registrar");
        btnAgregarGrupo.setBorder(null);
        btnAgregarGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarGrupo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoRegresarSmall.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnConsultarGrupo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoConsultarSmall.png"))); // NOI18N
        btnConsultarGrupo.setText("Consultar");
        btnConsultarGrupo.setBorder(null);
        btnConsultarGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarGrupo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnAgregarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblNombreCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo)
                                    .addComponent(comboCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(29, 29, 29)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCurso)
                    .addComponent(comboCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gruposRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gruposRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gruposRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gruposRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gruposRegistrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarGrupo;
    private javax.swing.JButton btnConsultarGrupo;
    private javax.swing.JButton btnEditarGrupo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboCursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tblGrupos;
    // End of variables declaration//GEN-END:variables
}
