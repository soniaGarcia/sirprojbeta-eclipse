/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

import java.io.Serializable;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sonia Garcia
 */
@ManagedBean
@ViewScoped
public class RutaProyecto implements Serializable {

    private static final String getProyectoPath = "/SICOPI/paginasWeb";
    private static final String mtto = "/MTTO";
    private static final String proceso = "/PROCESOS";
    private static final String consulta = "/CONSULTAS";
    private static final String reporte = "/REPORTES";
    private static final String otros = "/OTROS";
    private static final String quick = "/QUICK";
    private static final String moduloProyecto = "/PROYECTO";
    private static final String moduloCompra = "/COMPRA";
    private static final String moduloRRHH = "/RRHH";
    private static final String moduloSeguridad = "/SEGURIDAD";
    private static final String moduloFacturacion = "/FACTURACION";
    //
    /****************************************OTROS***************************************/
    public static final String wfrmPrincipal = getProyectoPath + "/wfrmPrincipal.xhtml";
    public static final String wfrmLogin = getProyectoPath + "/wfrmLogin.xhtml";
    public static final String wfrmLogOut = getProyectoPath + otros + "/wfrmlogout.xhtml";
    /****************************************COMPRA***************************************/
    /**PROCESOS**/
    public static final String wfrmAjuste = getProyectoPath + moduloCompra + proceso + "/wfrmAjuste.xhtml";
    public static final String wfrmSolicitudMaterial = getProyectoPath + moduloCompra + proceso + "/wfrmSolicitudMaterial.xhtml";
    public static final String wfrmAprobacionOrdenCompra = getProyectoPath + moduloCompra + proceso + "/wfrmAprobacionOrdenCompra.xhtml";
    public static final String wfrmOrdenCompra = getProyectoPath + moduloCompra + proceso + "/wfrmOrdenCompra.xhtml";
    public static final String wfrmCompra_Modificar = getProyectoPath + moduloCompra + proceso + "/wfrmCompraModificar.xhtml";
    public static final String wfrmCompra = getProyectoPath + moduloCompra + proceso + "/wfrmCompra.xhtml";
    public static final String wfrmAbonoCompra = getProyectoPath + moduloCompra + proceso + "/wfrmAbonoCompra.xhtml";
    public static final String wfrmDevolucionCompra = getProyectoPath + moduloCompra + proceso + "/wfrmDevolucionCompra.xhtml";
    /**MTTO**/
    private final String wfrmSucursal = getProyectoPath + moduloCompra + mtto + "/wfrmSucursal.xhtml";
    private final String wfrmEmpresa = getProyectoPath + moduloCompra + mtto + "/wfrmEmpresa.xhtml";
    private final String wfrmMarca = getProyectoPath + moduloCompra + mtto + "/wfrmMarca.xhtml";
    private final String wfrmUnidadMedicion = getProyectoPath + moduloCompra + mtto + "/wfrmUnidadMedicion.xhtml";
    private final String wfrmTipoMaterial = getProyectoPath + moduloCompra + mtto + "/wfrmTipoMaterial.xhtml";
    private final String wfrmMaterial = getProyectoPath + moduloCompra + mtto + "/wfrmMaterial.xhtml";
    private final String wfrmProveedor = getProyectoPath + moduloCompra + mtto + "/wfrmProveedor.xhtml";
    private final String wfrmCategoria = getProyectoPath + moduloCompra + mtto + "/wfrmCategoria.xhtml";
    private final String wfrmSubCategoria = getProyectoPath + moduloCompra + mtto + "/wfrmSubCategoria.xhtml";
    private final String wfrmPais = getProyectoPath + moduloCompra + mtto + "/wfrmPais.xhtml";
    private final String wfrmDepartamento = getProyectoPath + moduloCompra + mtto + "/wfrmDepartamento.xhtml";
    private final String wfrmMunicipio = getProyectoPath + moduloCompra + mtto + "/wfrmMunicipio.xhtml";

