/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Position {
/*    */   int colonne;
/*    */   int ligne;
/*    */   
/*    */   public Position(int colonne, int ligne) {
/*  8 */     setColonne(colonne);
/*  9 */     setLigne(ligne);
/*    */   }
/*    */   
/*    */   public int getColonne() {
/* 13 */     return this.colonne;
/*    */   }
/*    */   
/*    */   public int getLigne() {
/* 17 */     return this.ligne;
/*    */   }
/*    */   
/*    */   public void setColonne(int colonne) {
/* 21 */     if (colonne >= 0 && colonne <= 7) {
/* 22 */       this.colonne = colonne;
/*    */     }
/*    */   }
/*    */   
/*    */   public void setLigne(int ligne) {
/* 27 */     if (ligne >= 0 && ligne <= 7) {
/* 28 */       this.ligne = ligne;
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean equals(Position position) {
/* 33 */     return (position.getColonne() == this.colonne && position.getLigne() == this.ligne);
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Position.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */