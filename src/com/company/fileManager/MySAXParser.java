package com.company.fileManager;

import com.company.card.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import static java.lang.Integer.parseInt;

/**
 * Created by MichaelTrap on 14.04.2017.
 */

public class MySAXParser extends DefaultHandler {
    private String thisElement;
    private Card thisCard;

    public MySAXParser() {

    }

    public Card getThisCard() {
        return thisCard;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("cardtype")) {
            String type = new String(ch, start, length);
            System.out.println(type);
            try {
                if (type.equals("Существо")) {
                    thisCard = new CreatureCard();
                }
                else if (type.equals("Мгновенное заклинание")) {
                    thisCard = new InstantCard();
                }
                else if (type.equals("Волшебство")) {
                    thisCard = new MagicCard();
                }
                else if (type.equals("Чары")) {
                    thisCard = new EnchantmentCard();
                }
                else if (type.equals("Земля")) {
                    thisCard = new LandCard();
                }
                else if (type.equals("Фишка")) {
                    thisCard = new ChipCard();
                } else {
                    System.out.println("hereError");
                    throw new Exception("Введенные данные не соответствуют");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            thisCard.setCardtype(type);
        }
        if (thisElement.equals("cardname")) {
            thisCard.setCardname(new String(ch, start, length));
        }
        if (thisElement.equals("cardtext")) {
            thisCard.setCardtext(new String(ch, start, length));
        }
        if (thisElement.equals("signaturetext")) {
            thisCard.setSignaturetext(new String(ch, start, length));
        }
        if (thisElement.equals("cardpic")) {
            thisCard.setImgPath(new String(ch, start, length));
        }
        if (thisElement.equals("stats")) {
            String currentLine = new String(ch, start, length);
            int force = parseInt(currentLine.split("-")[0]);
            int life = parseInt(currentLine.split("-")[1]);
            thisCard.setForce(force);
            thisCard.setLife(life);
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";
    }
}
