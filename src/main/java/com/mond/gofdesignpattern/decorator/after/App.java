package com.mond.gofdesignpattern.decorator.after;

public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("디자인패턴");
        client.writeComment("학습중...");
        client.writeComment("http://mond.page");
    }
}
