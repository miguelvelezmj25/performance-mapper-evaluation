package org.prevayler.service;

import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;

public class Service {

    private static Service instance = new Service();
    private Prevayler<Root> prevayler;

    private Service() {
    }

    public static void main(String[] args) throws Exception {
        Service.getInstance().open();
        try {
            // todo execute your application
        } finally {
            Service.getInstance().close();
        }
    }

    public static Service getInstance() {
        return instance;
    }

    public Prevayler<Root> getPrevayler() {
        return prevayler;
    }

    public void open() throws Exception {
        prevayler = PrevaylerFactory.createPrevayler(new Root(), "PrevalenceBase");
        if(prevayler.prevalentSystem().getCreated() == null) {
            prevayler.execute(new InitializeServiceTransaction());
            prevayler.takeSnapshot();
        }
    }

    public void close() throws Exception {
        prevayler.close();
    }


}