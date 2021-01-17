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

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public String getPostCreatorName() {
        return postCreatorName;
    }

    public void setPostCreatorName(String postCreatorName) {
        this.postCreatorName = postCreatorName;
    }

    public int getCreationTimeDate() {
        return creationTimeDate;
    }

    public void setCreationTimeDate(int creationTimeDate) {
        this.creationTimeDate = creationTimeDate;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }
}
