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

    public Card makeCard(String fileName) throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        MySAXParser saxp = new MySAXParser();

        File currentDirFile = new File("src\\com\\company\\files\\");
        //String filePath = "C:\\Users\\ASTERNOTUS\\Desktop\\JavaMTG\\src\\com\\company\\files\\";

        parser.parse(new File(currentDirFile+"\\"+fileName),saxp);
        return saxp.getThisCard();
    }
}
