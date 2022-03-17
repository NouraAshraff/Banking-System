/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 * this class client to represent bank's client.
 * 
 * @author Sohaila.
 * @version 1.0
 */

public class Client {

	String name;
	private int nationalId;
	private String address;
	private int phone;
	private Account account;

	/**
	 * this constructor a client with specified name, national id, address, phone
	 * and account.
	 * 
	 * @param name       the name of the client.
	 * @param nationalID the national id of the client.
	 * @param address    the address of the client.
	 * @param phone      the phone number of the client.
	 * @param account    the account of the client.
	 */

	Client(String name, int nationalID, String address, int phone, Account account) {
		this.name = name;
		this.nationalId = nationalID;
		this.address = address;
		this.phone = phone;
		this.account = account;
	}

	/**
	 * this is function is to set the client's name.
	 * 
	 * @param name the name of the client.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * this is function is to set the client's national id.
	 * 
	 * @param nationalID the national id of the client.
	 */

	public void setNationalID(int nationalID) {
		this.nationalId = nationalID;
	}

	/**
	 * this is function is to set the client's address.
	 * 
	 * @param address the address of the client.
	 */

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * this is function is to set the client's phone number.
	 * 
	 * @param phone the phone number of the client.
	 */

	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * this is function is to set the client's account.
	 * 
	 * @param account the account of the client.
	 */

	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * this function is to return the name of this client.
	 * 
	 * @return the client's name.
	 */

	public String getName() {
		return name;
	}

	/**
	 * this function is to return the national id of this client.
	 * 
	 * @return the client's national id.
	 */

	public int getNationalID() {
		return nationalId;
	}

	/**
	 * this function is to return the address of this client.
	 * 
	 * @return the client's address.
	 */

	public String getAddress() {
		return address;
	}

	/**
	 * this function is to return the phone number of this client.
	 * 
	 * @return the client's phone's number.
	 */

	public int getPhone() {
		return phone;
	}

	/**
	 * this function is to return the account of this client
	 * 
	 * @return the client's account.
	 */

	public Account getAccount() {
		return account;
	}

	/**
	 * this override of toString function to print the client's information.
	 * 
	 * @return client's information.
	 */

	public String toString() {
		return "Client{" + "name=" + name + ", nationalID=" + nationalId + ", address=" + address + ", phone=" + phone
				+ ", account=" + account + '}';
	}

}
