/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenerateID;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HieuLe
 */
public class GenerateSequenceID {

    Date date;
    static SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("MMddHHmmss");

    public GenerateSequenceID() {
        date =  new Date();
    }

    public GenerateSequenceID(Date date) {
        this.date = date;
    }

    public long creatIDbyDateTime() {
        String format = dinhDangThoiGian.format(date);
        return Long.parseLong(format);
    }
    public static void main(String[] args) {
        GenerateSequenceID d = new GenerateSequenceID();
        System.out.println(d.creatIDbyDateTime());
    }
}
