package fr.JeuEchec.christophegarcia;

public interface MethodesEchiquier {
  void preparation();
  
  Case getCase(int paramInt1, int paramInt2);
  
  boolean cheminPossible(Piece paramPiece, Deplacement paramDeplacement);
}


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\MethodesEchiquier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */