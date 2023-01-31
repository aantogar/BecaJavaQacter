 package es.rf.tienda.dominio;

import java.time.LocalDate;

import es.rf.tienda.util.*;

public class Producto {
	//atributos de la clase Producto
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
	
	//variables generadas para aplicar los filtros
	private final LocalDate FECHA_ACTUAL=LocalDate.now();
	private final int MAX_DESC_COR=100;
	private final int MAX_DESC_LAR=2000;
	
	
	//Generamos un constructor vacio
	public Producto() {
		
	}
	//Generamos un constructor con todos sus atributos
	public Producto(String id_prod,String des_cor,String des_lar,double precio,
			int stock,LocalDate fech_repo,LocalDate fech_act,LocalDate fech_des,
			String unidad, double cant_x, String uni_ult,int id_pais,String uso_rec,
			int id_categ, int stock_res, int stock_alt, 
			int stock_baj,char estado)throws Exception {
		//asignamos los parámetros a sus atributos
		
		
		this.pro_precio=precio;
		this.stock=stock;
		this.pro_uniVenta=unidad;
		this.pro_cantXUniVenta=cant_x;
		this.pro_uniUltNivel=uni_ult;
		this.id_pais=id_pais;
		this.id_categoria=id_categ;
		this.pro_stkReservado=stock_res;
		this.pro_nStkAlto=stock_alt;
		this.pro_nStkBajo=stock_baj;
		this.pro_stat=estado;
		
		//setters de los atributos que aplican filtros;
		setId_producto(id_prod);
		setPro_descripcion(des_cor);
		setPro_desLarga(des_lar) ;
		setPro_fecActi(fech_act);
		setPro_fecRepos(fech_repo);
		setPro_fecDesacti(fech_des);
		setPro_usoRecomendado(uso_rec);
		
		
	}
	
	//Generamos getters and setters
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) throws Exception {
		//aplicamos paa saber si cumple el patrón
		if(Validator.cumpleIdproduc(id_producto)){
			this.id_producto=id_producto;
		}else //si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_001);
	
	}
	public String getPro_descripcion() {
		return pro_descripcion;
	}
	public void setPro_descripcion(String pro_descripcion) throws Exception {
		//aplicamos para saber si cumple con la longitud máxima
		if(Validator.cumpleLongitudMax(pro_descripcion,MAX_DESC_COR)){
			this.pro_descripcion=pro_descripcion;
		}else //si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_002);
	}
	public String getPro_desLarga() {
		return pro_desLarga;
	}
	public void setPro_desLarga(String pro_desLarga) throws Exception {
		//aplicamos para saber si cumple con la longitud máxima
		if(Validator.cumpleLongitudMax(pro_desLarga,MAX_DESC_LAR)){
			this.pro_desLarga=pro_desLarga;
		}else //si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_002);
	}
	public double getPro_precio() {
		return pro_precio;
	}
	public void setPro_precio(double pro_precio) {
		this.pro_precio = pro_precio;
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
	public void setPro_fecRepos(LocalDate pro_fecRepos) throws Exception {
		//aplicamos el filtro de fecha minima o mayor a la actual
		if(Validator.valDateMin(pro_fecRepos,FECHA_ACTUAL)){
			this.pro_fecActi=pro_fecRepos;
		}else //si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_007);
	}
	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}
	public void setPro_fecActi(LocalDate pro_fecActi) throws Exception {
		//aplicamos el filtro de fecha minima para fecha activacion
		if(Validator.valDateMin(pro_fecActi,FECHA_ACTUAL)){
			this.pro_fecActi=pro_fecActi;
		}else //si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_007);
	}
	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}
	public void setPro_fecDesacti(LocalDate pro_fecDesacti) throws Exception {
		//comprobamos que no haya fecha de activación para que sea superior a la actual
		if(pro_fecActi==null && Validator.valDateMin(pro_fecDesacti, FECHA_ACTUAL)) {
			this.pro_fecDesacti=pro_fecDesacti;
		//si tiene fecha de activación, la fecha será superior a ésta.
		}else if(pro_fecActi!=null) {
			pro_fecDesacti.isAfter(pro_fecActi);
			this.pro_fecDesacti=pro_fecDesacti;
		}else//lanzamos la excepción si no se cumple los pasos anteriores
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
	public void setPro_usoRecomendado(String pro_usoRecomendado) throws Exception {
		//aplicamos para saber si cumple con la longitud máxima
		if(Validator.cumpleLongitudMax(pro_usoRecomendado,MAX_DESC_LAR)){
			this.pro_usoRecomendado=pro_usoRecomendado;
		}else //si no se cumple lanzamos el mensaje de error
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
