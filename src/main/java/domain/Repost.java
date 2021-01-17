package domain;

public class Repost {
    private int repostCount;
    private boolean canRepost;
    private boolean reposted;

    public int getRepostCount() {
        return repostCount;
    }

    public void setRepostCount(int repostCount) {
        this.repostCount = repostCount;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isReposted() {
        return reposted;
    }

    public void setReposted(boolean reposted) {
        this.reposted = reposted;
    }
}
