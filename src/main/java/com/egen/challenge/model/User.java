package com.egen.challenge.model;

import com.egen.challenge.model.Company;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    private String id;
    private String firstName;
    private String lastName;
    @Indexed
    private String email;
    private String dateCreated;
    private String profilePic;
    private Address address;
    private Company company;
    public User() {
        super();
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return emailId
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return dateCreated
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return profilePicture
     */
    public String getProfilePic() {
        return profilePic;
    }

    /**
     * @param profilePic
     */
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    /**
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return companyDetails
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

}
