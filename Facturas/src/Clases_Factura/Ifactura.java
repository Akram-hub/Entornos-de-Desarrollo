package Clases_Factura;

public interface Ifactura {
	void cambiarEstado(Estados estado);
	float getTotal();
	float getCantidadIva();
}
