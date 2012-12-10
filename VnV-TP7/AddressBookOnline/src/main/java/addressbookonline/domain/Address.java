package addressbookonline.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Address {

    private String firstname;

    private String middlename;

    private String lastname;

    private String phone;

    private String email;

    private String address1;

    private String address2;

    private String city;

    private String addressState;

    private String postalCode;

    private String country;
}
