package com.company.fileManager;

import com.company.card.Card;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by MichaelTrap on 07.04.2017.
 */
public interface FileManager {
         Card makeCard(String path, Card card) throws IOException, SAXException, ParserConfigurationException;
}
