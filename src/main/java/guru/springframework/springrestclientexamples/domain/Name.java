package guru.springframework.springrestclientexamples.domain;

public class Name {

    private String title;
    private String first;
    private String last;

    /**
     * 
     */
    public Name() {
    }

    /**
     * @param title
     * @param first
     * @param last
     */
    public Name(String title, String first, String last) {
        this.title = title;
        this.first = first;
        this.last = last;
    }
    

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the first
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return String return the last
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(String last) {
        this.last = last;
    }

}
