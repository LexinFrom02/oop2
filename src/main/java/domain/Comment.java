package domain;

public class Comment {
    private int commentId;
    private int userId;
    private String commentBody;
    private int commentTimeDate;

    private Like like;
    private Repost repost;
    private Complain complain;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public int getCommentTimeDate() {
        return commentTimeDate;
    }

    public void setCommentTimeDate(int commentTimeDate) {
        this.commentTimeDate = commentTimeDate;
    }
}
