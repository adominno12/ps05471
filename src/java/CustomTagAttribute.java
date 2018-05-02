
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class CustomTagAttribute extends SimpleTagSupport{
    private String ten;
    private String kieungay;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKieungay() {
        return kieungay;
    }

    public void setKieungay(String kieungay) {
        this.kieungay = kieungay;
    }
    public void dotag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        try{
            if(ten.isEmpty())
                ten="Khong Ten";
            if(kieungay.isEmpty())
                kieungay="dd/MM/yyyy";
            Date ngay=new Date();
            String chuoiNgay= new SimpleDateFormat(kieungay).format(ngay);
            out.println("<h2>Hom nay ngay"+chuoiNgay+"</h2>");
            out.println("<h1>Hello ban'"+ten+"'den day</h1>")  ;    
        }catch (Exception ex) {
            throw new JspException("Error in CustomTagattribute tag", ex);
        }
    }
}

            
    

