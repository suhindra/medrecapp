/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmDlgAWTRekMedByNoDaftar.java
 *
 * Created on Feb 10, 2014, 3:37:10 AM
 */

package medrecapp.Gui.Dialog;

import javax.swing.JOptionPane;
import medrecapp.Services.RekamMedisService;
import medrecapp.TabelModel.TabelModelRekmedByNoDaftar;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class FrmDlgAWTRekMedByNoDaftar extends java.awt.Dialog {

    RekamMedisService rms = new RekamMedisService();
    TabelModelRekmedByNoDaftar tabelModelRekamMedisByNoDaftar = new TabelModelRekmedByNoDaftar();

    /** Creates new form FrmDlgAWTRekMedByNoDaftar */
    public FrmDlgAWTRekMedByNoDaftar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(this);
        String noPendaftaran = FrmDlgAWTRekMedByNoRm.NoDaftarRekmed;        
        tabelModelRekamMedisByNoDaftar.setData(rms.serviceGetRekamMedisByNoDaftar(noPendaftaran));

        if (tabelModelRekamMedisByNoDaftar.getRowCount() == 0) {
            txtMassaBadan3.setText("");
            txtTinggiBadan3.setText("");
            txtTekananDarah3.setText("");
            txtNadi3.setText("");
            txtTemperatur3.setText("");
            txtPernapasan3.setText("");
            txtKesadaran3.setText("");
            txtNamaPerawat3.setText("");
            txtAnamnesa.setText("");
            txtDiagnosa.setText("");
            txtTerapi.setText("");
        } else {

            /***************** Pemeriksaan Awal *****************/
            txtMassaBadan3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 0).toString());
            txtTinggiBadan3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 1).toString());
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 2) == null) {
                txtTekananDarah3.setText("");
            } else {
                txtTekananDarah3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 2).toString());
            }
            txtNadi3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 3).toString());
            txtTemperatur3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 4).toString());
            txtPernapasan3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 5).toString());
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 6) == null) {
                txtKesadaran3.setText("");
            } else {
                txtKesadaran3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 6).toString());
            }
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 7) == null) {
                txtNamaPerawat3.setText("");
            } else {
                txtNamaPerawat3.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 7).toString());
            }

            /***************** Pemeriksaan Lanjutan *****************/
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 8) == null) {
                txtAnamnesa.setText("");
            } else {
                txtAnamnesa.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 8).toString());
            }
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 9) == null) {
                txtDiagnosa.setText("");
            } else {
                txtDiagnosa.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 9).toString());
            }
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 10) == null) {
                txtTerapi.setText("");
            } else {
                txtTerapi.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 10).toString());
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        panelPemeriksaanLanjutan = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnosa = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTerapi = new javax.swing.JTextArea();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnamnesa = new javax.swing.JTextArea();
        jLabel72 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        panelPemeriksaanAwal = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtMassaBadan3 = new javax.swing.JTextField();
        txtTinggiBadan3 = new javax.swing.JTextField();
        txtTekananDarah3 = new javax.swing.JTextField();
        txtNadi3 = new javax.swing.JTextField();
        txtTemperatur3 = new javax.swing.JTextField();
        txtPernapasan3 = new javax.swing.JTextField();
        txtKesadaran3 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        txtNamaPerawat3 = new javax.swing.JTextField();

        setName("frmDlgAWTRekMedByNoDaftar"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        panelPemeriksaanLanjutan.setBackground(new java.awt.Color(0, 153, 153));
        panelPemeriksaanLanjutan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pemeriksaan Lanjutan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Diagnosis");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Terapi");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText(":");

        txtDiagnosa.setBackground(new java.awt.Color(153, 255, 153));
        txtDiagnosa.setColumns(20);
        txtDiagnosa.setEditable(false);
        txtDiagnosa.setRows(5);
        txtDiagnosa.setFocusable(false);
        jScrollPane2.setViewportView(txtDiagnosa);

        txtTerapi.setBackground(new java.awt.Color(153, 255, 153));
        txtTerapi.setColumns(20);
        txtTerapi.setEditable(false);
        txtTerapi.setRows(5);
        txtTerapi.setFocusable(false);
        jScrollPane3.setViewportView(txtTerapi);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Anamnesa");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText(":");

        txtAnamnesa.setBackground(new java.awt.Color(153, 255, 153));
        txtAnamnesa.setColumns(20);
        txtAnamnesa.setEditable(false);
        txtAnamnesa.setLineWrap(true);
        txtAnamnesa.setRows(5);
        txtAnamnesa.setFocusable(false);
        jScrollPane1.setViewportView(txtAnamnesa);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText(":");

        javax.swing.GroupLayout panelPemeriksaanLanjutanLayout = new javax.swing.GroupLayout(panelPemeriksaanLanjutan);
        panelPemeriksaanLanjutan.setLayout(panelPemeriksaanLanjutanLayout);
        panelPemeriksaanLanjutanLayout.setHorizontalGroup(
            panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPemeriksaanLanjutanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addComponent(jLabel69)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPemeriksaanLanjutanLayout.setVerticalGroup(
            panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPemeriksaanLanjutanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70)
                        .addComponent(jLabel71))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel67)
                        .addComponent(jLabel69))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPemeriksaanLanjutanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel68)
                        .addComponent(jLabel72))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOK.setText("OK");
        btnOK.setName("btnOK"); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        panelPemeriksaanAwal.setBackground(new java.awt.Color(0, 153, 153));
        panelPemeriksaanAwal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pemeriksaan Awal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Massa Badan");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Tinggi Badan");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Tekanan Darah");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Nadi");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Temperatur");

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Pernapasan");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Kesadaran");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText(":");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText(":");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText(":");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText(":");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText(":");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText(":");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText(":");

        txtMassaBadan3.setBackground(new java.awt.Color(153, 255, 153));
        txtMassaBadan3.setEditable(false);
        txtMassaBadan3.setFocusable(false);

        txtTinggiBadan3.setBackground(new java.awt.Color(153, 255, 153));
        txtTinggiBadan3.setEditable(false);
        txtTinggiBadan3.setFocusable(false);

        txtTekananDarah3.setBackground(new java.awt.Color(153, 255, 153));
        txtTekananDarah3.setEditable(false);
        txtTekananDarah3.setFocusable(false);

        txtNadi3.setBackground(new java.awt.Color(153, 255, 153));
        txtNadi3.setEditable(false);
        txtNadi3.setFocusable(false);

        txtTemperatur3.setBackground(new java.awt.Color(153, 255, 153));
        txtTemperatur3.setEditable(false);
        txtTemperatur3.setFocusable(false);

        txtPernapasan3.setBackground(new java.awt.Color(153, 255, 153));
        txtPernapasan3.setEditable(false);
        txtPernapasan3.setFocusable(false);

        txtKesadaran3.setBackground(new java.awt.Color(153, 255, 153));
        txtKesadaran3.setEditable(false);
        txtKesadaran3.setFocusable(false);

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Kg");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Cm");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("mmHg");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("/ Menit");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Celcius");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("/ Menit");

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Perawat");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText(":");

        txtNamaPerawat3.setBackground(new java.awt.Color(153, 255, 153));
        txtNamaPerawat3.setEditable(false);
        txtNamaPerawat3.setFocusable(false);

        javax.swing.GroupLayout panelPemeriksaanAwalLayout = new javax.swing.GroupLayout(panelPemeriksaanAwal);
        panelPemeriksaanAwal.setLayout(panelPemeriksaanAwalLayout);
        panelPemeriksaanAwalLayout.setHorizontalGroup(
            panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPemeriksaanAwalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPemeriksaanAwalLayout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamaPerawat3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPemeriksaanAwalLayout.createSequentialGroup()
                        .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPemeriksaanAwalLayout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKesadaran3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                            .addGroup(panelPemeriksaanAwalLayout.createSequentialGroup()
                                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPemeriksaanAwalLayout.createSequentialGroup()
                                        .addComponent(jLabel80)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMassaBadan3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(panelPemeriksaanAwalLayout.createSequentialGroup()
                                        .addComponent(jLabel85)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPernapasan3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(panelPemeriksaanAwalLayout.createSequentialGroup()
                                        .addComponent(jLabel84)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTemperatur3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(panelPemeriksaanAwalLayout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNadi3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPemeriksaanAwalLayout.createSequentialGroup()
                                        .addComponent(jLabel82)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTekananDarah3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPemeriksaanAwalLayout.createSequentialGroup()
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTinggiBadan3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel87))))
                        .addGap(45, 45, 45)))
                .addContainerGap())
        );
        panelPemeriksaanAwalLayout.setVerticalGroup(
            panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPemeriksaanAwalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel80)
                    .addComponent(txtMassaBadan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel81)
                    .addComponent(txtTinggiBadan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel82)
                    .addComponent(txtTekananDarah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel83)
                    .addComponent(txtNadi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel84)
                    .addComponent(txtTemperatur3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel85)
                    .addComponent(txtPernapasan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel86)
                    .addComponent(txtKesadaran3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPemeriksaanAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jLabel94)
                    .addComponent(txtNamaPerawat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(panelPemeriksaanAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPemeriksaanLanjutan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPemeriksaanAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(panelPemeriksaanLanjutan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_btnOKActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDlgAWTRekMedByNoDaftar dialog = new FrmDlgAWTRekMedByNoDaftar(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelPemeriksaanAwal;
    private javax.swing.JPanel panelPemeriksaanLanjutan;
    private javax.swing.JTextArea txtAnamnesa;
    private javax.swing.JTextArea txtDiagnosa;
    private javax.swing.JTextField txtKesadaran3;
    private javax.swing.JTextField txtMassaBadan3;
    private javax.swing.JTextField txtNadi3;
    private javax.swing.JTextField txtNamaPerawat3;
    private javax.swing.JTextField txtPernapasan3;
    private javax.swing.JTextField txtTekananDarah3;
    private javax.swing.JTextField txtTemperatur3;
    private javax.swing.JTextArea txtTerapi;
    private javax.swing.JTextField txtTinggiBadan3;
    // End of variables declaration//GEN-END:variables

}
