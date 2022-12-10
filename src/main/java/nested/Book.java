package nested;

import java.io.Serializable;

public class Book  {

    private String title;
    private String author;

    private String isbn;
    private String genre;
    private String published;
    private String description;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", published='").append(published).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Book(Builder builder){
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
        this.published = builder.published;
        this.genre = builder.genre;
        this.description = builder.description;
    }


    public static class Builder {

        private String title;
        private String author;

        private String isbn;
        private String genre;
        private String published;
        private String description;

        public Builder(String title, String author){
            this.title = title;
            this.author=author;
        }

        public Builder isbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public Builder genre(String genre){
            this.genre = genre;
            return this;
        }

        public Builder published(String published){
            this.published = published;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

}
