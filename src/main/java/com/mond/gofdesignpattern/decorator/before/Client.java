package com.mond.gofdesignpattern.decorator.before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("디자인패턴");
        client.writeComment("학습중...");
        client.writeComment("http://mond.page");
    }
}
