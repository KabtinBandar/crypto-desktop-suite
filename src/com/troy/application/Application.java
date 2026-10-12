package com.troy.application;


import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.troy.form.MainForm;
import com.troy.properties.SystemProperties;
import java.awt.AWTException;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import raven.toast.Notifications;

public class Application extends javax.swing.JFrame {

    private static Application app;
    public MainForm mainForm;

    ImageIcon logo = new ImageIcon(getClass().getResource("/com/troy/icon/download.png"));

    TrayIcon t = null;

    public Application() {
        initComponents();

        init();

    }

    public void init() {

        Notifications.getInstance().setJFrame(Application.this);

        t = new TrayIcon(logo.getImage());
        t.setImage(logo.getImage());
        t.setImageAutoSize(true);
        pack();
        setLocationRelativeTo(null);
        mainForm = new MainForm();

    }

    public void show2() {
        SystemTray tray = SystemTray.getSystemTray();
        PopupMenu p = new PopupMenu();
        MenuItem Show = new MenuItem("Open");
        Show.setFont(new Font("Segoe UI", Font.BOLD, 12));
        Show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setState(JFrame.NORMAL);
            }
        });

        MenuItem exit = new MenuItem("Exit");
        exit.setFont(new Font("Segoe UI", Font.BOLD, 12));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                setVisible(true);
            }
        });
        p.add(Show);
        p.add(exit);
        t.setPopupMenu(p);

        try {
            tray.add(t);
        } catch (AWTException ex) {
        }

    }

    public static void showForm(Component component) {
        component.applyComponentOrientation(app.getComponentOrientation());
        app.mainForm.showForm(component);
    }

    public static void setSelectedMenu(int index, int subIndex) {
        app.mainForm.setSelectedMenu(index, subIndex);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 730));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        login.setFocusable(false);
        login.setMinimumSize(new java.awt.Dimension(1400, 730));
        login.setPreferredSize(new java.awt.Dimension(1400, 730));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1416, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:   
        show2();
    }//GEN-LAST:event_formWindowOpened

//    private void open(java.awt.event.WindowEvent evt) {
//       System.out.println("dasd");
//        sp.toFront();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    sp.doTask("جاري تحميل البرنامج", 20);
//                    show2();
//                    System.out.println("dasd");
//                    sp.doTask("جاري تحميل واجهة تسجيل الدخول", 50);
//                    sp.doTask("جاري فتح الواجهة", 100);
//                    setVisible(true);
//                    toFront();
//                    sp.dispose();
//                    sp.toBack();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
    public static void main(String args[]) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("com.troy.theme");
        UIManager.put("defaultFont", new Font("Segoe UI", Font.BOLD, 12));
        SystemProperties pro = new SystemProperties();
        pro.loadFromFile();
        if (pro.isDarkMode()) {
            FlatMacDarkLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }
        java.awt.EventQueue.invokeLater(() -> {

            app = new Application();
            app.setVisible(true);
            app.setContentPane(app.mainForm);
            app.mainForm.applyComponentOrientation(app.getComponentOrientation());
            setSelectedMenu(0, 1);
            app.mainForm.hideMenu();
            SwingUtilities.updateComponentTreeUI(app.mainForm);
            //  app.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
