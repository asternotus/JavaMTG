package com.company.card;

/**
 * Created by MichaelTrap on 06.04.2017.
 */
public abstract class Card {
    private String cardname;
    private String cardtext;
    private String cardtype;
    private int force;
    private int life;
    private String signaturetext;
    private String imgPath;
    private Boolean spin;

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getCardtext() {
        return cardtext;
    }

    public void setCardtext(String cardtext) {
        this.cardtext = cardtext;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getSignaturetext() {
        return signaturetext;
    }

    public void setSignaturetext(String signaturetext) {
        this.signaturetext = signaturetext;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Boolean getSpin() {
        return spin;
    }

    public void setSpin(Boolean spin) {
        this.spin = spin;
    }

    //fuck your mom
    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }
}
