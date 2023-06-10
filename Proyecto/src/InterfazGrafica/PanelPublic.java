package InterfazGrafica;

import Clases.Audio;
import Clases.Imagen;
import Clases.Perfil;
import Clases.Publicacion;
import Clases.Video;
import Logica.Main.Filtro;
import static Logica.Main.Filtro.Blanco_negro;
import static Logica.Main.Filtro.Luminoso;
import static Logica.Main.Filtro.Noche;
import static Logica.Main.Filtro.Polarizado;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PanelPublic extends javax.swing.JPanel {
    private DefaultTableModel model;
    private ArrayList<Imagen> imgList;
    private ArrayList<Video> vidList;
    private ArrayList<Audio> audList;
    private ArrayList<Publicacion> mas100List;
    private ArrayList<Publicacion> Actual;
    private Publicacion objPubli;
    private Perfil objPerf;
    public PanelPublic(Perfil objP) {
        initComponents();
        objPerf =objP;
        Actual = new ArrayList();
        imgList = new ArrayList();
        vidList = new ArrayList();
        audList = new ArrayList();
        mas100List = new ArrayList();
        objPerf.filtraPubli(imgList, vidList, audList);
        mas100List = objPerf.masComentados();
        Actual = objPerf.getPubList();
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
    private void AplicarFiltro(Filtro F){
        String textNomF = TextFiltro.getText();
        boolean aux;
        objPubli = objPerf.BuscaPublicacion(textNomF);
        if(objPubli!=null){
          if(objPubli instanceof Audio){
            System.out.println("no se puede aplicar filtros a un Audio");
          }else{
             if(objPubli instanceof Imagen){
               Imagen imagen = (Imagen)objPubli;
               aux = imagen.AplicarFiltro(F);
             }else{
                Video video = (Video)objPubli;
                aux = video.AplicarFiltro(F);
             } 
             if(aux)
               System.out.println("Se aplico el filtro");
             else
               System.out.println("La publicacion no acepta filtros"); 
          }
        }else{
           System.out.println("La publicacion no existe");
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
        TextFiltro = new javax.swing.JTextField();
        ButtonBlanNeg = new javax.swing.JButton();
        ButtonNoche = new javax.swing.JButton();
        ButtonLuminoso = new javax.swing.JButton();
        ButtonPolari = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Repro = new javax.swing.JPanel();

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

        TextFiltro.setForeground(new java.awt.Color(51, 51, 51));
        TextFiltro.setText("Nombre Publicacion");
        TextFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFiltroActionPerformed(evt);
            }
        });

        ButtonBlanNeg.setBackground(new java.awt.Color(102, 102, 102));
        ButtonBlanNeg.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBlanNeg.setText("Blanco Negro");
        ButtonBlanNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBlanNegActionPerformed(evt);
            }
        });

        ButtonNoche.setBackground(new java.awt.Color(102, 102, 102));
        ButtonNoche.setForeground(new java.awt.Color(255, 255, 255));
        ButtonNoche.setText("Noche");
        ButtonNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNocheActionPerformed(evt);
            }
        });

        ButtonLuminoso.setBackground(new java.awt.Color(102, 102, 102));
        ButtonLuminoso.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLuminoso.setText("Luminoso");
        ButtonLuminoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLuminosoActionPerformed(evt);
            }
        });

        ButtonPolari.setBackground(new java.awt.Color(102, 102, 102));
        ButtonPolari.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPolari.setText("Polarizado");
        ButtonPolari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPolariActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reproducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Repro.setBackground(new java.awt.Color(51, 51, 51));
        Repro.setPreferredSize(new java.awt.Dimension(180, 180));

        javax.swing.GroupLayout ReproLayout = new javax.swing.GroupLayout(Repro);
        Repro.setLayout(ReproLayout);
        ReproLayout.setHorizontalGroup(
            ReproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ReproLayout.setVerticalGroup(
            ReproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(TextFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonBlanNeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonNoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLuminoso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPolari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(198, 198, 198))
            .addComponent(Repro, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
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
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBlanNeg)
                    .addComponent(ButtonNoche)
                    .addComponent(ButtonLuminoso)
                    .addComponent(ButtonPolari))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Repro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAudiosActionPerformed
        Carga(audList);
        Actual.addAll(audList);
    }//GEN-LAST:event_ButtonAudiosActionPerformed

    private void ButtonMas100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMas100ActionPerformed
        Carga(mas100List);
        Actual.addAll(mas100List);
    }//GEN-LAST:event_ButtonMas100ActionPerformed

    private void ButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTodosActionPerformed
        Carga(objPerf.getPubList());
        Actual.addAll(objPerf.getPubList());
    }//GEN-LAST:event_ButtonTodosActionPerformed

    private void ButtonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonImagenActionPerformed
        Carga(imgList);
        Actual.addAll(imgList);
    }//GEN-LAST:event_ButtonImagenActionPerformed

    private void ButtonVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVideosActionPerformed
        Carga(vidList);
        Actual.addAll(vidList);
    }//GEN-LAST:event_ButtonVideosActionPerformed

    private void ButtonNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNocheActionPerformed
        Filtro filtro = Noche;
        AplicarFiltro(filtro);
    }//GEN-LAST:event_ButtonNocheActionPerformed

    private void TextFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFiltroActionPerformed
        
    }//GEN-LAST:event_TextFiltroActionPerformed

    private void ButtonBlanNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBlanNegActionPerformed
        Filtro filtro = Blanco_negro;
        AplicarFiltro(filtro);
    }//GEN-LAST:event_ButtonBlanNegActionPerformed

    private void ButtonLuminosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLuminosoActionPerformed
        Filtro filtro = Luminoso;
        AplicarFiltro(filtro);
    }//GEN-LAST:event_ButtonLuminosoActionPerformed

    private void ButtonPolariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPolariActionPerformed
        Filtro filtro = Polarizado;
        AplicarFiltro(filtro);
    }//GEN-LAST:event_ButtonPolariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelReproduce PanelRep = new PanelReproduce(Actual);
        ShowPanel(PanelRep);
    }//GEN-LAST:event_jButton1ActionPerformed
        private void ShowPanel(JPanel P){
        P.setSize(800, 180);
        P.setLocation(0, 0);
        Repro.removeAll();
        Repro.add(P, BorderLayout.CENTER);
        Repro.revalidate();
        Repro.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAudios;
    private javax.swing.JButton ButtonBlanNeg;
    private javax.swing.JButton ButtonImagen;
    private javax.swing.JButton ButtonLuminoso;
    private javax.swing.JButton ButtonMas100;
    private javax.swing.JButton ButtonNoche;
    private javax.swing.JButton ButtonPolari;
    private javax.swing.JButton ButtonTodos;
    private javax.swing.JButton ButtonVideos;
    private javax.swing.JPanel Repro;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
