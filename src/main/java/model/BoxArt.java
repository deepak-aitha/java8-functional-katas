package model;

import java.util.Objects;
import java.util.StringJoiner;

public class BoxArt {
    private Integer width;
    private Integer height;
    private String url;

    public BoxArt() {
    }

    public BoxArt(Integer width, Integer height, String uri) {
        this.width = width;
        this.height = height;
        this.url = uri;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BoxArt.class.getSimpleName() + "[", "]")
                .add("width=" + width)
                .add("height=" + height)
                .add("url='" + url + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoxArt boxArt = (BoxArt) o;

        if (!Objects.equals(width, boxArt.width)) return false;
        if (!Objects.equals(height, boxArt.height)) return false;
        return Objects.equals(url, boxArt.url);
    }

    @Override
    public int hashCode() {
        int result = width != null ? width.hashCode() : 0;
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
