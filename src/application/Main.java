package application;

import java.util.Scanner;

import application.media.Audio;
import application.media.ElementoMultimediale;
import application.media.Immagine;
import application.media.Mostrabile;
import application.media.Riproducibile;
import application.media.Video;

public class Main {

	public static void main(String[] args) {
		Immagine img = new Immagine("img", "foto", 2);

		Mostrabile.show(img.getTitolo(), img.getLuminosità());

		Audio audio1 = new Audio("audio", "vocale", 2);
		Riproducibile.play(audio1.getTitolo(), audio1.getDurata(), audio1.getVolume());

		Video video1 = new Video("video", "videooo", 4, 3);
		Riproducibile.play(video1.getTitolo(), video1.getDurata(), video1.getVolume(),
				Mostrabile.show(video1.getLuminosità()));
	}

	public static void inserisciElementiMultimediali() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci il tipo di file e il suo titolo");
			Scanner scanner = new Scanner(System.in);
			ElementoMultimediale input = null;

			input = scanner.nextLine();
			scanner.close();

			//
			// for(i=input; i<5, i++) {

		}

	}

}
