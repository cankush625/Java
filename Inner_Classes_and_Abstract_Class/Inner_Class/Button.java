package com.Inner_Classes_and_Abstract_Class.Inner_Class;

public class Button {
    private String title;
    private onClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(onClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface onClickListener {
        void onClick(String title);
    }
}

//by Ankush Chavan