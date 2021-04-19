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
/*     */ public class NomJoueurs extends JFrame {
/*  20 */   static Fenetre fenetreJeu = null;
/*     */   
/*  22 */   private JPanel panelPrincipalNomJoueurs = new JPanel();
/*  23 */   private JPanel panelTitre = new JPanel();
/*  24 */   private JPanel panelContrainte = new JPanel();
/*  25 */   private JPanel panelNomJoueur1 = new JPanel();
/*  26 */   private JPanel panelNomJoueur2 = new JPanel();
/*  27 */   private JTextField jtfNomJoueur1 = new JTextField();
/*  28 */   private JTextField jtfNomJoueur2 = new JTextField();
/*  29 */   private JLabel labelTitre = new JLabel("NOM DE NOS 2 CHAMPIONS");
/*  30 */   private JLabel labelContrainte = new JLabel("8 caractères maximum");
/*  31 */   private JLabel labelNomJoueur1 = new JLabel("Pseudo du joueur 1 : ");
/*  32 */   private JLabel labelNomJoueur2 = new JLabel("Pseudo du joueur 2 : ");
/*  33 */   private Font policeJTF = new Font("Arial", 1, 75);
/*  34 */   private Font policeTitre = new Font("Arial", 1, 40);
/*  35 */   private Font policeLabels = new Font("Arial", 1, 20);
/*     */   
/*  37 */   static JButton boutonValiderNomJoueurs = new BoutonRond("Fenetre.getRessourceAsBytes(\"valider.png\")");
/*     */ 
/*     */   
/*     */   private String nomJoueur1;
/*     */ 
/*     */   
/*     */   private String nomJoueur2;
/*     */ 
/*     */   
/*     */   public NomJoueurs() {
/*     */     try {
/*  48 */       jbInit();
/*  49 */     } catch (Exception e) {
/*  50 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jbInit() throws Exception {
/*  60 */     setIconImage((new ImageIcon(Fenetre.getRessourceAsBytes("icon.png"))).getImage());
/*     */ 
/*     */     
/*  63 */     setSize(700, 400);
/*  64 */     setTitle("Nom de nos Champions");
/*  65 */     setUndecorated(true);
/*  66 */     setDefaultCloseOperation(2);
/*  67 */     setLocationRelativeTo(null);
/*  68 */     setResizable(false);
/*  69 */     setContentPane(this.panelPrincipalNomJoueurs);
/*     */ 
/*     */     
/*  72 */     EvenementsSouris gestEvent = new EvenementsSouris(null);
/*  73 */     boutonValiderNomJoueurs.addMouseListener(gestEvent);
/*  74 */     boutonValiderNomJoueurs.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  76 */             if (NomJoueurs.this.jtfNomJoueur1.getText().length() > 0 && NomJoueurs.this.jtfNomJoueur1.getText().length() <= 8 && 
/*  77 */               NomJoueurs.this.jtfNomJoueur2.getText().length() > 0 && NomJoueurs.this.jtfNomJoueur2.getText().length() <= 8) {
/*  78 */               NomJoueurs.this.setNomJoueur1(NomJoueurs.this.jtfNomJoueur1.getText().toUpperCase());
/*  79 */               NomJoueurs.this.setNomJoueur2(NomJoueurs.this.jtfNomJoueur2.getText().toUpperCase());
/*  80 */               NomJoueurs.fenetreJeu = new Fenetre(NomJoueurs.this.nomJoueur1, NomJoueurs.this.nomJoueur2);
/*  81 */               NomJoueurs.this.dispose();
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/*  87 */     this.panelPrincipalNomJoueurs.setBackground(new Color(100, 100, 100));
/*  88 */     this.panelPrincipalNomJoueurs.setLayout((LayoutManager)null);
/*  89 */     this.panelPrincipalNomJoueurs.add(this.panelTitre, (Object)null);
/*  90 */     this.panelPrincipalNomJoueurs.add(this.panelContrainte, (Object)null);
/*  91 */     this.panelPrincipalNomJoueurs.add(this.panelNomJoueur1, (Object)null);
/*  92 */     this.panelPrincipalNomJoueurs.add(this.panelNomJoueur2, (Object)null);
/*  93 */     this.panelPrincipalNomJoueurs.add(boutonValiderNomJoueurs, (Object)null);
/*     */ 
/*     */     
/*  96 */     this.panelTitre.setBackground(new Color(100, 100, 100));
/*  97 */     this.panelTitre.setBounds(0, 0, 700, 50);
/*  98 */     this.panelTitre.add(this.labelTitre);
/*  99 */     this.labelTitre.setForeground(Color.white);
/* 100 */     this.labelTitre.setFont(this.policeTitre);
/*     */ 
/*     */     
/* 103 */     this.panelContrainte.setBackground(new Color(100, 100, 100));
/* 104 */     this.panelContrainte.setBounds(0, 50, 700, 50);
/* 105 */     this.panelContrainte.add(this.labelContrainte);
/* 106 */     this.labelContrainte.setForeground(Color.red);
/* 107 */     this.labelContrainte.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 110 */     this.panelNomJoueur1.setBackground(new Color(100, 100, 100));
/* 111 */     this.panelNomJoueur1.add(this.labelNomJoueur1, (Object)null);
/* 112 */     this.panelNomJoueur1.add(this.jtfNomJoueur1, (Object)null);
/* 113 */     this.panelNomJoueur1.setBounds(0, 90, 700, 100);
/* 114 */     this.jtfNomJoueur1.setText("Joueur 1");
/* 115 */     this.jtfNomJoueur1.setFont(this.policeJTF);
/* 116 */     this.jtfNomJoueur1.setPreferredSize(new Dimension(470, 70));
/* 117 */     this.jtfNomJoueur1.setForeground(new Color(253, 206, 158));
/* 118 */     this.jtfNomJoueur1.addMouseListener(gestEvent);
/* 119 */     this.labelNomJoueur1.setForeground(Color.white);
/* 120 */     this.labelNomJoueur1.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 123 */     this.panelNomJoueur2.setBackground(new Color(100, 100, 100));
/* 124 */     this.panelNomJoueur2.add(this.labelNomJoueur2, (Object)null);
/* 125 */     this.panelNomJoueur2.add(this.jtfNomJoueur2, (Object)null);
/* 126 */     this.panelNomJoueur2.setBounds(0, 190, 700, 100);
/* 127 */     this.jtfNomJoueur2.setText("Joueur 2");
/* 128 */     this.jtfNomJoueur2.setFont(this.policeJTF);
/* 129 */     this.jtfNomJoueur2.setPreferredSize(new Dimension(470, 70));
/* 130 */     this.jtfNomJoueur2.setForeground(new Color(253, 206, 158));
/* 131 */     this.jtfNomJoueur2.addMouseListener(gestEvent);
/* 132 */     this.labelNomJoueur2.setForeground(Color.white);
/* 133 */     this.labelNomJoueur2.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 136 */     boutonValiderNomJoueurs.setBounds(260, 320, 180, 60);
/* 137 */     boutonValiderNomJoueurs.setBorderPainted(false);
/* 138 */     boutonValiderNomJoueurs.setFocusPainted(false);
/*     */     
/* 140 */     setVisible(true);
/*     */   }
/*     */   
/*     */   public void setNomJoueur1(String nomJoueur1) {
/* 144 */     if (nomJoueur1 != null) {
/* 145 */       this.nomJoueur1 = nomJoueur1;
/*     */     }
/*     */   }
/*     */   
/*     */   public void setNomJoueur2(String nomJoueur2) {
/* 150 */     if (nomJoueur2 != null) {
/* 151 */       this.nomJoueur2 = nomJoueur2;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getNomJoueur(String joueur) {
/* 156 */     if (joueur == "joueur1")
/* 157 */       return this.nomJoueur1; 
/* 158 */     if (joueur == "joueur2") {
/* 159 */       return this.nomJoueur2;
/*     */     }
/* 161 */     System.err.println("NomJoueurs : getNomJoueur : joueur != \"joueur1\" && joueur != \"joueur2\".");
/* 162 */     return "";
/*     */   }
/*     */   
/*     */   private class EvenementsSouris
/*     */     extends MouseAdapter {
/*     */     private EvenementsSouris() {}
/*     */     
/*     */     public void mouseEntered(MouseEvent event) {
/* 170 */       if (event.getSource() == NomJoueurs.boutonValiderNomJoueurs) {
/* 171 */         NomJoueurs.this.setCursor(Cursor.getPredefinedCursor(12));
/* 172 */         Fenetre.surLeBouton = true;
/* 173 */         int a = 260, b = 320, c = 180, d = 60;
/* 174 */         for (int i = 1; i < 6; i++) {
/* 175 */           a--; b--; c += 2; d += 2;
/* 176 */           NomJoueurs.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseExited(MouseEvent event) {
/* 183 */       if (event.getSource() == NomJoueurs.boutonValiderNomJoueurs) {
/* 184 */         NomJoueurs.this.setCursor(Cursor.getDefaultCursor());
/* 185 */         Fenetre.surLeBouton = false;
/* 186 */         int a = 255, b = 315, c = 190, d = 70;
/* 187 */         for (int i = 1; i < 6; i++) {
/* 188 */           a++; b++; c -= 2; d -= 2;
/* 189 */           NomJoueurs.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mousePressed(MouseEvent event) {
/* 196 */       if (event.getSource() == NomJoueurs.boutonValiderNomJoueurs) {
/* 197 */         NomJoueurs.this.setCursor(Cursor.getPredefinedCursor(12));
/* 198 */         Fenetre.surLeBouton = false;
/* 199 */         int a = 255, b = 315, c = 190, d = 70;
/* 200 */         for (int i = 1; i < 6; i++) {
/* 201 */           a++; b++; c -= 2; d -= 2;
/* 202 */           NomJoueurs.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseReleased(MouseEvent event) {
/* 209 */       if (event.getSource() == NomJoueurs.boutonValiderNomJoueurs && 
/* 210 */         event.getX() > 0 && event.getX() < NomJoueurs.boutonValiderNomJoueurs.getWidth() && event.getY() > 0 && event.getY() < NomJoueurs.boutonValiderNomJoueurs.getHeight()) {
/* 211 */         NomJoueurs.this.setCursor(Cursor.getPredefinedCursor(12));
/* 212 */         Fenetre.surLeBouton = true;
/* 213 */         int a = 260, b = 320, c = 180, d = 60;
/* 214 */         for (int i = 1; i < 6; i++) {
/* 215 */           a--; b--; c += 2; d += 2;
/* 216 */           NomJoueurs.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void mouseClicked(MouseEvent event) {
/* 224 */       if (event.getSource() == NomJoueurs.this.jtfNomJoueur1) {
/* 225 */         NomJoueurs.this.jtfNomJoueur1.setText("");
/* 226 */         NomJoueurs.this.jtfNomJoueur1.removeMouseListener(this);
/* 227 */       } else if (event.getSource() == NomJoueurs.this.jtfNomJoueur2) {
/* 228 */         NomJoueurs.this.jtfNomJoueur2.setText("");
/* 229 */         NomJoueurs.this.jtfNomJoueur2.removeMouseListener(this);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\NomJoueurs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */