package com.ferreteria.apliacacion.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.JoinColumn;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = -6833167247955613395L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long usuario_id;
	
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String usuario;
	@Column
	private String password;
	@Transient
	private String confirmPassword;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="usuario_role"
		,joinColumns=@JoinColumn(name="user_id")
		,inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role> roles;
	
	public Usuario() {	}
	
	public Usuario(Long id) {
		this.usuario_id = id;
	}

	public Long getId() {
		return usuario_id;
	}

	public void setId(Long id) {
		this.usuario_id = id;
	}

	public String getFirstName() {
		return nombre;
	}

	public void setFirstName(String firstName) {
		this.nombre = firstName;
	}

	public String getLastName() {
		return apellido;
	}

	public void setLastName(String lastName) {
		this.apellido = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return usuario;
	}

	public void setUsername(String username) {
		this.usuario = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Set getRoles() {
		return roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + usuario_id + ", firstName=" + nombre + ", lastName=" + apellido + ", email=" + email
				+ ", username=" + usuario + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((confirmPassword == null) ? 0 : confirmPassword.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((usuario_id == null) ? 0 : usuario_id.hashCode());
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (confirmPassword == null) {
			if (other.confirmPassword != null)
				return false;
		} else if (!confirmPassword.equals(other.confirmPassword))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (usuario_id == null) {
			if (other.usuario_id != null)
				return false;
		} else if (!usuario_id.equals(other.usuario_id))
			return false;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}    
	
}
