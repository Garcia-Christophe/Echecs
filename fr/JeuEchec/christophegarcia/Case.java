/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ 
/*    */ public class Case
/*    */ {
/*    */   private Piece piece;
/*    */   
/*    */   public Case() {}
/*    */   
/*    */   public Case(Piece piece) {
/* 11 */     setPiece(piece);
/*    */   }
/*    */   
/*    */   public Piece getPiece() {
/* 15 */     return this.piece;
/*    */   }
/*    */   
/*    */   public void setPiece(Piece piece) {
/* 19 */     this.piece = piece;
/*    */   }
/*    */   
/*    */   public boolean estOccupee() {
/* 23 */     return (this.piece != null);
/*    */   }
/*    */   
/*    */   public boolean estOccupee(String couleur) {
/* 27 */     if (estOccupee()) {
/* 28 */       return this.piece.getCouleur().equals(couleur);
/*    */     }
/* 30 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Case.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */