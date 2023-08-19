package Examples.StringBuilderComposicao.application;

import Examples.StringBuilderComposicao.entities.Comment;
import Examples.StringBuilderComposicao.entities.Post;

import java.time.LocalDateTime;

public class Program {
  public static void main(String[] args) {
    Comment comment1 = new Comment("Have a nice trip");
    Comment comment2 = new Comment("Wow that's awesome!");
    Comment comment3 = new Comment("Good night");
    Comment comment4 = new Comment("May the Force be with you");

    LocalDateTime moment1 =
        LocalDateTime.of(2018, 06, 21, 13, 05, 44);
    LocalDateTime moment2 =
        LocalDateTime.of(2018, 07, 28, 23, 14, 19);

    Post post1 = new Post(
        moment1,
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!",
        12
    );

    Post post2 = new Post(
        moment2,
        "Good night guys",
        "See you tomorrow",
        5
    );

    post1.addComment(comment1);
    post1.addComment(comment2);
    post2.addComment(comment3);
    post2.addComment(comment4);

    System.out.println(post1.toString());
    System.out.println(post2.toString());
  }
}
