package ro.uvt.info.models;

public interface Element  {
    //public void print();
    void add(Element element);
    void remove(Element element);
    Element get(int index);

}

