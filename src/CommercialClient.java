/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 * this class commercial client that extends from class client to represent
 * bank's client. the client in this case is not a person, it is a company or
 * something like that.
 * 
 * @author sohaila.
 * @version 1.0
 */
public class CommercialClient extends Client {
	private int commercialId = 00000000000000;

	/**
	 * this the parant's class constructor with specified name, national id,
	 * address, phone.
	 * 
	 * @param name       the name of the client.
	 * @param nationalID the national id of the client.
	 * @param address    the address of the client.
	 * @param phone      the phone number of the client.
	 * @param account    the account of the client.
	 */

	public CommercialClient(String name, int nationalID, String address, int phone, Account account) {
		super(name, nationalID, address, phone, account);
	}

	/**
	 * this function is to return the commercial id of this client.
	 * 
	 * @return the client's commercial id.
	 */
	public int getCommercialID() {
		return commercialId;
	}

	/**
	 * this is function is to set the client's commercial id.
	 * 
	 * @param commercialID the commercial id of the client.
	 */

	public void setCommercialID(int commercialID) {
		this.commercialId = commercialID;
	}

	/**
	 * this override of toString function to print the client's information.
	 * 
	 * @return client's information.
	 */

	@Override
	public String toString() {
		return "CommercialClient{" + "name =" + this.getName() + "commercialID= " + commercialId + "Address = "
				+ this.getAddress() + "Phone = " + this.getPhone() + "Account =" + this.getAccount() + '}';
	}

}