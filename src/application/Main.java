package application;

import java.util.Scanner;

import application.media.Audio;
import application.media.Immagine;
import application.media.Mostrabile;
import application.media.Riproducibile;
import application.media.Video;

public class Main {

	public static void main(String[] args) {
		Immagine img = new Immagine("img", "foto", 2);

		Mostrabile.show(img.getTitolo(), img.getLuminosità());

		Audio audio1 = new Audio("audio", "vocale", 10);
		Riproducibile.play(audio1.getTitolo(), audio1.getDurata(), audio1.getVolume());

		Video video1 = new Video("video", "videooo", 4, 7);
		Riproducibile.play(video1.getTitolo(), video1.getDurata(), video1.getVolume(),
				Mostrabile.show(video1.getLuminosità()));

		Scanner scanner = new Scanner(System.in);
		System.out.println();

	}

}
