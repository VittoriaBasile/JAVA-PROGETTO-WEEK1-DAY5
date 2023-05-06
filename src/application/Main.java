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
		ElementoMultimediale[] media = inserisciElementiMultimediali();
		selezionaIlFile(media);
	}

	public static ElementoMultimediale[] inserisciElementiMultimediali() {
		int counter = 0;
		ElementoMultimediale[] media = new ElementoMultimediale[5];
		ElementoMultimediale[] resizedMedia;

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci il tipo di file");
			String tipoFile = scanner.nextLine();
			System.out.println("Inserisci il titolo del file");
			String titoloFile = scanner.nextLine();
			String[] elemento = { tipoFile, titoloFile };
			if (elemento[0] != "" && elemento[1] != "") {
				switch (elemento[0]) {

				case "img": {
					System.out.println("Inserisci la luminosità dell' immagine");
					int luminosità = scanner.nextInt();
					scanner.nextLine();
					Immagine img = new Immagine(tipoFile, titoloFile, luminosità);

					media[counter] = img;

					counter++;
					break;
				}
				case "video": {
					System.out.println("Inserisci la durata del video");
					int durata = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Inserisci la luminosità del video");
					int luminosità = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Inserisci il volume del video");
					int volume = scanner.nextInt();
					scanner.nextLine();

					Video video = new Video(tipoFile, titoloFile, durata, luminosità, volume);

					media[counter] = video;

					counter++;
					break;
				}
				case "audio": {
					System.out.println("Inserisci la durata dell' audio");
					int durata = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Inserisci il volume dell' audio");
					int volume = scanner.nextInt();
					scanner.nextLine();
					Audio audio = new Audio(tipoFile, titoloFile, durata, volume);

					media[counter] = audio;
					counter++;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: ");
				}

			}

		}

		resizedMedia = new ElementoMultimediale[counter];
		int index = 0;
		for (ElementoMultimediale elemento : media) {
			if (index < resizedMedia.length) {
				resizedMedia[index] = elemento;
				index++;
			} else {
				System.out.println("devi compilare il campo");
			}
		}

		media = resizedMedia;
		return media;
	}

	public static void selezionaIlFile(ElementoMultimediale[] lista) {
		Scanner scanner = new Scanner(System.in);
		String input = "";

		while (!input.equals("0")) {
			System.out
					.println("Inserisci un numero da 1 a " + lista.length + " per selezionare un file (0 per uscire):");
			input = scanner.nextLine();

			if (!input.equals("0")) {
				int index = Integer.parseInt(input) - 1;

				if (index >= 0 && index < lista.length) {
					ElementoMultimediale elemento = lista[index];
					System.out.println("Hai selezionato il file: " + elemento.getTitolo());
				} else {
					System.out.println("Selezione non valida.");
				}
			}
		}

		scanner.close();
	}
}
