/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;
import java.util.ArrayList;

/**
 *
 * @author Jeanne
 */
public class MP3Player {
    private ArrayList<String> musicas;

    public MP3Player(ArrayList<String> musicas) {
        this.musicas = new ArrayList<>();
        this.musicas = musicas;
    }

    public MP3Player() {
        this.musicas = new ArrayList<>();
    }

    public MP3Player(MP3Player mp3Original) {
        this.musicas = new ArrayList<>();
        this.musicas = mp3Original.musicas;
    }

    public void setMusica(String musica) {
        this.musicas.add(musica);
    }

    public String getMusica(int i) {
        return this.musicas.get(i);
    }
    
    public void tocarMusica(int i) {
        System.out.println("Tocando a musica "+this.musicas.get(i));
    }
    
}

