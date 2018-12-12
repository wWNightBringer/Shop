package com.bespalov.shop.util;

import com.bespalov.shop.dao.DatabaseDAO;
import com.bespalov.shop.impl.ProductDAOImpl;
import com.bespalov.shop.model.Product;
import com.bespalov.shop.repository.ElementRepository;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JAXBUtil {
    private Path path;
    private JAXBContext context;
    private StringWriter stringWriter;

    public JAXBUtil() {
        path = Paths.get("shop_1/src/main/resources/result.xml");
        stringWriter = new StringWriter();
    }

    public void initJAXB(DatabaseDAO databaseDAO) {
        if (databaseDAO == null) {
            throw new NullPointerException();
        }
        try {
            context = JAXBContext.newInstance(databaseDAO.getClass(), ProductDAOImpl.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(databaseDAO, new FileOutputStream(path.toFile()));


        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getJAXB(DatabaseDAO databaseDAO) {
        if (databaseDAO == null) {
            throw new NullPointerException();
        }
        try {
            context = JAXBContext.newInstance(databaseDAO.getClass(), ProductDAOImpl.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            databaseDAO = (DatabaseDAO) unmarshaller.unmarshal(path.toFile());
            System.out.println(databaseDAO.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
