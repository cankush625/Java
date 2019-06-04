package com.Inner_Classes_and_Abstract_Class.Inner_Class.Inner_Class_Challenge;

import java.util.*;

public class IC_Album {
    private String name;
    private String artist;
    private songList songs;

    public IC_Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new songList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new IC_Song(title, duration));
    }


    public boolean addToPlaylist(int trackNumber, LinkedList<IC_Song> playList) { //by using track number
        IC_Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<IC_Song> playlist) {
        IC_Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in the album");
        return false;
    }

    private class songList {
        private ArrayList<IC_Song> songs;

        public songList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(IC_Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private IC_Song findSong(String title) {
            for (IC_Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public IC_Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index > 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
