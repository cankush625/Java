package com.interface_.Interface_LinkedList;

import java.util.*;

public class Songs_main_ {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Album_> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album_ album = new Album_("a", "abc");
        album.addSong("ab", 4.3);
        album.addSong("sd", 4.4);
        album.addSong("fs", 3.56);
        album.addSong("gs", 5.53);
        album.addSong("as", 3.33);
        album.addSong("ac", 3.46);
        album.addSong("vs", 6.36);

        albums.add(album);

        album = new Album_("jhk", "jk");
        album.addSong("fh", 5.3);
        album.addSong("dj", 3.3);
        album.addSong("lf", 3.43);
        album.addSong("kf", 2.44);
        album.addSong("dh", 4.54);
        album.addSong("ru", 4.55);
        album.addSong("sm", 5.56);

        albums.add(album);

        List<Song_> playList = new ArrayList<>();
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

    private static void play(List<Song_> playList) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song_> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in the playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
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
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list!");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list!");
                        }
                    }
                    break;
                case 4 :
                    printList(playList);
                    break;
                case 5 :
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                case 6 :
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions are : ");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - to replay the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - to remove current song from playlist");
        System.out.println("6 - print available actions");
    }

    private static void printList(List<Song_> playList) {
        Iterator<Song_> iterator = playList.iterator();
        System.out.println("========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("========================");
    }
}
