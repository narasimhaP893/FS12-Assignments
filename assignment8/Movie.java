import java.util.*;

class BookReview {
    private String title;
    private int rating;

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}

public class BookReviewAnalyzer {
    public static void main(String[] args) {

        List<BookReview> bookReviews = new ArrayList<>();
        bookReviews.add(new BookReview("Book 1", 4));
        bookReviews.add(new BookReview("Book 2", 7));
        bookReviews.add(new BookReview("Book 3", 9));
        bookReviews.add(new BookReview("Book 4", 3));
        bookReviews.add(new BookReview("Book 5", 6));
        bookReviews.add(new BookReview("Book 6", 2));

        int[] ratingRanges = {1, 5, 10};

        int positiveCount = 0;
        int neutralCount = 0;
        int negativeCount = 0;


        Map<String, Integer> ratingRangeCounts = new HashMap<>();
        for (int i = 0; i < ratingRanges.length - 1; i++) {
            ratingRangeCounts.put(ratingRanges[i] + "-" + ratingRanges[i + 1], 0);
        }

        for (BookReview review : bookReviews) {
            int rating = review.getRating();

            if (rating >= 8) {
                positiveCount++;
            } else if (rating >= 4) {
                neutralCount++;
            } else {
                negativeCount++;
            }

            for (int i = 0; i < ratingRanges.length - 1; i++) {
                if (rating >= ratingRanges[i] && rating <= ratingRanges[i + 1]) {
                    ratingRangeCounts.put(ratingRanges[i] + "-" + ratingRanges[i + 1],
                            ratingRangeCounts.get(ratingRanges[i] + "-" + ratingRanges[i + 1]) + 1);
                    break;
                }
            }
        }
        System.out.println("Book Review Statistics:");
        System.out.println("Positive Reviews: " + positiveCount);
        System.out.println("Neutral Reviews: " + neutralCount);
        System.out.println("Negative Reviews: " + negativeCount);
        System.out.println("Books Reviewed Within Rating Ranges:");
        for (Map.Entry<String, Integer> entry : ratingRangeCounts.entrySet()) {
            System.out.println(entry.getKey() + " Stars: " + entry.getValue());
        }
    }
}