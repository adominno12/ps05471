/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.custag;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Nguyễn Bùi Thội
 */
public class CustomTagAttribune extends SimpleTagSupport {

    private String ten;
    private String kieungay;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            if (ten.isEmpty()) 
                ten="Không tên";
            
            if (kieungay.isEmpty()) 
                kieungay="dd/mm/yy";
            Date ngay = new Date();
            String chuoiNgay = new SimpleDateFormat(kieungay).format(ngay);
            out.println("<h1>"+chuoiNgay+"</h1>");
            out.println("Tôi là "+ten);
           
        } catch (java.io.IOException ex) {
            throw new JspException("Error in CustomTagAttribune tag", ex);
        }
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setKieungay(String kieungay) {
        this.kieungay = kieungay;
    }

    public String getTen() {
        return ten;
    }

    public String getKieungay() {
        return kieungay;
    }
    
    
}
