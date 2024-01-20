public class SocialMediaPlatform {
    public static void main(String[] args) {
        // Create instances for Social Media Platform
        User user1 = new User("Alice", "alice@example.com");
        User user2 = new User("Bob", "bob@example.com");

        Post post1 = user1.createPost("Hello, world!");
        user2.commentOnPost(post1, "Nice post!");
        user1.commentOnPost(post1, "Thank you!");

        // Display user and post details
        user1.displayUserDetails();
        user2.displayUserDetails();
        post1.displayPostDetails();
    }
}

class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Post createPost(String content) {
        Post post = new Post(this, content);
        return post;
    }

    public void commentOnPost(Post post, String comment) {
        post.addComment(new Comment(this, comment));
    }

    public void displayUserDetails() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}

class Post {
    private User author;
    private String content;
    private List<Comment> comments;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void displayPostDetails() {
        System.out.println("Post by: " + author.getUsername());
        System.out.println("Content: " + content);
        System.out.println("Comments:");
        for (Comment comment : comments) {
            comment.displayCommentDetails();
        }
    }
}

class Comment {
    private User author;
    private String content;

    public Comment(User author, String content) {
        this.author = author;
        this.content = content;
    }

    public void displayCommentDetails() {
        System.out.println("Comment by: " + author.getUsername());
        System.out.println("Content: " + content);
    }
}
