package com.techlearnings.model;

public class Posts {

    private String postId;
    private String postTag;
    private String postPreview;
    private String postTitle;
    private String postData;
    private String postedTimeStamp;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostTag() {
        return postTag;
    }

    public void setPostTag(String postTag) {
        this.postTag = postTag;
    }

    public String getPostPreview() {
        return postPreview;
    }

    public void setPostPreview(String postPreview) {
        this.postPreview = postPreview;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostData() {
        return postData;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public String getPostedTimeStamp() {
        return postedTimeStamp;
    }

    public void setPostedTimeStamp(String postedTimeStamp) {
        this.postedTimeStamp = postedTimeStamp;
    }
}
