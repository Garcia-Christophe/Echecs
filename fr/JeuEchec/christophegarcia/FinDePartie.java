/*     */ package fr.JeuEchec.christophegarcia;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
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
/*     */ 
/*     */ public class FinDePartie
/*     */   extends JFrame
/*     */ {
/*  20 */   private JPanel panelPrincipal = new JPanel();
/*  21 */   private JPanel panelTitre = new JPanel();
/*  22 */   private JPanel panelAbandon = new JPanel();
/*  23 */   private JPanel panelMat = new JPanel();
/*  24 */   private JPanel panelEchecEtMat = new JPanel();
/*  25 */   private JPanel panelVNB = new JPanel();
/*  26 */   private JLabel labelTitre = new JLabel("Fin de la Partie ?");
/*  27 */   private JLabel labelAbandon = new JLabel("Abandon");
/*  28 */   private JLabel labelMat = new JLabel("Pat");
/*  29 */   private JLabel labelEchecEtMat = new JLabel("Échec & Mat");
/*  30 */   private JLabel labelVNB = new JLabel("Victoire du joueur");
/*  31 */   private Font policeTitre = new Font("Arial", 1, 60);
/*  32 */   private Font policeMiniTitres = new Font("Arial", 1, 40);
/*  33 */   private Font policeVictoireBN = new Font("Arial", 1, 20);
/*     */   
/*  35 */   static JButton boutonAnnuler = new BoutonRond("Fenetre.getRessourceAsBytes(\"annuler.png\")");
/*  36 */   static JButton boutonAbandon = new BoutonRond("Fenetre.getRessourceAsBytes(\"abandonnerBouton.png\")");
/*  37 */   static JButton boutonPat = new BoutonRond("Fenetre.getRessourceAsBytes(\"pat.png\")");
/*  38 */   static JButton boutonEchecEtMat = new BoutonRond("Fenetre.getRessourceAsBytes(\"echecEtMat.png\")");
/*  39 */   static JButton boutonBlanc = new BoutonRond("Fenetre.getRessourceAsBytes(\"boutonBlanc.png\")");
/*  40 */   static JButton boutonNoir = new BoutonRond("Fenetre.getRessourceAsBytes(\"boutonNoir.png\")");
/*     */   
/*  42 */   private Color couleurFond = new Color(100, 100, 100);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinDePartie() {
/*     */     try {
/*  50 */       jbInit();
/*  51 */     } catch (Exception e) {
/*  52 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jbInit() throws Exception {
/*  62 */     setIconImage((new ImageIcon(Fenetre.getRessourceAsBytes("icon.png"))).getImage());
/*     */ 
/*     */     
/*  65 */     setTitle("Fin de la Partie ?");
/*  66 */     setSize(900, 500);
/*  67 */     setUndecorated(true);
/*  68 */     setDefaultCloseOperation(3);
/*  69 */     setLocationRelativeTo(null);
/*  70 */     setResizable(false);
/*  71 */     setContentPane(this.panelPrincipal);
/*     */ 
/*     */     
/*  74 */     EvenementsSouris gestEvent = new EvenementsSouris(null);
/*  75 */     boutonAnnuler.addMouseListener(gestEvent);
/*  76 */     boutonAnnuler.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  78 */             Fenetre.boutonLancer.setEnabled(true);
/*  79 */             Fenetre.boutonPause.setEnabled(false);
/*  80 */             Fenetre.lancerEnable = true;
/*  81 */             Fenetre.pauseEnable = false;
/*  82 */             Fenetre.champTemps.setText("Jeu en Pause");
/*     */             
/*  84 */             FinDePartie.this.dispose();
/*     */           }
/*     */         });
/*  87 */     boutonAbandon.addMouseListener(gestEvent);
/*  88 */     boutonAbandon.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  90 */             Fenetre.affichageCoupSpecial = true;
/*  91 */             Fenetre.titreAffichage = "Abandon";
/*     */             
/*  93 */             if (!Fenetre.preparationPiecesMortesFaite) {
/*  94 */               Fenetre.nomJoueurGauche.setForeground(Color.green);
/*  95 */               Fenetre.nomJoueurDroite.setForeground(Color.green);
/*     */             }
/*  97 */             else if (Fenetre.couleurControle.equals("blanc")) {
/*  98 */               Fenetre.joueurGaucheAGagne = false;
/*  99 */               Fenetre.nomJoueurGauche.setForeground(Color.red);
/* 100 */               Fenetre.nomJoueurDroite.setForeground(Color.green);
/*     */             } else {
/* 102 */               Fenetre.joueurGaucheAGagne = true;
/* 103 */               Fenetre.nomJoueurGauche.setForeground(Color.green);
/* 104 */               Fenetre.nomJoueurDroite.setForeground(Color.red);
/*     */             } 
/*     */ 
/*     */             
/* 108 */             Fenetre.boutonLancer.setEnabled(false);
/* 109 */             Fenetre.boutonPause.setEnabled(false);
/* 110 */             Fenetre.lancerEnable = false;
/* 111 */             Fenetre.pauseEnable = true;
/*     */             
/* 113 */             Fenetre.champTemps.setForeground(Color.white);
/* 114 */             Font fontAffichageTemps = new Font("Arial", 2, 20);
/* 115 */             String temps = "(Temps : " + ((Fenetre.heures < 10) ? "" : (String.valueOf(Fenetre.heures) + "h ")) + (
/* 116 */               (Fenetre.minutes < 10) ? ("0" + Fenetre.minutes + "m ") : (String.valueOf(Fenetre.minutes) + "m ")) + (
/* 117 */               (Fenetre.secondes < 10) ? ("0" + Fenetre.secondes + "s ") : (String.valueOf(Fenetre.secondes) + "s")) + ")";
/* 118 */             JLabel affichageTemps = new JLabel(temps);
/* 119 */             Fenetre.champTemps.setBounds(471, 0, 585, 40);
/* 120 */             affichageTemps.setBounds(471, 40, 585, 20);
/* 121 */             affichageTemps.setFont(fontAffichageTemps);
/* 122 */             affichageTemps.setForeground(new Color(255, 255, 255));
/* 123 */             affichageTemps.setHorizontalAlignment(0);
/* 124 */             Fenetre.panelControles.add(affichageTemps);
/* 125 */             Fenetre.champTemps.setText("Félicitations à vous 2 !");
/*     */             
/* 127 */             FinDePartie.this.dispose();
/*     */           }
/*     */         });
/* 130 */     boutonPat.addMouseListener(gestEvent);
/* 131 */     boutonPat.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 133 */             Fenetre.affichageCoupSpecial = true;
/* 134 */             Fenetre.titreAffichage = "PAT";
/*     */             
/* 136 */             Fenetre.nomJoueurGauche.setForeground(Color.green);
/* 137 */             Fenetre.nomJoueurDroite.setForeground(Color.green);
/*     */             
/* 139 */             Fenetre.boutonLancer.setEnabled(false);
/* 140 */             Fenetre.boutonPause.setEnabled(false);
/* 141 */             Fenetre.lancerEnable = false;
/* 142 */             Fenetre.pauseEnable = true;
/*     */             
/* 144 */             Fenetre.champTemps.setForeground(Color.white);
/* 145 */             Font fontAffichageTemps = new Font("Arial", 2, 20);
/* 146 */             String temps = "(Temps : " + ((Fenetre.heures < 10) ? "" : (String.valueOf(Fenetre.heures) + "h ")) + (
/* 147 */               (Fenetre.minutes < 10) ? ("0" + Fenetre.minutes + "m ") : (String.valueOf(Fenetre.minutes) + "m ")) + (
/* 148 */               (Fenetre.secondes < 10) ? ("0" + Fenetre.secondes + "s ") : (String.valueOf(Fenetre.secondes) + "s")) + ")";
/* 149 */             JLabel affichageTemps = new JLabel(temps);
/* 150 */             Fenetre.champTemps.setBounds(471, 0, 585, 40);
/* 151 */             affichageTemps.setBounds(471, 40, 585, 20);
/* 152 */             affichageTemps.setFont(fontAffichageTemps);
/* 153 */             affichageTemps.setForeground(new Color(255, 255, 255));
/* 154 */             affichageTemps.setHorizontalAlignment(0);
/* 155 */             Fenetre.panelControles.add(affichageTemps);
/* 156 */             Fenetre.champTemps.setText("Félicitations à vous 2 !");
/*     */             
/* 158 */             FinDePartie.this.dispose();
/*     */           }
/*     */         });
/* 161 */     boutonEchecEtMat.addMouseListener(gestEvent);
/* 162 */     boutonEchecEtMat.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 164 */             FinDePartie.this.victoireVisible();
/*     */           }
/*     */         });
/* 167 */     boutonBlanc.addMouseListener(gestEvent);
/* 168 */     boutonBlanc.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 170 */             Fenetre.affichageCoupSpecial = true;
/* 171 */             Fenetre.titreAffichage = "ECHEC & MAT";
/* 172 */             Fenetre.joueurGaucheAGagne = true;
/*     */             
/* 174 */             Fenetre.nomJoueurGauche.setForeground(Color.green);
/* 175 */             Fenetre.nomJoueurDroite.setForeground(Color.red);
/*     */             
/* 177 */             Fenetre.boutonLancer.setEnabled(false);
/* 178 */             Fenetre.boutonPause.setEnabled(false);
/* 179 */             Fenetre.lancerEnable = false;
/* 180 */             Fenetre.pauseEnable = true;
/*     */             
/* 182 */             Fenetre.champTemps.setForeground(Color.white);
/* 183 */             Font fontAffichageTemps = new Font("Arial", 2, 20);
/* 184 */             String temps = "(Temps : " + ((Fenetre.heures < 10) ? "" : (String.valueOf(Fenetre.heures) + "h ")) + (
/* 185 */               (Fenetre.minutes < 10) ? ("0" + Fenetre.minutes + "m ") : (String.valueOf(Fenetre.minutes) + "m ")) + (
/* 186 */               (Fenetre.secondes < 10) ? ("0" + Fenetre.secondes + "s ") : (String.valueOf(Fenetre.secondes) + "s")) + ")";
/* 187 */             JLabel affichageTemps = new JLabel(temps);
/* 188 */             Fenetre.champTemps.setBounds(471, 0, 585, 40);
/* 189 */             affichageTemps.setBounds(471, 40, 585, 20);
/* 190 */             affichageTemps.setFont(fontAffichageTemps);
/* 191 */             affichageTemps.setForeground(new Color(255, 255, 255));
/* 192 */             affichageTemps.setHorizontalAlignment(0);
/* 193 */             Fenetre.panelControles.add(affichageTemps);
/* 194 */             Fenetre.champTemps.setText("Félicitations à vous 2 !");
/*     */             
/* 196 */             FinDePartie.this.dispose();
/*     */           }
/*     */         });
/* 199 */     boutonNoir.addMouseListener(gestEvent);
/* 200 */     boutonNoir.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 202 */             Fenetre.affichageCoupSpecial = true;
/* 203 */             Fenetre.titreAffichage = "ECHEC & MAT";
/* 204 */             Fenetre.joueurGaucheAGagne = false;
/*     */             
/* 206 */             Fenetre.nomJoueurGauche.setForeground(Color.red);
/* 207 */             Fenetre.nomJoueurDroite.setForeground(Color.green);
/*     */             
/* 209 */             Fenetre.boutonLancer.setEnabled(false);
/* 210 */             Fenetre.boutonPause.setEnabled(false);
/* 211 */             Fenetre.lancerEnable = false;
/* 212 */             Fenetre.pauseEnable = true;
/*     */             
/* 214 */             Fenetre.champTemps.setForeground(Color.white);
/* 215 */             Font fontAffichageTemps = new Font("Arial", 2, 20);
/* 216 */             String temps = "(Temps : " + ((Fenetre.heures < 10) ? "" : (String.valueOf(Fenetre.heures) + "h ")) + (
/* 217 */               (Fenetre.minutes < 10) ? ("0" + Fenetre.minutes + "m ") : (String.valueOf(Fenetre.minutes) + "m ")) + (
/* 218 */               (Fenetre.secondes < 10) ? ("0" + Fenetre.secondes + "s ") : (String.valueOf(Fenetre.secondes) + "s")) + ")";
/* 219 */             JLabel affichageTemps = new JLabel(temps);
/* 220 */             Fenetre.champTemps.setBounds(471, 0, 585, 40);
/* 221 */             affichageTemps.setBounds(471, 40, 585, 20);
/* 222 */             affichageTemps.setFont(fontAffichageTemps);
/* 223 */             affichageTemps.setForeground(new Color(255, 255, 255));
/* 224 */             affichageTemps.setHorizontalAlignment(0);
/* 225 */             Fenetre.panelControles.add(affichageTemps);
/* 226 */             Fenetre.champTemps.setText("Félicitations à vous 2 !");
/*     */             
/* 228 */             FinDePartie.this.dispose();
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 233 */     this.panelPrincipal.setLayout((LayoutManager)null);
/* 234 */     this.panelPrincipal.setBackground(this.couleurFond);
/* 235 */     this.panelPrincipal.add(this.panelTitre, (Object)null);
/* 236 */     this.panelPrincipal.add(this.panelAbandon, (Object)null);
/* 237 */     this.panelPrincipal.add(this.panelMat, (Object)null);
/* 238 */     this.panelPrincipal.add(this.panelEchecEtMat, (Object)null);
/* 239 */     this.panelPrincipal.add(this.panelVNB, (Object)null);
/* 240 */     this.panelPrincipal.add(boutonAbandon, (Object)null);
/* 241 */     this.panelPrincipal.add(boutonPat, (Object)null);
/* 242 */     this.panelPrincipal.add(boutonEchecEtMat, (Object)null);
/* 243 */     this.panelPrincipal.add(boutonBlanc, (Object)null);
/* 244 */     this.panelPrincipal.add(boutonNoir, (Object)null);
/* 245 */     this.panelPrincipal.add(boutonAnnuler, (Object)null);
/*     */ 
/*     */     
/* 248 */     this.panelTitre.setBackground(this.couleurFond);
/* 249 */     this.panelTitre.setBounds(0, 20, 900, 130);
/* 250 */     this.panelTitre.add(this.labelTitre);
/* 251 */     this.labelTitre.setForeground(Color.white);
/* 252 */     this.labelTitre.setFont(this.policeTitre);
/*     */ 
/*     */     
/* 255 */     this.panelAbandon.setBackground(this.couleurFond);
/* 256 */     this.panelAbandon.setBounds(0, 150, 300, 80);
/* 257 */     this.panelAbandon.add(this.labelAbandon);
/* 258 */     this.labelAbandon.setForeground(Color.white);
/* 259 */     this.labelAbandon.setFont(this.policeMiniTitres);
/*     */ 
/*     */     
/* 262 */     this.panelMat.setBackground(this.couleurFond);
/* 263 */     this.panelMat.setBounds(300, 150, 300, 80);
/* 264 */     this.panelMat.add(this.labelMat);
/* 265 */     this.labelMat.setForeground(Color.white);
/* 266 */     this.labelMat.setFont(this.policeMiniTitres);
/*     */ 
/*     */     
/* 269 */     this.panelEchecEtMat.setBackground(this.couleurFond);
/* 270 */     this.panelEchecEtMat.setBounds(600, 150, 300, 80);
/* 271 */     this.panelEchecEtMat.add(this.labelEchecEtMat);
/* 272 */     this.labelEchecEtMat.setForeground(Color.white);
/* 273 */     this.labelEchecEtMat.setFont(this.policeMiniTitres);
/*     */ 
/*     */     
/* 276 */     this.panelVNB.setBackground(this.couleurFond);
/* 277 */     this.panelVNB.setBounds(600, 345, 300, 30);
/* 278 */     this.panelVNB.add(this.labelVNB);
/* 279 */     this.labelVNB.setForeground(Color.white);
/* 280 */     this.labelVNB.setFont(this.policeVictoireBN);
/*     */ 
/*     */     
/* 283 */     boutonAnnuler.setBounds(360, 395, 180, 60);
/* 284 */     boutonAnnuler.setBorderPainted(false);
/* 285 */     boutonAnnuler.setFocusPainted(false);
/*     */ 
/*     */     
/* 288 */     boutonAbandon.setBounds(50, 240, 200, 100);
/* 289 */     boutonAbandon.setBorderPainted(false);
/* 290 */     boutonAbandon.setFocusPainted(false);
/*     */ 
/*     */     
/* 293 */     boutonPat.setBounds(350, 240, 200, 100);
/* 294 */     boutonPat.setBorderPainted(false);
/* 295 */     boutonPat.setFocusPainted(false);
/*     */ 
/*     */     
/* 298 */     boutonEchecEtMat.setBounds(650, 240, 200, 100);
/* 299 */     boutonEchecEtMat.setBorderPainted(false);
/* 300 */     boutonEchecEtMat.setFocusPainted(false);
/*     */ 
/*     */     
/* 303 */     boutonBlanc.setBounds(655, 380, 90, 40);
/* 304 */     boutonBlanc.setBorderPainted(false);
/* 305 */     boutonBlanc.setFocusPainted(false);
/*     */ 
/*     */     
/* 308 */     boutonNoir.setBounds(755, 380, 90, 40);
/* 309 */     boutonNoir.setBorderPainted(false);
/* 310 */     boutonNoir.setFocusPainted(false);
/*     */     
/* 312 */     setVisible(true);
/* 313 */     this.panelVNB.setVisible(false);
/* 314 */     boutonBlanc.setVisible(false);
/* 315 */     boutonNoir.setVisible(false);
/*     */   }
/*     */   
/*     */   public void victoireVisible() {
/* 319 */     this.panelVNB.setVisible(true);
/* 320 */     boutonBlanc.setVisible(true);
/* 321 */     boutonNoir.setVisible(true);
/*     */   }
/*     */   
/*     */   private class EvenementsSouris extends MouseAdapter {
/*     */     private EvenementsSouris() {}
/*     */     
/*     */     public void mouseEntered(MouseEvent event) {
/* 328 */       if (event.getSource() == FinDePartie.boutonAbandon) {
/* 329 */         FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 330 */         Fenetre.surLeBouton = true;
/* 331 */         int a = 50, b = 240, c = 200, d = 100;
/* 332 */         for (int i = 1; i < 6; i++) {
/* 333 */           a--; b--; c += 2; d += 2;
/* 334 */           FinDePartie.boutonAbandon.setBounds(a, b, c, d);
/*     */         } 
/* 336 */       } else if (event.getSource() == FinDePartie.boutonPat) {
/* 337 */         FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 338 */         Fenetre.surLeBouton = true;
/* 339 */         int a = 350, b = 240, c = 200, d = 100;
/* 340 */         for (int i = 1; i < 6; i++) {
/* 341 */           a--; b--; c += 2; d += 2;
/* 342 */           FinDePartie.boutonPat.setBounds(a, b, c, d);
/*     */         } 
/* 344 */       } else if (event.getSource() == FinDePartie.boutonEchecEtMat) {
/* 345 */         FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 346 */         Fenetre.surLeBouton = true;
/* 347 */         int a = 650, b = 240, c = 200, d = 100;
/* 348 */         for (int i = 1; i < 6; i++) {
/* 349 */           a--; b--; c += 2; d += 2;
/* 350 */           FinDePartie.boutonEchecEtMat.setBounds(a, b, c, d);
/*     */         } 
/* 352 */       } else if (event.getSource() == FinDePartie.boutonBlanc) {
/* 353 */         FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 354 */         Fenetre.surLeBouton = true;
/* 355 */         int a = 655, b = 380, c = 90, d = 40;
/* 356 */         for (int i = 1; i < 6; i++) {
/* 357 */           a--; b--; c += 2; d += 2;
/* 358 */           FinDePartie.boutonBlanc.setBounds(a, b, c, d);
/*     */         } 
/* 360 */       } else if (event.getSource() == FinDePartie.boutonNoir) {
/* 361 */         FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 362 */         Fenetre.surLeBouton = true;
/* 363 */         int a = 755, b = 380, c = 90, d = 40;
/* 364 */         for (int i = 1; i < 6; i++) {
/* 365 */           a--; b--; c += 2; d += 2;
/* 366 */           FinDePartie.boutonNoir.setBounds(a, b, c, d);
/*     */         } 
/* 368 */       } else if (event.getSource() == FinDePartie.boutonAnnuler) {
/* 369 */         FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 370 */         Fenetre.surLeBouton = true;
/* 371 */         int a = 360, b = 395, c = 180, d = 60;
/* 372 */         for (int i = 1; i < 6; i++) {
/* 373 */           a--; b--; c += 2; d += 2;
/* 374 */           FinDePartie.boutonAnnuler.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseExited(MouseEvent event) {
/* 381 */       if (event.getSource() == FinDePartie.boutonAbandon) {
/* 382 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 383 */         Fenetre.surLeBouton = false;
/* 384 */         int a = 45, b = 235, c = 210, d = 110;
/* 385 */         for (int i = 1; i < 6; i++) {
/* 386 */           a++; b++; c -= 2; d -= 2;
/* 387 */           FinDePartie.boutonAbandon.setBounds(a, b, c, d);
/*     */         } 
/* 389 */       } else if (event.getSource() == FinDePartie.boutonPat) {
/* 390 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 391 */         Fenetre.surLeBouton = false;
/* 392 */         int a = 345, b = 235, c = 210, d = 110;
/* 393 */         for (int i = 1; i < 6; i++) {
/* 394 */           a++; b++; c -= 2; d -= 2;
/* 395 */           FinDePartie.boutonPat.setBounds(a, b, c, d);
/*     */         } 
/* 397 */       } else if (event.getSource() == FinDePartie.boutonEchecEtMat) {
/* 398 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 399 */         Fenetre.surLeBouton = false;
/* 400 */         int a = 645, b = 235, c = 210, d = 110;
/* 401 */         for (int i = 1; i < 6; i++) {
/* 402 */           a++; b++; c -= 2; d -= 2;
/* 403 */           FinDePartie.boutonEchecEtMat.setBounds(a, b, c, d);
/*     */         } 
/* 405 */       } else if (event.getSource() == FinDePartie.boutonBlanc) {
/* 406 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 407 */         Fenetre.surLeBouton = false;
/* 408 */         int a = 650, b = 375, c = 100, d = 50;
/* 409 */         for (int i = 1; i < 6; i++) {
/* 410 */           a++; b++; c -= 2; d -= 2;
/* 411 */           FinDePartie.boutonBlanc.setBounds(a, b, c, d);
/*     */         } 
/* 413 */       } else if (event.getSource() == FinDePartie.boutonNoir) {
/* 414 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 415 */         Fenetre.surLeBouton = false;
/* 416 */         int a = 750, b = 375, c = 100, d = 50;
/* 417 */         for (int i = 1; i < 6; i++) {
/* 418 */           a++; b++; c -= 2; d -= 2;
/* 419 */           FinDePartie.boutonNoir.setBounds(a, b, c, d);
/*     */         } 
/* 421 */       } else if (event.getSource() == FinDePartie.boutonAnnuler) {
/* 422 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 423 */         Fenetre.surLeBouton = false;
/* 424 */         int a = 355, b = 390, c = 190, d = 70;
/* 425 */         for (int i = 1; i < 6; i++) {
/* 426 */           a++; b++; c -= 2; d -= 2;
/* 427 */           FinDePartie.boutonAnnuler.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mousePressed(MouseEvent event) {
/* 434 */       if (event.getSource() == FinDePartie.boutonAbandon) {
/* 435 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 436 */         Fenetre.surLeBouton = false;
/* 437 */         int a = 45, b = 235, c = 210, d = 110;
/* 438 */         for (int i = 1; i < 6; i++) {
/* 439 */           a++; b++; c -= 2; d -= 2;
/* 440 */           FinDePartie.boutonAbandon.setBounds(a, b, c, d);
/*     */         } 
/* 442 */       } else if (event.getSource() == FinDePartie.boutonPat) {
/* 443 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 444 */         Fenetre.surLeBouton = false;
/* 445 */         int a = 345, b = 235, c = 210, d = 110;
/* 446 */         for (int i = 1; i < 6; i++) {
/* 447 */           a++; b++; c -= 2; d -= 2;
/* 448 */           FinDePartie.boutonPat.setBounds(a, b, c, d);
/*     */         } 
/* 450 */       } else if (event.getSource() == FinDePartie.boutonEchecEtMat) {
/* 451 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 452 */         Fenetre.surLeBouton = false;
/* 453 */         int a = 645, b = 235, c = 210, d = 110;
/* 454 */         for (int i = 1; i < 6; i++) {
/* 455 */           a++; b++; c -= 2; d -= 2;
/* 456 */           FinDePartie.boutonEchecEtMat.setBounds(a, b, c, d);
/*     */         } 
/* 458 */       } else if (event.getSource() == FinDePartie.boutonBlanc) {
/* 459 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 460 */         Fenetre.surLeBouton = false;
/* 461 */         int a = 650, b = 375, c = 100, d = 50;
/* 462 */         for (int i = 1; i < 6; i++) {
/* 463 */           a++; b++; c -= 2; d -= 2;
/* 464 */           FinDePartie.boutonBlanc.setBounds(a, b, c, d);
/*     */         } 
/* 466 */       } else if (event.getSource() == FinDePartie.boutonNoir) {
/* 467 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 468 */         Fenetre.surLeBouton = false;
/* 469 */         int a = 750, b = 375, c = 100, d = 50;
/* 470 */         for (int i = 1; i < 6; i++) {
/* 471 */           a++; b++; c -= 2; d -= 2;
/* 472 */           FinDePartie.boutonNoir.setBounds(a, b, c, d);
/*     */         } 
/* 474 */       } else if (event.getSource() == FinDePartie.boutonAnnuler) {
/* 475 */         FinDePartie.this.setCursor(Cursor.getDefaultCursor());
/* 476 */         Fenetre.surLeBouton = false;
/* 477 */         int a = 355, b = 390, c = 190, d = 70;
/* 478 */         for (int i = 1; i < 6; i++) {
/* 479 */           a++; b++; c -= 2; d -= 2;
/* 480 */           FinDePartie.boutonAnnuler.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseReleased(MouseEvent event) {
/* 487 */       if (event.getSource() == FinDePartie.boutonAbandon) {
/* 488 */         if (event.getX() > 0 && event.getX() < FinDePartie.boutonAbandon.getWidth() && event.getY() > 0 && event.getY() < FinDePartie.boutonAbandon.getHeight()) {
/* 489 */           FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 490 */           Fenetre.surLeBouton = true;
/* 491 */           int a = 50, b = 240, c = 200, d = 100;
/* 492 */           for (int i = 1; i < 6; i++) {
/* 493 */             a--; b--; c += 2; d += 2;
/* 494 */             FinDePartie.boutonAbandon.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 497 */       } else if (event.getSource() == FinDePartie.boutonPat) {
/* 498 */         if (event.getX() > 0 && event.getX() < FinDePartie.boutonPat.getWidth() && event.getY() > 0 && event.getY() < FinDePartie.boutonPat.getHeight()) {
/* 499 */           FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 500 */           Fenetre.surLeBouton = true;
/* 501 */           int a = 350, b = 240, c = 200, d = 100;
/* 502 */           for (int i = 1; i < 6; i++) {
/* 503 */             a--; b--; c += 2; d += 2;
/* 504 */             FinDePartie.boutonPat.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 507 */       } else if (event.getSource() == FinDePartie.boutonEchecEtMat) {
/* 508 */         if (event.getX() > 0 && event.getX() < FinDePartie.boutonEchecEtMat.getWidth() && event.getY() > 0 && event.getY() < FinDePartie.boutonEchecEtMat.getHeight()) {
/* 509 */           FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 510 */           Fenetre.surLeBouton = true;
/* 511 */           int a = 650, b = 240, c = 200, d = 100;
/* 512 */           for (int i = 1; i < 6; i++) {
/* 513 */             a--; b--; c += 2; d += 2;
/* 514 */             FinDePartie.boutonEchecEtMat.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 517 */       } else if (event.getSource() == FinDePartie.boutonBlanc) {
/* 518 */         if (event.getX() > 0 && event.getX() < FinDePartie.boutonBlanc.getWidth() && event.getY() > 0 && event.getY() < FinDePartie.boutonBlanc.getHeight()) {
/* 519 */           FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 520 */           Fenetre.surLeBouton = true;
/* 521 */           int a = 655, b = 380, c = 90, d = 40;
/* 522 */           for (int i = 1; i < 6; i++) {
/* 523 */             a--; b--; c += 2; d += 2;
/* 524 */             FinDePartie.boutonBlanc.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 527 */       } else if (event.getSource() == FinDePartie.boutonNoir) {
/* 528 */         if (event.getX() > 0 && event.getX() < FinDePartie.boutonNoir.getWidth() && event.getY() > 0 && event.getY() < FinDePartie.boutonNoir.getHeight()) {
/* 529 */           FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 530 */           Fenetre.surLeBouton = true;
/* 531 */           int a = 755, b = 380, c = 90, d = 40;
/* 532 */           for (int i = 1; i < 6; i++) {
/* 533 */             a--; b--; c += 2; d += 2;
/* 534 */             FinDePartie.boutonNoir.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 537 */       } else if (event.getSource() == FinDePartie.boutonAnnuler && 
/* 538 */         event.getX() > 0 && event.getX() < FinDePartie.boutonAnnuler.getWidth() && event.getY() > 0 && event.getY() < FinDePartie.boutonAnnuler.getHeight()) {
/* 539 */         FinDePartie.this.setCursor(Cursor.getPredefinedCursor(12));
/* 540 */         Fenetre.surLeBouton = true;
/* 541 */         int a = 360, b = 395, c = 180, d = 60;
/* 542 */         for (int i = 1; i < 6; i++) {
/* 543 */           a--; b--; c += 2; d += 2;
/* 544 */           FinDePartie.boutonAnnuler.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\FinDePartie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */