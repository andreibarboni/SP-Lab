package ro.uvt.info.services;


import ro.uvt.info.models.*;

import javax.naming.Context;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph" + p.getName() + " align center");
    }
}
