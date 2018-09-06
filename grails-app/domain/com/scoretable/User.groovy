package com.scoretable

class User {

    String firstName
    String middleName
    String lastName
    String userType // referee/scorekeeper
    String gender
    String group
    Date dateOfBirth
    String address1
    String address2
    String city
    String state
    String zipCode
    String dayPhone
    String eveningPhone
    String cellPhone
    String primaryEmail
    String altEmail
    String registrationNumber
    String areaOfResidence

    Date created = new Date()

    static constraints = {

    }
}
