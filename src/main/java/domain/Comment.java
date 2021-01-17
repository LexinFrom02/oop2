package domain;

public class Comment {
    private int commentId;
    private int userId;
    private String commentBody;
    private int commentTimeDate;

    private Like like;
    private Repost repost;
    private Complain complain;
}
