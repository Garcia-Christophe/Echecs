/*     */ package fr.JeuEchec.christophegarcia;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class EditNoms extends JFrame {
/*  20 */   private JPanel panelPrincipalNomJoueurs = new JPanel();
/*  21 */   private JPanel panelTitre = new JPanel();
/*  22 */   private JPanel panelContrainte = new JPanel();
/*  23 */   private JPanel panelNomJoueur1 = new JPanel();
/*  24 */   private JPanel panelNomJoueur2 = new JPanel();
/*  25 */   private JTextField jtfNomJoueur1 = new JTextField();
/*  26 */   private JTextField jtfNomJoueur2 = new JTextField();
/*  27 */   private JLabel labelTitre = new JLabel("NOM DE NOS 2 CHAMPIONS");
/*  28 */   private JLabel labelContrainte = new JLabel("8 caractères maximum");
/*  29 */   private JLabel labelNomJoueur1 = new JLabel("Pseudo du joueur 1 : ");
/*  30 */   private JLabel labelNomJoueur2 = new JLabel("Pseudo du joueur 2 : ");
/*  31 */   private Font policeJTF = new Font("Arial", 1, 75);
/*  32 */   private Font policeTitre = new Font("Arial", 1, 40);
/*  33 */   private Font policeLabels = new Font("Arial", 1, 20);
/*     */   
/*  35 */   static JButton boutonValiderNomJoueurs = new BoutonRond("Fenetre.getRessourceAsBytes(\"valider.png\")");
/*     */ 
/*     */   
/*     */   private String nomJoueur1;
/*     */   
/*     */   private String nomJoueur2;
/*     */ 
/*     */   
/*     */   public EditNoms(String nomJoueur1, String nomJoueur2) {
/*  44 */     this.nomJoueur1 = nomJoueur1;
/*  45 */     this.nomJoueur2 = nomJoueur2;
/*     */ 
/*     */     
/*     */     try {
/*  49 */       jbInit();
/*  50 */     } catch (Exception e) {
/*  51 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jbInit() throws Exception {
/*  61 */     setIconImage((new ImageIcon(Fenetre.getRessourceAsBytes("icon.png"))).getImage());
/*     */ 
/*     */     
/*  64 */     setSize(700, 400);
/*  65 */     setTitle("Nom de nos Champions");
/*  66 */     setUndecorated(true);
/*  67 */     setDefaultCloseOperation(2);
/*  68 */     setLocationRelativeTo(null);
/*  69 */     setResizable(false);
/*  70 */     setContentPane(this.panelPrincipalNomJoueurs);
/*     */ 
/*     */     
/*  73 */     EvenementsSouris gestEvent = new EvenementsSouris(null);
/*  74 */     boutonValiderNomJoueurs.addMouseListener(gestEvent);
/*  75 */     boutonValiderNomJoueurs.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  77 */             if (EditNoms.this.jtfNomJoueur1.getText().length() > 0 && EditNoms.this.jtfNomJoueur1.getText().length() <= 8 && 
/*  78 */               EditNoms.this.jtfNomJoueur2.getText().length() > 0 && EditNoms.this.jtfNomJoueur2.getText().length() <= 8) {
/*  79 */               EditNoms.this.setNomJoueur1(EditNoms.this.jtfNomJoueur1.getText().toUpperCase());
/*  80 */               EditNoms.this.setNomJoueur2(EditNoms.this.jtfNomJoueur2.getText().toUpperCase());
/*     */               
/*  82 */               Fenetre.nomJoueurGauche.setText(EditNoms.this.nomJoueur1);
/*  83 */               Fenetre.nomJoueurDroite.setText(EditNoms.this.nomJoueur2);
/*  84 */               Fenetre.boutonLancer.setEnabled(true);
/*  85 */               Fenetre.boutonPause.setEnabled(false);
/*  86 */               Fenetre.lancerEnable = true;
/*  87 */               Fenetre.pauseEnable = false;
/*  88 */               Fenetre.champTemps.setText("Jeu en Pause");
/*     */               
/*  90 */               EditNoms.this.dispose();
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/*  96 */     this.panelPrincipalNomJoueurs.setBackground(new Color(100, 100, 100));
/*  97 */     this.panelPrincipalNomJoueurs.setLayout((LayoutManager)null);
/*  98 */     this.panelPrincipalNomJoueurs.add(this.panelTitre, (Object)null);
/*  99 */     this.panelPrincipalNomJoueurs.add(this.panelContrainte, (Object)null);
/* 100 */     this.panelPrincipalNomJoueurs.add(this.panelNomJoueur1, (Object)null);
/* 101 */     this.panelPrincipalNomJoueurs.add(this.panelNomJoueur2, (Object)null);
/* 102 */     this.panelPrincipalNomJoueurs.add(boutonValiderNomJoueurs, (Object)null);
/*     */ 
/*     */     
/* 105 */     this.panelTitre.setBackground(new Color(100, 100, 100));
/* 106 */     this.panelTitre.setBounds(0, 0, 700, 50);
/* 107 */     this.panelTitre.add(this.labelTitre);
/* 108 */     this.labelTitre.setForeground(Color.white);
/* 109 */     this.labelTitre.setFont(this.policeTitre);
/*     */ 
/*     */     
/* 112 */     this.panelContrainte.setBackground(new Color(100, 100, 100));
/* 113 */     this.panelContrainte.setBounds(0, 50, 700, 50);
/* 114 */     this.panelContrainte.add(this.labelContrainte);
/* 115 */     this.labelContrainte.setForeground(Color.red);
/* 116 */     this.labelContrainte.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 119 */     this.panelNomJoueur1.setBackground(new Color(100, 100, 100));
/* 120 */     this.panelNomJoueur1.add(this.labelNomJoueur1, (Object)null);
/* 121 */     this.panelNomJoueur1.add(this.jtfNomJoueur1, (Object)null);
/* 122 */     this.panelNomJoueur1.setBounds(0, 90, 700, 100);
/* 123 */     this.jtfNomJoueur1.setText("Joueur 1");
/* 124 */     this.jtfNomJoueur1.setFont(this.policeJTF);
/* 125 */     this.jtfNomJoueur1.setPreferredSize(new Dimension(470, 70));
/* 126 */     this.jtfNomJoueur1.setForeground(new Color(253, 206, 158));
/* 127 */     this.jtfNomJoueur1.addMouseListener(gestEvent);
/* 128 */     this.labelNomJoueur1.setForeground(Color.white);
/* 129 */     this.labelNomJoueur1.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 132 */     this.panelNomJoueur2.setBackground(new Color(100, 100, 100));
/* 133 */     this.panelNomJoueur2.add(this.labelNomJoueur2, (Object)null);
/* 134 */     this.panelNomJoueur2.add(this.jtfNomJoueur2, (Object)null);
/* 135 */     this.panelNomJoueur2.setBounds(0, 190, 700, 100);
/* 136 */     this.jtfNomJoueur2.setText("Joueur 2");
/* 137 */     this.jtfNomJoueur2.setFont(this.policeJTF);
/* 138 */     this.jtfNomJoueur2.setPreferredSize(new Dimension(470, 70));
/* 139 */     this.jtfNomJoueur2.setForeground(new Color(253, 206, 158));
/* 140 */     this.jtfNomJoueur2.addMouseListener(gestEvent);
/* 141 */     this.labelNomJoueur2.setForeground(Color.white);
/* 142 */     this.labelNomJoueur2.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 145 */     boutonValiderNomJoueurs.setBounds(260, 320, 180, 60);
/* 146 */     boutonValiderNomJoueurs.setBorderPainted(false);
/* 147 */     boutonValiderNomJoueurs.setFocusPainted(false);
/*     */     
/* 149 */     setVisible(true);
/*     */   }
/*     */   
/*     */   public void setNomJoueur1(String nomJoueur1) {
/* 153 */     if (nomJoueur1 != null) {
/* 154 */       this.nomJoueur1 = nomJoueur1;
/*     */     }
/*     */   }
/*     */   
/*     */   public void setNomJoueur2(String nomJoueur2) {
/* 159 */     if (nomJoueur2 != null) {
/* 160 */       this.nomJoueur2 = nomJoueur2;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getNomJoueur(String joueur) {
/* 165 */     if (joueur == "joueur1")
/* 166 */       return this.nomJoueur1; 
/* 167 */     if (joueur == "joueur2") {
/* 168 */       return this.nomJoueur2;
/*     */     }
/* 170 */     System.err.println("NomJoueurs : getNomJoueur : joueur != \"joueur1\" && joueur != \"joueur2\".");
/* 171 */     return "";
/*     */   }
/*     */   
/*     */   private class EvenementsSouris
/*     */     extends MouseAdapter {
/*     */     private EvenementsSouris() {}
/*     */     
/*     */     public void mouseEntered(MouseEvent event) {
/* 179 */       if (event.getSource() == EditNoms.boutonValiderNomJoueurs) {
/* 180 */         EditNoms.this.setCursor(Cursor.getPredefinedCursor(12));
/* 181 */         Fenetre.surLeBouton = true;
/* 182 */         int a = 260, b = 320, c = 180, d = 60;
/* 183 */         for (int i = 1; i < 6; i++) {
/* 184 */           a--; b--; c += 2; d += 2;
/* 185 */           EditNoms.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseExited(MouseEvent event) {
/* 192 */       if (event.getSource() == EditNoms.boutonValiderNomJoueurs) {
/* 193 */         EditNoms.this.setCursor(Cursor.getDefaultCursor());
/* 194 */         Fenetre.surLeBouton = false;
/* 195 */         int a = 255, b = 315, c = 190, d = 70;
/* 196 */         for (int i = 1; i < 6; i++) {
/* 197 */           a++; b++; c -= 2; d -= 2;
/* 198 */           EditNoms.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mousePressed(MouseEvent event) {
/* 205 */       if (event.getSource() == EditNoms.boutonValiderNomJoueurs) {
/* 206 */         EditNoms.this.setCursor(Cursor.getPredefinedCursor(12));
/* 207 */         Fenetre.surLeBouton = false;
/* 208 */         int a = 255, b = 315, c = 190, d = 70;
/* 209 */         for (int i = 1; i < 6; i++) {
/* 210 */           a++; b++; c -= 2; d -= 2;
/* 211 */           EditNoms.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseReleased(MouseEvent event) {
/* 218 */       if (event.getSource() == EditNoms.boutonValiderNomJoueurs && 
/* 219 */         event.getX() > 0 && event.getX() < EditNoms.boutonValiderNomJoueurs.getWidth() && event.getY() > 0 && event.getY() < EditNoms.boutonValiderNomJoueurs.getHeight()) {
/* 220 */         EditNoms.this.setCursor(Cursor.getPredefinedCursor(12));
/* 221 */         Fenetre.surLeBouton = true;
/* 222 */         int a = 260, b = 320, c = 180, d = 60;
/* 223 */         for (int i = 1; i < 6; i++) {
/* 224 */           a--; b--; c += 2; d += 2;
/* 225 */           EditNoms.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void mouseClicked(MouseEvent event) {
/* 233 */       if (event.getSource() == EditNoms.this.jtfNomJoueur1) {
/* 234 */         EditNoms.this.jtfNomJoueur1.setText("");
/* 235 */         EditNoms.this.jtfNomJoueur1.removeMouseListener(this);
/* 236 */       } else if (event.getSource() == EditNoms.this.jtfNomJoueur2) {
/* 237 */         EditNoms.this.jtfNomJoueur2.setText("");
/* 238 */         EditNoms.this.jtfNomJoueur2.removeMouseListener(this);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\EditNoms.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */