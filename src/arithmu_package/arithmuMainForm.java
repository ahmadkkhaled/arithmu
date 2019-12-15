package arithmu_package;

import java.awt.Color;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import javafx.util.Pair;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class arithmuMainForm extends javax.swing.JFrame {


    private File dataFile; // contains the data that the user wants to compress
    private File frequencyFile; // contains the probability of occurrence of each character in 'dataFile' in
    private File packedArithmuFile; // contains the compressed information of 'dataFile'
    
    public arithmuMainForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        compressButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        decompressButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cardLayOutPanel = new javax.swing.JPanel();
        compressionMenuPanel = new javax.swing.JPanel();
        applyCompressionButton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        importDataFileButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        importFrequencyFileButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        decompressionMenuPanel = new javax.swing.JPanel();
        importPackedArithmuFileButton = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        applyDecompressionButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(165, 197, 195));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 79, 79));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setBackground(new java.awt.Color(0, 51, 51));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Exit");
        exitButton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_delete_32px.png"))); // NOI18N
        exitButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        sidePanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 50));

        compressButton.setBackground(new java.awt.Color(0, 51, 51));
        compressButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compressButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                compressButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compressButtonMouseExited(evt);
            }
        });
        compressButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Compress");
        compressButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_compress_24px.png"))); // NOI18N
        compressButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        sidePanel.add(compressButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 50));

        decompressButton.setBackground(new java.awt.Color(0, 51, 51));
        decompressButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decompressButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                decompressButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                decompressButtonMouseExited(evt);
            }
        });
        decompressButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Decompress");
        decompressButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_archive_32px.png"))); // NOI18N
        decompressButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        sidePanel.add(decompressButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 50));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Arithmu");
        sidePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        backgroundPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 440));

        cardLayOutPanel.setBackground(new java.awt.Color(0, 120, 114));
        cardLayOutPanel.setLayout(new java.awt.CardLayout());

        compressionMenuPanel.setBackground(new java.awt.Color(0, 120, 114));

        applyCompressionButton.setBackground(new java.awt.Color(0, 51, 51));
        applyCompressionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyCompressionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applyCompressionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applyCompressionButtonMouseExited(evt);
            }
        });
        applyCompressionButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Apply");
        applyCompressionButton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 50, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_checkmark_16px.png"))); // NOI18N
        applyCompressionButton.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        importDataFileButton.setBackground(new java.awt.Color(0, 51, 51));
        importDataFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importDataFileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importDataFileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importDataFileButtonMouseExited(evt);
            }
        });
        importDataFileButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Import Data File");
        importDataFileButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_upload_32px.png"))); // NOI18N
        importDataFileButton.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 30));

        importFrequencyFileButton.setBackground(new java.awt.Color(0, 51, 51));
        importFrequencyFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importFrequencyFileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importFrequencyFileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importFrequencyFileButtonMouseExited(evt);
            }
        });
        importFrequencyFileButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Import Frequency File");
        importFrequencyFileButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_upload_32px.png"))); // NOI18N
        importFrequencyFileButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 30));

        javax.swing.GroupLayout compressionMenuPanelLayout = new javax.swing.GroupLayout(compressionMenuPanel);
        compressionMenuPanel.setLayout(compressionMenuPanelLayout);
        compressionMenuPanelLayout.setHorizontalGroup(
            compressionMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compressionMenuPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(compressionMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(importFrequencyFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importDataFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compressionMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(applyCompressionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        compressionMenuPanelLayout.setVerticalGroup(
            compressionMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compressionMenuPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(importDataFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(importFrequencyFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(applyCompressionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardLayOutPanel.add(compressionMenuPanel, "card2");

        decompressionMenuPanel.setBackground(new java.awt.Color(0, 120, 114));

        importPackedArithmuFileButton.setBackground(new java.awt.Color(0, 51, 51));
        importPackedArithmuFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importPackedArithmuFileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importPackedArithmuFileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importPackedArithmuFileButtonMouseExited(evt);
            }
        });
        importPackedArithmuFileButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText(" Import Packed Arithmu File ");
        importPackedArithmuFileButton.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 40));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_upload_32px.png"))); // NOI18N
        importPackedArithmuFileButton.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 30));

        applyDecompressionButton.setBackground(new java.awt.Color(0, 51, 51));
        applyDecompressionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyDecompressionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applyDecompressionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applyDecompressionButtonMouseExited(evt);
            }
        });
        applyDecompressionButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Apply");
        applyDecompressionButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 50, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmu_package/icons/icons8_checkmark_16px.png"))); // NOI18N
        applyDecompressionButton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        javax.swing.GroupLayout decompressionMenuPanelLayout = new javax.swing.GroupLayout(decompressionMenuPanel);
        decompressionMenuPanel.setLayout(decompressionMenuPanelLayout);
        decompressionMenuPanelLayout.setHorizontalGroup(
            decompressionMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decompressionMenuPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(importPackedArithmuFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decompressionMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(applyDecompressionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        decompressionMenuPanelLayout.setVerticalGroup(
            decompressionMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decompressionMenuPanelLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(importPackedArithmuFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(applyDecompressionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardLayOutPanel.add(decompressionMenuPanel, "card3");

        backgroundPanel.add(cardLayOutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 420, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void switchPanels(JPanel panel){
        cardLayOutPanel.removeAll();
        cardLayOutPanel.add(panel);
        cardLayOutPanel.repaint();
        cardLayOutPanel.revalidate();
    }
    /**
     * Creates a file of type (paf - packed Arithmu file) and writes the following data to it:
     * 1- Length of the compressed data string
     * 2- The final compression value
     * 3- The cumulative probability range of each character that was compressed (in the order assigned by the HashMap used during compression)
     * @param compressionValue 
     */
    private void createCompressedFile(Double compressionValue, String data, 
                                            HashMap<Character, Pair<Double, Double>> characterToRange){
        List<String> lines = new ArrayList<>();
        
        lines.add(Integer.toString(data.length()));
        lines.add(Double.toString(compressionValue));
        
        for(HashMap.Entry<Character, Pair<Double, Double> > entry : characterToRange.entrySet()){
            String entryString = "";
            
            entryString += entry.getKey().toString();
            entryString += " ";
            
            entryString += Double.toString(entry.getValue().getKey());
            entryString += " ";
            
            entryString += Double.toString(entry.getValue().getValue());
            entryString += " ";
            
            lines.add(entryString);
        }
        
        String[] dataFileName = (dataFile.getName()).split("\\.");
        String extension = ".paf";
        String filePathString = dataFile.getParentFile().getAbsolutePath() + "\\" + dataFileName[0] + extension;
        
        Path file = Paths.get(filePathString);
        try{
            Files.write(file, lines, StandardCharsets.UTF_8);
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    private Character getCharacter(Double compressionCode, 
                              HashMap< Pair<Double, Double> , Character > rangeToCharacter,
                              List< Pair< Double, Double> > totalRange){
        Character ret = '\0';
        for(Pair< Double , Double> p : totalRange){
            if(p.getValue() > compressionCode) {
                ret = rangeToCharacter.get(p);
                break;
            }      
        }
        assert(ret != '\0');
        return ret;
    }
    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void importDataFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importDataFileButtonMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory( new File ( System.getProperty("user.home") ) );
        fileChooser.setDialogTitle("Import Data File...");
        fileChooser.showOpenDialog(null);
        
        dataFile = fileChooser.getSelectedFile();
    }//GEN-LAST:event_importDataFileButtonMouseClicked

    private void compressButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compressButtonMouseClicked
        switchPanels(compressionMenuPanel);
    }//GEN-LAST:event_compressButtonMouseClicked

    private void decompressButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decompressButtonMouseClicked
        switchPanels(decompressionMenuPanel);
    }//GEN-LAST:event_decompressButtonMouseClicked

    private void importFrequencyFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importFrequencyFileButtonMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory( new File ( System.getProperty("user.home") ) );
        fileChooser.setDialogTitle("Import Frequency File...");
        fileChooser.showOpenDialog(null);
        frequencyFile = fileChooser.getSelectedFile();
    }//GEN-LAST:event_importFrequencyFileButtonMouseClicked

    private void applyCompressionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyCompressionButtonMouseClicked
        if( dataFile == null){
            JOptionPane.showMessageDialog(null, "Data File Missing", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(frequencyFile == null ){
            JOptionPane.showMessageDialog(null, "Frequency File Missing", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String data;
        HashMap<Character, Pair<Double, Double>> characterToRange = new HashMap<>();
        
        try{
            Scanner fileReader = new Scanner(dataFile);
            data = fileReader.nextLine();
            fileReader.close();
            
            for(int i=0; i<data.length(); i++) characterToRange.put(data.charAt(i), new Pair(0,0));
        }
        catch(Exception e){
            e.printStackTrace();
            return; // FixMe is this needed?
        }
        
        try{
            Scanner fileReader = new Scanner(frequencyFile);
            Double low = 0.0;
            while(fileReader.hasNextLine()){
                /**
                 * Reading the current line in the given frequency file
                 * the line has to be in the following form:
                 * <char>'whitespace'<probability> 
                 * e.g: A 0.08
                 *      B 0.12
                 */
                String[] currentLine = (fileReader.nextLine()).split(" "); 
                
                /**
                 * Updating HashMap characterToFrequency with the given probabilities
                 * by setting a range for each character (building cumulative probability)
                 */
               
                characterToRange.put(currentLine[0].charAt(0), new Pair(low, low + Double.valueOf(currentLine[1])));
                low+=Double.valueOf(currentLine[1]);
            }
            fileReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        Double low = 0.0, high = 1.0, range = 1.0;
        for(int i=0; i<data.length(); i++){
            Pair<Double, Double> currentRange = characterToRange.get(data.charAt(i));
            Double currentLow = currentRange.getKey();
            Double currentHigh = currentRange.getValue();
            
            high = low + range * currentHigh;
            low = low + range * currentLow;
            range = high-low;
        }
        
        /**
         * The following while loop mimics the binary representation of the first value
         * in the range [low , high] which the fractional binary system can represent.
         * This is achieved by iterating through through each fractional binary bit
         * 2^-1 , 2^-2, 2^-3, ....
         */
        Double compressionValue = 0.0;
        Double fractionalBitValue = 0.5;
        while(compressionValue < low){
            compressionValue += fractionalBitValue;
            if(compressionValue > high) compressionValue -= fractionalBitValue;
            fractionalBitValue*=0.5;
        }
        createCompressedFile(compressionValue, data, characterToRange);
        dataFile = null;
        frequencyFile = null;
        JOptionPane.showMessageDialog (null, "File compressed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_applyCompressionButtonMouseClicked

    private void compressButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compressButtonMouseEntered
        compressButton.setBackground(new Color(77,101,101)); // [77,101,101]
    }//GEN-LAST:event_compressButtonMouseEntered

    private void compressButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compressButtonMouseExited
        compressButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_compressButtonMouseExited

    private void decompressButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decompressButtonMouseEntered
        decompressButton.setBackground(new Color(77,101,101));
    }//GEN-LAST:event_decompressButtonMouseEntered

    private void decompressButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decompressButtonMouseExited
        decompressButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_decompressButtonMouseExited

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setBackground(new Color(77,101,101));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void importDataFileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importDataFileButtonMouseEntered
        importDataFileButton.setBackground(new Color(77,101,101));
    }//GEN-LAST:event_importDataFileButtonMouseEntered

    private void importDataFileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importDataFileButtonMouseExited
        importDataFileButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_importDataFileButtonMouseExited

    private void importFrequencyFileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importFrequencyFileButtonMouseEntered
        importFrequencyFileButton.setBackground(new Color(77,101,101));
    }//GEN-LAST:event_importFrequencyFileButtonMouseEntered

    private void importFrequencyFileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importFrequencyFileButtonMouseExited
        importFrequencyFileButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_importFrequencyFileButtonMouseExited

    private void applyCompressionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyCompressionButtonMouseEntered
        applyCompressionButton.setBackground(new Color(77,101,101));
    }//GEN-LAST:event_applyCompressionButtonMouseEntered

    private void applyCompressionButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyCompressionButtonMouseExited
        applyCompressionButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_applyCompressionButtonMouseExited

    private void importPackedArithmuFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importPackedArithmuFileButtonMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory( new File ( System.getProperty("user.home") ) );
        fileChooser.setDialogTitle("Import Packed Arithmu File...");
        fileChooser.showOpenDialog(null);
        
        packedArithmuFile = fileChooser.getSelectedFile();
    }//GEN-LAST:event_importPackedArithmuFileButtonMouseClicked

    private void importPackedArithmuFileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importPackedArithmuFileButtonMouseEntered
        importPackedArithmuFileButton.setBackground(new Color(77,101,101));
    }//GEN-LAST:event_importPackedArithmuFileButtonMouseEntered

    private void importPackedArithmuFileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importPackedArithmuFileButtonMouseExited
        importPackedArithmuFileButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_importPackedArithmuFileButtonMouseExited

    private void applyDecompressionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyDecompressionButtonMouseClicked
        if(packedArithmuFile == null){
            JOptionPane.showMessageDialog(null, "Packed Arithmu File Missing", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(packedArithmuFile);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        Integer dataLength = Integer.valueOf(fileReader.nextLine());
        Double compressionCode = Double.valueOf(fileReader.nextLine());
        HashMap< Character, Pair<Double, Double> > characterToRange = new HashMap<>();
        HashMap< Pair<Double, Double> , Character > rangeToCharacter = new HashMap<>();
        List< Pair< Double, Double> > totalRange = new ArrayList<>();
        
        while(fileReader.hasNextLine()){
            String[] data = (fileReader.nextLine()).split(" ");
            Character c = data[0].charAt(0);
            Double low = Double.valueOf(data[1]);
            Double high = Double.valueOf(data[2]);

            characterToRange.put(c, new Pair(low, high));
            rangeToCharacter.put(new Pair(low, high), c);
            totalRange.add(new Pair(low, high));
        }
        fileReader.close();
        
        Collections.sort(totalRange, new RangeComparator());
        String decompressedData = "";
        Double low = 0.0;
        Double high = 1.0;
        Double range = 1.0;
        for(int i=0; i<dataLength; i++){
            
            Character c = getCharacter(compressionCode, rangeToCharacter, totalRange);
            decompressedData += c.toString();
            low = characterToRange.get(c).getKey();
            high = characterToRange.get(c).getValue();
            range = high - low;
            compressionCode = (compressionCode - low) / range;
        }

        save(decompressedData);
        packedArithmuFile = null;
    }//GEN-LAST:event_applyDecompressionButtonMouseClicked

    private void save(String decompressedData){
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory( new File ( System.getProperty("user.home") ) );
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        fileChooser.showSaveDialog(null);
        
        List<String> lines = new ArrayList<>();
        lines.add(decompressedData);
        String fileDirectory = fileChooser.getSelectedFile() + "\\" + "decompressed_file.txt";
        try{
            Files.write(Paths.get(fileDirectory), lines, StandardCharsets.UTF_8);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    private void applyDecompressionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyDecompressionButtonMouseEntered
        applyDecompressionButton.setBackground(new Color(77,101,101));
    }//GEN-LAST:event_applyDecompressionButtonMouseEntered

    private void applyDecompressionButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyDecompressionButtonMouseExited
        applyDecompressionButton.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_applyDecompressionButtonMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arithmuMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel applyCompressionButton;
    private javax.swing.JPanel applyDecompressionButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel cardLayOutPanel;
    private javax.swing.JPanel compressButton;
    private javax.swing.JPanel compressionMenuPanel;
    private javax.swing.JPanel decompressButton;
    private javax.swing.JPanel decompressionMenuPanel;
    private javax.swing.JPanel exitButton;
    private javax.swing.JPanel importDataFileButton;
    private javax.swing.JPanel importFrequencyFileButton;
    private javax.swing.JPanel importPackedArithmuFileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
