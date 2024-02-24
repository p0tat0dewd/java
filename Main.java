class Post {
    public void publish() {
        System.out.println("This is a generic post.");
    }
}

class TextPost extends Post {
    @Override
    public void publish() {
        System.out.println("Text post published.");
    }
}

class ImagePost extends Post {
    @Override
    public void publish() {
        System.out.println("Image post published.");
    }
}

class VideoPost extends Post {
    @Override
    public void publish() {
        System.out.println("Video post published.");
    }
}

public class Main {
    public static void main(String[] args) {
        Post post1 = new TextPost();
        Post post2 = new ImagePost();
        Post post3 = new VideoPost();

        post1.publish();
        post2.publish();
        post3.publish();
    }
}
