package Examples.StringBuilderComposicao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
  private LocalDateTime moment;
  private String title;
  private String content;
  private Integer likes;
  List<Comment> comments = new ArrayList<>();

  public Post(LocalDateTime moment, String title, String content, int likes) {
    this.moment = moment;
    this.title = title;
    this.content = content;
    this.likes = likes;
  }

  public LocalDateTime getMoment() {
    return moment;
  }

  public void setMoment(LocalDateTime moment) {
    this.moment = moment;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void addComment(Comment comment) {
    comments.add(comment);
  }

  public void removeComment(Comment comment) {
    comments.remove(comment);
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    DateTimeFormatter fullDateMask = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    stringBuilder.append(title + "\n");
    stringBuilder.append(likes + " Likes - " + moment.format(fullDateMask) + "\n");
    stringBuilder.append(content + "\n");
    stringBuilder.append("Comments: \n");

    for (Comment comment : comments) {
      stringBuilder.append(comment.getText() + "\n");
    }

    return stringBuilder.toString();
  }
}
