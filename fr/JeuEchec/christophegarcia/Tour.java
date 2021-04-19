/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Tour
/*    */   extends Piece {
/*    */   public Tour(String couleur) {
/*  6 */     super("tour", couleur);
/*    */   }
/*    */   
/*    */   public boolean estValide(Deplacement deplacement) {
/* 10 */     if (deplacement.getDeplacementX() == 0.0D || deplacement.getDeplacementY() == 0.0D) {
/* 11 */       return true;
/*    */     }
/* 13 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Tour.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */