package co.com.gohost.certificacion.pruebasrecorrido.models;

public class TransarData {
    private String user;
    private String password;
    private String tipoDoc;
    private String email;
    private String nFactura;
    private String tipoDocumento;
    private String destino;
    private String ejercicio;
    private String periodo;
    private String formaPago;
    private String observaciones;
    private String nombreArchivo;
    private String tipoArchivo;
    private String tipoArchivoDos;
    private String mensajeObligado;
    private String mensajeRadicado;
    private String mensajeNoDisponible;
    private String mensajeAprobado;






    public String getMensajeObligado() {
        return mensajeObligado;
    }

    public String getTipoArchivoDos() {
        return tipoArchivoDos;
    }

    public String getMensajeAprobado() {
        return mensajeAprobado;
    }

    public void setMensajeAprobado(String mensajeAprobado) {
        this.mensajeAprobado = mensajeAprobado;
    }

    public void setTipoArchivoDos(String tipoArchivoDos) {
        this.tipoArchivoDos = tipoArchivoDos;
    }

    public void setMensajeObligado(String mensajeObligado) {
        this.mensajeObligado = mensajeObligado;
    }

    public String getMensajeNoDisponible() {
        return mensajeNoDisponible;
    }

    public void setMensajeNoDisponible(String mensajeNoDisponible) {
        this.mensajeNoDisponible = mensajeNoDisponible;
    }

    public String getMensajeRadicado() {
        return mensajeRadicado;
    }

    public void setMensajeRadicado(String mensajeRadicado) {
        this.mensajeRadicado = mensajeRadicado;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnFactura() {
        return nFactura;
    }

    public void setnFactura(String nFactura) {
        this.nFactura = nFactura;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
