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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Parametres
/*     */   extends JFrame
/*     */ {
/*  42 */   private JPanel panelPrincipalParametres = new JPanel();
/*  43 */   private JPanel panelTitre = new JPanel();
/*  44 */   private JPanel panelSonTitre = new JPanel();
/*  45 */   private JPanel panelEchiquierTitre = new JPanel();
/*  46 */   private JLabel labelTitre = new JLabel("PARAMÈTRES");
/*  47 */   private JLabel labelSon = new JLabel("Son : ");
/*  48 */   private JLabel labelEchiquier = new JLabel("Échiquier : ");
/*  49 */   private Font policeTitre = new Font("Arial", 1, 60);
/*  50 */   private Font policeLabels = new Font("Arial", 1, 30);
/*     */   
/*  52 */   static JButton boutonValider = new BoutonRond("Fenetre.getRessourceAsBytes(\"valider.png\")");
/*  53 */   static JButton orangeBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"orangeBouton.png\")");
/*  54 */   static JButton vertBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"vertBouton.png\")");
/*  55 */   static JButton marronBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"marronBouton.png\")");
/*  56 */   static JButton bleuBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"bleuBouton.png\")");
/*  57 */   static JButton violetBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"violetBouton.png\")");
/*  58 */   static JButton grisBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"grisBouton.png\")");
/*  59 */   static JButton turquoiseBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"turquoiseBouton.png\")");
/*  60 */   static JButton rougeBouton = new BoutonRond("Fenetre.getRessourceAsBytes(\"rougeBouton.png\")");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Parametres() {
/*     */     try {
/*  69 */       jbInit();
/*  70 */     } catch (Exception e) {
/*  71 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jbInit() throws Exception {
/*  81 */     setIconImage((new ImageIcon(Fenetre.getRessourceAsBytes("icon.png"))).getImage());
/*     */ 
/*     */     
/*  84 */     setSize(850, 700);
/*  85 */     setTitle("Paramètres");
/*  86 */     setUndecorated(true);
/*  87 */     setDefaultCloseOperation(2);
/*  88 */     setLocationRelativeTo(null);
/*  89 */     setResizable(false);
/*  90 */     setContentPane(this.panelPrincipalParametres);
/*     */ 
/*     */     
/*  93 */     EvenementsSouris gestEvent = new EvenementsSouris(null);
/*  94 */     boutonValider.addMouseListener(gestEvent);
/*  95 */     boutonValider.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  97 */             Fenetre.boutonLancer.setEnabled(true);
/*  98 */             Fenetre.boutonPause.setEnabled(false);
/*  99 */             Fenetre.lancerEnable = true;
/* 100 */             Fenetre.pauseEnable = false;
/* 101 */             Fenetre.champTemps.setText("Jeu en Pause");
/*     */             
/* 103 */             Parametres.this.dispose();
/*     */           }
/*     */         });
/* 106 */     orangeBouton.addMouseListener(gestEvent);
/* 107 */     orangeBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 109 */             Fenetre.couleurPrincipale = "orange";
/* 110 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/* 113 */     vertBouton.addMouseListener(gestEvent);
/* 114 */     vertBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 116 */             Fenetre.couleurPrincipale = "vert";
/* 117 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/* 120 */     marronBouton.addMouseListener(gestEvent);
/* 121 */     marronBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 123 */             Fenetre.couleurPrincipale = "marron";
/* 124 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/* 127 */     bleuBouton.addMouseListener(gestEvent);
/* 128 */     bleuBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 130 */             Fenetre.couleurPrincipale = "bleu";
/* 131 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/* 134 */     violetBouton.addMouseListener(gestEvent);
/* 135 */     violetBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 137 */             Fenetre.couleurPrincipale = "violet";
/* 138 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/* 141 */     grisBouton.addMouseListener(gestEvent);
/* 142 */     grisBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 144 */             Fenetre.couleurPrincipale = "gris";
/* 145 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/* 148 */     turquoiseBouton.addMouseListener(gestEvent);
/* 149 */     turquoiseBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 151 */             Fenetre.couleurPrincipale = "turquoise";
/* 152 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/* 155 */     rougeBouton.addMouseListener(gestEvent);
/* 156 */     rougeBouton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 158 */             Fenetre.couleurPrincipale = "rouge";
/* 159 */             Fenetre.setCouleurEchiquier();
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 164 */     this.panelPrincipalParametres.setBackground(new Color(100, 100, 100));
/* 165 */     this.panelPrincipalParametres.setLayout((LayoutManager)null);
/* 166 */     this.panelPrincipalParametres.add(this.panelTitre, (Object)null);
/* 167 */     this.panelPrincipalParametres.add(this.panelSonTitre, (Object)null);
/* 168 */     this.panelPrincipalParametres.add(this.panelEchiquierTitre, (Object)null);
/* 169 */     this.panelPrincipalParametres.add(boutonValider, (Object)null);
/* 170 */     this.panelPrincipalParametres.add(orangeBouton, (Object)null);
/* 171 */     this.panelPrincipalParametres.add(vertBouton, (Object)null);
/* 172 */     this.panelPrincipalParametres.add(marronBouton, (Object)null);
/* 173 */     this.panelPrincipalParametres.add(bleuBouton, (Object)null);
/* 174 */     this.panelPrincipalParametres.add(violetBouton, (Object)null);
/* 175 */     this.panelPrincipalParametres.add(grisBouton, (Object)null);
/* 176 */     this.panelPrincipalParametres.add(turquoiseBouton, (Object)null);
/* 177 */     this.panelPrincipalParametres.add(rougeBouton, (Object)null);
/*     */ 
/*     */     
/* 180 */     this.panelTitre.setBackground(new Color(100, 100, 100));
/* 181 */     this.panelTitre.setBounds(0, 0, 850, 70);
/* 182 */     this.panelTitre.add(this.labelTitre);
/* 183 */     this.labelTitre.setForeground(Color.white);
/* 184 */     this.labelTitre.setFont(this.policeTitre);
/*     */ 
/*     */     
/* 187 */     this.panelSonTitre.setBackground(new Color(100, 100, 100));
/* 188 */     this.panelSonTitre.add(this.labelSon, (Object)null);
/*     */     
/* 190 */     this.panelSonTitre.setBounds(10, 70, 112, 100);
/* 191 */     this.labelSon.setHorizontalAlignment(2);
/* 192 */     this.labelSon.setForeground(Color.white);
/* 193 */     this.labelSon.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 196 */     this.panelEchiquierTitre.setBackground(new Color(100, 100, 100));
/* 197 */     this.panelEchiquierTitre.add(this.labelEchiquier, (Object)null);
/* 198 */     this.panelEchiquierTitre.setBounds(10, 235, 200, 40);
/* 199 */     this.labelEchiquier.setHorizontalAlignment(2);
/* 200 */     this.labelEchiquier.setForeground(Color.white);
/* 201 */     this.labelEchiquier.setFont(this.policeLabels);
/*     */ 
/*     */     
/* 204 */     orangeBouton.setBounds(60, 285, 150, 150);
/* 205 */     orangeBouton.setBorderPainted(false);
/* 206 */     orangeBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 209 */     vertBouton.setBounds(250, 285, 150, 150);
/* 210 */     vertBouton.setBorderPainted(false);
/* 211 */     vertBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 214 */     marronBouton.setBounds(445, 285, 150, 150);
/* 215 */     marronBouton.setBorderPainted(false);
/* 216 */     marronBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 219 */     bleuBouton.setBounds(640, 285, 150, 150);
/* 220 */     bleuBouton.setBorderPainted(false);
/* 221 */     bleuBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 224 */     violetBouton.setBounds(60, 460, 150, 150);
/* 225 */     violetBouton.setBorderPainted(false);
/* 226 */     violetBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 229 */     grisBouton.setBounds(250, 460, 150, 150);
/* 230 */     grisBouton.setBorderPainted(false);
/* 231 */     grisBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 234 */     turquoiseBouton.setBounds(445, 460, 150, 150);
/* 235 */     turquoiseBouton.setBorderPainted(false);
/* 236 */     turquoiseBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 239 */     rougeBouton.setBounds(640, 460, 150, 150);
/* 240 */     rougeBouton.setBorderPainted(false);
/* 241 */     rougeBouton.setFocusPainted(false);
/*     */ 
/*     */     
/* 244 */     boutonValider.setBounds(335, 630, 180, 60);
/* 245 */     boutonValider.setBorderPainted(false);
/* 246 */     boutonValider.setFocusPainted(false);
/*     */     
/* 248 */     setVisible(true);
/*     */   }
/*     */   
/*     */   private class EvenementsSouris extends MouseAdapter {
/*     */     private EvenementsSouris() {}
/*     */     
/*     */     public void mouseEntered(MouseEvent event) {
/* 255 */       if (event.getSource() == Parametres.boutonValider) {
/* 256 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 257 */         Fenetre.surLeBouton = true;
/* 258 */         int a = 335, b = 630, c = 180, d = 60;
/* 259 */         for (int i = 1; i < 6; i++) {
/* 260 */           a--; b--; c += 2; d += 2;
/* 261 */           Parametres.boutonValider.setBounds(a, b, c, d);
/*     */         } 
/* 263 */       } else if (event.getSource() == Parametres.orangeBouton) {
/* 264 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 265 */         Fenetre.surLeBouton = true;
/* 266 */         int a = 60, b = 285, c = 150, d = 150;
/* 267 */         for (int i = 1; i < 6; i++) {
/* 268 */           a--; b--; c += 2; d += 2;
/* 269 */           Parametres.orangeBouton.setBounds(a, b, c, d);
/*     */         } 
/* 271 */       } else if (event.getSource() == Parametres.vertBouton) {
/* 272 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 273 */         Fenetre.surLeBouton = true;
/* 274 */         int a = 250, b = 285, c = 150, d = 150;
/* 275 */         for (int i = 1; i < 6; i++) {
/* 276 */           a--; b--; c += 2; d += 2;
/* 277 */           Parametres.vertBouton.setBounds(a, b, c, d);
/*     */         } 
/* 279 */       } else if (event.getSource() == Parametres.marronBouton) {
/* 280 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 281 */         Fenetre.surLeBouton = true;
/* 282 */         int a = 445, b = 285, c = 150, d = 150;
/* 283 */         for (int i = 1; i < 6; i++) {
/* 284 */           a--; b--; c += 2; d += 2;
/* 285 */           Parametres.marronBouton.setBounds(a, b, c, d);
/*     */         } 
/* 287 */       } else if (event.getSource() == Parametres.bleuBouton) {
/* 288 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 289 */         Fenetre.surLeBouton = true;
/* 290 */         int a = 640, b = 285, c = 150, d = 150;
/* 291 */         for (int i = 1; i < 6; i++) {
/* 292 */           a--; b--; c += 2; d += 2;
/* 293 */           Parametres.bleuBouton.setBounds(a, b, c, d);
/*     */         } 
/* 295 */       } else if (event.getSource() == Parametres.violetBouton) {
/* 296 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 297 */         Fenetre.surLeBouton = true;
/* 298 */         int a = 60, b = 460, c = 150, d = 150;
/* 299 */         for (int i = 1; i < 6; i++) {
/* 300 */           a--; b--; c += 2; d += 2;
/* 301 */           Parametres.violetBouton.setBounds(a, b, c, d);
/*     */         } 
/* 303 */       } else if (event.getSource() == Parametres.grisBouton) {
/* 304 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 305 */         Fenetre.surLeBouton = true;
/* 306 */         int a = 250, b = 460, c = 150, d = 150;
/* 307 */         for (int i = 1; i < 6; i++) {
/* 308 */           a--; b--; c += 2; d += 2;
/* 309 */           Parametres.grisBouton.setBounds(a, b, c, d);
/*     */         } 
/* 311 */       } else if (event.getSource() == Parametres.turquoiseBouton) {
/* 312 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 313 */         Fenetre.surLeBouton = true;
/* 314 */         int a = 445, b = 460, c = 150, d = 150;
/* 315 */         for (int i = 1; i < 6; i++) {
/* 316 */           a--; b--; c += 2; d += 2;
/* 317 */           Parametres.turquoiseBouton.setBounds(a, b, c, d);
/*     */         } 
/* 319 */       } else if (event.getSource() == Parametres.rougeBouton) {
/* 320 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 321 */         Fenetre.surLeBouton = true;
/* 322 */         int a = 640, b = 460, c = 150, d = 150;
/* 323 */         for (int i = 1; i < 6; i++) {
/* 324 */           a--; b--; c += 2; d += 2;
/* 325 */           Parametres.rougeBouton.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseExited(MouseEvent event) {
/* 332 */       if (event.getSource() == Parametres.boutonValider) {
/* 333 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 334 */         Fenetre.surLeBouton = false;
/* 335 */         int a = 330, b = 625, c = 190, d = 70;
/* 336 */         for (int i = 1; i < 6; i++) {
/* 337 */           a++; b++; c -= 2; d -= 2;
/* 338 */           Parametres.boutonValider.setBounds(a, b, c, d);
/*     */         } 
/* 340 */       } else if (event.getSource() == Parametres.orangeBouton) {
/* 341 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 342 */         Fenetre.surLeBouton = true;
/* 343 */         int a = 55, b = 280, c = 160, d = 160;
/* 344 */         for (int i = 1; i < 6; i++) {
/* 345 */           a++; b++; c -= 2; d -= 2;
/* 346 */           Parametres.orangeBouton.setBounds(a, b, c, d);
/*     */         } 
/* 348 */       } else if (event.getSource() == Parametres.vertBouton) {
/* 349 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 350 */         Fenetre.surLeBouton = true;
/* 351 */         int a = 245, b = 280, c = 160, d = 160;
/* 352 */         for (int i = 1; i < 6; i++) {
/* 353 */           a++; b++; c -= 2; d -= 2;
/* 354 */           Parametres.vertBouton.setBounds(a, b, c, d);
/*     */         } 
/* 356 */       } else if (event.getSource() == Parametres.marronBouton) {
/* 357 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 358 */         Fenetre.surLeBouton = true;
/* 359 */         int a = 440, b = 280, c = 160, d = 160;
/* 360 */         for (int i = 1; i < 6; i++) {
/* 361 */           a++; b++; c -= 2; d -= 2;
/* 362 */           Parametres.marronBouton.setBounds(a, b, c, d);
/*     */         } 
/* 364 */       } else if (event.getSource() == Parametres.bleuBouton) {
/* 365 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 366 */         Fenetre.surLeBouton = true;
/* 367 */         int a = 635, b = 280, c = 160, d = 160;
/* 368 */         for (int i = 1; i < 6; i++) {
/* 369 */           a++; b++; c -= 2; d -= 2;
/* 370 */           Parametres.bleuBouton.setBounds(a, b, c, d);
/*     */         } 
/* 372 */       } else if (event.getSource() == Parametres.violetBouton) {
/* 373 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 374 */         Fenetre.surLeBouton = true;
/* 375 */         int a = 55, b = 455, c = 160, d = 160;
/* 376 */         for (int i = 1; i < 6; i++) {
/* 377 */           a++; b++; c -= 2; d -= 2;
/* 378 */           Parametres.violetBouton.setBounds(a, b, c, d);
/*     */         } 
/* 380 */       } else if (event.getSource() == Parametres.grisBouton) {
/* 381 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 382 */         Fenetre.surLeBouton = true;
/* 383 */         int a = 245, b = 455, c = 160, d = 160;
/* 384 */         for (int i = 1; i < 6; i++) {
/* 385 */           a++; b++; c -= 2; d -= 2;
/* 386 */           Parametres.grisBouton.setBounds(a, b, c, d);
/*     */         } 
/* 388 */       } else if (event.getSource() == Parametres.turquoiseBouton) {
/* 389 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 390 */         Fenetre.surLeBouton = true;
/* 391 */         int a = 440, b = 455, c = 160, d = 160;
/* 392 */         for (int i = 1; i < 6; i++) {
/* 393 */           a++; b++; c -= 2; d -= 2;
/* 394 */           Parametres.turquoiseBouton.setBounds(a, b, c, d);
/*     */         } 
/* 396 */       } else if (event.getSource() == Parametres.rougeBouton) {
/* 397 */         Parametres.this.setCursor(Cursor.getDefaultCursor());
/* 398 */         Fenetre.surLeBouton = true;
/* 399 */         int a = 635, b = 455, c = 160, d = 160;
/* 400 */         for (int i = 1; i < 6; i++) {
/* 401 */           a++; b++; c -= 2; d -= 2;
/* 402 */           Parametres.rougeBouton.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mousePressed(MouseEvent event) {
/* 409 */       if (event.getSource() == Parametres.boutonValider) {
/* 410 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 411 */         Fenetre.surLeBouton = false;
/* 412 */         int a = 330, b = 625, c = 190, d = 70;
/* 413 */         for (int i = 1; i < 6; i++) {
/* 414 */           a++; b++; c -= 2; d -= 2;
/* 415 */           Parametres.boutonValider.setBounds(a, b, c, d);
/*     */         } 
/* 417 */       } else if (event.getSource() == Parametres.orangeBouton) {
/* 418 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 419 */         Fenetre.surLeBouton = true;
/* 420 */         int a = 55, b = 280, c = 160, d = 160;
/* 421 */         for (int i = 1; i < 6; i++) {
/* 422 */           a--; b--; c += 2; d += 2;
/* 423 */           Parametres.orangeBouton.setBounds(a, b, c, d);
/*     */         } 
/* 425 */       } else if (event.getSource() == Parametres.vertBouton) {
/* 426 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 427 */         Fenetre.surLeBouton = true;
/* 428 */         int a = 245, b = 280, c = 160, d = 160;
/* 429 */         for (int i = 1; i < 6; i++) {
/* 430 */           a--; b--; c += 2; d += 2;
/* 431 */           Parametres.vertBouton.setBounds(a, b, c, d);
/*     */         } 
/* 433 */       } else if (event.getSource() == Parametres.marronBouton) {
/* 434 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 435 */         Fenetre.surLeBouton = true;
/* 436 */         int a = 440, b = 280, c = 160, d = 160;
/* 437 */         for (int i = 1; i < 6; i++) {
/* 438 */           a--; b--; c += 2; d += 2;
/* 439 */           Parametres.marronBouton.setBounds(a, b, c, d);
/*     */         } 
/* 441 */       } else if (event.getSource() == Parametres.bleuBouton) {
/* 442 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 443 */         Fenetre.surLeBouton = true;
/* 444 */         int a = 635, b = 280, c = 160, d = 160;
/* 445 */         for (int i = 1; i < 6; i++) {
/* 446 */           a--; b--; c += 2; d += 2;
/* 447 */           Parametres.bleuBouton.setBounds(a, b, c, d);
/*     */         } 
/* 449 */       } else if (event.getSource() == Parametres.violetBouton) {
/* 450 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 451 */         Fenetre.surLeBouton = true;
/* 452 */         int a = 55, b = 455, c = 160, d = 160;
/* 453 */         for (int i = 1; i < 6; i++) {
/* 454 */           a--; b--; c += 2; d += 2;
/* 455 */           Parametres.violetBouton.setBounds(a, b, c, d);
/*     */         } 
/* 457 */       } else if (event.getSource() == Parametres.grisBouton) {
/* 458 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 459 */         Fenetre.surLeBouton = true;
/* 460 */         int a = 245, b = 455, c = 160, d = 160;
/* 461 */         for (int i = 1; i < 6; i++) {
/* 462 */           a--; b--; c += 2; d += 2;
/* 463 */           Parametres.grisBouton.setBounds(a, b, c, d);
/*     */         } 
/* 465 */       } else if (event.getSource() == Parametres.turquoiseBouton) {
/* 466 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 467 */         Fenetre.surLeBouton = true;
/* 468 */         int a = 440, b = 455, c = 160, d = 160;
/* 469 */         for (int i = 1; i < 6; i++) {
/* 470 */           a--; b--; c += 2; d += 2;
/* 471 */           Parametres.turquoiseBouton.setBounds(a, b, c, d);
/*     */         } 
/* 473 */       } else if (event.getSource() == Parametres.rougeBouton) {
/* 474 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 475 */         Fenetre.surLeBouton = true;
/* 476 */         int a = 635, b = 455, c = 160, d = 160;
/* 477 */         for (int i = 1; i < 6; i++) {
/* 478 */           a--; b--; c += 2; d += 2;
/* 479 */           Parametres.rougeBouton.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseReleased(MouseEvent event) {
/* 486 */       if (event.getSource() == Parametres.boutonValider) {
/* 487 */         if (event.getX() > 0 && event.getX() < Parametres.boutonValider.getWidth() && event.getY() > 0 && event.getY() < Parametres.boutonValider.getHeight()) {
/* 488 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 489 */           Fenetre.surLeBouton = true;
/* 490 */           int a = 335, b = 630, c = 180, d = 60;
/* 491 */           for (int i = 1; i < 6; i++) {
/* 492 */             a--; b--; c += 2; d += 2;
/* 493 */             Parametres.boutonValider.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 496 */       } else if (event.getSource() == Parametres.orangeBouton) {
/* 497 */         if (event.getX() > 0 && event.getX() < Parametres.orangeBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.orangeBouton.getHeight()) {
/* 498 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 499 */           Fenetre.surLeBouton = true;
/* 500 */           int a = 60, b = 285, c = 150, d = 150;
/* 501 */           for (int i = 1; i < 6; i++) {
/* 502 */             a--; b--; c += 2; d += 2;
/* 503 */             Parametres.orangeBouton.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 506 */       } else if (event.getSource() == Parametres.vertBouton) {
/* 507 */         if (event.getX() > 0 && event.getX() < Parametres.vertBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.vertBouton.getHeight()) {
/* 508 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 509 */           Fenetre.surLeBouton = true;
/* 510 */           int a = 250, b = 285, c = 150, d = 150;
/* 511 */           for (int i = 1; i < 6; i++) {
/* 512 */             a--; b--; c += 2; d += 2;
/* 513 */             Parametres.vertBouton.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 516 */       } else if (event.getSource() == Parametres.marronBouton) {
/* 517 */         if (event.getX() > 0 && event.getX() < Parametres.marronBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.marronBouton.getHeight()) {
/* 518 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 519 */           Fenetre.surLeBouton = true;
/* 520 */           int a = 445, b = 285, c = 150, d = 150;
/* 521 */           for (int i = 1; i < 6; i++) {
/* 522 */             a--; b--; c += 2; d += 2;
/* 523 */             Parametres.marronBouton.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 526 */       } else if (event.getSource() == Parametres.bleuBouton) {
/* 527 */         if (event.getX() > 0 && event.getX() < Parametres.bleuBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.bleuBouton.getHeight()) {
/* 528 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 529 */           Fenetre.surLeBouton = true;
/* 530 */           int a = 640, b = 285, c = 150, d = 150;
/* 531 */           for (int i = 1; i < 6; i++) {
/* 532 */             a--; b--; c += 2; d += 2;
/* 533 */             Parametres.bleuBouton.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 536 */       } else if (event.getSource() == Parametres.violetBouton) {
/* 537 */         if (event.getX() > 0 && event.getX() < Parametres.violetBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.violetBouton.getHeight()) {
/* 538 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 539 */           Fenetre.surLeBouton = true;
/* 540 */           int a = 60, b = 460, c = 150, d = 150;
/* 541 */           for (int i = 1; i < 6; i++) {
/* 542 */             a--; b--; c += 2; d += 2;
/* 543 */             Parametres.violetBouton.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 546 */       } else if (event.getSource() == Parametres.grisBouton) {
/* 547 */         if (event.getX() > 0 && event.getX() < Parametres.grisBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.grisBouton.getHeight()) {
/* 548 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 549 */           Fenetre.surLeBouton = true;
/* 550 */           int a = 250, b = 460, c = 150, d = 150;
/* 551 */           for (int i = 1; i < 6; i++) {
/* 552 */             a--; b--; c += 2; d += 2;
/* 553 */             Parametres.grisBouton.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 556 */       } else if (event.getSource() == Parametres.turquoiseBouton) {
/* 557 */         if (event.getX() > 0 && event.getX() < Parametres.turquoiseBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.turquoiseBouton.getHeight()) {
/* 558 */           Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 559 */           Fenetre.surLeBouton = true;
/* 560 */           int a = 445, b = 460, c = 150, d = 150;
/* 561 */           for (int i = 1; i < 6; i++) {
/* 562 */             a--; b--; c += 2; d += 2;
/* 563 */             Parametres.turquoiseBouton.setBounds(a, b, c, d);
/*     */           } 
/*     */         } 
/* 566 */       } else if (event.getSource() == Parametres.rougeBouton && 
/* 567 */         event.getX() > 0 && event.getX() < Parametres.rougeBouton.getWidth() && event.getY() > 0 && event.getY() < Parametres.rougeBouton.getHeight()) {
/* 568 */         Parametres.this.setCursor(Cursor.getPredefinedCursor(12));
/* 569 */         Fenetre.surLeBouton = true;
/* 570 */         int a = 640, b = 460, c = 150, d = 150;
/* 571 */         for (int i = 1; i < 6; i++) {
/* 572 */           a--; b--; c += 2; d += 2;
/* 573 */           Parametres.rougeBouton.setBounds(a, b, c, d);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public void mouseClicked(MouseEvent event) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Parametres.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */