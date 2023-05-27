package InterfazGrafica;

import Clases.Audio;
import Clases.Imagen;
import Clases.Publicacion;
import Clases.Video;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PanelPublic extends javax.swing.JPanel {
    private DefaultTableModel model;
    private ArrayList<Imagen> imgList;
    private ArrayList<Video> vidList;
    private ArrayList<Audio> audList;
    private ArrayList<Publicacion> mas100List;
    private ArrayList<Publicacion> publicList;
    public PanelPublic(ArrayList<Imagen> img,ArrayList<Video> vid,ArrayList<Audio> aud,ArrayList<Publicacion> mas100,ArrayList<Publicacion> Public) {
        initComponents();
        imgList = img;
        vidList = vid;
        audList = aud;
        mas100List = mas100;
        publicList = Public;
        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Fecha");
        model.addColumn("Likes");
        model.addColumn("Etiquetas");
        model.addColumn("Comentarios");
        model.addColumn("Especificaciones");
        Table.setModel(model);
    }
    
    public void Carga(ArrayList<? extends Publicacion> ListPubli){
       model.setRowCount(0);
       for(int i=0; i<ListPubli.size(); i++){
          Object[] fila={
            ListPubli.get(i).getNombre(),
            ListPubli.get(i).getFecha(),
            ListPubli.get(i).getCantMG(),
            ListPubli.get(i).getEtiquetas(),
            ListPubli.get(i).getComentarios(),
            ListPubli.get(i).muestra()
          };
          model.addRow(fila);
       }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonImagen = new javax.swing.JButton();
        ButtonVideos = new javax.swing.JButton();
        ButtonAudios = new javax.swing.JButton();
        ButtonMas100 = new javax.swing.JButton();
        ButtonTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(497, 662));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Publicaciones");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por:");

        ButtonImagen.setBackground(new java.awt.Color(102, 102, 102));
        ButtonImagen.setForeground(new java.awt.Color(255, 255, 255));
        ButtonImagen.setText("Imagenes");
        ButtonImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonImagenActionPerformed(evt);
            }
        });

        ButtonVideos.setBackground(new java.awt.Color(102, 102, 102));
        ButtonVideos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonVideos.setText("Videos");
        ButtonVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVideosActionPerformed(evt);
            }
        });

        ButtonAudios.setBackground(new java.awt.Color(102, 102, 102));
        ButtonAudios.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAudios.setText("Audios");
        ButtonAudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAudiosActionPerformed(evt);
            }
        });

        ButtonMas100.setBackground(new java.awt.Color(102, 102, 102));
        ButtonMas100.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMas100.setText("Mas de 100 Comentarios");
        ButtonMas100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMas100ActionPerformed(evt);
            }
        });

        ButtonTodos.setBackground(new java.awt.Color(102, 102, 102));
        ButtonTodos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTodos.setText("Todos");
        ButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTodosActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AplicarFiltro");

        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setText("Nombre Publicacion");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Blanco Negro");

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Noche");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Luminoso");

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Polarizado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(ButtonImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonMas100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonVideos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAudios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ButtonImagen)
                    .addComponent(ButtonVideos)
                    .addComponent(ButtonAudios)
                    .addComponent(ButtonTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonMas100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(264, 264, 264))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAudiosActionPerformed
        Carga(audList);
    }//GEN-LAST:event_ButtonAudiosActionPerformed

    private void ButtonMas100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMas100ActionPerformed
        Carga(mas100List);
    }//GEN-LAST:event_ButtonMas100ActionPerformed

    private void ButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTodosActionPerformed
        Carga(publicList);
    }//GEN-LAST:event_ButtonTodosActionPerformed

    private void ButtonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonImagenActionPerformed
        Carga(imgList);
    }//GEN-LAST:event_ButtonImagenActionPerformed

    private void ButtonVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVideosActionPerformed
        Carga(vidList);
    }//GEN-LAST:event_ButtonVideosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAudios;
    private javax.swing.JButton ButtonImagen;
    private javax.swing.JButton ButtonMas100;
    private javax.swing.JButton ButtonTodos;
    private javax.swing.JButton ButtonVideos;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
