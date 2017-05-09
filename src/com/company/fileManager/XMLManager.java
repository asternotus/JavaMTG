package com.company.fileManager;

import com.company.card.Card;

import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;

import java.io.IOException;

/**
 * Created by MichaelTrap on 06.04.2017.
 */
public class XMLManager {

    SAXParserFactory factory;
    SAXParser parser;
    MySAXParser saxp;

    public XMLManager() throws ParserConfigurationException, SAXException {
        factory = SAXParserFactory.newInstance();
        parser = factory.newSAXParser();
        saxp = new MySAXParser();
    }


    public Card makeCard(String fileName) throws IOException, SAXException {

        parser.parse(fileName, saxp);
        return saxp.getThisCard();
    }
}
