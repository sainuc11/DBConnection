package sainuc11.example.DBConnection;

import javax.persistence.*;

@Entity
@Table(name = "pindetails",schema="public")
public class PinDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="slno")
    private Integer slNo;
    
    @Column(name="pincode")
    private String pinCode;
    
    @Column(name="pinarea")    
    private String pinArea;
 
    // getters and setters...
	public int getSlNo()
	{
		return slNo;
	}
	
	public void setSlNo(int slNo) {
		this.slNo=slNo;
	}

	public String getPinCode()
	{
		return pinCode;
	}
	
	public void setPinCode(String pinCode) {
		this.pinCode= pinCode;
	}

	public String getPinArea()
	{
		return pinArea;
	}
	
	public void setPinArea(String pinArea) {
		this.pinArea=pinArea;
	}
}