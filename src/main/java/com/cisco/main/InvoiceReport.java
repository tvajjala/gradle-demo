package com.cisco.main;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.core.io.ClassPathResource;
public class InvoiceReport {
    
    public static void main(String[] args) throws Exception{
        JRPdfExporter exporter=new JRPdfExporter();
        ClassPathResource resource=new ClassPathResource("Invoice.jrxml");
      
        JasperReport jasperReport= JasperCompileManager.compileReport( resource.getInputStream());
        JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport, null,new JRTableModelDataSource(tableModelData()));
        JasperViewer jasperViewer = new JasperViewer(jasperPrint);
        jasperViewer.setVisible(true);
     
    }
    
    private static DefaultTableModel tableModelData() {
        String[] columnNames = {"Id", "Name", "Department", "Email"};
        String[][] data = {
            {"111", "G Conger", " Orthopaedic", "jim@wheremail.com"},
            {"222", "A Date", "ENT", "adate@somemail.com"},
            {"333", "R Linz", "Paedriatics", "rlinz@heremail.com"},
            {"444", "V Sethi", "Nephrology", "vsethi@whomail.com"},
            {"555", "K Rao", "Orthopaedics", "krao@whatmail.com"},
            {"666", "V Santana", "Nephrology", "vsan@whenmail.com"},
            {"777", "J Pollock", "Nephrology", "jpol@domail.com"},
            {"888", "H David", "Nephrology", "hdavid@donemail.com"},
            {"999", "P Patel", "Nephrology", "ppatel@gomail.com"},
            {"101", "C Comer", "Nephrology", "ccomer@whymail.com"}
        };
      return new DefaultTableModel(data, columnNames);
    }
}
