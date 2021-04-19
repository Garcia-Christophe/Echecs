/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Cavalier
/*    */   extends Piece {
/*    */   public Cavalier(String couleur) {
/*  6 */     super("cavalier", couleur);
/*    */   }
/*    */   
/*    */   public boolean estValide(Deplacement deplacement) {
/* 10 */     if ((Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY()) == 2.0D || 
/* 11 */       Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY()) == 0.5D) && 
/* 12 */       Math.abs(deplacement.getDeplacementX()) <= 2.0D && 
/* 13 */       Math.abs(deplacement.getDeplacementY()) <= 2.0D) {
/* 14 */       return true;
/*    */     }
/* 16 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Cavalier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */