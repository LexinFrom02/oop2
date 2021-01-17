package domain;

public class Like {
    private boolean liked;
    private int likeCount;
    private String[] userListWhoLiked;

    private int userLikes;
    private int canLike;
    private int canPublish;

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public String[] getUserListWhoLiked() {
        return userListWhoLiked;
    }

    public void setUserListWhoLiked(String[] userListWhoLiked) {
        this.userListWhoLiked = userListWhoLiked;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