    /*CONSULTAS COMPRA*/
    private final String wfrmConsulta_Ajuste = getProyectoPath + moduloCompra + consulta + "/wfrmcon_Ajuste.xhtml";
    private final String wfrmConsulta_Compra = getProyectoPath + moduloCompra + consulta + "/wfrmcon_Compra.xhtml";
    private final String wfrmConsulta_OrdenCompra = getProyectoPath + moduloCompra + consulta + "/wfrmcon_OrdenCompra.xhtml";
    private final String wfrmConsulta_Compra_Cantidad_x_Costo = getProyectoPath + moduloCompra + consulta + "/wfrmcon_Compra_Costo_x_Cantidad.xhtml";

    /*CONSULTAS GENERALES*/
    private final String wfrmConsulta_MaximoMinimo = getProyectoPath + moduloCompra + consulta + "/wfrmcon_MaximoMinimo.xhtml";
    private final String wfrmConsulta_ConteoFisico = getProyectoPath + moduloCompra + consulta + "/wfrmcon_ConteoFisico.xhtml";
    private final String wfrmConsulta_Producto = getProyectoPath + moduloCompra + consulta + "/wfrmcon_Producto.xhtml";
    private final String wfrmConsulta_Kardex = getProyectoPath + moduloCompra + consulta + "/wfrmcon_Kardex.xhtml";
    private final String wfrmConsulta_BitacoraInventario = getProyectoPath + moduloCompra + consulta + "/wfrmcon_BitacoraInventario.xhtml";
    /*QUICK*/
    private final String wfrmQuick_Compra_AC = getProyectoPath + moduloCompra + quick + "/wfrmquick_Compra.xhtml";
    private final String wfrmQuick_Compra_DC = getProyectoPath + moduloCompra + quick + "/wfrmquick_Compra_DC.xhtml";
    /****************************************PROYECTO***************************************/
    /**MTTO**/
    private final String wfrmTipoCliente = getProyectoPath + moduloProyecto + mtto + "/wfrmTipoCliente.xhtml";
    private final String wfrmTipoProyecto = getProyectoPath + moduloProyecto + mtto + "/wfrmTipoProyecto.xhtml";
    private final String wfrmCliente = getProyectoPath + moduloProyecto + mtto + "/wfrmCliente.xhtml";
    private final String wfrmProyecto = getProyectoPath + moduloProyecto + mtto + "/wfrmProyecto.xhtml";
    /**PROCESOS**/
    public static final String wfrmDevolucionProyecto = getProyectoPath + moduloProyecto + proceso + "/wfrmDevolucionProyecto.xhtml";
    public static final String wfrmSalidaProyecto = getProyectoPath + moduloProyecto + proceso + "/wfrmSalidaProyecto.xhtml";
    public static final String wfrmUtilizacionProyecto = getProyectoPath + moduloProyecto + proceso + "/wfrmUtilizacionProyecto.xhtml";
    /**CONSULTAS**/
    private final String wfrmConsulta_DevolucionProyecto = getProyectoPath + moduloProyecto + consulta + "/wfrmcon_DevolucionProyecto.xhtml";
    private final String wfrmConsulta_SalidaProyecto = getProyectoPath + moduloProyecto + consulta + "/wfrmcon_SalidaProyecto.xhtml";
    private final String wfrmConsulta_UtilizacionProyecto = getProyectoPath + moduloProyecto + consulta + "/wfrmcon_UtilizacionProyecto.xhtml";
    private final String wfrmConsulta_MaestraProyecto = getProyectoPath + moduloProyecto + consulta + "/wfrmcon_MaestroProyecto.xhtml";
    /****************************************SEGURIDAD***************************************/
    /**MTTO**/
    private final String wfrmUsuario = getProyectoPath + moduloSeguridad + mtto + "/wfrmUsuario.xhtml";
    private final String wfrmModulo = getProyectoPath + moduloSeguridad + mtto + "/wfrmModulo.xhtml";
    private final String wfrmFormluario = getProyectoPath + moduloSeguridad + mtto + "/wfrmFormulario.xhtml";
    private final String wfrmParametroProyecto = getProyectoPath + moduloSeguridad + mtto + "/wfrmParametroProyecto.xhtml";
    private final String wfrmParametroFacturacion = getProyectoPath + moduloSeguridad + mtto + "/wfrmParametroFacturacion.xhtml";
    private final String wfrmPerfil = getProyectoPath + moduloSeguridad + mtto + "/wfrmPerfil.xhtml";
    /**PROCESOS**/
    private final String wfrmRoles = getProyectoPath + moduloSeguridad + proceso + "/wfrmRoles.xhtml";
    private final String wfrmPerfilUsuario = getProyectoPath + moduloSeguridad + proceso + "/wfrmPerfilUsuario.xhtml";
    /**CONSULTAS**/
    private final String wfrmConsulta_BitacoraAnulacion = getProyectoPath + moduloSeguridad + consulta + "/wfrmcon_BitacoraAnulacion.xhtml";
    /****************************************RRHH***************************************/
    /**MTTO**/
    private final String wfrmArea = getProyectoPath + moduloRRHH + mtto + "/wfrmArea.xhtml";
    private final String wfrmCargo = getProyectoPath + moduloRRHH + mtto + "/wfrmCargo.xhtml";
    private final String wfrmEmpleado = getProyectoPath + moduloRRHH + mtto + "/wfrmEmpleado.xhtml";
    /***********************************************************************************/
    /****************************************FACTURACION***************************************/
    /**MTTO**/
    private final String wfrmCaja = getProyectoPath + moduloFacturacion + mtto + "/wfrmCaja.xhtml";
    private final String wfrmTipoCaja = getProyectoPath + moduloFacturacion + mtto + "/wfrmTipoCaja.xhtml";
    private final String wfrmAsignarCaja = getProyectoPath + moduloFacturacion + mtto + "/wfrmAsignarCaja.xhtml";

    /**PROCESOS**/
    /**CONSULTAS**/
    /***********************************************************************************/
    public String getWfrmAprobacionOrdenCompra() {
        return wfrmAprobacionOrdenCompra;
    }

    public String getWfrmCompra_Modificar() {
        return wfrmCompra_Modificar;
    }

    public String getWfrmConsulta_Ajuste() {
        return wfrmConsulta_Ajuste;
    }

    public String getWfrmConsulta_MaximoMinimo() {
        return wfrmConsulta_MaximoMinimo;
    }

    public String getWfrmConsulta_OrdenCompra() {
        return wfrmConsulta_OrdenCompra;
    }

    public String getWfrmConsulta_Producto() {
        return wfrmConsulta_Producto;
    }

    public String getWfrmSolicitudMaterial() {
        return wfrmSolicitudMaterial;
    }

    public String getWfrmLogOut() {
        return wfrmLogOut;
    }

    public String getWfrmArea() {
        return wfrmArea;
    }

    public String getWfrmCargo() {
        return wfrmCargo;
    }

    public String getWfrmEmpleado() {
        return wfrmEmpleado;
    }

    public String getWfrmAbonoCompra() {
        return wfrmAbonoCompra;
    }

    public String getWfrmAjuste() {
        return wfrmAjuste;
    }

    public String getWfrmCategoria() {
        return wfrmCategoria;
    }

    public String getWfrmCliente() {
        return wfrmCliente;
    }

    public String getWfrmCompra() {
        return wfrmCompra;
    }

    public String getWfrmConsulta_BitacoraAnulacion() {
        return wfrmConsulta_BitacoraAnulacion;
    }

    public String getWfrmConsulta_Compra() {
        return wfrmConsulta_Compra;
    }

    public String getWfrmConsulta_DevolucionProyecto() {
        return wfrmConsulta_DevolucionProyecto;
    }

    public String getWfrmConsulta_MaestraProyecto() {
        return wfrmConsulta_MaestraProyecto;
    }

    public String getWfrmConsulta_SalidaProyecto() {
        return wfrmConsulta_SalidaProyecto;
    }

    public String getWfrmConsulta_UtilizacionProyecto() {
        return wfrmConsulta_UtilizacionProyecto;
    }

    public String getWfrmDepartamento() {
        return wfrmDepartamento;
    }

    public String getWfrmDevolucionCompra() {
        return wfrmDevolucionCompra;
    }

    public String getWfrmDevolucionProyecto() {
        return wfrmDevolucionProyecto;
    }

    public String getWfrmEmpresa() {
        return wfrmEmpresa;
    }

    public String getWfrmFormluario() {
        return wfrmFormluario;
    }

    public String getWfrmLogin() {
        return wfrmLogin;
    }

    public String getWfrmMarca() {
        return wfrmMarca;
    }

    public String getWfrmMaterial() {
        return wfrmMaterial;
    }

    public String getWfrmModulo() {
        return wfrmModulo;
    }

    public String getWfrmMunicipio() {
        return wfrmMunicipio;
    }

    public String getWfrmOrdenCompra() {
        return wfrmOrdenCompra;
    }

    public String getWfrmPais() {
        return wfrmPais;
    }

    public String getWfrmParametroFacturacion() {
        return wfrmParametroFacturacion;
    }

    public String getWfrmParametroProyecto() {
        return wfrmParametroProyecto;
    }

    public String getWfrmPrincipal() {
        return wfrmPrincipal;
    }

    public String getWfrmProveedor() {
        return wfrmProveedor;
    }

    public String getWfrmProyecto() {
        return wfrmProyecto;
    }

    public String getWfrmRoles() {
        return wfrmRoles;
    }

    public String getWfrmSalidaProyecto() {
        return wfrmSalidaProyecto;
    }

    public String getWfrmSubCategoria() {
        return wfrmSubCategoria;
    }

    public String getWfrmSucursal() {
        return wfrmSucursal;
    }

    public String getWfrmTipoCliente() {
        return wfrmTipoCliente;
    }

    public String getWfrmTipoMaterial() {
        return wfrmTipoMaterial;
    }

    public String getWfrmTipoProyecto() {
        return wfrmTipoProyecto;
    }

    public String getWfrmUnidadMedicion() {
        return wfrmUnidadMedicion;
    }

    public String getWfrmUsuario() {
        return wfrmUsuario;
    }

    public String getWfrmUtilizacionProyecto() {
        return wfrmUtilizacionProyecto;
    }

    public String getWfrmQuick_Compra_AC() {
        return wfrmQuick_Compra_AC;
    }

    public String getWfrmQuick_Compra_DC() {
        return wfrmQuick_Compra_DC;
    }

    public String getWfrmAsignarCaja() {
        return wfrmAsignarCaja;
    }

    public String getWfrmCaja() {
        return wfrmCaja;
    }

    public String getWfrmTipoCaja() {
        return wfrmTipoCaja;
    }

    public String getWfrmConsulta_BitacoraInventario() {
        return wfrmConsulta_BitacoraInventario;
    }

    public String getWfrmConsulta_Kardex() {
        return wfrmConsulta_Kardex;
    }

    public String getWfrmPerfil() {
        return wfrmPerfil;
    }

    public String getWfrmPerfilUsuario() {
        return wfrmPerfilUsuario;
    }

    public String getWfrmConsulta_ConteoFisico() {
        return wfrmConsulta_ConteoFisico;
    }

    public String getWfrmConsulta_Compra_Cantidad_x_Costo() {
        return wfrmConsulta_Compra_Cantidad_x_Costo;
    }
}
