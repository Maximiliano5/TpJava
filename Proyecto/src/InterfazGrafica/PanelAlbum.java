package InterfazGrafica;

import Clases.Album;
import Clases.Perfil;
import Clases.Publicacion;
import Logica.Reporte;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class PanelAlbum extends javax.swing.JPanel {
   private Reporte Rep;
   private Album Album1;
   private ArrayList<Publicacion> Public;
   private DefaultTreeModel modelTree;
   private DefaultMutableTreeNode nodoSelec;

    public PanelAlbum(ArrayList<Publicacion> P) {
        initComponents();
        Rep = new Reporte();
        Public = P;
        modelTree = new DefaultTreeModel(new DefaultMutableTreeNode("ALBUMES"));
        TreeArbol.setModel(modelTree);
        Album1 = new Album("ALBUMES");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TreeArbol = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePublicacion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TextCrea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextAgrega = new javax.swing.JTextField();
        ButtonCrea = new javax.swing.JButton();
        ButtonAgrega = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fechaini = new javax.swing.JTextField();
        Fechafin = new javax.swing.JTextField();
        ButtonReporte = new javax.swing.JButton();
        ButtonBorrar = new javax.swing.JButton();
        ButtonBorrarP = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        textArea1 = new java.awt.TextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);

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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear Album");

        TextCrea.setForeground(new java.awt.Color(51, 51, 51));
        TextCrea.setText("Nombre album");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Publicacion");

        TextAgrega.setForeground(new java.awt.Color(51, 51, 51));
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

        Fechaini.setForeground(new java.awt.Color(51, 51, 51));
        Fechaini.setText("Fecha Inicial");
        Fechaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechainiActionPerformed(evt);
            }
        });

        Fechafin.setForeground(new java.awt.Color(51, 51, 51));
        Fechafin.setText("Fecha final");
        Fechafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechafinActionPerformed(evt);
            }
        });

        ButtonReporte.setBackground(new java.awt.Color(102, 102, 102));
        ButtonReporte.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReporte.setText("Generar reporte");
        ButtonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReporteActionPerformed(evt);
            }
        });

        ButtonBorrar.setBackground(new java.awt.Color(102, 102, 102));
        ButtonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBorrar.setText("Borrar Album");
        ButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarActionPerformed(evt);
            }
        });

        ButtonBorrarP.setBackground(new java.awt.Color(102, 102, 102));
        ButtonBorrarP.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBorrarP.setText("Borrar Publicacion");
        ButtonBorrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarPActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(textArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addComponent(Fechaini)
                .addGap(18, 18, 18)
                .addComponent(Fechafin)
                .addGap(41, 41, 41)
                .addComponent(ButtonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonBorrarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextAgrega)
                            .addComponent(TextCrea)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonAgrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonCrea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBorrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fechafin)
                        .addComponent(Fechaini)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void FechafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechafinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechafinActionPerformed

    private void FechainiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechainiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechainiActionPerformed

    private void TreeArbolValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_TreeArbolValueChanged
        nodoSelec=(DefaultMutableTreeNode) TreeArbol.getLastSelectedPathComponent();
    }//GEN-LAST:event_TreeArbolValueChanged

    private void ButtonCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreaActionPerformed
        String Selecnodo = nodoSelec.toString();
        if(Selecnodo.startsWith("ALBUM-") || Selecnodo.startsWith("ALBUMES")){
          String AlbumText = "ALBUM-";
          String text=this.TextCrea.getText();
          text = AlbumText+text;
          Album nodoEncon = Album1.buscarAlbum(Album1, Selecnodo);
          nodoEncon.agregaSubAlbum(text);
          DefaultMutableTreeNode n=new DefaultMutableTreeNode(text);
          if(nodoSelec!=null){
            modelTree.insertNodeInto(n,nodoSelec,nodoSelec.getChildCount());
          }
        }else
           System.out.println("No se puede crear un Album dentro de una publicacion"); 
    }//GEN-LAST:event_ButtonCreaActionPerformed

    private void ButtonAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregaActionPerformed
        String Selecnodo = nodoSelec.toString();
        if(Selecnodo.startsWith("ALBUM-")){
          String text=this.TextAgrega.getText();
          Album nodoEncon = Album1.buscarAlbum(Album1, Selecnodo);
          if(nodoEncon.agregaPublicacion(text, Public)){
            DefaultMutableTreeNode n = new DefaultMutableTreeNode(text);
            modelTree.insertNodeInto(n, nodoSelec, nodoSelec.getChildCount());
          }else
              System.out.println("La Publicacion No existe");
        }else
            System.out.println("No podes guardar una publicacion dentro de otra");
    }//GEN-LAST:event_ButtonAgregaActionPerformed

    private void ButtonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReporteActionPerformed
        String fechaini=this.Fechaini.getText();
        String fechafin=this.Fechafin.getText();
        StringBuilder reporteGrafico = new StringBuilder();
        Rep.reportesAlbum(fechaini,fechafin,Album1.getSubAlbum(),reporteGrafico);
        textArea1.setText(String.valueOf(reporteGrafico));
        System.out.println(reporteGrafico);
    }//GEN-LAST:event_ButtonReporteActionPerformed

    private void ButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarActionPerformed
       if(nodoSelec!=null){
         String Selecnodo = nodoSelec.toString(); 
         Album nodoEncon = Album1.buscarAlbum(Album1, Selecnodo);
         nodoEncon.eliminar();
         modelTree.removeNodeFromParent(nodoSelec);
       }
    }//GEN-LAST:event_ButtonBorrarActionPerformed

    private void ButtonBorrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarPActionPerformed
       if(nodoSelec!=null){
         DefaultMutableTreeNode nodoPadre = (DefaultMutableTreeNode) nodoSelec.getParent();
         String nombrePadre = (String) nodoPadre.getUserObject();
         String Selecnodo = nodoSelec.toString();  
         System.out.println(nombrePadre);
         Album nodoEncon = Album1.buscarAlbum(Album1,nombrePadre);
         nodoEncon.eliminarPublicacion(Selecnodo);
         modelTree.removeNodeFromParent(nodoSelec);
       }
    }//GEN-LAST:event_ButtonBorrarPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgrega;
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonBorrarP;
    private javax.swing.JButton ButtonCrea;
    private javax.swing.JButton ButtonReporte;
    private javax.swing.JTextField Fechafin;
    private javax.swing.JTextField Fechaini;
    private javax.swing.JTable TablePublicacion;
    private javax.swing.JTextField TextAgrega;
    private javax.swing.JTextField TextCrea;
    private javax.swing.JTree TreeArbol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
