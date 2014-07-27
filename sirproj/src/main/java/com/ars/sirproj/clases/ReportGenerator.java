/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

//import java.io.ByteArrayOutputStream;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Map;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.ExternalContext;
//import javax.faces.context.FacesContext;
//import javax.servlet.http.HttpServletResponse;
//
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JRExporter;
//import net.sf.jasperreports.engine.JRExporterParameter;
//import net.sf.jasperreports.engine.JRParameter;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//import net.sf.jasperreports.engine.export.JRPdfExporter;
//import net.sf.jasperreports.view.JasperViewer;
//import sv.com.intesal.conexion.cConexion;

/**
 *
 * @author Sonia Garcia
 */
public class ReportGenerator {
//
//    //    private ServletContext servletContextObj = null;
//    private FacesContext fc = null;
//
//    /* Bigginig of new test */
//    public ReportGenerator() {
//    }
//
//    public final boolean printReport(String format, Map params, String template, String attachmentName) throws Exception {
//        Connection cnn = cConexion.conectar();
//        try {
//
//
//            FacesContext context = FacesContext.getCurrentInstance();
//            ExternalContext ext = context.getExternalContext();
//            System.out.println("ruta: " + template);
//            System.out.println("ruta con externalcontext: " + ext.getRealPath(template));
////            InputStream fis = ext.getResourceAsStream(ext.getRealPath(template));
//            InputStream fis = ext.getResourceAsStream((template));
//            System.out.println("gets here");
////            JasperReport jasperReport = JasperCompileManager.compileReport(fis);
//            JasperReport jasperReport = JasperCompileManager.compileReport(ext.getRealPath(template));
//            System.out.println("Compila exitosamente");
//
//
//
//            /*trying to print a .pdf*/
//            params.put(JRParameter.IS_IGNORE_PAGINATION, Boolean.FALSE);
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, cnn);
//            HttpServletResponse resp = (HttpServletResponse) ext.getResponse();
//            resp.setContentType("application/pdf");
//            String filename = new StringBuffer(attachmentName).append(".pdf").toString();
//            resp.addHeader("Content-Disposition", "inline; filename=" + filename);
//
//            System.out.println("hope this works");
//            JasperExportManager.exportReportToPdfStream(jasperPrint, resp.getOutputStream());
//
////resp.sendRedirect(format)
//            /*end of report things*/
//            context.getApplication().getStateManager().saveView(context);
//            context.responseComplete();
//            System.out.println("finished");
//            return true;
//        } catch (Exception e) {
//            throw new Exception(e);
//        } finally {
//            try {
//                cnn.close();
//            } catch (Exception ex) {
//                throw new Exception(ex);
//            }
//        }
//    }
//
//    /*end of new test*/
//    public ReportGenerator(FacesContext facesContextObj) {
//        this.fc = facesContextObj;
//
//
//    }
//
////    public void getPdfReportStream(String reportLocation, Map parameters) throws JRException, SQLException {
//    public byte[] getPdfReportStream(String reportLocation, Map parameters) throws JRException, SQLException {
//        ExternalContext ec = fc.getExternalContext();
//        System.out.println("1");
//        System.out.println("path to file is: " + ec.getRealPath(reportLocation));
//        JasperReport jasperReport = JasperCompileManager.compileReport(ec.getRealPath(reportLocation));
//
//
//
//
//        System.out.println("2");
//        //Obtenemos una conexion de la sesion que contiene el entityManager
//        Connection conn = cConexion.conectar();
//        // Almacenamos en un objeto JasperPrint el reporte generado
//        System.out.println("3");
//
//
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
//        System.out.println("4");
//        JasperViewer.viewReport(jasperPrint);
//        // Convertimos el objeto JasperPrint a un stream de bytes
//        System.out.println("IT WORKED");
//
//
////        JasperExportManager.exportReportToPdfFile(jasperPrint, "/home/andrew/simple_report.pdf");
////        JRExporter exporter = null;
////        exporter = new net.sf.jasperreports.engine.export.JRPdfExporter();
//
//
//        // Convertimos el objeto JasperPrint a un stream de bytes
//        return JasperExportManager.exportReportToPdf(jasperPrint);  /*works*/
//    }
////    public byte[] getXlsReportStream(String reportLocation, Map parameters) throws JRException, FileNotFoundException, IOException, SQLException {
////        JasperReport jasperReport = JasperCompileManager.compileReport(servletContextObj.getRealPath(reportLocation));
////        //Obtenemos una conexion de la sesion que contiene el entityManager
////        Connection conn = cConexion.conectar();
////        // Almacenamos en un objeto JasperPrint el reporte generado
////        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
////        //Exportador a excel
////        JRXlsExporter expExcel = new JRXlsExporter();
////        expExcel.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
////        System.out.println(reportLocation.substring(0, reportLocation.lastIndexOf(".")) + ".xls");
////        //File tmpFile = new File(reportLocation.substring(0, reportLocation.lastIndexOf(".")) + ".xls");
////        //tmpFile.createNewFile();
////        //OutputStream ouputStream = new FileOutputStream(tmpFile);
////        ByteArrayOutputStream tmpStream = new ByteArrayOutputStream();
////        expExcel.setParameter(JRExporterParameter.OUTPUT_STREAM, tmpStream);
////        expExcel.exportReport();
////        // Convertimos el objeto JasperPrint a un stream de bytes
////        return tmpStream.toByteArray();
////    }
////    public void testingReport() {
////        JRExporter exporter = new JRPdfExporter();
////        List<JasperPrint> reportlist = new java.util.ArrayList<JasperPrint>();
////        ByteArrayOutputStream baos = new ByteArrayOutputStream();
////        byte[] bytes = null;
////        for (int i = 0; i < list.size(); i++) {
////            /** get report **/
////            java.io.InputStream reportStream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream(FacesUtil.getReportMessage(getReportKey()));
////            JasperPrint jasperPrint = JasperFillManager.fillReport(
////                    reportStream, reportParameters, new CustomCollectionDataSource(newlist));
////            reportlist.add(jasperPrint);
////        }
////
////        exporter.setParameter(JRExporterParameter.JASPER_PRINT_LIST, reportlist);
////
////        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, baos);
////
////        exporter.exportReport();
////        bytes = baos.toByteArray();
////        FacesContext facesContext = FacesContext.getCurrentInstance();
////        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
////        ServletOutputStream servletOutputStream = response.getOutputStream();
////
////        facesContext.responseComplete();
////
////        response.setContentType(getFormat
////
////
////
////
////    }
////
////    ( )
////
////
////
////     );
////    response   .resetBuffer()    ;
////    String fileName = firsttemp.getStorageName() + DateUtil.formatDate(qyDateFrom) + "-"
////            + DateUtil.formatDate(qyDateTo) + ".pdf";
////    fileName  = URLEncoder.encode(fileName, "UTF-8");
////    fileName  = StringUtils.replace(fileName, "+", "%20");
////
////    response.setHeader ("Content-Disposition"
////
////      ,
////
////
////
////
////
////
////
////
////"attachment; filename=".concat(fileName));
////    response.setContentLength(bytes.length);
////    servletOutputStream.write(bytes);
////    servletOutputStream.flush();
////    servletOutputStream.close();
////    }
}
