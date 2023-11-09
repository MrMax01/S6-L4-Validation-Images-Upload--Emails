package massimomauro.S6L4ValidationImagesUpload.Emails.payloads;

import lombok.Getter;

@Getter
public class NewBlogPostPayload {
    private int authorId;
    private String category;
    private String content;
    private double readingTime;
    private String title;
}
