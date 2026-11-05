public class Game {

  public String winner(String[] deckSteve, String[] deckJosh) {
    // String contendo a ordem das cartas da menor para a maior força
    String cartas = "23456789TJQKA";
    
    int pontosSteve = 0;
    int pontosJosh = 0;

    // Percorremos cada rodada com um único loop
    for (int i = 0; i < deckSteve.length; i++) {
      // Descobrimos o valor (peso) de cada carta com base na posição dela na string 'cartas'
      int cartaSteve = cartas.indexOf(deckSteve[i]);
      int cartaJosh = cartas.indexOf(deckJosh[i]);

      if (cartaSteve > cartaJosh) {
        pontosSteve++;
      } else if (cartaJosh > cartaSteve) {
        pontosJosh++;
      }
      // Se forem iguais, nenhum ganha ponto (empate na rodada)
    }

    // Retorna o resultado final de acordo com as regras do jogo
    if (pontosSteve > pontosJosh) {
      return "Steve wins " + pontosSteve + " to " + pontosJosh;
    } else if (pontosJosh > pontosSteve) {
      return "Josh wins " + pontosJosh + " to " + pontosSteve;
    } else {
      return "Tie";
    }
  }
}
