package InterfazGrafica;

import Clases.Audio;
import Clases.Imagen;
import Clases.Publicacion;
import Clases.Video;
import Logica.Reporte;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PanelReport extends javax.swing.JPanel {
    private Reporte Report;
    private ArrayList<Imagen> imgList;
    private ArrayList<Video> vidList;
    private ArrayList<Audio> audList;
    float PromV,PromA,PromI;

    public PanelReport(ArrayList<Imagen> img,ArrayList<Video> vid,ArrayList<Audio> aud,float V,float A,float I) {
        initComponents(); 
        Report = new Reporte();
        imgList = img;
        vidList = vid;
        audList = aud;
        PromV = V;
        PromA = A;
        PromI = I;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVideo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableImagen = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableAudio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setForeground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(497, 662));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        TableVideo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableVideo);

        TableImagen.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TableImagen);

        TableAudio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TableAudio);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Videos:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Audios:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Imagenes:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("15");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("10");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("15");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prom.Likes:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prom.Likes:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Prom.Likes:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reporte pubs TXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Report.reportesPubs(imgList, vidList, audList, vidList.size(), PromV, audList.size(), PromA, imgList.size(), PromI);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void MustraTablas(ArrayList<Imagen> imgList,ArrayList<Video> vidList,ArrayList<Audio> audList) {
       String[] columnNames = {"Nombre", "Fecha", "Likes", "Etiquetas", "Comentarios", "Especificaciones"};
    
       DefaultTableModel audioModel = createTableModel(columnNames);
       CargaFila(audList, audioModel);
       TableAudio.setModel(audioModel);
    
       DefaultTableModel imagenModel = createTableModel(columnNames);
       CargaFila(imgList, imagenModel);
       TableImagen.setModel(imagenModel);
    
       DefaultTableModel videoModel = createTableModel(columnNames);
       CargaFila(vidList, videoModel);
       TableVideo.setModel(videoModel);
   }

   public DefaultTableModel createTableModel(String[] columnNames) {
      DefaultTableModel model = new DefaultTableModel();
      for (String columnName : columnNames) {
          model.addColumn(columnName);
      }
      return model;
   }
    
    @SuppressWarnings("empty-statement")
    public void CargaFila(ArrayList<? extends Publicacion> List,DefaultTableModel model){
    
        model.setRowCount(0);
        for(int i=0; i<List.size(); i++){
           Object[] fila={
               List.get(i).getNombre(),
               List.get(i).getFecha(),
               List.get(i).getCantMG(),
               List.get(i).getEtiquetas(),
               List.get(i).getComentarios(),
               List.get(i).muestra()
           };
           model.addRow(fila);
        }; 
    }
    
    public void CargaLabels(float V, float A, float I,int DimensionV, int DimensionI, int DimensionA){
      jLabel4.setText(String.valueOf(DimensionV));
      jLabel5.setText(String.valueOf(DimensionA));
      jLabel6.setText(String.valueOf(DimensionI));
      jLabel10.setText(String.valueOf(V));
      jLabel11.setText(String.valueOf(A));
      jLabel12.setText(String.valueOf(I));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAudio;
    private javax.swing.JTable TableImagen;
    private javax.swing.JTable TableVideo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
