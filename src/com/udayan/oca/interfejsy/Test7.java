package com.udayan.oca.interfejsy;

interface Exportable {
    public void export();
}

class Tool implements Exportable {
    int t;

    @Override
     public void export() {
        System.out.println("Tool:Exportable");
    }
}

class ReportTool extends Tool   implements Exportable {
    int tr;

    @Override
    public void export() {
        System.out.println("ReportTool:Exportable");
    }

}

class ExtraTool extends Tool   implements Exportable {
    int tr;

    @Override
    public void export() {
        System.out.println("ExtraTool:Exportable");
    }

}

public class Test7 {
    public static void main (String[] args) {
        Tool aTool = new Tool(); // pełny Tool
        Tool bTool = new ReportTool();  //niepełny ReportTool - odpali wszystko z Tool oraz TYLKO @Override w ReportTool
        Tool cTool = new ExtraTool(); // niepełny ExtraTool



        callExport(aTool);
        callExport(bTool);
        callExport(cTool);

        boolean b = aTool instanceof Exportable;

        Exportable iE1 = new Tool(); //zupełnie niepełny Tool
        Exportable iE2 = new ReportTool(); //zupełnie niepełny Tool
        Exportable iE3 = new ExtraTool(); //zupełnie niepełny Tool
        iE1.export();
        iE2.export();
        iE3.export();

        System.out.println("aaaaaaaaaa");
    }

    private static void callExport( Exportable i) {
        i.export();
    }
}

