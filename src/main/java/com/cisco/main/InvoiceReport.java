package com.cisco.main;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.core.io.ClassPathResource;

import javax.swing.table.DefaultTableModel;
public class InvoiceReport {

    public static void main(final String[] args) throws Exception {
        final JRPdfExporter exporter = new JRPdfExporter();
        final ClassPathResource resource = new ClassPathResource("Invoice.jrxml");

        final JasperReport jasperReport = JasperCompileManager.compileReport(resource.getInputStream());
        final JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, new JRTableModelDataSource(tableModelData()));
        final JasperViewer jasperViewer = new JasperViewer(jasperPrint);
        jasperViewer.setVisible(true);
     
    }
    
    private static DefaultTableModel tableModelData() {
        final String[] columnNames = {"Id", "Name", "Department", "Email"};
        final String[][] data = {
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
