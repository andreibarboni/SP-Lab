package ro.uvt.info.services;


import ro.uvt.info.models.*;

import javax.naming.Context;

public interface AlignStrategy {
    void render (Paragraph p, Context c);
}
