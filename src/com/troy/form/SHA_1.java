package com.troy.form;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import com.troy.component.Form;
import com.troy.properties.SystemProperties;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.security.KeyRep;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import raven.toast.Notifications;

public class SHA_1 extends Form {

    int TimeTherd = 200;

    public SHA_1() {
        initComponents();

    }

    private String customHash(String input) {
        int hash = 7;
        for (int i = 0; i < input.length(); i++) {
            hash = hash * 31 + input.charAt(i);
        }
        String hex = Integer.toHexString(hash);
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 40) {
            sb.append(hex);
        }
        return sb.substring(0, 40);
    }

    public void init2() {

        txtHash.setText("");
        txtOutputHash.setText("");
        txtHashMT.setText("");
        txtOutputHashMT.setText("");
        lblMT.setText("");
        SystemProperties pro = new SystemProperties();
        pro.loadFromFile();
        if (pro.isDarkMode()) {
            FlatMacDarkLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }
    }

    public boolean ChackFiled() {
        String var_txtHash = txtHash.getText();

        if (var_txtHash.equals("")) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, 4000, "من فضلك ادخل النص للتشفير!!");

            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
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
        txtHash = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtOutputHash = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtHashMT = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtOutputHashMT = new javax.swing.JTextArea();
        lblMT = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("RSA Encryption ");

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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SHA-1 Hash", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel4.setOpaque(false);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setText("Create SHA-1 Hash");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtHash.setColumns(20);
        txtHash.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtHash.setRows(5);
        jScrollPane3.setViewportView(txtHash);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Text to hash");

        txtOutputHash.setColumns(20);
        txtOutputHash.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtOutputHash.setRows(5);
        txtOutputHash.setEnabled(false);
        jScrollPane5.setViewportView(txtOutputHash);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Hashed output");

        txtHashMT.setColumns(20);
        txtHashMT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtHashMT.setRows(5);
        txtHashMT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHashMTMouseClicked(evt);
            }
        });
        txtHashMT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHashMTKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(txtHashMT);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Text to hash");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Hashed output");

        txtOutputHashMT.setColumns(20);
        txtOutputHashMT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtOutputHashMT.setRows(5);
        txtOutputHashMT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOutputHashMTMouseClicked(evt);
            }
        });
        txtOutputHashMT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOutputHashMTKeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(txtOutputHashMT);

        lblMT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("Copy Hashed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(414, 414, 414))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(397, 397, 397)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(310, 310, 310)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

                try {
                    String input = txtHash.getText();
                    String hash = customHash(input);

                    txtOutputHash.setText(hash);
                    Notifications.getInstance().show(
                            Notifications.Type.SUCCESS,
                            Notifications.Location.TOP_CENTER,
                            4000,
                            "Done Encrypted (Custom Hash)"
                    );
                } catch (Exception ex) {
                    Notifications.getInstance().show(
                            Notifications.Type.ERROR,
                            Notifications.Location.TOP_CENTER,
                            4000,
                            "Error: " + ex.getMessage()
                    );
                }

                SwingUtilities.invokeLater(() -> {
                    jButton3.setIcon(null);
                    jButton3.setText(Name);
                    jButton3.setEnabled(true);
                });
            }

            // دالة تشفير يدوية بدائية
            private String customHash(String input) {
                int hash = 7;
                for (int i = 0; i < input.length(); i++) {
                    hash = hash * 31 + input.charAt(i); // رقم أولي + الحرف
                }

                // نحول الناتج إلى Hex
                String hex = Integer.toHexString(hash);

                // نكرر النتيجة للحصول على طول مناسب مثل SHA-1
                StringBuilder sb = new StringBuilder();
                while (sb.length() < 40) {
                    sb.append(hex);
                }

                return sb.substring(0, 40); // نعيد أول 40 حرف (مثل طول SHA-1)
            }
        });
        t.start();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String text = txtOutputHash.getText();
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, 4000, "Done Copy Text");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        txtHash.setText("");
        txtOutputHash.setText("");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        txtHashMT.setText("");
        txtOutputHashMT.setText("");
        lblMT.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtHashMTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHashMTKeyReleased
        // TODO add your handling code here:
        if (!txtHashMT.getText().equals("") && !txtOutputHashMT.getText().equals("")) {
            try {
                String storeHash = txtOutputHashMT.getText();   // القيمة المتوقعة
                String txt = txtHashMT.getText();               // النص الأصلي

                // توليد هاش بديل يدوي
                String generatedHash = customHash(txt);

                if (storeHash.equals(generatedHash)) {
                    lblMT.setForeground(Color.GREEN);
                    lblMT.setText("Hash and text matched");
                } else {
                    lblMT.setForeground(Color.RED);
                    lblMT.setText("Hash and text not matched");
                }

            } catch (Exception ex) {
                Notifications.getInstance().show(
                        Notifications.Type.ERROR,
                        Notifications.Location.TOP_CENTER,
                        4000,
                        "Error: " + ex.getMessage()
                );
            }
        } 

    }//GEN-LAST:event_txtHashMTKeyReleased

    private void txtOutputHashMTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOutputHashMTKeyReleased
        // TODO add your handling code here:

        if (!txtHashMT.getText().equals("") && !txtOutputHashMT.getText().equals("")) {
            try {
                String storeHash = txtOutputHashMT.getText();   // القيمة المتوقعة
                String txt = txtHashMT.getText();               // النص الأصلي

                // توليد هاش بديل يدوي
                String generatedHash = customHash(txt);

                if (storeHash.equals(generatedHash)) {
                    lblMT.setForeground(Color.GREEN);
                    lblMT.setText("Hash and text matched");
                } else {
                    lblMT.setForeground(Color.RED);
                    lblMT.setText("Hash and text not matched");
                }

            } catch (Exception ex) {
                Notifications.getInstance().show(
                        Notifications.Type.ERROR,
                        Notifications.Location.TOP_CENTER,
                        4000,
                        "Error: " + ex.getMessage()
                );
            }
        } 


    }//GEN-LAST:event_txtOutputHashMTKeyReleased

    private void txtHashMTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHashMTMouseClicked
        // TODO add your handling code here:
        if (!txtHashMT.getText().equals("") && !txtOutputHashMT.getText().equals("")) {
            try {
                String storeHash = txtOutputHashMT.getText();   // القيمة المتوقعة
                String txt = txtHashMT.getText();               // النص الأصلي

                // توليد هاش بديل يدوي
                String generatedHash = customHash(txt);

                if (storeHash.equals(generatedHash)) {
                    lblMT.setForeground(Color.GREEN);
                    lblMT.setText("Hash and text matched");
                } else {
                    lblMT.setForeground(Color.RED);
                    lblMT.setText("Hash and text not matched");
                }

            } catch (Exception ex) {
                Notifications.getInstance().show(
                        Notifications.Type.ERROR,
                        Notifications.Location.TOP_CENTER,
                        4000,
                        "Error: " + ex.getMessage()
                );
            }
        } 
        // دالة توليد هاش يدوي بديل (غير آمن)


    }//GEN-LAST:event_txtHashMTMouseClicked

    private void txtOutputHashMTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOutputHashMTMouseClicked
        // TODO add your handling code here:
        if (!txtHashMT.getText().equals("") && !txtOutputHashMT.getText().equals("")) {
            try {
                String storeHash = txtOutputHashMT.getText();   // القيمة المتوقعة
                String txt = txtHashMT.getText();               // النص الأصلي

                // توليد هاش بديل يدوي
                String generatedHash = customHash(txt);

                if (storeHash.equals(generatedHash)) {
                    lblMT.setForeground(Color.GREEN);
                    lblMT.setText("Hash and text matched");
                } else {
                    lblMT.setForeground(Color.RED);
                    lblMT.setText("Hash and text not matched");
                }

            } catch (Exception ex) {
                Notifications.getInstance().show(
                        Notifications.Type.ERROR,
                        Notifications.Location.TOP_CENTER,
                        4000,
                        "Error: " + ex.getMessage()
                );
            }
        } 
        // دالة توليد هاش يدوي بديل (غير آمن)


    }//GEN-LAST:event_txtOutputHashMTMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JLabel lblMT;
    private javax.swing.JTextArea txtHash;
    private javax.swing.JTextArea txtHashMT;
    private javax.swing.JTextArea txtOutputHash;
    private javax.swing.JTextArea txtOutputHashMT;
    // End of variables declaration//GEN-END:variables
}
