/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Fou
/*    */   extends Piece {
/*    */   public Fou(String couleur) {
/*  6 */     super("fou", couleur);
/*    */   }
/*    */   
/*    */   public boolean estValide(Deplacement deplacement) {
/* 10 */     if (Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) == 0.0D) {
/* 11 */       return true;
/*    */     }
/* 13 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Fou.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */