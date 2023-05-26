package InterfazGrafica;

import Clases.Album;
import Clases.Publicacion;
import Logica.Reporte;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class PanelAlbum extends javax.swing.JPanel {
   private Reporte Rep;
   private ArrayList<Album> Albu;
   private ArrayList<Publicacion> Public;
   private DefaultTreeModel modelTree;
   private DefaultMutableTreeNode nodoSelec;

    public PanelAlbum(ArrayList<Album> A,ArrayList<Publicacion> P) {
        initComponents();
        Rep = new Reporte();
        Public = P;
        modelTree = new DefaultTreeModel(new DefaultMutableTreeNode("Album1"));
        TreeArbol.setModel(modelTree);
        Albu = A;
        Album Album1 = new Album("Album1");
        A.add(Album1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TreeArbol = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePublicacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextCrea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextAgrega = new javax.swing.JTextField();
        ButtonCrea = new javax.swing.JButton();
        ButtonAgrega = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 0, 102));

        TreeArbol.setBackground(new java.awt.Color(51, 51, 51));
        TreeArbol.setForeground(new java.awt.Color(255, 255, 255));
        TreeArbol.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                TreeArbolValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(TreeArbol);

        TablePublicacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablePublicacion);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Albumes");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear Album");

        TextCrea.setForeground(new java.awt.Color(204, 204, 204));
        TextCrea.setText("Nombre");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Publicacion");

        TextAgrega.setForeground(new java.awt.Color(204, 204, 204));
        TextAgrega.setText("Nombre publicacion");
        TextAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAgregaActionPerformed(evt);
            }
        });

        ButtonCrea.setBackground(new java.awt.Color(102, 102, 102));
        ButtonCrea.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCrea.setText("Crear");
        ButtonCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreaActionPerformed(evt);
            }
        });

        ButtonAgrega.setBackground(new java.awt.Color(102, 102, 102));
        ButtonAgrega.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgrega.setText("Agregar");
        ButtonAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publicaciones");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Generar Reporte:");

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Fecha Inicial");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("Fecha final");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Generar reporte");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(ButtonAgrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(187, 187, 187))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jTextField3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane3)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextAgrega)
                            .addComponent(TextCrea)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(ButtonCrea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCrea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCrea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextAgrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonAgrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4)
                        .addComponent(jTextField3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void CargaPublicaciones(ArrayList<Publicacion> PubList){
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("Nombre");
       model.addColumn("Fecha");
       model.addColumn("Likes");
       model.addColumn("Etiquetas");
       model.addColumn("Comentarios");
       model.addColumn("Especificaciones");
       TablePublicacion.setModel(model);
       model.setRowCount(0);
       for(int i=0; i<PubList.size(); i++){
          Object[] fila={
            PubList.get(i).getNombre(),
            PubList.get(i).getFecha(),
            PubList.get(i).getCantMG(),
            PubList.get(i).getEtiquetas(),
            PubList.get(i).getComentarios(),
            PubList.get(i).muestra()
    
          };
          model.addRow(fila);
        }
    
    }
    
    
    private void TextAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAgregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAgregaActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void TreeArbolValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_TreeArbolValueChanged
        nodoSelec=(DefaultMutableTreeNode) TreeArbol.getLastSelectedPathComponent();
    }//GEN-LAST:event_TreeArbolValueChanged

    private void ButtonCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreaActionPerformed
        String Selecnodo = nodoSelec.toString();
        Album albumRaiz = Albu.get(0);  // Obtener el primer elemento del ArrayList
        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode(albumRaiz);
        DefaultMutableTreeNode nodoEncon = Albu.get(0).buscarNodoAlbum(nodoRaiz, Selecnodo);
        Album albumEncon = (Album) nodoEncon.getUserObject();
        albumEncon.agregaSubAlbum(Selecnodo);
        String text=this.TextCrea.getText();
        DefaultMutableTreeNode n=new DefaultMutableTreeNode(text);
        if(nodoSelec!=null){
          modelTree.insertNodeInto(n,nodoSelec,nodoSelec.getChildCount());
        }
    }//GEN-LAST:event_ButtonCreaActionPerformed

    private void ButtonAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgregaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgrega;
    private javax.swing.JButton ButtonCrea;
    private javax.swing.JTable TablePublicacion;
    private javax.swing.JTextField TextAgrega;
    private javax.swing.JTextField TextCrea;
    private javax.swing.JTree TreeArbol;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
