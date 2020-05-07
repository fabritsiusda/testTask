import java.util.Objects;

public class TextHelper implements Comparable {

    private String word;
    private int count = 1;

    public TextHelper(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void addCount() {
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextHelper that = (TextHelper) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public int compareTo(Object o) {
        if ( !(o instanceof TextHelper))
            return -1;
        int compareByCount = Integer.compare(((TextHelper) o).getCount(), count);
        return compareByCount != 0 ? compareByCount : word.compareTo(((TextHelper) o).word);
    }
}
