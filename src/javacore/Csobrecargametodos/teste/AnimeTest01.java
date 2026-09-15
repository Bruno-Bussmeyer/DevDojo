package javacore.Csobrecargametodos.teste;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init( "One Piece","Aventura", 12);
        anime.imprimir();
    }
}
