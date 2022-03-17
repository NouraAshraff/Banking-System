package task1;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * this class is to represent the bank.
 * 
 * @author Samaa.
 * @version 1.0
 */
public class Bank {

	private String name;
	private String address;
	private int phone;
	ArrayList<Client> Clients = new ArrayList<Client>();
	ArrayList<Account> Accounts = new ArrayList<Account>();

	/**
	 * this constructor is a bank with specified name, address, phone.
	 * 
	 * @param name    name of this bank.
	 * @param address address of this bank.
	 * @param phone   phone of this bank.
	 * 
	 */
	public Bank() {
		name = "";
		address = "";
		phone = 0;
	}

	/**
	 * this is function is to set the bank's name.
	 * 
	 * @param newName new Name to this bank.
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * this function gets this bank's name.
	 * 
	 * @return this bank's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * this is function is to set the bank's address.
	 * 
	 * @param newADD new address to this bank.
	 */
	public void setADD(String newADD) {
		this.address = newADD;
	}

	/**
	 * this function gets this bank's address.
	 * 
	 * @return address of this bank.
	 */
	public String getADD() {
		return address;
	}

	/**
	 * this is function is to set the bank's phone.
	 * 
	 * @param newPhone
	 */
	public void setPhone(int newPhone) {
		this.phone = newPhone;
	}

	/**
	 * this function gets this bank's phone.
	 * 
	 * @return phone of this bank.
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * this method adds Client with his account.
	 * 
	 * @param CLobj
	 */
	public void AddAccountClient(Client CLobj) {
		Clients.add(CLobj);
		Accounts.add(CLobj.getAccount());

	}

	/**
	 * this method displays all the Clients and their accounts in this bank.
	 */
	public void Display() {
		for (int i = 0; i < Clients.size(); i++) {

			System.out.println(Clients.get(i).toString());

		}

	}
}