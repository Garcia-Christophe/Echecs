/*     */ package fr.JeuEchec.christophegarcia;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.GradientPaint;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.geom.RoundRectangle2D;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.JButton;
/*     */ 
/*     */ class BoutonRond
/*     */   extends JButton
/*     */ {
/*     */   private Image img;
/*     */   private String aNameString;
/*     */   
/*     */   public BoutonRond(String aNameString) {
/*  20 */     this.aNameString = aNameString;
/*  21 */     setContentAreaFilled(false);
/*     */     try {
/*  23 */       if (aNameString.equals("Fenetre.getRessourceAsBytes(\"valider.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/valider.png")); }
/*  24 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"play.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/play.png")); }
/*  25 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"pause.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/pause.png")); }
/*  26 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"restart.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/restart.png")); }
/*  27 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"abandonner.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/abandonner.png")); }
/*  28 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"editNom.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/editNom.png")); }
/*  29 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"parametresO.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/parametresO.png")); }
/*  30 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"annuler.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/annuler.png")); }
/*  31 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"abandonnerBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/abandonnerBouton.png")); }
/*  32 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"pat.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/pat.png")); }
/*  33 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"echecEtMat.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/echecEtMat.png")); }
/*  34 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"boutonBlanc.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/boutonBlanc.png")); }
/*  35 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"boutonNoir.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/boutonNoir.png")); }
/*  36 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"orangeBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/orangeBouton.png")); }
/*  37 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"vertBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/vertBouton.png")); }
/*  38 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"marronBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/marronBouton.png")); }
/*  39 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"bleuBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/bleuBouton.png")); }
/*  40 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"violetBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/violetBouton.png")); }
/*  41 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"grisBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/grisBouton.png")); }
/*  42 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"turquoiseBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/turquoiseBouton.png")); }
/*  43 */       else if (aNameString.equals("Fenetre.getRessourceAsBytes(\"rougeBouton.png\")")) { this.img = ImageIO.read(Fenetre.class.getResourceAsStream("/rougeBouton.png")); } 
/*  44 */     } catch (IOException e) {
/*  45 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintComponent(Graphics g) {
/*  51 */     if (this.aNameString == "Fenetre.getRessourceAsBytes(\"valider.png\")") {
/*  52 */       Graphics2D g2d = (Graphics2D)g;
/*  53 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/*  54 */       g2d.clip(r2d);
/*  55 */       Color green = new Color(26, 225, 19);
/*  56 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, green, 60.0F, 60.0F, green);
/*  57 */       g2d.setPaint(gradient);
/*  58 */       if (Fenetre.surLeBouton) {
/*  59 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/*  61 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/*  63 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/*  64 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"play.png\")") {
/*  65 */       Graphics2D g2d = (Graphics2D)g;
/*  66 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/*  67 */       g2d.clip(r2d);
/*  68 */       Color green = new Color(26, 225, 19);
/*  69 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, green, 50.0F, 50.0F, green);
/*  70 */       g2d.setPaint(gradient);
/*  71 */       if (Fenetre.surLeBouton) {
/*  72 */         g2d.fillRect(0, 0, 56, 56);
/*     */       } else {
/*  74 */         g2d.fillRect(0, 0, 50, 50);
/*     */       } 
/*  76 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/*  77 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"pause.png\")") {
/*  78 */       Graphics2D g2d = (Graphics2D)g;
/*  79 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/*  80 */       g2d.clip(r2d);
/*  81 */       Color green = new Color(225, 184, 19);
/*  82 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, green, 50.0F, 50.0F, green);
/*  83 */       g2d.setPaint(gradient);
/*  84 */       if (Fenetre.surLeBouton) {
/*  85 */         g2d.fillRect(0, 0, 56, 56);
/*     */       } else {
/*  87 */         g2d.fillRect(0, 0, 50, 50);
/*     */       } 
/*  89 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/*  90 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"restart.png\")") {
/*  91 */       Graphics2D g2d = (Graphics2D)g;
/*  92 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/*  93 */       g2d.clip(r2d);
/*  94 */       Color red = new Color(225, 19, 19);
/*  95 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, red, 50.0F, 50.0F, red);
/*  96 */       g2d.setPaint(gradient);
/*  97 */       if (Fenetre.surLeBouton) {
/*  98 */         g2d.fillRect(0, 0, 56, 56);
/*     */       } else {
/* 100 */         g2d.fillRect(0, 0, 50, 50);
/*     */       } 
/* 102 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 103 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"abandonner.png\")") {
/* 104 */       Graphics2D g2d = (Graphics2D)g;
/* 105 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/* 106 */       g2d.clip(r2d);
/* 107 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.darkGray, 50.0F, 50.0F, Color.darkGray);
/* 108 */       g2d.setPaint(gradient);
/* 109 */       if (Fenetre.surLeBouton) {
/* 110 */         g2d.fillRect(0, 0, 56, 56);
/*     */       } else {
/* 112 */         g2d.fillRect(0, 0, 50, 50);
/*     */       } 
/* 114 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 115 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"editNom.png\")") {
/* 116 */       Graphics2D g2d = (Graphics2D)g;
/* 117 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 100.0F, 100.0F);
/* 118 */       g2d.clip(r2d);
/* 119 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.darkGray, 50.0F, 50.0F, Color.darkGray);
/* 120 */       g2d.setPaint(gradient);
/* 121 */       if (Fenetre.surLeBouton) {
/* 122 */         g2d.fillRect(0, 0, 56, 56);
/*     */       } else {
/* 124 */         g2d.fillRect(0, 0, 50, 50);
/*     */       } 
/* 126 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 127 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"parametresO.png\")") {
/* 128 */       Graphics2D g2d = (Graphics2D)g;
/* 129 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 100.0F, 100.0F);
/* 130 */       g2d.clip(r2d);
/* 131 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.darkGray, 50.0F, 50.0F, Color.darkGray);
/* 132 */       g2d.setPaint(gradient);
/* 133 */       if (Fenetre.surLeBouton) {
/* 134 */         g2d.fillRect(0, 0, 56, 56);
/*     */       } else {
/* 136 */         g2d.fillRect(0, 0, 50, 50);
/*     */       } 
/* 138 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 139 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"annuler.png\")") {
/* 140 */       Graphics2D g2d = (Graphics2D)g;
/* 141 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/* 142 */       g2d.clip(r2d);
/* 143 */       Color red = new Color(225, 19, 19);
/* 144 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, red, 60.0F, 60.0F, red);
/* 145 */       g2d.setPaint(gradient);
/* 146 */       if (Fenetre.surLeBouton) {
/* 147 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 149 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 151 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 152 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"abandonnerBouton.png\")") {
/* 153 */       Graphics2D g2d = (Graphics2D)g;
/* 154 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/* 155 */       g2d.clip(r2d);
/* 156 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.white, 60.0F, 60.0F, Color.white);
/* 157 */       g2d.setPaint(gradient);
/* 158 */       if (Fenetre.surLeBouton) {
/* 159 */         g2d.fillRect(0, 0, 210, 110);
/*     */       } else {
/* 161 */         g2d.fillRect(0, 0, 200, 100);
/*     */       } 
/* 163 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 164 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"pat.png\")") {
/* 165 */       Graphics2D g2d = (Graphics2D)g;
/* 166 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/* 167 */       g2d.clip(r2d);
/* 168 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.white, 60.0F, 60.0F, Color.white);
/* 169 */       g2d.setPaint(gradient);
/* 170 */       if (Fenetre.surLeBouton) {
/* 171 */         g2d.fillRect(0, 0, 210, 110);
/*     */       } else {
/* 173 */         g2d.fillRect(0, 0, 200, 100);
/*     */       } 
/* 175 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 176 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"echecEtMat.png\")") {
/* 177 */       Graphics2D g2d = (Graphics2D)g;
/* 178 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 25.0F, 25.0F);
/* 179 */       g2d.clip(r2d);
/* 180 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.white, 60.0F, 60.0F, Color.white);
/* 181 */       g2d.setPaint(gradient);
/* 182 */       if (Fenetre.surLeBouton) {
/* 183 */         g2d.fillRect(0, 0, 210, 110);
/*     */       } else {
/* 185 */         g2d.fillRect(0, 0, 200, 100);
/*     */       } 
/* 187 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 188 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"boutonBlanc.png\")") {
/* 189 */       Graphics2D g2d = (Graphics2D)g;
/* 190 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 191 */       g2d.clip(r2d);
/* 192 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.white, 60.0F, 60.0F, Color.white);
/* 193 */       g2d.setPaint(gradient);
/* 194 */       if (Fenetre.surLeBouton) {
/* 195 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 197 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 199 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 200 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"boutonNoir.png\")") {
/* 201 */       Graphics2D g2d = (Graphics2D)g;
/* 202 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 203 */       g2d.clip(r2d);
/* 204 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 205 */       g2d.setPaint(gradient);
/* 206 */       if (Fenetre.surLeBouton) {
/* 207 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 209 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 211 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 212 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"orangeBouton.png\")") {
/* 213 */       Graphics2D g2d = (Graphics2D)g;
/* 214 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 215 */       g2d.clip(r2d);
/* 216 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 217 */       g2d.setPaint(gradient);
/* 218 */       if (Fenetre.surLeBouton) {
/* 219 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 221 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 223 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 224 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"vertBouton.png\")") {
/* 225 */       Graphics2D g2d = (Graphics2D)g;
/* 226 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 227 */       g2d.clip(r2d);
/* 228 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 229 */       g2d.setPaint(gradient);
/* 230 */       if (Fenetre.surLeBouton) {
/* 231 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 233 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 235 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 236 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"marronBouton.png\")") {
/* 237 */       Graphics2D g2d = (Graphics2D)g;
/* 238 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 239 */       g2d.clip(r2d);
/* 240 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 241 */       g2d.setPaint(gradient);
/* 242 */       if (Fenetre.surLeBouton) {
/* 243 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 245 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 247 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 248 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"bleuBouton.png\")") {
/* 249 */       Graphics2D g2d = (Graphics2D)g;
/* 250 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 251 */       g2d.clip(r2d);
/* 252 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 253 */       g2d.setPaint(gradient);
/* 254 */       if (Fenetre.surLeBouton) {
/* 255 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 257 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 259 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 260 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"violetBouton.png\")") {
/* 261 */       Graphics2D g2d = (Graphics2D)g;
/* 262 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 263 */       g2d.clip(r2d);
/* 264 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 265 */       g2d.setPaint(gradient);
/* 266 */       if (Fenetre.surLeBouton) {
/* 267 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 269 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 271 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 272 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"grisBouton.png\")") {
/* 273 */       Graphics2D g2d = (Graphics2D)g;
/* 274 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 275 */       g2d.clip(r2d);
/* 276 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 277 */       g2d.setPaint(gradient);
/* 278 */       if (Fenetre.surLeBouton) {
/* 279 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 281 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 283 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 284 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"turquoiseBouton.png\")") {
/* 285 */       Graphics2D g2d = (Graphics2D)g;
/* 286 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 287 */       g2d.clip(r2d);
/* 288 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 289 */       g2d.setPaint(gradient);
/* 290 */       if (Fenetre.surLeBouton) {
/* 291 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 293 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 295 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/* 296 */     } else if (this.aNameString == "Fenetre.getRessourceAsBytes(\"rougeBouton.png\")") {
/* 297 */       Graphics2D g2d = (Graphics2D)g;
/* 298 */       RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), getHeight(), 15.0F, 15.0F);
/* 299 */       g2d.clip(r2d);
/* 300 */       GradientPaint gradient = new GradientPaint(0.0F, 0.0F, Color.black, 60.0F, 60.0F, Color.black);
/* 301 */       g2d.setPaint(gradient);
/* 302 */       if (Fenetre.surLeBouton) {
/* 303 */         g2d.fillRect(0, 0, 220, 80);
/*     */       } else {
/* 305 */         g2d.fillRect(0, 0, 210, 70);
/*     */       } 
/* 307 */       g2d.drawImage(this.img, 0, 0, getWidth(), getHeight(), this);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\BoutonRond.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */