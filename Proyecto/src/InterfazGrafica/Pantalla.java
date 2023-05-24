package InterfazGrafica;

import Clases.Perfil;
import Clases.Publicacion;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Pantalla extends javax.swing.JFrame {
    private Perfil Per;

    public Pantalla(Perfil Perf) {
        initComponents();
        Per = Perf;
        labelNombre.setText(Per.getNombre());
        labelApellido.setText(Per.getApellido());
        labelSeguidores.setText(String.valueOf(Per.getSeguidores()));
        labelSeguidos.setText(String.valueOf(Per.getSeguidos()));
        labelPublic.setText(String.valueOf(Per.getPublicaciones()));
        Contenido.setLayout(new GridLayout(1, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        ButtonPubli = new javax.swing.JButton();
        ButtonEstadist = new javax.swing.JButton();
        ButtonAlbum = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelSeguidos = new javax.swing.JLabel();
        labelSeguidores = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelPublic = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        ButtonReporte = new javax.swing.JButton();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Menu.setBackground(new java.awt.Color(0, 51, 102));
        Menu.setToolTipText("APELLIDO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGrafica/FotoPerfil (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        labelNombre.setBackground(new java.awt.Color(255, 255, 255));
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));

        ButtonPubli.setBackground(new java.awt.Color(0, 51, 153));
        ButtonPubli.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPubli.setText("Publicaciones");
        ButtonPubli.setBorder(null);
        ButtonPubli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonPubli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPubliActionPerformed(evt);
            }
        });

        ButtonEstadist.setBackground(new java.awt.Color(0, 51, 153));
        ButtonEstadist.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEstadist.setText("Estadisticas");
        ButtonEstadist.setBorder(null);
        ButtonEstadist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonEstadist.setPreferredSize(new java.awt.Dimension(47, 16));
        ButtonEstadist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEstadistActionPerformed(evt);
            }
        });

        ButtonAlbum.setBackground(new java.awt.Color(0, 51, 153));
        ButtonAlbum.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAlbum.setText("Albumes");
        ButtonAlbum.setBorder(null);
        ButtonAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlbumActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seguidores");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seguidos");

        labelSeguidos.setForeground(new java.awt.Color(255, 255, 255));

        labelSeguidores.setForeground(new java.awt.Color(255, 255, 255));
        labelSeguidores.setText("     ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Publicaciones");

        labelPublic.setForeground(new java.awt.Color(255, 255, 255));

        labelApellido.setForeground(new java.awt.Color(255, 255, 255));

        ButtonReporte.setBackground(new java.awt.Color(0, 51, 153));
        ButtonReporte.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReporte.setText("Reporte");
        ButtonReporte.setBorder(null);
        ButtonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonPubli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonEstadist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(labelPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSeguidores, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSeguidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ButtonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSeguidos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSeguidores, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonPubli, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonEstadist, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setPreferredSize(new java.awt.Dimension(497, 662));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPubliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPubliActionPerformed
        PanelPublic P1 = new PanelPublic();
        ShowPanel(P1);
    }//GEN-LAST:event_ButtonPubliActionPerformed

    private void ButtonAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlbumActionPerformed
        PanelAlbum P2 = new PanelAlbum(); 
        ShowPanel(P2);
    }//GEN-LAST:event_ButtonAlbumActionPerformed

    private void ButtonEstadistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEstadistActionPerformed
        PanelEstadist P3 = new PanelEstadist(Per);
        P3.GeneraBarras();
        P3.GraficoCircular();
        ShowPanel(P3);
    }//GEN-LAST:event_ButtonEstadistActionPerformed

    private void ButtonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReporteActionPerformed
        PanelReport P4 = new PanelReport(Per);
        P4.MustraTablas();
        ShowPanel(P4);
    }//GEN-LAST:event_ButtonReporteActionPerformed
     
    private void ShowPanel(JPanel P){
        P.setSize(497, 662);
        P.setLocation(0, 0);
        Contenido.removeAll();
        Contenido.add(P, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlbum;
    private javax.swing.JButton ButtonEstadist;
    private javax.swing.JButton ButtonPubli;
    private javax.swing.JButton ButtonReporte;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPublic;
    private javax.swing.JLabel labelSeguidores;
    private javax.swing.JLabel labelSeguidos;
    // End of variables declaration//GEN-END:variables
}
