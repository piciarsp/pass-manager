package com.passguard.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Salt_Cellar")
public class Salt {
    
    @Id
    private String user_id;
    
    private String salt;

    @Override
    public String toString() {
	return "Salt{ id: " + user_id //
		+ ", salt: " + salt //
		+ "}";
    }
    
    

}
