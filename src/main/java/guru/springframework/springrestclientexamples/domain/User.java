package guru.springframework.springrestclientexamples.domain;

public class User {

    private Gender gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private char[] language;
    private char[] currency;

    /**
     * 
     */
    public User() {
        language = new char[2];
        currency = new char[3];
    }

    /**
     * @param gender
     * @param name
     * @param location
     * @param email
     * @param login
     * @param phone
     * @param job
     * @param billing
     * @param language
     * @param currency
     */
    public User(Gender gender, Name name, Location location, String email, Login login, String phone, Job job,
            Billing billing, char[] language, char[] currency) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.phone = phone;
        this.job = job;
        this.billing = billing;
        this.language = language;
        this.currency = currency;
    }

    /**
     * @return Gender return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return Name return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * @return Location return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Login return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return Job return the job
     */
    public Job getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * @return Billing return the billing
     */
    public Billing getBilling() {
        return billing;
    }

    /**
     * @param billing the billing to set
     */
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    /**
     * @return char[] return the language
     */
    public char[] getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(char[] language) {
        this.language = language;
    }

    /**
     * @return char[] return the currency
     */
    public char[] getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(char[] currency) {
        this.currency = currency;
    }

}