package com.interface_.Interface_LinkedList;

public class Song_ {
        private String title;
        private double duration;

        public Song_(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return this.title + " : " + this.duration;
        }
}
