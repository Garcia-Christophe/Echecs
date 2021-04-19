/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Pion extends Piece {
/*    */   String couleur;
/*    */   
/*    */   public Pion(String couleur) {
/*  7 */     super("pion", couleur);
/*  8 */     this.couleur = couleur;
/*    */   }
/*    */   
/*    */   public boolean estValide(Deplacement deplacement) {
/* 12 */     if (this.couleur == "blanc") {
/* 13 */       if ((deplacement.getDeplacementX() == 0.0D && deplacement.getDeplacementY() == -1.0D) || (
/* 14 */         deplacement.getDepart().getLigne() == 6 && deplacement.getDeplacementY() == -2.0D && 
/* 15 */         deplacement.getDeplacementX() == 0.0D) || (
/* 16 */         Fenetre.priseEnPassantPossible && (
/* 17 */         deplacement.getDeplacementX() == -1.0D || deplacement.getDeplacementX() == 1.0D) && 
/* 18 */         deplacement.getDeplacementY() == -1.0D) || ((
/* 19 */         deplacement.getDeplacementX() == -1.0D || deplacement.getDeplacementX() == 1.0D) && 
/* 20 */         deplacement.getDeplacementY() == -1.0D && 
/* 21 */         Fenetre.echiquier.getCase(deplacement.getArrivee().getColonne(), deplacement.getArrivee().getLigne()).estOccupee("noir"))) {
/* 22 */         return true;
/*    */       }
/*    */     }
/* 25 */     else if ((deplacement.getDeplacementX() == 0.0D && deplacement.getDeplacementY() == 1.0D) || (
/* 26 */       deplacement.getDepart().getLigne() == 1 && deplacement.getDeplacementY() == 2.0D && 
/* 27 */       deplacement.getDeplacementX() == 0.0D) || (
/* 28 */       Fenetre.priseEnPassantPossible && (
/* 29 */       deplacement.getDeplacementX() == -1.0D || deplacement.getDeplacementX() == 1.0D) && 
/* 30 */       deplacement.getDeplacementY() == 1.0D) || ((
/* 31 */       deplacement.getDeplacementX() == -1.0D || deplacement.getDeplacementX() == 1.0D) && 
/* 32 */       deplacement.getDeplacementY() == 1.0D && 
/* 33 */       Fenetre.echiquier.getCase(deplacement.getArrivee().getColonne(), deplacement.getArrivee().getLigne()).estOccupee("blanc"))) {
/* 34 */       return true;
/*    */     } 
/*    */     
/* 37 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Pion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */