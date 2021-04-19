/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Reine
/*    */   extends Piece {
/*    */   public Reine(String couleur) {
/*  6 */     super("reine", couleur);
/*    */   }
/*    */   
/*    */   public boolean estValide(Deplacement deplacement) {
/* 10 */     if (Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) == 0.0D || 
/* 11 */       deplacement.getDeplacementX() == 0.0D || deplacement.getDeplacementY() == 0.0D) {
/* 12 */       return true;
/*    */     }
/* 14 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Reine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */