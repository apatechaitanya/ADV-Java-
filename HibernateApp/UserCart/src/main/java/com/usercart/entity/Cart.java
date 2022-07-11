package com.usercart.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartID;
	
	@ManyToOne()
	@JoinColumn(name="suppierID")
	private Supplier supplier;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	private List<CartItem> cartItems;

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	
}
