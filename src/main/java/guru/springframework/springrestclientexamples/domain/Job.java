package guru.springframework.springrestclientexamples.domain;

public class Job {

    private String title;
    private String company;

    /**
     * 
     */
    public Job() {
    }

    /**
     * @param title
     * @param company
     */
    public Job(String title, String company) {
        this.title = title;
        this.company = company;
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
     * @return String return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

}
