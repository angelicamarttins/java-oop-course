package Exercises.Map.entities;

public class Candidate implements Comparable<Candidate> {
  private String name;
  private Integer votes;

  public Candidate(String name, Integer votes) {
    this.name = name;
    this.votes = votes;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getVotes() {
    return votes;
  }

  public void setVotes(Integer votes) {
    this.votes = votes;
  }


  @Override
  public int compareTo(Candidate candidate) {
    return name.compareTo(candidate.getName());
  }
}
