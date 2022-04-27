package com.mond.gofdesignpattern.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("mond");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("Issue : JVM Memory 부족");

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        clone.setId(2);
        clone.setTitle("Issue : Clone Test");

        System.out.println(clone);
    }
}
