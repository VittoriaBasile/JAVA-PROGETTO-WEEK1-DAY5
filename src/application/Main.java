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
		// PROVE DEL FUNZIONAMENTO DELLE CLASSI E DELLE INTERFACCE
		/*
		 * Immagine img = new Immagine("img", "foto", 2);
		 * 
		 * Mostrabile.show(img.getTitolo(), img.getLuminosità());
		 * 
		 * Audio audio1 = new Audio("audio", "vocale", 2);
		 * Riproducibile.play(audio1.getTitolo(), audio1.getDurata(),
		 * audio1.getVolume());
		 * 
		 * Video video1 = new Video("video", "videooo", 4, 3);
		 * Riproducibile.play(video1.getTitolo(), video1.getDurata(),
		 * video1.getVolume(), Mostrabile.show(video1.getLuminosità()));
		 */
		ElementoMultimediale[] media = inserisciElementiMultimediali();
		selezionaIlFile(media);

	}

	public static ElementoMultimediale[] inserisciElementiMultimediali() {
		int counter = 0;
		ElementoMultimediale[] media = new ElementoMultimediale[5];
		ElementoMultimediale[] resizedMedia;

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci un tipo di file tra img, video e audio");
			String tipoFile = scanner.nextLine();
			System.out.println("Inserisci il titolo del file");
			String titoloFile = scanner.nextLine();
			String[] elemento = { tipoFile, titoloFile };
			if (elemento[0] != "" && elemento[1] != "") {
				switch (elemento[0]) {

				case "img": {
					System.out.println("Inserisci la luminosità dell' immagine (digita un numero)");
					int luminosità = scanner.nextInt();
					scanner.nextLine();

					Immagine img = new Immagine(tipoFile, titoloFile, luminosità);

					media[counter] = img;

					counter++;
					break;
				}
				case "video": {
					System.out.println("Inserisci la durata del video (digita un numero)");
					int durata = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Inserisci la luminosità del video (digita un numero)");
					int luminosità = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Inserisci il volume del video (digita un numero)");
					int volume = scanner.nextInt();
					scanner.nextLine();

					Video video = new Video(tipoFile, titoloFile, durata, luminosità, volume);

					media[counter] = video;

					counter++;
					break;
				}
				case "audio": {
					System.out.println("Inserisci la durata dell' audio (digita un numero)");
					int durata = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Inserisci il volume dell' audio (digita un numero)");
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
					if (elemento instanceof Mostrabile || elemento instanceof Riproducibile
							|| elemento instanceof Mostrabile && elemento instanceof Riproducibile) {
						switch (elemento.getClass().getSimpleName()) {// METODO TROVATO SU INTERNET PER LA STAMPA DEL
																		// CASO DI DEFAULF DELLO SWITCH
						case "Immagine": {
							Immagine immagine = (Immagine) elemento;
							Mostrabile.show(immagine.getTitolo(), immagine.getLuminosità());
							System.out
									.println("vuoi aumentare o diminuire la luminosità?(digita aumentare o diminuire)");
							String input2 = scanner.next();
							if (input2.contains("aumentare")) {
								System.out.println("Di quanto vuoi aumentare la luminosità?(digita un numero)");
								int valoreLuminosità = scanner.nextInt() + immagine.getLuminosità();
								int luminosità = Mostrabile.aumentaLuminosità(valoreLuminosità);
								Mostrabile.show(immagine.getTitolo(), luminosità);

							} else {
								System.out.println("Di quanto vuoi diminuire la luminosità?(digita un numero)");
								int valoreLuminosità = immagine.getLuminosità() - scanner.nextInt();
								int luminosità = Mostrabile.aumentaLuminosità(valoreLuminosità);
								Mostrabile.show(immagine.getTitolo(), luminosità);

							}
							scanner.nextLine();

							break;
						}
						case "Audio": {
							Audio audio = (Audio) elemento;
							Riproducibile.play(audio.getTitolo(), audio.getDurata(), audio.getVolume());
							System.out.println("vuoi aumentare o diminuire il volume?(digita aumentare o diminuire)");
							String input2 = scanner.next();
							if (input2.contains("aumentare")) {
								System.out.println("Di quanto vuoi aumentare la luminosità?(digita un numero)");
								int valoreVolume = scanner.nextInt() + audio.getVolume();
								int volume = Riproducibile.alzaVolume(valoreVolume);
								Riproducibile.play(audio.getTitolo(), audio.getDurata(), volume);

							} else {
								System.out.println("Di quanto vuoi diminuire la luminosità?(digita un numero)");
								int valoreVolume = audio.getVolume() - scanner.nextInt();
								int volume = Riproducibile.abbassaVolume(valoreVolume);
								Riproducibile.play(audio.getTitolo(), audio.getDurata(), volume);

							}
							scanner.nextLine();
							break;
						}
						case "Video": {
							Video video = (Video) elemento;
							Riproducibile.play(video.getTitolo(), video.getDurata(), video.getVolume(),
									Mostrabile.show(video.getLuminosità()));
							System.out.println("vuoi modificare luminosità o volume?(digita luminosità o volume)");
							String risposta = scanner.next();
							if (risposta.contains("luminosità")) {
								System.out.println(
										"vuoi aumentare o diminuire la luminosità?(digita aumentare o diminuire)");
								String input2 = scanner.next();
								if (input2.contains("aumentare")) {
									System.out.println("Di quanto vuoi aumentare la luminosità?(digita un numero)");
									int valoreLuminosità = scanner.nextInt() + video.getLuminosità();
									int luminosità = Mostrabile.aumentaLuminosità(valoreLuminosità);
									Riproducibile.play(video.getTitolo(), video.getDurata(), video.getVolume(),
											Mostrabile.show(luminosità));

								} else {
									System.out.println("Di quanto vuoi diminuire la luminosità?(digita un numero)");
									int valoreLuminosità = video.getLuminosità() - scanner.nextInt();
									int luminosità = Mostrabile.aumentaLuminosità(valoreLuminosità);
									Riproducibile.play(video.getTitolo(), video.getDurata(), video.getVolume(),
											Mostrabile.show(luminosità));

								}
							} else {
								System.out
										.println("vuoi aumentare o diminuire il volume?(digita aumentare o diminuire)");
								String input2 = scanner.next();
								if (input2.contains("aumentare")) {
									System.out.println("Di quanto vuoi aumentare la luminosità?(digita un numero)");
									int valoreVolume = scanner.nextInt() + video.getVolume();
									int volume = Riproducibile.alzaVolume(valoreVolume);
									Riproducibile.play(video.getTitolo(), video.getDurata(), volume,
											Mostrabile.show(video.getLuminosità()));

								} else {
									System.out.println("Di quanto vuoi diminuire la luminosità?(digita un numero)");
									int valoreVolume = video.getVolume() - scanner.nextInt();
									int volume = Riproducibile.abbassaVolume(valoreVolume);
									Riproducibile.play(video.getTitolo(), video.getDurata(), volume,
											Mostrabile.show(video.getLuminosità()));
								}

							}
							scanner.nextLine();

							break;

						}
						default:
							throw new IllegalArgumentException(
									"Unexpected value: " + elemento.getClass().getSimpleName());
						}
					} else {
						System.out.println("Selezione non valida.");
					}

				}

			}

		}
		scanner.close();

	}

}