package ie.lyit.gui;
import ie.lyit.algorithms.*;
import ie.lyit.arrays.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * Author: 
 * James Fallon
 * BSc Computing Year 3
 * -- Algorithm Speed Check --
 * 
 * -------------------------------------------------------------------------------
 * This program uses different arrays which have been cloned from an original,
 * this should ensure that all algorithms being tested are using the same data set
 * for better accuracy.
 * --------------------------------------------------------------------------------
 * 
 * IDE's Used -- NetBeans & Eclipse
 */

public class MainFrame extends javax.swing.JFrame {
    
    // Random object
    Random rand = new Random();
    // Array class objects
    SortedArray sorted = new SortedArray();
    InvertedArray invert = new InvertedArray();
    UnSortedArray unsort = new UnSortedArray();
    // Algorithm objects
    BubbleSort bubble  = new BubbleSort();
    SelectionSort select = new SelectionSort();
    EnhancedBubble enhanced = new EnhancedBubble();
    InsertionSort insert = new InsertionSort();
    
    // Array for passsing into array classes 
    int[] data;
    
    // Arrays for storing clones
    int[] unsortCopy,unsortCopy2,unsortCopy3;
    int[] sortedCopy,sortedCopy2,sortedCopy3;
    int[] invertCopy,invertCopy2,invertCopy3;
    
    // Initializes all of the GUI components
    public MainFrame() { 
        initComponents();  
    }
    // Builds the entire GUI (Netbeans IDE generated code..can be ignored)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        randomPanel = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        compareLabel = new javax.swing.JLabel();
        swapLabel = new javax.swing.JLabel();
        randBubbleP = new javax.swing.JPanel();
        bubbleLabel = new javax.swing.JLabel();
        bubTimeT = new javax.swing.JTextField();
        bubCompareT = new javax.swing.JTextField();
        bubSwapT = new javax.swing.JTextField();
        randEnhancedP = new javax.swing.JPanel();
        enhanceLabel = new javax.swing.JLabel();
        enhanceTimeT = new javax.swing.JTextField();
        enhanceCompareT = new javax.swing.JTextField();
        enhanceSwapT = new javax.swing.JTextField();
        randSelectP = new javax.swing.JPanel();
        selectLabel = new javax.swing.JLabel();
        selectTimeT = new javax.swing.JTextField();
        selectCompareT = new javax.swing.JTextField();
        selectSwapT = new javax.swing.JTextField();
        randInsertP = new javax.swing.JPanel();
        insertLabel = new javax.swing.JLabel();
        insertTimeT = new javax.swing.JTextField();
        insertCompareT = new javax.swing.JTextField();
        insertSwapT = new javax.swing.JTextField();
        bannerPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        speedIcon = new javax.swing.JLabel();
        logoLine = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        bubbleButt = new javax.swing.JButton();
        enhancedButt = new javax.swing.JButton();
        selectButt = new javax.swing.JButton();
        insertButt = new javax.swing.JButton();
        footerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sortedPanel = new javax.swing.JPanel();
        timeLabel1 = new javax.swing.JLabel();
        compareLabel1 = new javax.swing.JLabel();
        swapLabel1 = new javax.swing.JLabel();
        randBubbleP1 = new javax.swing.JPanel();
        bubbleLabel1 = new javax.swing.JLabel();
        bubTimeT1 = new javax.swing.JTextField();
        bubCompareT1 = new javax.swing.JTextField();
        bubSwapT1 = new javax.swing.JTextField();
        randEnhancedP1 = new javax.swing.JPanel();
        enhanceLabel1 = new javax.swing.JLabel();
        enhanceTimeT1 = new javax.swing.JTextField();
        enhanceCompareT1 = new javax.swing.JTextField();
        enhanceSwapT1 = new javax.swing.JTextField();
        randSelectP1 = new javax.swing.JPanel();
        selectLabel1 = new javax.swing.JLabel();
        selectTimeT1 = new javax.swing.JTextField();
        selectCompareT1 = new javax.swing.JTextField();
        selectSwapT1 = new javax.swing.JTextField();
        randInsertP1 = new javax.swing.JPanel();
        insertLabel1 = new javax.swing.JLabel();
        insertTimeT1 = new javax.swing.JTextField();
        insertCompareT1 = new javax.swing.JTextField();
        insertSwapT1 = new javax.swing.JTextField();
        invertedPanel = new javax.swing.JPanel();
        timeLabel2 = new javax.swing.JLabel();
        compareLabel2 = new javax.swing.JLabel();
        swapLabel2 = new javax.swing.JLabel();
        randBubbleP2 = new javax.swing.JPanel();
        bubbleLabel2 = new javax.swing.JLabel();
        bubTimeT2 = new javax.swing.JTextField();
        bubCompareT2 = new javax.swing.JTextField();
        bubSwapT2 = new javax.swing.JTextField();
        randEnhancedP2 = new javax.swing.JPanel();
        enhanceLabel2 = new javax.swing.JLabel();
        enhanceTimeT2 = new javax.swing.JTextField();
        enhanceCompareT2 = new javax.swing.JTextField();
        enhanceSwapT2 = new javax.swing.JTextField();
        randSelectP2 = new javax.swing.JPanel();
        selectLabel2 = new javax.swing.JLabel();
        selectTimeT2 = new javax.swing.JTextField();
        selectCompareT2 = new javax.swing.JTextField();
        selectSwapT2 = new javax.swing.JTextField();
        randInsertP2 = new javax.swing.JPanel();
        insertLabel2 = new javax.swing.JLabel();
        insertTimeT2 = new javax.swing.JTextField();
        insertCompareT2 = new javax.swing.JTextField();
        insertSwapT2 = new javax.swing.JTextField();
        resetButt = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Speed Tester");
        setResizable(false);

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        randomPanel.setBackground(new java.awt.Color(255, 255, 255));
        randomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unsorted Array", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        timeLabel.setText("Time taken (Nano):");

