package com.relative.QuskyOro.ObjetosNegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class XmlDescuentosNuevaOperacion implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("DescuentosOperacion")
	private com.relative.QuskyOro.ObjetosNegocio.DescuentosOperacion DescuentosOperacion;

	public XmlDescuentosNuevaOperacion() {
	}

	public com.relative.QuskyOro.ObjetosNegocio.DescuentosOperacion getDescuentosOperacion() {
		return this.DescuentosOperacion;
	}

	public void setDescuentosOperacion(
			com.relative.QuskyOro.ObjetosNegocio.DescuentosOperacion descuentosOperacion) {
		this.DescuentosOperacion = descuentosOperacion;
	}

	public XmlDescuentosNuevaOperacion(
			com.relative.QuskyOro.ObjetosNegocio.DescuentosOperacion descuentosOperacion) {
		this.DescuentosOperacion = descuentosOperacion;
	}

}