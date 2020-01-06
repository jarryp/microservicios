package com.formacionbdi.springboot.app.item.models;

public class Item {

		private Producto producto;
		private Integer cantidad = 0;
		private Double subTotal = 0.00;
		
		public Producto getProducto() {
			return producto;
		}
		public void setProducto(Producto producto) {
			this.producto = producto;
		}
		public Integer getCantidad() {
			return cantidad;
		}
		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}
		
		
		public void setSubTotal(Double subTotal) {
			this.subTotal = subTotal;
		}
		
		public Double getSubTotal() {
			
			if(this.producto != null)
				subTotal = this.producto.getPrecio() * this.cantidad;
			
			if(this.producto==null)
				subTotal = 0.00;
			
			return subTotal;
		}

		public Item(Producto producto, Integer cantidad) {
			super();
			this.producto = producto;
			this.cantidad = cantidad;
			this.subTotal = 0.00;
		}
		
		
		public Item() {
			
		}
		
		
}
