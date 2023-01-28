 package es.rf.tienda.dominio;

import java.time.LocalDate;

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
	private int pro_cantXUniVenta;
	private String pro_uniUltNivel;
	private static int id_pais;
	private String pro_usoRecomendado;
	private static int id_categoria;
	private int pro_stkReservado;
	private int pro_nStkAlto;
	private int pro_nStkBajo;
	private String pro_stat;
	
	
	//Generamos un constructor vacio
	public Producto() {
		
	}
	//Generamos un constructor con todos sus atributos
	public Producto(String id_prod,String des_cor,String des_lar,double precio,
			int stock,LocalDate fech_repo,LocalDate fech_act,LocalDate fech_des,
			String unidad, int cant_x, String uni_ult,int id_pais,String uso_rec,
			int id_categ, int stock_res, int stock_alt, int stock_baj,String estado) {
		this.id_producto=id_prod;
		this.pro_descripcion=des_cor;
		this.pro_desLarga=des_lar;
		this.pro_precio=precio;
		this.stock=stock;
		this.pro_fecRepos=fech_repo;
		this.pro_fecActi=fech_act;
		this.pro_fecDesacti=fech_des;
		this.pro_uniVenta=unidad;
		this.pro_cantXUniVenta=cant_x;
		this.pro_uniUltNivel=uni_ult;
		this.id_pais=id_pais;
		this.pro_usoRecomendado=uso_rec;
		this.id_categoria=id_categ;
		this.pro_stkReservado=stock_res;
		this.pro_nStkAlto=stock_alt;
		this.pro_nStkBajo=stock_baj;
		this.pro_stat=estado;
		
	}
	
	
	
	
	//Generamos getters and setters
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	
	}
	public String getPro_descripcion() {
		return pro_descripcion;
	}
	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}
	public String getPro_desLarga() {
		return pro_desLarga;
	}
	public void setPro_desLarga(String pro_desLarga) {
		this.pro_desLarga = pro_desLarga;
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
	public void setPro_fecRepos(LocalDate pro_fecRepos) {
		this.pro_fecRepos = pro_fecRepos;
	}
	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}
	public void setPro_fecActi(LocalDate pro_fecActi) {
		this.pro_fecActi = pro_fecActi;
	}
	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}
	public void setPro_fecDesacti(LocalDate pro_fecDesacti) {
		this.pro_fecDesacti = pro_fecDesacti;
	}
	public String getPro_uniVenta() {
		return pro_uniVenta;
	}
	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
	}
	public int getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}
	public void setPro_cantXUniVenta(int pro_cantXUniVenta) {
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
		int contador=1;
		id_pais=contador;
		contador ++;
	}
	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}
	public void setPro_usoRecomendado(String pro_usoRecomendado) {
		this.pro_usoRecomendado = pro_usoRecomendado;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
		int contador=1;
		id_categoria=contador;
		contador ++;
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
	public String getPro_stat() {
		return pro_stat;
	}
	public void setPro_stat(String pro_stat) {
		this.pro_stat = pro_stat;
	}
	
	
	

}
