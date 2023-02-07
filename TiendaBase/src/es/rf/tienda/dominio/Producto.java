 package es.rf.tienda.dominio;

import java.time.LocalDate;

import es.rf.tienda.util.*;

public class Producto {

	private String id_producto;
	private String pro_descripcion;
	private String pro_desLarga;
	private double pro_precio;
	private int stock;
	private LocalDate pro_fecRepos;
	private LocalDate pro_fecActi;
	private LocalDate pro_fecDesacti;
	private String pro_uniVenta;
	private double pro_cantXUniVenta;
	private String pro_uniUltNivel;
	private  int id_pais;
	private String pro_usoRecomendado;
	private static int id_categoria;
	private int pro_stkReservado;
	private int pro_nStkAlto;
	private int pro_nStkBajo;
	private char pro_stat;
	
	/**
	 * variables generadas para los filtros.
	 */
	private final LocalDate FECHA_ACTUAL=LocalDate.now();
	private final int MAX_DESC_COR=100;
	private final int MAX_DESC_LAR=2000;
	
	/**
	 * Constructor
	 * @throws Exception
	 */
	public Producto() throws Exception {
		setId_producto(id_producto);	
	}
	
	/**
	 * Generamos getters and setters
	 * 
	 */
	public String getId_producto() {
		return id_producto;
	}
	
	/**
	 * 
	 * Aplicamos filtro para saber si cumple el patrón
	 * 
	 */
	public void setId_producto(String id_producto) throws Exception {
	
		if(Validator.cumpleIdproduc(id_producto)){
			this.id_producto=id_producto;
		}else 
			throw new Exception(ErrorMessages.PROERR_001);
	}
	public String getPro_descripcion() {
		return pro_descripcion;
	}
	
	/**
	 * 
	 * Aplicamos filtro para saber si cumple con la longitud máxima
	 * 
	 */
	public void setPro_descripcion(String pro_descripcion) throws Exception {
		if(Validator.cumpleLongitudMax(pro_descripcion,MAX_DESC_COR)){
			this.pro_descripcion=pro_descripcion;
		}else 
			throw new Exception(ErrorMessages.PROERR_002);
	}
	public String getPro_desLarga() {
		return pro_desLarga;
	}
	
	/**
	 * 
	 * Aplicamos filtro para saber si cumple con la longitud máxima
	 * 
	 */
	public void setPro_desLarga(String pro_desLarga) throws Exception {
		
		if(Validator.cumpleLongitudMax(pro_desLarga,MAX_DESC_LAR)){
			this.pro_desLarga=pro_desLarga;
		}else 
			throw new Exception(ErrorMessages.PROERR_002);
	}
	public double getPro_precio() {
		return pro_precio;
	}
	
	/**
	 * 
	 * Aplicamos el filtro para que cumpla con los dos decimales
	 * @throws Exception 
	 */
	public void setPro_precio(double pro_precio) throws Exception {
		if(Validator.cumplePrecioProduc(pro_precio)){
			this.pro_precio = pro_precio;
		}else 
			throw new Exception(ErrorMessages.PROERR_001);
		
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}
	
	/**
	 * 
	 * Aplicamos el filtro de fecha minima o mayor a la actual
	 * 
	 */
	public void setPro_fecRepos(LocalDate pro_fecRepos) throws Exception {
		if(Validator.valDateMin(pro_fecRepos,FECHA_ACTUAL)){
			this.pro_fecActi=pro_fecRepos;
		}else 
			throw new Exception(ErrorMessages.PROERR_007);
	}
	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}
	
	/**
	 * 
	 * Aplicamos el filtro de fecha minima para fecha activacion
	 * 
	 */
	public void setPro_fecActi(LocalDate pro_fecActi) throws Exception {
		if(Validator.valDateMin(pro_fecActi,FECHA_ACTUAL)){
			this.pro_fecActi=pro_fecActi;
		}else 
			throw new Exception(ErrorMessages.PROERR_007);
	}
	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}
	
	/**
	 * 	Comprobamos que no haya fecha de activación para
	 *  que sea superior a la actual.
	 *  Si tiene fecha de activación, la fecha será superior a ésta.
	 */
	public void setPro_fecDesacti(LocalDate pro_fecDesacti) throws Exception {
		if(pro_fecActi==null && Validator.valDateMin(pro_fecDesacti, FECHA_ACTUAL)) {
			this.pro_fecDesacti=pro_fecDesacti;
		}else if(pro_fecActi!=null) {
			pro_fecDesacti.isAfter(pro_fecActi);
			this.pro_fecDesacti=pro_fecDesacti;
		}else
			throw new Exception(ErrorMessages.PROERR_007);
	}
	public String getPro_uniVenta() {
		return pro_uniVenta;
	}
	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
	}
	public double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}
	public void setPro_cantXUniVenta(double pro_cantXUniVenta) {
		this.pro_cantXUniVenta = pro_cantXUniVenta;
	}
	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}
	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		this.pro_uniUltNivel = pro_uniUltNivel;
	}
	public int getId_pais() {
		return id_pais;
	}
	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}
	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}
	
	/**
	 * 
	 * Aplicamos filtro para saber si cumple con la longitud máxima
	 * 
	 */
	public void setPro_usoRecomendado(String pro_usoRecomendado) throws Exception {
		if(Validator.cumpleLongitudMax(pro_usoRecomendado,MAX_DESC_LAR)){
			this.pro_usoRecomendado=pro_usoRecomendado;
		}else 
			throw new Exception(ErrorMessages.PROERR_002);
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getPro_stkReservado() {
		return pro_stkReservado;
	}
	public void setPro_stkReservado(int pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}
	public int getPro_nStkAlto() {
		return pro_nStkAlto;
	}
	public void setPro_nStkAlto(int pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}
	public int getPro_nStkBajo() {
		return pro_nStkBajo;
	}
	public void setPro_nStkBajo(int pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}
	public char getPro_stat() {
		return pro_stat;
	}
	public void setPro_stat(char pro_stat) {
		this.pro_stat = pro_stat;
	}
	
	
	

}
