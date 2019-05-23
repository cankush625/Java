package com.interface_.Interface_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album_ {
    private String name;
    private String artist;
    private ArrayList<Song_> songs;

    public Album_(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null){
            this.songs.add(new Song_(title, duration));
            return true;
        }
        return false;
    }

    private Song_ findSong(String title) {
        for (int i = 0; i < this.songs.size(); i++) {
            Song_ checkedSong = this.songs.get(i);
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song_> playList) { //by using track number
        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song_> playlist) {
        Song_ checkedSong = findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in the album");
        return false;
    }
}
