package com.troy.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.troy.component.Form;
import com.troy.properties.SystemProperties;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

import raven.toast.Notifications;

public class AES_Encryption extends Form {

    int TimeTherd = 250;

    public AES_Encryption() {
        initComponents();

    }

    private SecretKey getInternalSecretKey() {
        byte[] keyBytes = new byte[]{
            12, 34, 56, 78, 90, 87, 65, 43,
            21, 9, 8, 7, 6, 5, 4, 3
        };
        return new SecretKeySpec(keyBytes, "AES");
    }

    public void init2() {

        encryptionText.setText("");
        encryptionText1.setText("");
        DecryptedText.setText("");
        encryptedText.setText("");
        keySizeCombo1.setSelectedIndex(0);
        keySizeCombo.setSelectedIndex(0);
        SystemProperties pro = new SystemProperties();
        pro.loadFromFile();
        if (pro.isDarkMode()) {
            FlatMacDarkLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }
    }

    public boolean ChackFiledEncypt() {
        String var_encryptionText = encryptionText.getText();

        if (var_encryptionText.equals("")) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, 4000, "من فضلك ادخل نص التشفير!!");

            return false;
        }

        return true;
    }

    public boolean ChackFiledDecrypt() {
        String var_encryptionText = encryptionText1.getText();

        if (var_encryptionText.equals("")) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, 4000, "من فضلك ادخل نص التشفير!!");

            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        encryptionText = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        encryptedText = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        keySizeCombo = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        encryptionText1 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        DecryptedText = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        keySizeCombo1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();

        jPanel5.setOpaque(false);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setText("Encrypt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Public key");

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextArea7.setRows(5);
        jScrollPane7.setViewportView(jTextArea7);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Encryption Text ");

        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextArea8.setRows(5);
        jScrollPane8.setViewportView(jTextArea8);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Encrypted Text ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(460, 460, 460)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setMinimumSize(new java.awt.Dimension(873, 479));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AES Encryption", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel4.setOpaque(false);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setText("Encrypt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        encryptionText.setColumns(20);
        encryptionText.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        encryptionText.setRows(5);
        jScrollPane3.setViewportView(encryptionText);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Encryption Text ");

        encryptedText.setColumns(20);
        encryptedText.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        encryptedText.setRows(5);
        encryptedText.setEnabled(false);
        encryptedText.setOpaque(false);
        jScrollPane5.setViewportView(encryptedText);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Encrypted Text ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Encryption Mode ");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CBC" }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Encryption Key Size ");

        keySizeCombo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        keySizeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "128 Bits" }));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("Copy Encrypted Text");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(218, 218, 218))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3)
                .addGap(12, 12, 12))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(208, 208, 208))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(189, 189, 189))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(keySizeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(189, 189, 189))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane5)
                .addGap(1, 1, 1))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keySizeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AES Decryption", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel7.setOpaque(false);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setText("Decrypt");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        encryptionText1.setColumns(20);
        encryptionText1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        encryptionText1.setRows(5);
        jScrollPane4.setViewportView(encryptionText1);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Encryption Text ");

        DecryptedText.setColumns(20);
        DecryptedText.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        DecryptedText.setRows(5);
        DecryptedText.setEnabled(false);
        jScrollPane12.setViewportView(DecryptedText);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Decrypted Text");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CBC" }));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Encryption Key Size ");

        keySizeCombo1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        keySizeCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "128 Bits" }));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setText("Copy Decrypted Text");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Encryption Mode ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(217, 217, 217))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(189, 189, 189))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(191, 191, 191))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(keySizeCombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(189, 189, 189))
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(223, 223, 223))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane12)
                                .addGap(6, 6, 6)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4)
                .addGap(11, 11, 11))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel22)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel25)
                .addGap(10, 10, 10)
                .addComponent(keySizeCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel23)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_searchText1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setEnabled(false);
        String Name = jButton3.getText();
        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/troy/icon/Infinity-1s-40px.gif")));
        jButton3.setText("");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(TimeTherd);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }

                if (ChackFiledEncypt()) {
                    try {
                        String textToEncrypt = encryptionText.getText();

                        String key = "1234567890123456"; // مفتاح ثابت (16 حرف)
                        String iv = generateIV(); // IV عشوائي يدوي

                        // تشفير CBC يدوي (XOR)
                        String encryptedData = encryptCBC(textToEncrypt, key, iv);

                        // دمج IV مع النص المشفر
                        String fullData = iv + encryptedData;

                        // تحويل إلى Base64 يدوي
                        String encryptedTextOutput = manualBase64Encode(fullData.getBytes("UTF-8"));

                        encryptedText.setText(encryptedTextOutput);

                        Notifications.getInstance().show(
                                Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, 4000, "Done Encrypted CBC (Manual)"
                        );

                    } catch (Exception ex) {
                        ex.printStackTrace();
                        Notifications.getInstance().show(
                                Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, 4000, "Encryption failed: " + ex.getMessage()
                        );
                    }
                }

                SwingUtilities.invokeLater(() -> {
                    jButton3.setIcon(null);
                    jButton3.setText(Name);
                    jButton3.setEnabled(true);
                });
            }

            // توليد IV عشوائي مكون من 16 حرف
            private String generateIV() {
                String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
                StringBuilder iv = new StringBuilder();
                for (int i = 0; i < 16; i++) {
                    int idx = (int) (Math.random() * chars.length());
                    iv.append(chars.charAt(idx));
                }
                return iv.toString();
            }

            // تشفير CBC يدوي باستخدام XOR
            private String encryptCBC(String text, String key, String iv) {
                int blockSize = 16;
                StringBuilder result = new StringBuilder();
                String prev = iv;

                for (int i = 0; i < text.length(); i += blockSize) {
                    String block = text.substring(i, Math.min(i + blockSize, text.length()));
                    block = padBlock(block, blockSize);

                    String xored = xor(block, prev);
                    String encrypted = xor(xored, key); // محاكاة التشفير
                    result.append(encrypted);
                    prev = encrypted;
                }

                return result.toString();
            }

            private String xor(String a, String b) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length(); i++) {
                    sb.append((char) (a.charAt(i) ^ b.charAt(i % b.length())));
                }
                return sb.toString();
            }

            private String padBlock(String block, int size) {
                while (block.length() < size) {
                    block += '\0';
                }
                return block;
            }

            // Base64 يدوي (مبسط)
            private String manualBase64Encode(byte[] bytes) {
                final String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
                StringBuilder result = new StringBuilder();

                int paddingCount = (3 - (bytes.length % 3)) % 3;
                int len = bytes.length + paddingCount;

                for (int i = 0; i < len; i += 3) {
                    int b = ((i < bytes.length ? bytes[i] : 0) & 0xFF) << 16
                            | ((i + 1 < bytes.length ? bytes[i + 1] : 0) & 0xFF) << 8
                            | ((i + 2 < bytes.length ? bytes[i + 2] : 0) & 0xFF);

                    result.append(base64chars.charAt((b >> 18) & 0x3F));
                    result.append(base64chars.charAt((b >> 12) & 0x3F));
                    result.append(i + 1 < bytes.length ? base64chars.charAt((b >> 6) & 0x3F) : '=');
                    result.append(i + 2 < bytes.length ? base64chars.charAt(b & 0x3F) : '=');
                }

                return result.toString();
            }

        });
        t.start();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jButton6.setEnabled(false);
        String Name = jButton6.getText();
        jButton6.setIcon(new ImageIcon(getClass().getResource("/com/troy/icon/Infinity-1s-40px.gif")));
        jButton6.setText("");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(TimeTherd);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }

                if (ChackFiledDecrypt()) {
                    try {
                        String encryptedInput = encryptionText1.getText();

                        byte[] allData = manualBase64Decode(encryptedInput);
                        String fullString = new String(allData, "UTF-8");

                        String iv = fullString.substring(0, 16);
                        String encryptedContent = fullString.substring(16);

                        String key = "1234567890123456"; // نفس المفتاح المستخدم في التشفير

                        String decrypted = decryptCBC(encryptedContent, key, iv);

                        DecryptedText.setText(decrypted.replaceAll("\0", "")); // حذف الحشو \0
                        Notifications.getInstance().show(
                                Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, 4000, "Done Decryption CBC (Manual)"
                        );

                    } catch (Exception ex) {
                        ex.printStackTrace();
                        Notifications.getInstance().show(
                                Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, 4000, "Decryption failed: " + ex.getMessage()
                        );
                    }
                }

                SwingUtilities.invokeLater(() -> {
                    jButton6.setIcon(null);
                    jButton6.setText(Name);
                    jButton6.setEnabled(true);
                });
            }

            private String decryptCBC(String encryptedText, String key, String iv) {
                int blockSize = 16;
                StringBuilder result = new StringBuilder();
                String prev = iv;

                for (int i = 0; i < encryptedText.length(); i += blockSize) {
                    String encryptedBlock = encryptedText.substring(i, Math.min(i + blockSize, encryptedText.length()));
                    String decrypted = xor(encryptedBlock, key);      // فك "التشفير"
                    String original = xor(decrypted, prev);           // إزالة التأثير بـ IV أو البلوك السابق
                    result.append(original);
                    prev = encryptedBlock;
                }

                return result.toString();
            }

            private String xor(String a, String b) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length(); i++) {
                    sb.append((char) (a.charAt(i) ^ b.charAt(i % b.length())));
                }
                return sb.toString();
            }

            // Base64 فك يدوي
            private byte[] manualBase64Decode(String input) {
                final String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
                input = input.replaceAll("=+$", "");

                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                for (int i = 0; i < input.length(); i += 4) {
                    int b = (base64chars.indexOf(input.charAt(i)) << 18)
                            + (base64chars.indexOf(input.charAt(i + 1)) << 12)
                            + (i + 2 < input.length() ? base64chars.indexOf(input.charAt(i + 2)) << 6 : 0)
                            + (i + 3 < input.length() ? base64chars.indexOf(input.charAt(i + 3)) : 0);

                    baos.write((b >> 16) & 0xFF);
                    if (i + 2 < input.length()) {
                        baos.write((b >> 8) & 0xFF);
                    }
                    if (i + 3 < input.length()) {
                        baos.write(b & 0xFF);
                    }
                }

                return baos.toByteArray();
            }
        });
        t.start();

        // TODO add your handling code here:

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String text = encryptedText.getText();
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, 4000, "Done Copy Text");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String text = DecryptedText.getText();
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, 4000, "Done Copy Text");

    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DecryptedText;
    private javax.swing.JTextArea encryptedText;
    private javax.swing.JTextArea encryptionText;
    private javax.swing.JTextArea encryptionText1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JComboBox<String> keySizeCombo;
    private javax.swing.JComboBox<String> keySizeCombo1;
    // End of variables declaration//GEN-END:variables
}
