package com.wipro.Day_seven;

import java.util.Objects;

public class Learner {
    String name;
    String mic = "off";
    String video = "off";
    
    public Learner() {
    }
   

    @Override
	public int hashCode() {
		return Objects.hash(mic, name, video);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Learner other = (Learner) obj;
		return Objects.equals(mic, other.mic) && Objects.equals(name, other.name) && Objects.equals(video, other.video);
	}


	public Learner(String name, String mic, String video) {
        this.name = name;
        this.mic = mic;
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMic() {
        return mic;
    }

    public void setMic(String mic) {
        this.mic = mic;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Learner [name=" + name + ", mic=" + mic + ", video=" + video + "]";
    }
}