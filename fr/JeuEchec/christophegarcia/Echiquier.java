/*     */ package fr.JeuEchec.christophegarcia;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import javax.swing.ImageIcon;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Echiquier
/*     */   implements MethodesEchiquier
/*     */ {
/*  12 */   private Case[][] tabCases = new Case[8][8]; public Echiquier() {
/*  13 */     for (int i = 0; i < 8; i++) {
/*  14 */       for (int j = 0; j < 8; j++) {
/*  15 */         this.tabCases[i][j] = new Case();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void preparation() {
/*  21 */     this.tabCases[0][0].setPiece(new Tour("noir"));
/*  22 */     this.tabCases[1][0].setPiece(new Cavalier("noir"));
/*  23 */     this.tabCases[2][0].setPiece(new Fou("noir"));
/*  24 */     this.tabCases[3][0].setPiece(new Reine("noir"));
/*  25 */     this.tabCases[4][0].setPiece(new Roi("noir"));
/*  26 */     this.tabCases[5][0].setPiece(new Fou("noir"));
/*  27 */     this.tabCases[6][0].setPiece(new Cavalier("noir"));
/*  28 */     this.tabCases[7][0].setPiece(new Tour("noir")); int i;
/*  29 */     for (i = 0; i < 8; i++) {
/*  30 */       this.tabCases[i][1].setPiece(new Pion("noir"));
/*     */     }
/*     */     
/*  33 */     this.tabCases[0][7].setPiece(new Tour("blanc"));
/*  34 */     this.tabCases[1][7].setPiece(new Cavalier("blanc"));
/*  35 */     this.tabCases[2][7].setPiece(new Fou("blanc"));
/*  36 */     this.tabCases[3][7].setPiece(new Reine("blanc"));
/*  37 */     this.tabCases[4][7].setPiece(new Roi("blanc"));
/*  38 */     this.tabCases[5][7].setPiece(new Fou("blanc"));
/*  39 */     this.tabCases[6][7].setPiece(new Cavalier("blanc"));
/*  40 */     this.tabCases[7][7].setPiece(new Tour("blanc"));
/*  41 */     for (i = 0; i < 8; i++) {
/*  42 */       this.tabCases[i][6].setPiece(new Pion("blanc"));
/*     */     }
/*     */ 
/*     */     
/*  46 */     Fenetre.tabLabels[0][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("tour-noir.png")));
/*  47 */     Fenetre.tabLabels[1][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("cavalier-noir.png")));
/*  48 */     Fenetre.tabLabels[2][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("fou-noir.png")));
/*  49 */     Fenetre.tabLabels[3][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("reine-noir.png")));
/*  50 */     Fenetre.tabLabels[4][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("roi-noir.png")));
/*  51 */     Fenetre.tabLabels[5][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("fou-noir.png")));
/*  52 */     Fenetre.tabLabels[6][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("cavalier-noir.png")));
/*  53 */     Fenetre.tabLabels[7][0].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("tour-noir.png")));
/*  54 */     for (i = 0; i < 8; ) { Fenetre.tabLabels[i][1].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("pion-noir.png"))); i++; }
/*  55 */      Fenetre.tabLabels[0][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("tour-blanc.png")));
/*  56 */     Fenetre.tabLabels[1][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("cavalier-blanc.png")));
/*  57 */     Fenetre.tabLabels[2][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("fou-blanc.png")));
/*  58 */     Fenetre.tabLabels[3][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("reine-blanc.png")));
/*  59 */     Fenetre.tabLabels[4][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("roi-blanc.png")));
/*  60 */     Fenetre.tabLabels[5][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("fou-blanc.png")));
/*  61 */     Fenetre.tabLabels[6][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("cavalier-blanc.png")));
/*  62 */     Fenetre.tabLabels[7][7].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("tour-blanc.png")));
/*  63 */     for (i = 0; i < 8; ) { Fenetre.tabLabels[i][6].setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("pion-blanc.png"))); i++; }
/*     */   
/*     */   }
/*     */   public Case getCase(int colonne, int ligne) {
/*  67 */     return this.tabCases[colonne][ligne];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cheminPossible(Piece piece, Deplacement deplacement) {
/*  72 */     if (!this.tabCases[deplacement.getArrivee().getColonne()][deplacement.getArrivee().getLigne()].estOccupee(piece.getCouleur())) {
/*     */       
/*  74 */       if (!(piece instanceof Cavalier)) {
/*     */ 
/*     */         
/*  77 */         if (!(piece instanceof Pion)) {
/*     */           
/*  79 */           if (!(piece instanceof Roi)) {
/*     */             
/*  81 */             if (Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) > 1.0D || 
/*  82 */               Math.abs(deplacement.getDeplacementX()) + Math.abs(deplacement.getDeplacementY()) > 1.0D) {
/*     */               
/*  84 */               int jumpX = (deplacement.getDeplacementX() == 0.0D) ? 0 : ((deplacement.getArrivee().getColonne() - deplacement.getDepart().getColonne()) / 
/*  85 */                 Math.abs(deplacement.getArrivee().getColonne() - deplacement.getDepart().getColonne()));
/*  86 */               int jumpY = (deplacement.getDeplacementY() == 0.0D) ? 0 : ((deplacement.getArrivee().getLigne() - deplacement.getDepart().getLigne()) / 
/*  87 */                 Math.abs(deplacement.getArrivee().getLigne() - deplacement.getDepart().getLigne()));
/*     */ 
/*     */               
/*  90 */               int incX = deplacement.getDepart().getColonne() + jumpX, incY = deplacement.getDepart().getLigne() + jumpY;
/*  91 */               for (; incX != deplacement.getArrivee().getColonne() || incY != deplacement.getArrivee().getLigne(); 
/*  92 */                 incX += jumpX, incY += jumpY) {
/*  93 */                 if (this.tabCases[incX][incY].estOccupee()) return false;
/*     */               
/*     */               } 
/*  96 */               return true;
/*     */             } 
/*     */ 
/*     */             
/* 100 */             return true;
/*     */           } 
/*     */ 
/*     */           
/* 104 */           boolean presenceRoiAdverse = false;
/* 105 */           ArrayList<Position> casesRoiValides = new ArrayList<>();
/* 106 */           Position positionRoi = new Position(deplacement.getArrivee().getColonne(), deplacement.getArrivee().getLigne());
/*     */           
/* 108 */           for (int i = 0; i < 8; i++) {
/* 109 */             for (int j = 0; j < 8; j++) {
/* 110 */               if (piece.estValide(new Deplacement(positionRoi, new Position(i, j)))) {
/* 111 */                 casesRoiValides.add(new Position(i, j));
/*     */               }
/*     */             } 
/*     */           } 
/*     */           
/* 116 */           Iterator<Position> it = casesRoiValides.iterator();
/* 117 */           Position pos = null;
/* 118 */           while (it.hasNext() && !presenceRoiAdverse) {
/* 119 */             pos = it.next();
/* 120 */             if (Fenetre.echiquier.getCase(pos.getColonne(), pos.getLigne()).getPiece() instanceof Roi && 
/* 121 */               Fenetre.echiquier.getCase(pos.getColonne(), pos.getLigne()).estOccupee(
/* 122 */                 piece.getCouleur().equals("blanc") ? "noir" : "blanc")) {
/* 123 */               presenceRoiAdverse = true;
/*     */             }
/*     */           } 
/* 126 */           it.remove();
/* 127 */           if (presenceRoiAdverse) return false; 
/* 128 */           return true;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 133 */         if (Fenetre.priseEnPassantPossible) return true;
/*     */         
/* 135 */         if (deplacement.getDeplacementX() == 0.0D && 
/* 136 */           !this.tabCases[deplacement.getArrivee().getColonne()][deplacement.getArrivee().getLigne()].estOccupee() && 
/*     */ 
/*     */           
/* 139 */           !this.tabCases[deplacement.getArrivee().getColonne()][piece.getCouleur().equals("blanc") ? (deplacement.getDepart().getLigne() - 1) : (deplacement.getDepart().getLigne() + 1)].estOccupee()) {
/*     */           
/* 141 */           if (deplacement.getDeplacementY() == -1.0D || deplacement.getDeplacementY() == 1.0D) {
/* 142 */             return true;
/*     */           }
/*     */           
/* 145 */           if (deplacement.getDeplacementY() == -2.0D) {
/* 146 */             if (!this.tabCases[deplacement.getDepart().getColonne()][deplacement.getDepart().getLigne() - 1].estOccupee()) {
/* 147 */               return true;
/*     */             }
/*     */           }
/* 150 */           else if (deplacement.getDeplacementY() == 2.0D && 
/* 151 */             !this.tabCases[deplacement.getDepart().getColonne()][deplacement.getDepart().getLigne() + 1].estOccupee()) {
/* 152 */             return true;
/*     */           
/*     */           }
/*     */         
/*     */         }
/* 157 */         else if ((deplacement.getDeplacementY() == -1.0D || deplacement.getDeplacementY() == 1.0D) && (
/* 158 */           deplacement.getDeplacementX() == -1.0D || deplacement.getDeplacementX() == 1.0D)) {
/*     */           
/* 160 */           if (this.tabCases[deplacement.getArrivee().getColonne()][deplacement.getArrivee().getLigne()].estOccupee()) {
/* 161 */             return true;
/*     */           }
/*     */         } 
/*     */         
/* 165 */         return false;
/*     */       } 
/*     */ 
/*     */       
/* 169 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 173 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Echiquier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */