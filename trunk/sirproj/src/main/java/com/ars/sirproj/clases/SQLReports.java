/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sonia Garcia
 */


public class SQLReports  {


    /*DEVOLUCION PROYECTO*/
    public static final String getReport_DP_id_dp="select s.nombre_s,e.nombre_e,e.apellido_e,e.identificador_e,dp.id_dp,dp.fecha_dp,dp.observacion_dp,dp.bloque_dp,dp.numero_documento_dp,dp.estado_dp,m.nombre_m,d.cantidad_d,m.codigo_barra_m,m.codigo_barra_original_m,p.nombre_p,p.direccion_p,p.fecha_inicio_p,p.fecha_finalizacion_p,p.descripcion_p,p.estado_p FROM DEVOLUCION_PROYECTO as dp,DETA_DEVOLUCION_PROYECTO as d,MATERIAL as m,MATERIAL_SUCURSAL as ms, SUCURSAL as s,EMPLEADO as e,PROYECTO as p  where dp.id_dp=d.id_dp and m.id_m=ms.id_m and ms.id_dm=d.id_dm and s.codigo_s=ms.codigo_s and e.id_e=dp.id_e and p.id_p=dp.id_p and dp.id_dp=? order by s.nombre_s,dp.fecha_dp,dp.numero_documento_dp";


    /*SALIDA_PROYECTO*/
    public static final String getReport_SP_id_sp="select s.nombre_s,e.nombre_e,e.apellido_e,e.identificador_e,sp.id_sp,sp.fecha_sp,sp.observacion_sp,sp.bloque_sp,sp.numero_documento_sp,sp.estado_sp,m.nombre_m,d.cantidad_d,m.codigo_barra_m,m.codigo_barra_original_m ,p.nombre_p,p.direccion_p,p.fecha_inicio_p,p.fecha_finalizacion_p,p.descripcion_p,p.estado_p FROM SALIDA_PROYECTO as sp,DETA_SALIDA_PROYECTO as d,MATERIAL as m,MATERIAL_SUCURSAL as ms, SUCURSAL as s,EMPLEADO as e,PROYECTO as p where sp.id_sp=d.id_sp and m.id_m=ms.id_m and ms.id_dm=d.id_dm and s.codigo_s=ms.codigo_s and e.id_e=sp.id_e and p.id_p=sp.id_p and sp.id_sp=2 order by s.nombre_s,sp.fecha_sp,sp.numero_documento_sp";

    /*UTILIZACION_PROYECTO*/
    public static final String getReport_UP_id_up="select s.nombre_s,e.nombre_e,e.apellido_e,e.identificador_e,up.id_up,up.fecha_up,up.observacion_up,up.bloque_up,up.numero_documento_up,up.estado_up,m.nombre_m,d.cantidad_d,m.codigo_barra_m,m.codigo_barra_original_m,p.nombre_p,p.direccion_p,p.fecha_inicio_p,p.fecha_finalizacion_p,p.descripcion_p,p.estado_p FROM UTILIZACION_PROYECTO as up,DETA_UTILIZACION_PROYECTO as d,MATERIAL as m,MATERIAL_SUCURSAL as ms, SUCURSAL as s,EMPLEADO as e,PROYECTO as p where up.id_up=d.id_up and m.id_m=ms.id_m and ms.id_dm=d.id_dm and s.codigo_s=ms.codigo_s and e.id_e=up.id_e and p.id_p=up.id_up and up.id_up=? order by s.nombre_s,up.fecha_up,up.numero_documento_up";

    /*AJUSTE*/
    public static final String getReport_Ajuste_Fechas="select aj.id_aj,aj.fecha_aj,aj.descripcion_aj,aj.bloque_aj,aj.numero_documento_aj,aj.estado_aj,s.nombre_s,m.nombre_m,m.codigo_barra_m,m.codigo_barra_original_m,d.cantidad_d,d.tipo_d,u.usuario_u from AJUSTE as aj,DETA_AJUSTE as d,MATERIAL as m,MATERIAL_SUCURSAL AS ms,SUCURSAL as s,USUARIO as u where aj.id_aj=d.id_aj and m.id_m=ms.id_m and ms.id_dm=d.id_dm and s.codigo_s=ms.codigo_s and u.id_u=aj.id_u and aj.fecha_aj between ? and ? order by s.nombre_s,aj.fecha_aj,aj.numero_documento_aj";

    /*BITACORA_ANULACION */
    public static final String getReport_BA="select ba.fecha_ba,ba.fechahora,ba.tipo_ba,ba.codigo_documento_ba,s.codigo_s,s.nombre_s,u.usuario_u from bitacora_anulacion as ba,USUARIO as u,SUCURSAL as s,EMPLEADO as e where u.id_u=ba.id_u and e.id_e=u.id_e and s.codigo_s=e.codigo_s";

    /*COMPRA*/
    public static final String getReport_Compra="";

}
