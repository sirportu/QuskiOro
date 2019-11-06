package com.relative.QuskiOro.ObjetosNegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SimularResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("CodigoError")
	private java.lang.String codigoError;
	@org.kie.api.definition.type.Label("Mensaje")
	private java.lang.String mensaje;
	@org.kie.api.definition.type.Label("NumeroOperacionMadre")
	private java.lang.String numeroOperacionMadre;
	@org.kie.api.definition.type.Label("XmlOpcionesRenovacion")
	private com.relative.QuskiOro.ObjetosNegocio.XmlOpcionesRenovacion xmlOpcionesRenovacion;
	@org.kie.api.definition.type.Label("XmlGarantias")
	private com.relative.QuskiOro.ObjetosNegocio.XmlGarantias xmlGarantias;

	@org.kie.api.definition.type.Label("XmlVariablesInternas")
	private XmlVariablesInternasSalida xmlVariablesInternas;

	public SimularResult() {
	}

	public java.lang.String getCodigoError() {
		return this.codigoError;
	}

	public void setCodigoError(java.lang.String codigoError) {
		this.codigoError = codigoError;
	}

	public java.lang.String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(java.lang.String mensaje) {
		this.mensaje = mensaje;
	}

	public java.lang.String getNumeroOperacionMadre() {
		return this.numeroOperacionMadre;
	}

	public void setNumeroOperacionMadre(java.lang.String numeroOperacionMadre) {
		this.numeroOperacionMadre = numeroOperacionMadre;
	}

	public com.relative.QuskiOro.ObjetosNegocio.XmlOpcionesRenovacion getXmlOpcionesRenovacion() {
		return this.xmlOpcionesRenovacion;
	}

	public void setXmlOpcionesRenovacion(
			com.relative.QuskiOro.ObjetosNegocio.XmlOpcionesRenovacion xmlOpcionesRenovacion) {
		this.xmlOpcionesRenovacion = xmlOpcionesRenovacion;
	}

	public com.relative.QuskiOro.ObjetosNegocio.XmlGarantias getXmlGarantias() {
		return this.xmlGarantias;
	}

	public void setXmlGarantias(
			com.relative.QuskiOro.ObjetosNegocio.XmlGarantias xmlGarantias) {
		this.xmlGarantias = xmlGarantias;
	}

	public com.relative.QuskiOro.ObjetosNegocio.XmlVariablesInternasSalida getXmlVariablesInternas() {
		return this.xmlVariablesInternas;
	}

	public void setXmlVariablesInternas(
			com.relative.QuskiOro.ObjetosNegocio.XmlVariablesInternasSalida xmlVariablesInternas) {
		this.xmlVariablesInternas = xmlVariablesInternas;
	}

	public SimularResult(
			java.lang.String codigoError,
			java.lang.String mensaje,
			java.lang.String numeroOperacionMadre,
			com.relative.QuskiOro.ObjetosNegocio.XmlOpcionesRenovacion xmlOpcionesRenovacion,
			com.relative.QuskiOro.ObjetosNegocio.XmlGarantias xmlGarantias,
			com.relative.QuskiOro.ObjetosNegocio.XmlVariablesInternasSalida xmlVariablesInternas) {
		this.codigoError = codigoError;
		this.mensaje = mensaje;
		this.numeroOperacionMadre = numeroOperacionMadre;
		this.xmlOpcionesRenovacion = xmlOpcionesRenovacion;
		this.xmlGarantias = xmlGarantias;
		this.xmlVariablesInternas = xmlVariablesInternas;
	}

}