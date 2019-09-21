package com.relative.QuskiOro.ObjetosNegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Cliente implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("edad")
	private java.lang.Integer edad;
	@org.kie.api.definition.type.Label("fechaNacimiento")
	private java.util.Date fechaNacimiento;
	@org.kie.api.definition.type.Label("cargas")
	private java.lang.String cargas;
	@org.kie.api.definition.type.Label("categoriaValor")
	private java.lang.String categoriaValor;

	@org.kie.api.definition.type.Label("score")
	private java.lang.Integer score;

	@org.kie.api.definition.type.Label("grupo")
	private Integer grupo;

	@org.kie.api.definition.type.Label("numeroPagos")
	private java.lang.Integer numeroPagos;

	@org.kie.api.definition.type.Label("numeroCreditos")
	private java.lang.Integer numeroCreditos;

	@org.kie.api.definition.type.Label("diasMoraMaximo")
	private java.lang.Integer diasMoraMaximo;

	@org.kie.api.definition.type.Label("diasMoraPromedio")
	private java.lang.Integer diasMoraPromedio;

	@org.kie.api.definition.type.Label("permanencia")
	private java.lang.Integer permanencia;

	@org.kie.api.definition.type.Label("colateral")
	private java.lang.Integer colateral;

	@org.kie.api.definition.type.Label("categoria")
	private java.lang.String categoria;

	@org.kie.api.definition.type.Label("calificacionWebMupi")
	private java.lang.String calificacionWebMupi;

	@org.kie.api.definition.type.Label("tipo")
	private java.lang.String tipo;

	@org.kie.api.definition.type.Label("cartera")
	private java.lang.String cartera;

	@org.kie.api.definition.type.Label("Tasacion")
	private java.lang.Double tasacion;

	@org.kie.api.definition.type.Label("Custodia")
	private java.lang.Double custodia;

	@org.kie.api.definition.type.Label("Resguardo")
	private java.lang.Double resguardo;

	@org.kie.api.definition.type.Label("Seguro")
	private java.lang.Double seguro;

	@org.kie.api.definition.type.Label("SeguroM4")
	private java.lang.Double seguroM4;

	@org.kie.api.definition.type.Label("perfilExterno")
	private java.lang.String perfilExterno;

	@org.kie.api.definition.type.Label("PerfilInterno")
	private java.lang.String perfilInterno;

	@org.kie.api.definition.type.Label("ScoreEquifax")
	private java.lang.Integer scoreEquifax;

	@org.kie.api.definition.type.Label("RiesgoTotal")
	private java.lang.Double riesgoTotal;

	@org.kie.api.definition.type.Label("CiudadProceso")
	private java.lang.String ciudadProceso;

	@org.kie.api.definition.type.Label("Transporte")
	private java.lang.Double transporte;

	@org.kie.api.definition.type.Label("BloqueosCliente")
	private java.lang.String bloqueosCliente;

	@org.kie.api.definition.type.Label("ColateralAdicional")
	private java.lang.Integer colateralAdicional;

	@org.kie.api.definition.type.Label("VinculadoQuski")
	private java.lang.String vinculadoQuski;

	@org.kie.api.definition.type.Label("ImpagoQuski")
	private java.lang.String impagoQuski;

	@org.kie.api.definition.type.Label("TotalCreditos")
	private java.lang.Integer totalCreditos;

	@org.kie.api.definition.type.Label("GrupoInterno")
	private java.lang.Integer grupoInterno;

	@org.kie.api.definition.type.Label("Riesgo Acumulado")
	private java.lang.Double riesgoAcumulado;

	@org.kie.api.definition.type.Label("ColateralExcepcionada")
	private java.lang.Integer colateralExcepcionada;

	@org.kie.api.definition.type.Label("ColateralCalculoBre")
	private java.lang.Integer colateralCalculoBre;

	@org.kie.api.definition.type.Label("ScoreComportamiento")
	private java.lang.Integer scoreComportamiento;

	@org.kie.api.definition.type.Label("PerfilComportamiento")
	private java.lang.Integer perfilComportamiento;

	@org.kie.api.definition.type.Label("MontoCarteraVencida")
	private java.lang.Double montoCarteraVencida;

	@org.kie.api.definition.type.Label("MontoCarteraCastigada")
	private java.lang.Double montoCarteraCastigada;

	@org.kie.api.definition.type.Label("RecalculoColateral")
	private java.lang.Boolean recalculoColateral;

	@org.kie.api.definition.type.Label("ColateralOriginal")
	private java.lang.Integer colateralOriginal;

	@org.kie.api.definition.type.Label("TiempoCancelacion")
	private java.lang.Integer tiempoCancelacion;

	@org.kie.api.definition.type.Label(value = "Months")
	private java.lang.Integer months;

	public Cliente() {
	}

	public java.lang.Integer getEdad() {
		return this.edad;
	}

	public void setEdad(java.lang.Integer edad) {
		this.edad = edad;
	}

	public java.util.Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(java.util.Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public java.lang.String getCargas() {
		return this.cargas;
	}

	public void setCargas(java.lang.String cargas) {
		this.cargas = cargas;
	}

	public java.lang.String getCategoriaValor() {
		return this.categoriaValor;
	}

	public void setCategoriaValor(java.lang.String categoriaValor) {
		this.categoriaValor = categoriaValor;
	}

	public java.lang.Integer getScore() {
		return this.score;
	}

	public void setScore(java.lang.Integer score) {
		this.score = score;
	}

	public java.lang.Integer getGrupo() {
		return this.grupo;
	}

	public void setGrupo(java.lang.Integer grupo) {
		this.grupo = grupo;
	}

	public java.lang.Integer getNumeroPagos() {
		return this.numeroPagos;
	}

	public void setNumeroPagos(java.lang.Integer numeroPagos) {
		this.numeroPagos = numeroPagos;
	}

	public java.lang.Integer getNumeroCreditos() {
		return this.numeroCreditos;
	}

	public void setNumeroCreditos(java.lang.Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

	public java.lang.Integer getDiasMoraMaximo() {
		return this.diasMoraMaximo;
	}

	public void setDiasMoraMaximo(java.lang.Integer diasMoraMaximo) {
		this.diasMoraMaximo = diasMoraMaximo;
	}

	public java.lang.Integer getDiasMoraPromedio() {
		return this.diasMoraPromedio;
	}

	public void setDiasMoraPromedio(java.lang.Integer diasMoraPromedio) {
		this.diasMoraPromedio = diasMoraPromedio;
	}

	public java.lang.Integer getPermanencia() {
		return this.permanencia;
	}

	public void setPermanencia(java.lang.Integer permanencia) {
		this.permanencia = permanencia;
	}

	public java.lang.Integer getColateral() {
		return this.colateral;
	}

	public void setColateral(java.lang.Integer colateral) {
		this.colateral = colateral;
	}

	public java.lang.String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(java.lang.String categoria) {
		this.categoria = categoria;
	}

	public java.lang.String getCalificacionWebMupi() {
		return this.calificacionWebMupi;
	}

	public void setCalificacionWebMupi(java.lang.String calificacionWebMupi) {
		this.calificacionWebMupi = calificacionWebMupi;
	}

	public java.lang.String getTipo() {
		return this.tipo;
	}

	public void setTipo(java.lang.String tipo) {
		this.tipo = tipo;
	}

	public java.lang.String getCartera() {
		return this.cartera;
	}

	public void setCartera(java.lang.String cartera) {
		this.cartera = cartera;
	}

	public java.lang.Double getTasacion() {
		return this.tasacion;
	}

	public void setTasacion(java.lang.Double tasacion) {
		this.tasacion = tasacion;
	}

	public java.lang.Double getCustodia() {
		return this.custodia;
	}

	public void setCustodia(java.lang.Double custodia) {
		this.custodia = custodia;
	}

	public java.lang.Double getResguardo() {
		return this.resguardo;
	}

	public void setResguardo(java.lang.Double resguardo) {
		this.resguardo = resguardo;
	}

	public java.lang.Double getSeguro() {
		return this.seguro;
	}

	public void setSeguro(java.lang.Double seguro) {
		this.seguro = seguro;
	}

	public java.lang.Double getSeguroM4() {
		return this.seguroM4;
	}

	public void setSeguroM4(java.lang.Double seguroM4) {
		this.seguroM4 = seguroM4;
	}

	public java.lang.String getPerfilExterno() {
		return this.perfilExterno;
	}

	public void setPerfilExterno(java.lang.String perfilExterno) {
		this.perfilExterno = perfilExterno;
	}

	public java.lang.String getPerfilInterno() {
		return this.perfilInterno;
	}

	public void setPerfilInterno(java.lang.String perfilInterno) {
		this.perfilInterno = perfilInterno;
	}

	public java.lang.Integer getScoreEquifax() {
		return this.scoreEquifax;
	}

	public void setScoreEquifax(java.lang.Integer scoreEquifax) {
		this.scoreEquifax = scoreEquifax;
	}

	public java.lang.Double getRiesgoTotal() {
		return this.riesgoTotal;
	}

	public void setRiesgoTotal(java.lang.Double riesgoTotal) {
		this.riesgoTotal = riesgoTotal;
	}

	public java.lang.String getCiudadProceso() {
		return this.ciudadProceso;
	}

	public void setCiudadProceso(java.lang.String ciudadProceso) {
		this.ciudadProceso = ciudadProceso;
	}

	public java.lang.Double getTransporte() {
		return this.transporte;
	}

	public void setTransporte(java.lang.Double transporte) {
		this.transporte = transporte;
	}

	public java.lang.String getBloqueosCliente() {
		return this.bloqueosCliente;
	}

	public void setBloqueosCliente(java.lang.String bloqueosCliente) {
		this.bloqueosCliente = bloqueosCliente;
	}

	public java.lang.Integer getColateralAdicional() {
		return this.colateralAdicional;
	}

	public void setColateralAdicional(java.lang.Integer colateralAdicional) {
		this.colateralAdicional = colateralAdicional;
	}

	public java.lang.String getVinculadoQuski() {
		return this.vinculadoQuski;
	}

	public void setVinculadoQuski(java.lang.String vinculadoQuski) {
		this.vinculadoQuski = vinculadoQuski;
	}

	public java.lang.String getImpagoQuski() {
		return this.impagoQuski;
	}

	public void setImpagoQuski(java.lang.String impagoQuski) {
		this.impagoQuski = impagoQuski;
	}

	public java.lang.Integer getTotalCreditos() {
		return this.totalCreditos;
	}

	public void setTotalCreditos(java.lang.Integer totalCreditos) {
		this.totalCreditos = totalCreditos;
	}

	public java.lang.Integer getGrupoInterno() {
		return this.grupoInterno;
	}

	public void setGrupoInterno(java.lang.Integer grupoInterno) {
		this.grupoInterno = grupoInterno;
	}

	public java.lang.Double getRiesgoAcumulado() {
		return this.riesgoAcumulado;
	}

	public void setRiesgoAcumulado(java.lang.Double riesgoAcumulado) {
		this.riesgoAcumulado = riesgoAcumulado;
	}

	public java.lang.Integer getColateralExcepcionada() {
		return this.colateralExcepcionada;
	}

	public void setColateralExcepcionada(java.lang.Integer colateralExcepcionada) {
		this.colateralExcepcionada = colateralExcepcionada;
	}

	public java.lang.Integer getColateralCalculoBre() {
		return this.colateralCalculoBre;
	}

	public void setColateralCalculoBre(java.lang.Integer colateralCalculoBre) {
		this.colateralCalculoBre = colateralCalculoBre;
	}

	public java.lang.Integer getScoreComportamiento() {
		return this.scoreComportamiento;
	}

	public void setScoreComportamiento(java.lang.Integer scoreComportamiento) {
		this.scoreComportamiento = scoreComportamiento;
	}

	public java.lang.Integer getPerfilComportamiento() {
		return this.perfilComportamiento;
	}

	public void setPerfilComportamiento(java.lang.Integer perfilComportamiento) {
		this.perfilComportamiento = perfilComportamiento;
	}

	public java.lang.Double getMontoCarteraVencida() {
		return this.montoCarteraVencida;
	}

	public void setMontoCarteraVencida(java.lang.Double montoCarteraVencida) {
		this.montoCarteraVencida = montoCarteraVencida;
	}

	public java.lang.Double getMontoCarteraCastigada() {
		return this.montoCarteraCastigada;
	}

	public void setMontoCarteraCastigada(java.lang.Double montoCarteraCastigada) {
		this.montoCarteraCastigada = montoCarteraCastigada;
	}

	public java.lang.Boolean getRecalculoColateral() {
		return this.recalculoColateral;
	}

	public void setRecalculoColateral(java.lang.Boolean recalculoColateral) {
		this.recalculoColateral = recalculoColateral;
	}

	public java.lang.Integer getColateralOriginal() {
		return this.colateralOriginal;
	}

	public void setColateralOriginal(java.lang.Integer colateralOriginal) {
		this.colateralOriginal = colateralOriginal;
	}

	public java.lang.Integer getTiempoCancelacion() {
		return this.tiempoCancelacion;
	}

	public void setTiempoCancelacion(java.lang.Integer tiempoCancelacion) {
		this.tiempoCancelacion = tiempoCancelacion;
	}

	public java.lang.Integer getMonths() {
		return this.months;
	}

	public void setMonths(java.lang.Integer months) {
		this.months = months;
	}

	public Cliente(java.lang.Integer edad, java.util.Date fechaNacimiento,
			java.lang.String cargas, java.lang.String categoriaValor,
			java.lang.Integer score, java.lang.Integer grupo,
			java.lang.Integer numeroPagos, java.lang.Integer numeroCreditos,
			java.lang.Integer diasMoraMaximo,
			java.lang.Integer diasMoraPromedio, java.lang.Integer permanencia,
			java.lang.Integer colateral, java.lang.String categoria,
			java.lang.String calificacionWebMupi, java.lang.String tipo,
			java.lang.String cartera, java.lang.Double tasacion,
			java.lang.Double custodia, java.lang.Double resguardo,
			java.lang.Double seguro, java.lang.Double seguroM4,
			java.lang.String perfilExterno, java.lang.String perfilInterno,
			java.lang.Integer scoreEquifax, java.lang.Double riesgoTotal,
			java.lang.String ciudadProceso, java.lang.Double transporte,
			java.lang.String bloqueosCliente,
			java.lang.Integer colateralAdicional,
			java.lang.String vinculadoQuski, java.lang.String impagoQuski,
			java.lang.Integer totalCreditos, java.lang.Integer grupoInterno,
			java.lang.Double riesgoAcumulado,
			java.lang.Integer colateralExcepcionada,
			java.lang.Integer colateralCalculoBre,
			java.lang.Integer scoreComportamiento,
			java.lang.Integer perfilComportamiento,
			java.lang.Double montoCarteraVencida,
			java.lang.Double montoCarteraCastigada,
			java.lang.Boolean recalculoColateral,
			java.lang.Integer colateralOriginal,
			java.lang.Integer tiempoCancelacion, java.lang.Integer months) {
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.cargas = cargas;
		this.categoriaValor = categoriaValor;
		this.score = score;
		this.grupo = grupo;
		this.numeroPagos = numeroPagos;
		this.numeroCreditos = numeroCreditos;
		this.diasMoraMaximo = diasMoraMaximo;
		this.diasMoraPromedio = diasMoraPromedio;
		this.permanencia = permanencia;
		this.colateral = colateral;
		this.categoria = categoria;
		this.calificacionWebMupi = calificacionWebMupi;
		this.tipo = tipo;
		this.cartera = cartera;
		this.tasacion = tasacion;
		this.custodia = custodia;
		this.resguardo = resguardo;
		this.seguro = seguro;
		this.seguroM4 = seguroM4;
		this.perfilExterno = perfilExterno;
		this.perfilInterno = perfilInterno;
		this.scoreEquifax = scoreEquifax;
		this.riesgoTotal = riesgoTotal;
		this.ciudadProceso = ciudadProceso;
		this.transporte = transporte;
		this.bloqueosCliente = bloqueosCliente;
		this.colateralAdicional = colateralAdicional;
		this.vinculadoQuski = vinculadoQuski;
		this.impagoQuski = impagoQuski;
		this.totalCreditos = totalCreditos;
		this.grupoInterno = grupoInterno;
		this.riesgoAcumulado = riesgoAcumulado;
		this.colateralExcepcionada = colateralExcepcionada;
		this.colateralCalculoBre = colateralCalculoBre;
		this.scoreComportamiento = scoreComportamiento;
		this.perfilComportamiento = perfilComportamiento;
		this.montoCarteraVencida = montoCarteraVencida;
		this.montoCarteraCastigada = montoCarteraCastigada;
		this.recalculoColateral = recalculoColateral;
		this.colateralOriginal = colateralOriginal;
		this.tiempoCancelacion = tiempoCancelacion;
		this.months = months;
	}

}