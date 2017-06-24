package com.dfirago.dlt.question.model;

import java.util.List;

/**
 * Created by Dmytro Firago on 13/06/2017.
 */
public class VideoQuestion extends AbstractQuestion {

    private String videoPath;

    public VideoQuestion(String question, List<ResponseOption> options, String videoPath) {
        super(question, options);
        this.videoPath = videoPath;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }
}
