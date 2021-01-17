package domain;

public class Post {
    private int postId;
    private int creatorId;
    private String postCreatorName;
    private int creationTimeDate;
    private String postBody;
    private String photoUrl;
    private int viewsCount;

    private Complain complain;
    private Like like;
    private Comment comment;
    private Repost repost;
}
