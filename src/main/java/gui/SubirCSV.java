package gui;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * GUI que permite hacer drag-n-drop de un archivo .csv
 * 
 * Para utilizar esta GUI se debe crear como atributo de otra clase para poder
 * acceder a la URI del archivo arrastrado hacia esta ventana.
 * 
 * @author Luis Marin
 */
public class SubirCSV extends javax.swing.JFrame {

    private String archivoSubido;

    private JFrame framePadre;
    
    /**
     * Crea una ventana para que se arrastre un archivo de tipo .csv
     * 
     * @param File Archivo donde se guardará el archivo arrastrado
     */
    public SubirCSV() {
       initComponents();
    }
    public SubirCSV(JFrame padre) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.framePadre = padre;
        padre.setVisible(false);
        
        try {
            //Drag-N-Drop Image Setter
            BufferedImage image = ImageIO.read(new File("assets/download.png"));
            lblDropImage.setIcon(new ImageIcon(image.getScaledInstance(128, 128, 128)));
            
        } catch (IOException ex) {
            Logger.getLogger(SubirCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static File[] getDropFiles(DropTargetDropEvent dtde){
        try{
            if(dtde.getDropAction() == DnDConstants.ACTION_MOVE){
                dtde.acceptDrop(dtde.getDropAction());
                final Transferable transferable = dtde.getTransferable();
                if(transferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor)){
                    List<File> listFiles = (List) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                    dtde.dropComplete(true);
                    return listFiles.toArray(File[]::new);
                }
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return null;
    }
    
    /**
     * Devuelve la extensión de un archivo pasandole su nombre canónico.
     * 
     * @param fileName Path del archivo
     * @return Extensión del archivo
     * @throws IOException Excepción si el archivo no contiene extensión
     */
    private String getExtensionArchivo(String fileName) throws IOException{
        int lastDot = fileName.lastIndexOf('.');
        int lastDirectory = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));

        
        if(lastDot == -1){
            throw new IOException("File has no extension");
        }
        
        String extension = "";

        if (lastDot > lastDirectory) {
            extension = fileName.substring(lastDot + 1);
        }
        
        return extension;
    }
    
    /**
     * Devuelve el archivo que se subió a esta pantalla.
     * Null en caso de no haberse subido un archivo.
     * 
     * @return Path del archivo arrastrado a esta ventana.
     */
    public String getArchivoSubido(){
        
        return archivoSubido;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dropTarget2 = new java.awt.dnd.DropTarget();
        lblTitle = new javax.swing.JLabel();
        pnlMainContainer = new javax.swing.JPanel();
        pnlDragNDrop = new javax.swing.JPanel();
        lblDragNDropTitle = new javax.swing.JLabel();
        lblFileText = new javax.swing.JLabel();
        pnlDropArea = new javax.swing.JPanel();
        lblDropImage = new javax.swing.JLabel();
        lblFileName = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(35, 0), new java.awt.Dimension(35, 0), new java.awt.Dimension(35, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(35, 0), new java.awt.Dimension(35, 0), new java.awt.Dimension(35, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnUploadFile = new javax.swing.JButton();

        dropTarget2.setComponent(pnlDropArea);
        try {
            dropTarget2.addDropTargetListener(new java.awt.dnd.DropTargetListener() {
                public void dragEnter(java.awt.dnd.DropTargetDragEvent evt) {
                }
                public void dragExit(java.awt.dnd.DropTargetEvent evt) {
                }
                public void dragOver(java.awt.dnd.DropTargetDragEvent evt) {
                }
                public void drop(java.awt.dnd.DropTargetDropEvent evt) {
                    fileDrop(evt);
                }
                public void dropActionChanged(java.awt.dnd.DropTargetDragEvent evt) {
                }
            });
        } catch (java.util.TooManyListenersException e1) {
            e1.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cargar CSV");

        pnlMainContainer.setLayout(new java.awt.CardLayout());

        lblDragNDropTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDragNDropTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDragNDropTitle.setText("Arrastre el archivo .csv aquí");

        lblFileText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDropImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlDropAreaLayout = new javax.swing.GroupLayout(pnlDropArea);
        pnlDropArea.setLayout(pnlDropAreaLayout);
        pnlDropAreaLayout.setHorizontalGroup(
            pnlDropAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDropAreaLayout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(lblDropImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        pnlDropAreaLayout.setVerticalGroup(
            pnlDropAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDropAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDropImage, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblFileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlDragNDropLayout = new javax.swing.GroupLayout(pnlDragNDrop);
        pnlDragNDrop.setLayout(pnlDragNDropLayout);
        pnlDragNDropLayout.setHorizontalGroup(
            pnlDragNDropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDragNDropLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(pnlDragNDropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDragNDropTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDropArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFileText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102))
            .addGroup(pnlDragNDropLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(lblFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDragNDropLayout.setVerticalGroup(
            pnlDragNDropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDragNDropLayout.createSequentialGroup()
                .addComponent(lblDragNDropTitle)
                .addGap(32, 32, 32)
                .addComponent(pnlDropArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFileText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pnlMainContainer.add(pnlDragNDrop, "card2");

        btnUploadFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUploadFile.setText("Cargar Archivo");
        btnUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(pnlMainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filler2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlMainContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUploadFile)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        lblTitle.getAccessibleContext().setAccessibleName("uploadCSV");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento que detecta si se arrastró un archivo cualquiera a la zona de drag-n-drop de esta ventana.
     * Este método se encarga de verificar que el archivo realmente sea .csv, en caso contrario tirará una
     * expcepción.
     * 
     * @param evt Evento drop de un archivo.
     */
    private void fileDrop(java.awt.dnd.DropTargetDropEvent evt) {//GEN-FIRST:event_fileDrop
        File[] files = getDropFiles(evt);
        
        File archivoArrastrado = files[0];
        
        try {
            String extension = getExtensionArchivo(archivoArrastrado.getCanonicalPath());
            
            if(!extension.equalsIgnoreCase("csv")){
                showMessageDialog(null, "El archivo no es de tipo .csv");
                throw new Exception("El archivo no es de extensión csv");
            }
            
            lblFileName.setText(archivoArrastrado.getName());
            
            this.archivoSubido = archivoArrastrado.getCanonicalPath();
        } catch (Exception ex) {
            Logger.getLogger(SubirCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_fileDrop

    /**
     * Evento al presionar el botón de Cargar Archivo
     * 
     * Cierra la ventana actual y regresa a su padre.
     * @param evt 
     */
    private void btnUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFileActionPerformed
        this.setVisible(false);
        framePadre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUploadFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUploadFile;
    private java.awt.dnd.DropTarget dropTarget2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDragNDropTitle;
    private javax.swing.JLabel lblDropImage;
    private javax.swing.JLabel lblFileName;
    private javax.swing.JLabel lblFileText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlDragNDrop;
    private javax.swing.JPanel pnlDropArea;
    private javax.swing.JPanel pnlMainContainer;
    // End of variables declaration//GEN-END:variables
}