        compareLabel.setText("Comparsions:");

        swapLabel.setText("Swap Operations:");

        randBubbleP.setBackground(new java.awt.Color(255, 255, 255));
        randBubbleP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randBubbleP.setPreferredSize(new java.awt.Dimension(150, 115));

        bubbleLabel.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        bubbleLabel.setText("Bubble Sort");

        javax.swing.GroupLayout randBubblePLayout = new javax.swing.GroupLayout(randBubbleP);
        randBubbleP.setLayout(randBubblePLayout);
        randBubblePLayout.setHorizontalGroup(
            randBubblePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randBubblePLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randBubblePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bubSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randBubblePLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bubbleLabel)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randBubblePLayout.setVerticalGroup(
            randBubblePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randBubblePLayout.createSequentialGroup()
                .addComponent(bubbleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randEnhancedP.setBackground(new java.awt.Color(255, 255, 255));
        randEnhancedP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randEnhancedP.setPreferredSize(new java.awt.Dimension(150, 115));

        enhanceLabel.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        enhanceLabel.setText("Enhanced Bubble");

        javax.swing.GroupLayout randEnhancedPLayout = new javax.swing.GroupLayout(randEnhancedP);
        randEnhancedP.setLayout(randEnhancedPLayout);
        randEnhancedPLayout.setHorizontalGroup(
            randEnhancedPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randEnhancedPLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(randEnhancedPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enhanceSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enhanceCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randEnhancedPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enhanceLabel)
                        .addComponent(enhanceTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        randEnhancedPLayout.setVerticalGroup(
            randEnhancedPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randEnhancedPLayout.createSequentialGroup()
                .addComponent(enhanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randSelectP.setBackground(new java.awt.Color(255, 255, 255));
        randSelectP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randSelectP.setPreferredSize(new java.awt.Dimension(150, 115));

        selectLabel.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        selectLabel.setText("Selection Sort");

        javax.swing.GroupLayout randSelectPLayout = new javax.swing.GroupLayout(randSelectP);
        randSelectP.setLayout(randSelectPLayout);
        randSelectPLayout.setHorizontalGroup(
            randSelectPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randSelectPLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randSelectPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randSelectPLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(selectLabel)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randSelectPLayout.setVerticalGroup(
            randSelectPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randSelectPLayout.createSequentialGroup()
                .addComponent(selectLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randInsertP.setBackground(new java.awt.Color(255, 255, 255));
        randInsertP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randInsertP.setPreferredSize(new java.awt.Dimension(150, 115));

        insertLabel.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        insertLabel.setText("Insertion Sort");

        javax.swing.GroupLayout randInsertPLayout = new javax.swing.GroupLayout(randInsertP);
        randInsertP.setLayout(randInsertPLayout);
        randInsertPLayout.setHorizontalGroup(
            randInsertPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randInsertPLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randInsertPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randInsertPLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(insertLabel)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randInsertPLayout.setVerticalGroup(
            randInsertPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randInsertPLayout.createSequentialGroup()
                .addComponent(insertLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertTimeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertCompareT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertSwapT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout randomPanelLayout = new javax.swing.GroupLayout(randomPanel);
        randomPanel.setLayout(randomPanelLayout);
        randomPanelLayout.setHorizontalGroup(
            randomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(randomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compareLabel)
                    .addComponent(swapLabel)
                    .addComponent(timeLabel))
                .addGap(38, 38, 38)
                .addComponent(randBubbleP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(randEnhancedP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(randSelectP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(randInsertP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        randomPanelLayout.setVerticalGroup(
            randomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(randomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(randInsertP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randSelectP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randEnhancedP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randomPanelLayout.createSequentialGroup()
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(compareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(swapLabel)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randomPanelLayout.createSequentialGroup()
                            .addComponent(randBubbleP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );

        bannerPanel.setBackground(new java.awt.Color(0, 153, 0));

        logoLabel.setFont(new java.awt.Font("DokChampa", 1, 36)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setText("Algorithm Speed Tester");

        speedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ie/lyit/images/Speed_96px.png"))); // NOI18N

        logoLine.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bannerPanelLayout = new javax.swing.GroupLayout(bannerPanel);
        bannerPanel.setLayout(bannerPanelLayout);
        bannerPanelLayout.setHorizontalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLine, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(speedIcon)
                .addGap(29, 29, 29))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(speedIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(logoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoLine, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel4.setText("Select array size:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000", "10000", "100000" }));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        bubbleButt.setText("Bubble");
        bubbleButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleButtActionPerformed(evt);
            }
        });

        enhancedButt.setText("Enhanced");
        enhancedButt.setEnabled(false);
        enhancedButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enhancedButtActionPerformed(evt);
            }
        });

        selectButt.setText("Selection");
        selectButt.setEnabled(false);
        selectButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtActionPerformed(evt);
            }
        });

        insertButt.setText("Insertion");
        insertButt.setEnabled(false);
        insertButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtActionPerformed(evt);
            }
        });

        footerPanel.setBackground(new java.awt.Color(0, 204, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Author J.Fallon L00131059");

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        sortedPanel.setBackground(new java.awt.Color(255, 255, 255));
        sortedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sorted Array", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        timeLabel1.setText("Time taken (Nano):");

        compareLabel1.setText("Comparsions:");

        swapLabel1.setText("Swap Operations:");

        randBubbleP1.setBackground(new java.awt.Color(255, 255, 255));
        randBubbleP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randBubbleP1.setPreferredSize(new java.awt.Dimension(150, 115));

        bubbleLabel1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        bubbleLabel1.setText("Bubble Sort");

        javax.swing.GroupLayout randBubbleP1Layout = new javax.swing.GroupLayout(randBubbleP1);
        randBubbleP1.setLayout(randBubbleP1Layout);
        randBubbleP1Layout.setHorizontalGroup(
            randBubbleP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randBubbleP1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randBubbleP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bubSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randBubbleP1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bubbleLabel1)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randBubbleP1Layout.setVerticalGroup(
            randBubbleP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randBubbleP1Layout.createSequentialGroup()
                .addComponent(bubbleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randEnhancedP1.setBackground(new java.awt.Color(255, 255, 255));
        randEnhancedP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randEnhancedP1.setPreferredSize(new java.awt.Dimension(150, 115));

        enhanceLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        enhanceLabel1.setText("Enhanced Bubble");

        javax.swing.GroupLayout randEnhancedP1Layout = new javax.swing.GroupLayout(randEnhancedP1);
        randEnhancedP1.setLayout(randEnhancedP1Layout);
        randEnhancedP1Layout.setHorizontalGroup(
            randEnhancedP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randEnhancedP1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(randEnhancedP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enhanceSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enhanceCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randEnhancedP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enhanceLabel1)
                        .addComponent(enhanceTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        randEnhancedP1Layout.setVerticalGroup(
            randEnhancedP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randEnhancedP1Layout.createSequentialGroup()
                .addComponent(enhanceLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randSelectP1.setBackground(new java.awt.Color(255, 255, 255));
        randSelectP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randSelectP1.setPreferredSize(new java.awt.Dimension(150, 115));

        selectLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        selectLabel1.setText("Selection Sort");

        javax.swing.GroupLayout randSelectP1Layout = new javax.swing.GroupLayout(randSelectP1);
        randSelectP1.setLayout(randSelectP1Layout);
        randSelectP1Layout.setHorizontalGroup(
            randSelectP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randSelectP1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randSelectP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randSelectP1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(selectLabel1)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randSelectP1Layout.setVerticalGroup(
            randSelectP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randSelectP1Layout.createSequentialGroup()
                .addComponent(selectLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randInsertP1.setBackground(new java.awt.Color(255, 255, 255));
        randInsertP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randInsertP1.setPreferredSize(new java.awt.Dimension(150, 115));

        insertLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        insertLabel1.setText("Insertion Sort");

        javax.swing.GroupLayout randInsertP1Layout = new javax.swing.GroupLayout(randInsertP1);
        randInsertP1.setLayout(randInsertP1Layout);
        randInsertP1Layout.setHorizontalGroup(
            randInsertP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randInsertP1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randInsertP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randInsertP1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(insertLabel1)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randInsertP1Layout.setVerticalGroup(
            randInsertP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randInsertP1Layout.createSequentialGroup()
                .addComponent(insertLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertTimeT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertCompareT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertSwapT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sortedPanelLayout = new javax.swing.GroupLayout(sortedPanel);
        sortedPanel.setLayout(sortedPanelLayout);
        sortedPanelLayout.setHorizontalGroup(
            sortedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sortedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compareLabel1)
                    .addComponent(swapLabel1)
                    .addComponent(timeLabel1))
                .addGap(38, 38, 38)
                .addComponent(randBubbleP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(randEnhancedP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(randSelectP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(randInsertP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        sortedPanelLayout.setVerticalGroup(
            sortedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sortedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(randInsertP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randSelectP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randEnhancedP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sortedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortedPanelLayout.createSequentialGroup()
                            .addComponent(timeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(compareLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(swapLabel1)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortedPanelLayout.createSequentialGroup()
                            .addComponent(randBubbleP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );

        invertedPanel.setBackground(new java.awt.Color(255, 255, 255));
        invertedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inverted Sort", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        timeLabel2.setText("Time taken (Nano):");

        compareLabel2.setText("Comparsions:");

        swapLabel2.setText("Swap Operations:");

        randBubbleP2.setBackground(new java.awt.Color(255, 255, 255));
        randBubbleP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randBubbleP2.setPreferredSize(new java.awt.Dimension(150, 115));

        bubbleLabel2.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        bubbleLabel2.setText("Bubble Sort");

        javax.swing.GroupLayout randBubbleP2Layout = new javax.swing.GroupLayout(randBubbleP2);
        randBubbleP2.setLayout(randBubbleP2Layout);
        randBubbleP2Layout.setHorizontalGroup(
            randBubbleP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randBubbleP2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randBubbleP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bubSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randBubbleP2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bubbleLabel2)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randBubbleP2Layout.setVerticalGroup(
            randBubbleP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randBubbleP2Layout.createSequentialGroup()
                .addComponent(bubbleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randEnhancedP2.setBackground(new java.awt.Color(255, 255, 255));
        randEnhancedP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randEnhancedP2.setPreferredSize(new java.awt.Dimension(150, 115));

        enhanceLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        enhanceLabel2.setText("Enhanced Bubble");

        javax.swing.GroupLayout randEnhancedP2Layout = new javax.swing.GroupLayout(randEnhancedP2);
        randEnhancedP2.setLayout(randEnhancedP2Layout);
        randEnhancedP2Layout.setHorizontalGroup(
            randEnhancedP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randEnhancedP2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(randEnhancedP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enhanceSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enhanceCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randEnhancedP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enhanceLabel2)
                        .addComponent(enhanceTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        randEnhancedP2Layout.setVerticalGroup(
            randEnhancedP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randEnhancedP2Layout.createSequentialGroup()
                .addComponent(enhanceLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enhanceSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randSelectP2.setBackground(new java.awt.Color(255, 255, 255));
        randSelectP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randSelectP2.setPreferredSize(new java.awt.Dimension(150, 115));

        selectLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        selectLabel2.setText("Selection Sort");

        javax.swing.GroupLayout randSelectP2Layout = new javax.swing.GroupLayout(randSelectP2);
        randSelectP2.setLayout(randSelectP2Layout);
        randSelectP2Layout.setHorizontalGroup(
            randSelectP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randSelectP2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randSelectP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randSelectP2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(selectLabel2)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randSelectP2Layout.setVerticalGroup(
            randSelectP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randSelectP2Layout.createSequentialGroup()
                .addComponent(selectLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        randInsertP2.setBackground(new java.awt.Color(255, 255, 255));
        randInsertP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        randInsertP2.setPreferredSize(new java.awt.Dimension(150, 115));

        insertLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        insertLabel2.setText("Insertion Sort");

        javax.swing.GroupLayout randInsertP2Layout = new javax.swing.GroupLayout(randInsertP2);
        randInsertP2.setLayout(randInsertP2Layout);
        randInsertP2Layout.setHorizontalGroup(
            randInsertP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randInsertP2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(randInsertP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(randInsertP2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(insertLabel2)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        randInsertP2Layout.setVerticalGroup(
            randInsertP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randInsertP2Layout.createSequentialGroup()
                .addComponent(insertLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertTimeT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertCompareT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertSwapT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout invertedPanelLayout = new javax.swing.GroupLayout(invertedPanel);
        invertedPanel.setLayout(invertedPanelLayout);
        invertedPanelLayout.setHorizontalGroup(
            invertedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invertedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invertedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compareLabel2)
                    .addComponent(swapLabel2)
                    .addComponent(timeLabel2))
                .addGap(38, 38, 38)
                .addComponent(randBubbleP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(randEnhancedP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(randSelectP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(randInsertP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        invertedPanelLayout.setVerticalGroup(
            invertedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invertedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(invertedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(randInsertP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randSelectP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randEnhancedP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(invertedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invertedPanelLayout.createSequentialGroup()
                            .addComponent(timeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(compareLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(swapLabel2)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invertedPanelLayout.createSequentialGroup()
                            .addComponent(randBubbleP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );

        resetButt.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        resetButt.setText("Reset");
        resetButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bannerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(randomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bubbleButt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enhancedButt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectButt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertButt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(sortedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invertedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insertButt)
                        .addComponent(selectButt)
                        .addComponent(enhancedButt)
                        .addComponent(bubbleButt))
                    .addComponent(resetButt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(randomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invertedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Random Sorted Array"));

        jLabel7.setText("Time taken:");

        jLabel8.setText("Comparsions:");

        jLabel9.setText("Swap Operations:");

        jPanel13.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bubbleButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubbleButtActionPerformed
        // Convert object in combobox to integer
        int size = Integer.valueOf((String)comboBox.getSelectedItem());
        //Create array
        data = new int[size];
        // Create the arrays (unsorted,sorted,inverted)
        createArrays(rand,data);
        
        // Create clone copies of the arrays,otherwise they will end up sorted and identical after sorting
        // these copies will be used in the other action listeners
        cloneArrays();
        
        // BubbleSort with unsorted random array
        bubble.bubbleSort(unsort.getArrray());
        bubTimeT.setText(""+bubble.getFinishTime());
        bubCompareT.setText(""+bubble.getComparsions());
        bubSwapT.setText(""+bubble.getSwaps());
       
        // BubbleSort with sorted array
        bubble.bubbleSort(sorted.getArray());
        bubTimeT1.setText(""+bubble.getFinishTime());
        bubCompareT1.setText(""+bubble.getComparsions());
        bubSwapT1.setText(""+bubble.getSwaps());
        
        // BubbleSort with inverse array
        bubble.bubbleSort(invert.getArray());
        bubTimeT2.setText(""+bubble.getFinishTime());
        bubCompareT2.setText(""+bubble.getComparsions());
        bubSwapT2.setText(""+bubble.getSwaps());
        
        enhancedButt.setEnabled(true);
        bubbleButt.setEnabled(false);
        comboBox.setEnabled(false);

    }//GEN-LAST:event_bubbleButtActionPerformed
    // Methods that create clone copies of reqired arrays
    public void createArrays(Random rand,int[] data){
        unsort.unsortedArray(rand,data);
        sorted.sortedArray(rand,data);
        invert.inverseArray(rand,data);
    }
    public void cloneArrays(){
        // Get & clone arrays( clones needed because of the sorting,need a seprate object copy of array,not a referance)
        unsortCopy = unsort.getArrray().clone();
        unsortCopy2 = unsort.getArrray().clone();
        unsortCopy3 = unsort.getArrray().clone();
        
        sortedCopy = sorted.getArray().clone();
        sortedCopy2 = sorted.getArray().clone();
        sortedCopy3 = sorted.getArray().clone();
        
        invertCopy = invert.getArray().clone();
        invertCopy2 = invert.getArray().clone();
        invertCopy3= invert.getArray().clone();
    }
    private void selectButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtActionPerformed
      
        // Selection sort with unsorted array
        select.selectionSort(unsortCopy2);
        selectTimeT.setText(""+select.getFinishTime());
        selectCompareT.setText(""+select.getComparsions());
        selectSwapT.setText(""+select.getSwaps());
        // Selection sort with sorted array
        select.selectionSort(sortedCopy2);
        selectTimeT1.setText(""+select.getFinishTime());
        selectCompareT1.setText(""+select.getComparsions());
        selectSwapT1.setText(""+select.getSwaps());
        // Selection sort with inverted array
        select.selectionSort(invertCopy2);
        selectTimeT2.setText(""+select.getFinishTime());
        selectCompareT2.setText(""+select.getComparsions());
        selectSwapT2.setText(""+select.getSwaps());
        // Disable buttons
        selectButt.setEnabled(false);
        insertButt.setEnabled(true);
            
    }//GEN-LAST:event_selectButtActionPerformed

    private void enhancedButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enhancedButtActionPerformed
       
       // Enhanced sort with unsorted array
       enhanced.bubbleSortTweak(unsortCopy);
       enhanceTimeT.setText(""+enhanced.getFinishTime());
       enhanceCompareT.setText(""+enhanced.getComparsions());
       enhanceSwapT.setText(""+enhanced.getSwaps());
       // Enhanced sort with sorted array
       enhanced.bubbleSortTweak(sortedCopy);
       enhanceTimeT1.setText(""+enhanced.getFinishTime());
       enhanceCompareT1.setText(""+enhanced.getComparsions());
       enhanceSwapT1.setText(""+enhanced.getSwaps());
       // Enhanced sort with inverted array
       enhanced.bubbleSortTweak(invertCopy);
       enhanceTimeT2.setText(""+enhanced.getFinishTime());
       enhanceCompareT2.setText(""+enhanced.getComparsions());
       enhanceSwapT2.setText(""+enhanced.getSwaps());
       selectButt.setEnabled(true);   
       enhancedButt.setEnabled(false);
    }//GEN-LAST:event_enhancedButtActionPerformed

    private void insertButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtActionPerformed
        
        // Insertsort with unsorted array
        insert.insertionSort(unsortCopy3);
        insertTimeT.setText(""+insert.getFinishTime());
        insertCompareT.setText(""+insert.getComparsions());
        insertSwapT.setText(""+insert.getSwaps());
        // Insertsort with sorted array
        insert.insertionSort(sortedCopy3);
        insertTimeT1.setText(""+insert.getFinishTime());
        insertCompareT1.setText(""+insert.getComparsions());
        insertSwapT1.setText(""+insert.getSwaps());
        // Insertsort with inverted array
        insert.insertionSort(invertCopy3);
        insertTimeT2.setText(""+insert.getFinishTime());
        insertCompareT2.setText(""+insert.getComparsions());
        insertSwapT2.setText(""+insert.getSwaps());
        insertButt.setEnabled(false);
        
        //Finally,set the colors of the panels depending on their speed(time taken)
        setColors(insertTimeT,bubTimeT,selectTimeT,enhanceTimeT);
        setColors(insertTimeT1,bubTimeT1,selectTimeT1,enhanceTimeT1);
        setColors(insertTimeT2,bubTimeT2,selectTimeT2,enhanceTimeT2);
              
    }//GEN-LAST:event_insertButtActionPerformed

    private void resetButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtActionPerformed
       //Buble reset
       bubTimeT.setText("");
       bubCompareT.setText("");
       bubSwapT.setText("");
       bubTimeT1.setText("");
       bubCompareT1.setText("");
       bubSwapT1.setText("");
       bubTimeT2.setText("");
       bubCompareT2.setText("");
       bubSwapT2.setText("");
       //Enhance reset
       enhanceTimeT.setText("");
       enhanceCompareT.setText("");
       enhanceSwapT.setText("");
       enhanceTimeT1.setText("");
       enhanceCompareT1.setText("");
       enhanceSwapT1.setText("");
       enhanceTimeT2.setText("");
       enhanceCompareT2.setText("");
       enhanceSwapT2.setText("");
       //Select reset
       selectTimeT.setText("");
       selectCompareT.setText("");
       selectSwapT.setText("");
       selectTimeT1.setText("");
       selectCompareT1.setText("");
       selectSwapT1.setText("");
       selectTimeT2.setText("");
       selectCompareT2.setText("");
       selectSwapT2.setText("");
       //Insert reset
       insertTimeT.setText("");
       insertCompareT.setText("");
       insertSwapT.setText("");
       insertTimeT1.setText("");
       insertCompareT1.setText("");
       insertSwapT1.setText("");
       insertTimeT2.setText("");
       insertCompareT2.setText("");
       insertSwapT2.setText("");
       
       //Color reset
       bubTimeT.getParent().setBackground(Color.white);
       enhanceTimeT.getParent().setBackground(Color.white);
       selectTimeT.getParent().setBackground(Color.white);
       insertTimeT.getParent().setBackground(Color.white);
       bubTimeT1.getParent().setBackground(Color.white);
       enhanceTimeT1.getParent().setBackground(Color.white);
       selectTimeT1.getParent().setBackground(Color.white);
       insertTimeT1.getParent().setBackground(Color.white);  
       bubTimeT2.getParent().setBackground(Color.white);
       enhanceTimeT2.getParent().setBackground(Color.white);
       selectTimeT2.getParent().setBackground(Color.white);
       insertTimeT2.getParent().setBackground(Color.white);
      
       //Buttons reset
       comboBox.setEnabled(true);
       bubbleButt.setEnabled(true);
       enhancedButt.setEnabled(false);
       selectButt.setEnabled(false);
       insertButt.setEnabled(false);
      
    }//GEN-LAST:event_resetButtActionPerformed
    
    public void setColors(JTextField t1,JTextField t2,JTextField t3,JTextField t4){
        
        // Store vlaues from fields
        long[] colors = new long[4];
        JTextField[] text = new JTextField[4];
        
        // Store values from fields into array
        colors[0] = Long.parseLong(t1.getText());
        colors[1] = Long.parseLong(t2.getText());
        colors[2] = Long.parseLong(t3.getText());
        colors[3] = Long.parseLong(t4.getText());
        // Store into TextFields
        text[0] = t1;
        text[1] = t2;
        text[2] = t3;
        text[3] = t4;
        //Sort list
        Arrays.sort(colors);
 
        // Loop and compare values in the arrays,then change background
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
                if(colors[i] == Long.parseLong(text[j].getText()) && i == 0){
                    text[j].getParent().setBackground(Color.green);
                    break;
                 }
                 if(colors[i] == Long.parseLong(text[j].getText()) && i == 1){
                    text[j].getParent().setBackground(Color.yellow); 
                    break;
                 }
                 if(colors[i] == Long.parseLong(text[j].getText()) && i == 2){
                    text[j].getParent().setBackground(Color.orange);           
                    break;
                 }
                 if(colors[i] == Long.parseLong(text[j].getText()) && i == 3){
                    text[j].getParent().setBackground(Color.red);
                    break;
                 }     
            }
        } // End of for loop 
    }
    
    public static void main(String args[]) {
        
        // Set the look and feel for the Java GUI(Metal)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);     
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JTextField bubCompareT;
    private javax.swing.JTextField bubCompareT1;
    private javax.swing.JTextField bubCompareT2;
    private javax.swing.JTextField bubSwapT;
    private javax.swing.JTextField bubSwapT1;
    private javax.swing.JTextField bubSwapT2;
    private javax.swing.JTextField bubTimeT;
    private javax.swing.JTextField bubTimeT1;
    private javax.swing.JTextField bubTimeT2;
    private javax.swing.JButton bubbleButt;
    private javax.swing.JLabel bubbleLabel;
    private javax.swing.JLabel bubbleLabel1;
    private javax.swing.JLabel bubbleLabel2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel compareLabel;
    private javax.swing.JLabel compareLabel1;
    private javax.swing.JLabel compareLabel2;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTextField enhanceCompareT;
    private javax.swing.JTextField enhanceCompareT1;
    private javax.swing.JTextField enhanceCompareT2;
    private javax.swing.JLabel enhanceLabel;
    private javax.swing.JLabel enhanceLabel1;
    private javax.swing.JLabel enhanceLabel2;
    private javax.swing.JTextField enhanceSwapT;
    private javax.swing.JTextField enhanceSwapT1;
    private javax.swing.JTextField enhanceSwapT2;
    private javax.swing.JTextField enhanceTimeT;
    private javax.swing.JTextField enhanceTimeT1;
    private javax.swing.JTextField enhanceTimeT2;
    private javax.swing.JButton enhancedButt;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JButton insertButt;
    private javax.swing.JTextField insertCompareT;
    private javax.swing.JTextField insertCompareT1;
    private javax.swing.JTextField insertCompareT2;
    private javax.swing.JLabel insertLabel;
    private javax.swing.JLabel insertLabel1;
    private javax.swing.JLabel insertLabel2;
    private javax.swing.JTextField insertSwapT;
    private javax.swing.JTextField insertSwapT1;
    private javax.swing.JTextField insertSwapT2;
    private javax.swing.JTextField insertTimeT;
    public javax.swing.JTextField insertTimeT1;
    private javax.swing.JTextField insertTimeT2;
    private javax.swing.JPanel invertedPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JSeparator logoLine;
    private javax.swing.JPanel randBubbleP;
    private javax.swing.JPanel randBubbleP1;
    private javax.swing.JPanel randBubbleP2;
    private javax.swing.JPanel randEnhancedP;
    private javax.swing.JPanel randEnhancedP1;
    private javax.swing.JPanel randEnhancedP2;
    private javax.swing.JPanel randInsertP;
    private javax.swing.JPanel randInsertP1;
    private javax.swing.JPanel randInsertP2;
    private javax.swing.JPanel randSelectP;
    private javax.swing.JPanel randSelectP1;
    private javax.swing.JPanel randSelectP2;
    private javax.swing.JPanel randomPanel;
    private javax.swing.JButton resetButt;
    private javax.swing.JButton selectButt;
    private javax.swing.JTextField selectCompareT;
    private javax.swing.JTextField selectCompareT1;
    private javax.swing.JTextField selectCompareT2;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JLabel selectLabel1;
    private javax.swing.JLabel selectLabel2;
    private javax.swing.JTextField selectSwapT;
    private javax.swing.JTextField selectSwapT1;
    private javax.swing.JTextField selectSwapT2;
    private javax.swing.JTextField selectTimeT;
    private javax.swing.JTextField selectTimeT1;
    private javax.swing.JTextField selectTimeT2;
    private javax.swing.JPanel sortedPanel;
    private javax.swing.JLabel speedIcon;
    private javax.swing.JLabel swapLabel;
    private javax.swing.JLabel swapLabel1;
    private javax.swing.JLabel swapLabel2;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel timeLabel1;
    private javax.swing.JLabel timeLabel2;
    // End of variables declaration//GEN-END:variables
}
