/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author firza
 */
import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dashboard extends javax.swing.JPanel {
    private Connection conn;
    
    public Dashboard() {
        initComponents();
        conn = Koneksi .getConnection();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Siswa2 = new javax.swing.JPanel();
        lb_siswa2 = new javax.swing.JLabel();
        lbjumlahsiswa2 = new javax.swing.JLabel();
        lbiconiswa2 = new javax.swing.JLabel();
        Guru = new javax.swing.JPanel();
        lb_guru = new javax.swing.JLabel();
        lbjumlahguru = new javax.swing.JLabel();
        lbiconguru = new javax.swing.JLabel();
        Mapel = new javax.swing.JPanel();
        lb_mapel = new javax.swing.JLabel();
        lbjumlahmapel = new javax.swing.JLabel();
        lbiconmapel = new javax.swing.JLabel();
        Jadwal = new javax.swing.JPanel();
        lb_jadwal = new javax.swing.JLabel();
        lbjumlahjadwal = new javax.swing.JLabel();
        lbiconjadwal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Siswa2.setBackground(new java.awt.Color(102, 102, 255));

        lb_siswa2.setBackground(new java.awt.Color(255, 255, 255));
        lb_siswa2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_siswa2.setForeground(new java.awt.Color(204, 204, 255));
        lb_siswa2.setText("SISWA");

        lbjumlahsiswa2.setBackground(new java.awt.Color(255, 255, 255));
        lbjumlahsiswa2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbjumlahsiswa2.setForeground(new java.awt.Color(204, 204, 255));
        lbjumlahsiswa2.setText("0");

        lbiconiswa2.setBackground(new java.awt.Color(255, 255, 255));
        lbiconiswa2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbiconiswa2.setForeground(new java.awt.Color(204, 204, 255));
        lbiconiswa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Siswa.png"))); // NOI18N

        javax.swing.GroupLayout Siswa2Layout = new javax.swing.GroupLayout(Siswa2);
        Siswa2.setLayout(Siswa2Layout);
        Siswa2Layout.setHorizontalGroup(
            Siswa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Siswa2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Siswa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Siswa2Layout.createSequentialGroup()
                        .addComponent(lb_siswa2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Siswa2Layout.createSequentialGroup()
                        .addComponent(lbjumlahsiswa2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(lbiconiswa2)
                        .addGap(21, 21, 21))))
        );
        Siswa2Layout.setVerticalGroup(
            Siswa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Siswa2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_siswa2)
                .addGroup(Siswa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Siswa2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbjumlahsiswa2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Siswa2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbiconiswa2)
                        .addGap(25, 25, 25))))
        );

        Guru.setBackground(new java.awt.Color(102, 102, 255));

        lb_guru.setBackground(new java.awt.Color(255, 255, 255));
        lb_guru.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_guru.setForeground(new java.awt.Color(204, 204, 255));
        lb_guru.setText("GURU");

        lbjumlahguru.setBackground(new java.awt.Color(255, 255, 255));
        lbjumlahguru.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbjumlahguru.setForeground(new java.awt.Color(204, 204, 255));
        lbjumlahguru.setText("0");

        lbiconguru.setBackground(new java.awt.Color(255, 255, 255));
        lbiconguru.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbiconguru.setForeground(new java.awt.Color(204, 204, 255));
        lbiconguru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Siswa.png"))); // NOI18N

        javax.swing.GroupLayout GuruLayout = new javax.swing.GroupLayout(Guru);
        Guru.setLayout(GuruLayout);
        GuruLayout.setHorizontalGroup(
            GuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuruLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(GuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GuruLayout.createSequentialGroup()
                        .addComponent(lb_guru)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GuruLayout.createSequentialGroup()
                        .addComponent(lbjumlahguru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(lbiconguru)
                        .addGap(21, 21, 21))))
        );
        GuruLayout.setVerticalGroup(
            GuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_guru)
                .addGroup(GuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GuruLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbjumlahguru)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuruLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbiconguru)
                        .addGap(25, 25, 25))))
        );

        Mapel.setBackground(new java.awt.Color(102, 102, 255));

        lb_mapel.setBackground(new java.awt.Color(255, 255, 255));
        lb_mapel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_mapel.setForeground(new java.awt.Color(204, 204, 255));
        lb_mapel.setText("Mata Pelajaran");

        lbjumlahmapel.setBackground(new java.awt.Color(255, 255, 255));
        lbjumlahmapel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbjumlahmapel.setForeground(new java.awt.Color(204, 204, 255));
        lbjumlahmapel.setText("0");

        lbiconmapel.setBackground(new java.awt.Color(255, 255, 255));
        lbiconmapel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbiconmapel.setForeground(new java.awt.Color(204, 204, 255));
        lbiconmapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Siswa.png"))); // NOI18N

        javax.swing.GroupLayout MapelLayout = new javax.swing.GroupLayout(Mapel);
        Mapel.setLayout(MapelLayout);
        MapelLayout.setHorizontalGroup(
            MapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MapelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(MapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MapelLayout.createSequentialGroup()
                        .addComponent(lb_mapel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MapelLayout.createSequentialGroup()
                        .addComponent(lbjumlahmapel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(lbiconmapel)
                        .addGap(21, 21, 21))))
        );
        MapelLayout.setVerticalGroup(
            MapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_mapel)
                .addGroup(MapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MapelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbjumlahmapel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MapelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbiconmapel)
                        .addGap(25, 25, 25))))
        );

        Jadwal.setBackground(new java.awt.Color(102, 102, 255));

        lb_jadwal.setBackground(new java.awt.Color(255, 255, 255));
        lb_jadwal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_jadwal.setForeground(new java.awt.Color(204, 204, 255));
        lb_jadwal.setText("Jadwal");

        lbjumlahjadwal.setBackground(new java.awt.Color(255, 255, 255));
        lbjumlahjadwal.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbjumlahjadwal.setForeground(new java.awt.Color(204, 204, 255));
        lbjumlahjadwal.setText("0");

        lbiconjadwal.setBackground(new java.awt.Color(255, 255, 255));
        lbiconjadwal.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbiconjadwal.setForeground(new java.awt.Color(204, 204, 255));
        lbiconjadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Siswa.png"))); // NOI18N

        javax.swing.GroupLayout JadwalLayout = new javax.swing.GroupLayout(Jadwal);
        Jadwal.setLayout(JadwalLayout);
        JadwalLayout.setHorizontalGroup(
            JadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JadwalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(JadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JadwalLayout.createSequentialGroup()
                        .addComponent(lb_jadwal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JadwalLayout.createSequentialGroup()
                        .addComponent(lbjumlahjadwal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(lbiconjadwal)
                        .addGap(21, 21, 21))))
        );
        JadwalLayout.setVerticalGroup(
            JadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_jadwal)
                .addGroup(JadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JadwalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbjumlahjadwal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JadwalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbiconjadwal)
                        .addGap(25, 25, 25))))
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Master Data > Dashboard");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-tv-20.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Siswa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Guru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Mapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Siswa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Guru;
    private javax.swing.JPanel Jadwal;
    private javax.swing.JPanel Mapel;
    private javax.swing.JPanel Siswa;
    private javax.swing.JPanel Siswa1;
    private javax.swing.JPanel Siswa2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_guru;
    private javax.swing.JLabel lb_jadwal;
    private javax.swing.JLabel lb_mapel;
    private javax.swing.JLabel lb_siswa;
    private javax.swing.JLabel lb_siswa1;
    private javax.swing.JLabel lb_siswa2;
    private javax.swing.JLabel lbiconguru;
    private javax.swing.JLabel lbiconiswa;
    private javax.swing.JLabel lbiconiswa1;
    private javax.swing.JLabel lbiconiswa2;
    private javax.swing.JLabel lbiconjadwal;
    private javax.swing.JLabel lbiconmapel;
    private javax.swing.JLabel lbjumlahguru;
    private javax.swing.JLabel lbjumlahjadwal;
    private javax.swing.JLabel lbjumlahmapel;
    private javax.swing.JLabel lbjumlahsiswa;
    private javax.swing.JLabel lbjumlahsiswa1;
    private javax.swing.JLabel lbjumlahsiswa2;
    // End of variables declaration//GEN-END:variables

    private int jumlahSiswa(){
        int totalSiswa = 0;
        try {
            String sql = "SELECT COUNT(*) AS Total FROM DataSiswa";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalSiswa = rs.getInt("Total");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return totalSiswa;
    }
    
    private int jumlahGuru(){
        int totalGuru = 0;
        try {
            String sql = "SELECT COUNT(*) AS Total FROM DataGuru";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalGuru = rs.getInt("Total");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return totalGuru;
    }
    
    private int jumlahMapel(){
        int totalMapel = 0;
        try {
            String sql = "SELECT COUNT(*) AS Total FROM Mapel";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalMapel = rs.getInt("Total");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return totalMapel;
    }
    
    private int jumlahJadwal(){
        int totalJadwal = 0;
        try {
            String sql = "SELECT COUNT(*) AS Total FROM Jadwal";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalJadwal = rs.getInt("Total");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return totalJadwal;
    }
    
    private void loadData() {
        lbjumlahsiswa2.setText(String.valueOf(jumlahSiswa()));
        lbjumlahguru.setText(String.valueOf(jumlahGuru()));
        lbjumlahmapel.setText(String.valueOf(jumlahMapel()));
        lbjumlahjadwal.setText(String.valueOf(jumlahJadwal()));
    }
}
