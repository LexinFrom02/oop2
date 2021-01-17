package domain;

public class Like {
    private boolean liked;
    private int likeCount;
    private String[] userListWhoLiked;

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
}
