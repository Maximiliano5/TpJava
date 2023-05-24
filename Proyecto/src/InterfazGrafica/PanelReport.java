package InterfazGrafica;

import Clases.Audio;
import Clases.Imagen;
import Clases.Perfil;
import Clases.Publicacion;
import Clases.Video;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PanelReport extends javax.swing.JPanel {
    private Perfil perfil;

  
    public PanelReport(Perfil P) {
        initComponents();
        perfil = P;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TableImagen = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVideo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableAudio = new javax.swing.JTable();

        setForeground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(497, 662));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setHorizontalScrollBar(null);

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
        TableImagen.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TableImagen);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void MustraTablas() {
       ArrayList<Imagen> imgList = new ArrayList(); 
       ArrayList<Video> vidList = new ArrayList();
       ArrayList<Audio> audList = new ArrayList();
       perfil.filtraPubli(imgList, vidList, audList);
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAudio;
    private javax.swing.JTable TableImagen;
    private javax.swing.JTable TableVideo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
