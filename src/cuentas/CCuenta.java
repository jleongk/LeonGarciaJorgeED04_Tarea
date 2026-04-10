package cuentas;
/**
 * Clase que agrupara todos los metodos para trabajar con las cuentas
 */
public class CCuenta {

	/**
	 * Atributo que almacena el Nombre del titular de la cuenta
	 */
    private String nombre;
    /**
     * Atributo que almacena el nombre de la cuenta
     */
    private String cuenta;
    /**
     * Atributo que almacena el saldo de la cuenta
     */
    private double saldo;
    /**
     * Atributo que almacena el tipo de interes que tiene la cuenta
     */
    private double tipoInterés;

    

    /**
     * Constructor por defecto.
     */
	public CCuenta()
    {
    }
	/***
	 * 
	 * Constructor que configura todos los datos de la cuenta (Tipo interes no se utiliza)
	 * 
	 * @param nom Nombre del titular
	 * @param cue Nombre o Numero de cuenta
	 * @param sal Saldo inicial
	 * @param tipo Tipo de interes
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Devuelve el tipo de interés
     * @return tipo de interés
     */
    double getTipoInterés() {
		return tipoInterés;
	}
    
    /**
     * Modifica el tipo de interés
     * @param tipoInterés
     */
    void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    /**
     * Devuelve el saldo actual de la cuenta 
     * @return saldo actual
     */
	double getSaldo() {
		return saldo;
	}
	
	/**	
	 * Modifica el saldo de la cuenta
	 * @param saldo 
	 */
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Devuelve el nombre o numero de la cuenta
	 * @return
	 */
	String getCuenta() {
		return cuenta;
	}
	/**
	 * Cambia el nombre o numero de la cuenta
	 * @param cuenta
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Devuelve el nombre del titular de la cuenta. 
	 * @return
	 */
	String getNombre() {
		return nombre;
	}
	
	/**
	 * Cambia el nombre del titular de la cuenta
	 * @param nombre
	 */

	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el saldo de la cuenta llamando al setter del atributo.
	 * @return 
	 */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta.
     * @param cantidad Se indica la cantidad a retirar
     * @throws Exception Se produce una excepcion en caso de que la cantidad a ingresar sea negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una cantidad de la cuenta
     * @param cantidad Indica la cantidad a retirar
     * @throws Exception Se produce si la cantidad a retirar es negativa o si no hay suficiente saldo para cubrir la cantidad a retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
