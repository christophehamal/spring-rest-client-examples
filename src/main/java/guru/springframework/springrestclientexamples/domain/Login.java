package guru.springframework.springrestclientexamples.domain;

public class Login {

    private String username;
    private String password;
    private char[] md5;
    private char[] sha1;
    private char[] sha256;
    
	/**
	 * 
	 */
	public Login() {
        md5 = new char[32];
        sha1 = new char[40];
        sha256 = new char[64];
	}

    /**
     * @param username
     * @param password
     */
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        md5 = new char[32];
        sha1 = new char[40];
        sha256 = new char[64];
    }

    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return char[] return the md5
     */
    public char[] getMd5() {
        return md5;
    }

    /**
     * @param md5 the md5 to set
     */
    public void setMd5(char[] md5) {
        this.md5 = md5;
    }

    /**
     * @return char[] return the sha1
     */
    public char[] getSha1() {
        return sha1;
    }

    /**
     * @param sha1 the sha1 to set
     */
    public void setSha1(char[] sha1) {
        this.sha1 = sha1;
    }

    /**
     * @return char[] return the sha256
     */
    public char[] getSha256() {
        return sha256;
    }

    /**
     * @param sha256 the sha256 to set
     */
    public void setSha256(char[] sha256) {
        this.sha256 = sha256;
    }

}
