/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author jairo
 */
public class adminUI extends javax.swing.JFrame {

    /**
     * Creates new form adminUI
     */
    public adminUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxRoles = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbxStores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Productos", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Administrador de Usuarios");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 330, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, -1));
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 110, -1));

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUsers);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1050, 290));

        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 150, -1));

        jLabel4.setText("Rol:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        cbxRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 140, -1));

        jLabel5.setText("Tienda");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        cbxStores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxStores, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 150, -1));

        jTabbedPane1.addTab("Usuarios", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxRoles;
    private javax.swing.JComboBox<String> cbxStores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}