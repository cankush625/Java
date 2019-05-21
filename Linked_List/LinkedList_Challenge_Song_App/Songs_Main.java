package com.Linked_List.LinkedList_Challenge_Song_App;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Songs_Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("a", "abc");
        album.addSong("ab", 4.3);
        album.addSong("sd", 4.4);
        album.addSong("fs", 3.56);
        album.addSong("gs", 5.53);
        album.addSong("as", 3.33);
        album.addSong("ac", 3.46);
        album.addSong("vs", 6.36);

        albums.add(album);

        album = new Album("jhk", "jk");
        album.addSong("fh", 5.3);
        album.addSong("dj", 3.3);
        album.addSong("lf", 3.43);
        album.addSong("kf", 2.44);
        album.addSong("dh", 4.54);
        album.addSong("ru", 4.55);
        album.addSong("sm", 5.56);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("ab", playList);
        albums.get(0).addToPlaylist("ac", playList);
        albums.get(0).addToPlaylist("as", playList);
        albums.get(1).addToPlaylist("ddh", playList); //does not exist
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(5, playList);
        albums.get(1).addToPlaylist(7, playList);
        albums.get(1).addToPlaylist(25, playList); //there is no track 25

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in the playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 :
                    System.out.println("Playlist complete!");
                    quit = true;
                    break;
                case 1 :
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2 :
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the starting of the playlist!");
                        forward = true;
                    }
                    break;
                case 3 :
                    break;
                case 4 :
                    //printList(playList);
                    break;
                case 5 :
                    //printMenu();
                    break;
            }
        }
    }
}