package practicum2;
import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object obj) {
        // проверяем ссылки
        if (this == obj) return true;
        // проверяем null и класс
        if (obj == null || getClass() != obj.getClass()) return false;
        // приводим к типу Song
        Song song = (Song) obj;
        // сравниваем поля
        return Objects.equals(title, song.title)
                && Objects.equals(artist, song.artist)
                && Objects.equals(songwriter, song.songwriter);
    }
}